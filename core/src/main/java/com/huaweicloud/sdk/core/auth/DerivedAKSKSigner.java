/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.utils.BinaryUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * signature certification with AK/SK
 *
 * @author HuaweiCloud_SDK
 */
public class DerivedAKSKSigner extends AKSKSigner {
    private static final String V_11_HMAC_SHA_256 = "V11-HMAC-SHA256";
    private final static DerivedAKSKSigner SINGLETON = new DerivedAKSKSigner();

    protected DerivedAKSKSigner() {

    }

    public static DerivedAKSKSigner getInstance() {
        return SINGLETON;
    }

    @Override
    protected <T extends AbstractCredentials<T>> void checkRequired(T credential) {
        super.checkRequired(credential);
        if (StringUtils.isEmpty(credential.regionId)) {
            throw new SdkException("regionId is required in credentials when using derived auth");
        }
        if (StringUtils.isEmpty(credential.derivedAuthServiceName)) {
            throw new SdkException("derivedAuthServiceName is required in credentials when using derived auth");
        }
    }

    @Override
    public <T extends AbstractCredentials<T>> Map<String, String> sign(HttpRequest request, T credentials) {
        checkRequired(credentials);

        HashMap<String, String> authenticationHeaders = new HashMap<>();
        URL url = request.getUrl();
        String canonicalHost = url.getAuthority();
        authenticationHeaders.put(Constants.HOST, canonicalHost);

        String dateTimeStamp = extractTimeStamp(request, authenticationHeaders);

        Map<String, String> allHeaders = combineAllHeaders(request, authenticationHeaders);

        String canonicalUri = buildCanonicalUri(url);

        String query = url.getQuery();
        Map<String, List<String>> parameters = request.getQueryParams();
        String canonicalQueryString = buildCanonicalQueryString(query, parameters);

        String signedHeaderNames = String.join(";", allHeaders.keySet());

        String canonicalHeaders = buildCanonicalHeaders(allHeaders);

        String payloadHash = buildPayloadHash(request);

        String canonicalRequest = buildCanonicalRequest(request.getMethod().name(),
                canonicalUri, canonicalQueryString, canonicalHeaders, signedHeaderNames, payloadHash);
        String canonicalRequestHash = BinaryUtils.toHex(hasher.hash(canonicalRequest.getBytes(StandardCharsets.UTF_8)));

        String dateStr = dateTimeStamp.substring(0, 8);
        String info = String.format(Locale.ROOT, "%s/%s/%s",
                dateStr, credentials.regionId, credentials.derivedAuthServiceName);
        String stringToSign = buildStringToSign(V_11_HMAC_SHA_256, dateTimeStamp, info, canonicalRequestHash);

        String derivationKey = HKDF.getDerKeySHA256(credentials.getAk(), credentials.getSk(), info);
        HmacSigningKey hmacSigningKey = new HmacSigningKey(hasher, derivationKey.getBytes(StandardCharsets.UTF_8));
        String signature = buildSignature(stringToSign, hmacSigningKey);

        String authorization = String.format(Locale.ROOT, "%s Credential=%s/%s, SignedHeaders=%s, Signature=%s",
                V_11_HMAC_SHA_256, credentials.getAk(), info, signedHeaderNames, signature);
        authenticationHeaders.put(Constants.AUTHORIZATION, authorization);
        return authenticationHeaders;
    }

    static class HKDF {
        private static final String HMAC_SHA1 = "hmacsha1";

        private static final String HMAC_SHA256 = "hmacsha256";

        private static final int DERIVATION_KEY_LENGTH = 32;

        private static final String HMAC_ALGORITHM = HMAC_SHA256;

        private static final int ALGORITHM_HASH_LENGTH = getHashLen(HMAC_ALGORITHM);

        private static final Charset UTF_8 = StandardCharsets.UTF_8;

