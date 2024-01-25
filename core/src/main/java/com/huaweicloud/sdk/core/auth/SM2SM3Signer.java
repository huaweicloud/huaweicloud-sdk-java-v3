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
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.SM2Signer;
import org.bouncycastle.jce.ECNamedCurveTable;

import java.math.BigInteger;

public class SM2SM3Signer extends P256SHA256Signer {
    private final static SM2SM3Signer SINGLETON = new SM2SM3Signer();

    protected SM2SM3Signer() {
        super();
        this.algorithm = Constants.SDK_SM2_SM3;
        this.contentHeader = Constants.X_SDK_CONTENT_SM3;
        this.emptyHash = "1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b";
        this.hasher = new SM3Hasher();
        this.ecSpec = ECNamedCurveTable.getParameterSpec("sm2p256v1");
        this.nMinusTwo = ecSpec.getN().subtract(BigInteger.valueOf(2L));
    }

    public static SM2SM3Signer getInstance() {
        return SINGLETON;
    }

    @Override
    protected ISigningKey initSigningKey(ECPrivateKeyParameters privateKeyParameters,
                                         ECPublicKeyParameters publicKeyParameters) {
        return new SM2SigningKey(privateKeyParameters, publicKeyParameters);
    }

    class SM2SigningKey extends P256SigningKey {

        SM2SigningKey(ECPrivateKeyParameters privateKeyParameters, ECPublicKeyParameters publicKeyParameters) {
            super(privateKeyParameters, publicKeyParameters);
        }

        @Override
        public byte[] sign(byte[] data) {
            SM2Signer signer = new SM2Signer();
            signer.init(true, privateKeyParameters);
            signer.update(data, 0, data.length);
            try {
                return signer.generateSignature();
            } catch (CryptoException e) {
                throw new SdkException("failed to generate signature with SM2Signer", e);
            }
        }

        @Override
        public boolean verify(byte[] signature, byte[] data) {
            SM2Signer signer = new SM2Signer();
            signer.init(false, publicKeyParameters);
            signer.update(data, 0, data.length);
            return signer.verifySignature(signature);
        }
    }
}
