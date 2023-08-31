/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECPoint;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Security;
import java.util.Objects;

public class P256SHA256Signer extends AKSKSigner {
    private static volatile P256SHA256Signer instance;
    protected ECNamedCurveParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("P-256");
    protected BigInteger nMinusTwo = ecSpec.getN().subtract(BigInteger.valueOf(2L));

    protected P256SHA256Signer() {
        super();
        this.algorithm = Constants.SDK_ECDSA_P256_SHA256;
    }

    public static P256SHA256Signer getInstance() {
        if (Objects.nonNull(instance)) {
            return instance;
        }

        synchronized (P256SHA256Signer.class) {
            if (instance == null) {
                Security.addProvider(new BouncyCastleProvider());
                instance = new P256SHA256Signer();
            }
            return instance;
        }
    }

    public <T extends AbstractCredentials<T>> ISigningKey getSigningKey(T credentials) {
        String key = algorithm + credentials.getAk();
        if (SIGNING_KEY_CACHE.containsKey(key)) {
            return SIGNING_KEY_CACHE.get(key);
        }

        BigInteger privateInt = derivePrivateInt(credentials);
        ISigningKey signingKey = generateSigningKey(privateInt);
        SIGNING_KEY_CACHE.put(key, signingKey);
        return signingKey;
    }

    protected ISigningKey generateSigningKey(BigInteger candidate) {
        ECParameterSpec ecParameterSpec = new ECParameterSpec(
                ecSpec.getCurve(), ecSpec.getG(), ecSpec.getN(), ecSpec.getH(), ecSpec.getSeed());
        ECDomainParameters domainParameters = new ECDomainParameters(
                ecParameterSpec.getCurve(), ecParameterSpec.getG(), ecParameterSpec.getN(), ecParameterSpec.getH());
        ECPrivateKeyParameters privateKeyParameters = new ECPrivateKeyParameters(candidate, domainParameters);

        ECPoint ecPoint = ecSpec.getCurve().getMultiplier().multiply(ecSpec.getG(), candidate);
        ECPublicKeyParameters publicKeyParameters = new ECPublicKeyParameters(ecPoint, domainParameters);

        return initSigningKey(privateKeyParameters, publicKeyParameters);
    }

    protected ISigningKey initSigningKey(ECPrivateKeyParameters privateKeyParameters,
                                         ECPublicKeyParameters publicKeyParameters) {
        return new P256SigningKey(privateKeyParameters, publicKeyParameters);
    }

    private <T extends AbstractCredentials<T>> BigInteger derivePrivateInt(T credentials) {
        ByteBuffer context = ByteBuffer.allocate(21);
        ByteBuffer data = ByteBuffer.allocate(algorithm.length() + 30);

        for (int counter = 0; counter <= 0xff; counter++) {
            context.clear();
            data.clear();

            context.put(credentials.getAk().getBytes(StandardCharsets.UTF_8));
            context.put((byte) counter);

            data.put(new byte[]{0x00, 0x00, 0x00, 0x01});
            data.put(algorithm.getBytes(StandardCharsets.UTF_8));
            data.put((byte) 0x00);
            data.put(context.array(), 0, context.position());
            data.put(new byte[]{0x00, 0x00, 0x01, 0x00});
            byte[] hmacBytes = hasher.hmac(data.array(), credentials.getSk().getBytes(StandardCharsets.UTF_8));
            BigInteger candidate = new BigInteger(1, hmacBytes);
            if (candidate.compareTo(nMinusTwo) <= 0) {
                return candidate.add(BigInteger.ONE);
            }
        }

        throw new SdkException("derive candidate failed, counter out of range");
    }

    class P256SigningKey implements ISigningKey {

        protected final ECPrivateKeyParameters privateKeyParameters;

        protected final ECPublicKeyParameters publicKeyParameters;

        P256SigningKey(ECPrivateKeyParameters privateKeyParameters, ECPublicKeyParameters publicKeyParameters) {
            this.privateKeyParameters = privateKeyParameters;
            this.publicKeyParameters = publicKeyParameters;
        }

        @Override
        public byte[] sign(byte[] data) {
            ECDSASigner signer = new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest()));
            signer.init(true, privateKeyParameters);
            byte[] hashed = hasher.hash(data);
            BigInteger[] integers = signer.generateSignature(hashed);
            ASN1EncodableVector vector = new ASN1EncodableVector();
            vector.add(new ASN1Integer(integers[0]));
            vector.add(new ASN1Integer(integers[1]));
            DERSequence derSequence = new DERSequence(vector);
            try {
                return derSequence.getEncoded();
            } catch (IOException e) {
                throw new SdkException("failed to encode data to ASN.1-DER format", e);
            }
        }

        @Override
        public boolean verify(byte[] signature, byte[] data) {
            try (ASN1InputStream as = new ASN1InputStream(signature)) {
                ASN1Sequence asn1Sequence = (ASN1Sequence) as.readObject();
                BigInteger r = ((ASN1Integer) asn1Sequence.getObjectAt(0)).getValue();
                BigInteger s = ((ASN1Integer) asn1Sequence.getObjectAt(1)).getValue();
                ECDSASigner signer = new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest()));
                signer.init(false, publicKeyParameters);
                byte[] hashed = hasher.hash(data);
                return signer.verifySignature(hashed, r, s);
            } catch (IOException | ClassCastException e) {
                return false;
            }
        }
    }
}