        private static final int EXPAND_CEIL =
                (int) Math.ceil((double) DERIVATION_KEY_LENGTH / (double) ALGORITHM_HASH_LENGTH);

        public static String getDerKeySHA256(String accessKey, String secretKey, String info) {
            if (null == accessKey || "".equals(accessKey) || null == secretKey || "".equals(secretKey)) {
                return null;
            }
            try {
                byte[] tmpKey = extract(secretKey.getBytes(UTF_8), accessKey.getBytes(UTF_8), HMAC_ALGORITHM);
                byte[] derSecretKey =
                        expand(tmpKey, info.getBytes(UTF_8), HMAC_ALGORITHM, DERIVATION_KEY_LENGTH, EXPAND_CEIL);
                return toHex(derSecretKey);
            } catch (NoSuchAlgorithmException | InvalidKeyException | IOException e) {
                String msg = "Failed to derive AK " + accessKey + " with info " + info + " .";
                throw new SdkException(msg, e);
            }
        }

        public static String toHex(byte[] data) {
            StringBuilder sb = new StringBuilder(data.length * 2);
            for (byte itemByte : data) {
                String hex = Integer.toHexString(itemByte);
                if (hex.length() == 1) {
                    sb.append("0");
                } else if (hex.length() == 8) {
                    hex = hex.substring(6);
                }
                sb.append(hex);
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        }

        private static byte[] extract(byte[] ikm, byte[] salt, String hmacAlgorithm)
                throws NoSuchAlgorithmException, InvalidKeyException {
            if (salt == null || salt.length == 0) {
                salt = new byte[getHashLen(hmacAlgorithm)];
            }

            Mac mac = Mac.getInstance(hmacAlgorithm);
            mac.init(new SecretKeySpec(salt, hmacAlgorithm));
            return mac.doFinal(ikm);
        }

        private static byte[] expand(byte[] prk, byte[] info, String hmacAlgorithm, int okmLength, int ceil)
                throws NoSuchAlgorithmException, InvalidKeyException, IOException {
            Mac mac = Mac.getInstance(hmacAlgorithm);
            mac.init(new SecretKeySpec(prk, hmacAlgorithm));
            byte[] rawResult;
            if (ceil == 1) {
                rawResult = expandFirst(info, mac);
            } else {
                rawResult = new byte[0];
                byte[] temp = new byte[0];
                for (int i = 1; i <= ceil; ++i) {
                    temp = expandOnce(info, mac, temp, i);

                    ByteArrayOutputStream combineBytes = new ByteArrayOutputStream();
                    combineBytes.write(rawResult);
                    combineBytes.write(temp);
                    rawResult = combineBytes.toByteArray();
                }
            }

            if (HKDF.DERIVATION_KEY_LENGTH == rawResult.length) {
                return rawResult;
            } else if (HKDF.DERIVATION_KEY_LENGTH < rawResult.length) {
                return Arrays.copyOf(rawResult, HKDF.DERIVATION_KEY_LENGTH);
            } else {
                throw new IOException("Failed to expand with algorithm " + hmacAlgorithm);
            }
        }

        private static byte[] expandFirst(byte[] info, Mac mac) {
            byte[] result = new byte[info.length + 1];
            System.arraycopy(info, 0, result, 0, info.length);
            result[info.length] = 0x01;
            return mac.doFinal(result);
        }

        private static byte[] expandOnce(byte[] info, Mac mac, byte[] preTemp, int i) throws IOException {
            ByteArrayOutputStream hashBytes = new ByteArrayOutputStream();
            hashBytes.write(preTemp);
            hashBytes.write(info);
            hashBytes.write(i);
            return mac.doFinal(hashBytes.toByteArray());
        }

        private static int getHashLen(String hmacAlgorithm) {
            switch (hmacAlgorithm) {
                case HMAC_SHA1:
                    return 20;
                case HMAC_SHA256:
                default:
                    return 32;
            }
        }
    }
}
