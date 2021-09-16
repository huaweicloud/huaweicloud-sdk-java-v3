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

package com.huaweicloud.sdk.iotda.v5.auth;

import com.huaweicloud.sdk.core.exception.SdkException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author HuaweiCloud_SDK
 */
public class HKDF {
    private static final String HMAC_SHA1 = "hmacsha1";

    private static final String HMAC_SHA256 = "hmacsha256";

    private static final int DERIVATION_KEY_LENGTH = 32;

    private static final String HMAC_ALGORITHM = HMAC_SHA256;

    private static final int ALGORITHM_HASH_LENGTH = getHashLen(HMAC_ALGORITHM);

    private static final Charset UTF_8 = StandardCharsets.UTF_8;

    private static final int EXPAND_CEIL = (int) Math.ceil(
        (double) DERIVATION_KEY_LENGTH / (double) ALGORITHM_HASH_LENGTH);

    public static String getDerKeySHA256(String accessKey, String secretKey, String info) {
        if (null == accessKey || "".equals(accessKey) || null == secretKey || "".equals(secretKey)) {
            return null;
        }
        try {
            byte[] tmpKey = extract(secretKey.getBytes(UTF_8), accessKey.getBytes(UTF_8), HMAC_ALGORITHM);
            byte[] derSecretKey = expand(tmpKey, info.getBytes(UTF_8), HMAC_ALGORITHM, DERIVATION_KEY_LENGTH,
                EXPAND_CEIL);
            if (null != derSecretKey) {
                return toHex(derSecretKey);
            }
        } catch (NoSuchAlgorithmException | InvalidKeyException | IOException e) {
            String msg = "Failed to derive AK " + accessKey + " with info " + info + " .";
            throw new SdkException(msg, e);
        }
        return null;
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

        return okmLength == rawResult.length
            ? rawResult
            : (okmLength < rawResult.length ? Arrays.copyOf(rawResult, okmLength) : null);
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