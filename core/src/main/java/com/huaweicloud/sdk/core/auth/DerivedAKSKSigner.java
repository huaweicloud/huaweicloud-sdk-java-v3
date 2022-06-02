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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SimpleTimeZone;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * signature certification with AK/SK
 *
 * @author HuaweiCloud_SDK
 */
public class DerivedAKSKSigner extends AKSKSigner {
    private static final String V_11_HMAC_SHA_256 = "V11-HMAC-SHA256";

    public static Map<String, String> sign(HttpRequest request, AbstractCredentials credential) {
        if (StringUtils.isEmpty(credential.regionId)) {
            throw new SdkException("regionId in credential is required when using derived auth");
        }
        if (StringUtils.isEmpty(credential.derivedAuthServiceName)) {
            throw new SdkException("derivedAuthServiceName in credential is required when using derived auth");
        }

        // ************* TASK 1: CONSTRUCT CANONICAL REQUEST *************
        // 设置基准时间
        Date now = new Date();
        HashMap<String, String> authenticationHeaders = new HashMap<>();

        // Step 1: add basic headers required by V4
        URL url = request.getUrl();

        // Step 1.1: Add Host header
        String canonicalHost = url.getAuthority();
        authenticationHeaders.put(Constants.HOST, canonicalHost);

        // Step 1.2: Add X-Sdk-Date
        String dateTimeStamp;
        if (!request.haveHeader(Constants.X_SDK_DATE)) {
            SimpleDateFormat isoDateFormat = new SimpleDateFormat(ISO_8601_BASIC_FORMAT);
            isoDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
            dateTimeStamp = isoDateFormat.format(now);
            authenticationHeaders.put(Constants.X_SDK_DATE, dateTimeStamp);
        } else {
            dateTimeStamp = request.getHeader(Constants.X_SDK_DATE);
        }

        // Step 1.3 combine all headers
        Map<String, String> allHeaders = new TreeMap<>();

        allHeaders.putAll(request.getHeaders()
            .entrySet()
            .stream()
            .filter(entry -> (!entry.getKey().startsWith(Constants.CONTENT_TYPE) || !entry.getValue()
                .get(0)
                .startsWith(Constants.MEDIATYPE.MULTIPART_FORM_DATA)))
            .collect(
                Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), entry -> entry.getValue().get(0))));
        allHeaders.putAll(authenticationHeaders.entrySet()
            .stream()
            .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), Map.Entry::getValue)));

        // Step 2: Create Canonical URI -- the part of the URI from domain to query
        String pathOld = url.getPath();
        String canonicalUri;
        StringBuilder canonicalUriSb = new StringBuilder();
        String[] split = pathOld.split("/");
        for (String urlSplit : split) {
            canonicalUriSb.append(urlEncode(urlSplit)).append("/");
        }
        canonicalUri = canonicalUriSb.toString();

        // Step 3: Create the canonical query string. In this example (a GET request),
        // request parameters are in the query string. Query string values must
        // be URL-encoded (space=%20). The parameters must be sorted by name.
        // For this example, the query string is pre-formatted in the request_parameters
        // variable.
        String query = url.getQuery();
        Map<String, List<String>> parameters = request.getQueryParams();
        String canonicalQueryString = buildCanonicalQueryString(query, parameters);

        // Step 4: Create the list of signed headers. This lists the headers
        // in the canonical_headers list, delimited with ";" and in alpha order.
        // Note: The request can include any headers; canonical_headers and
        // signed_headers lists those that you want to be included in the
        // hash of the request. "Host" and "x-sdk-date" are always required.
        // In V4 signer, we only use required header - host & x-sdk-date.
        String signedHeaderNames = String.join(";", allHeaders.keySet());

        // Step 5: Create the canonical headers and signed headers. Header names
        // and value must be trimmed and lower-case, and sorted in ASCII order.
        // Note that there is a trailing \n.
        String canonicalHeaders = buildCanonicalHeaders(allHeaders);

        // Step 6: Create payload hash (hash of the request body content). For GET
        // requests, the payload is an empty string ("").
        String payloadHash = buildPayloadHash(request);

        // Step 7: Combine elements to create canonical request
        String canonicalRequest =
            buildCanonicalRequest(
                request.getMethod().name(),
                canonicalUri,
                canonicalQueryString,
                canonicalHeaders,
                signedHeaderNames,
                payloadHash);
        String canonicalRequestHash = BinaryUtils.toHex(sha256(canonicalRequest));
        // ************* TASK 2: CREATE THE STRING TO SIGN*************
        // Match the algorithm to the hashing algorithm you use, either SHA-1 or SHA-256(recommended)
        String dateStr = LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE);
        String info = dateStr + "/" + credential.regionId + "/" + credential.derivedAuthServiceName;
        String stringToSign = getStringToSign(V_11_HMAC_SHA_256, dateTimeStamp, info, canonicalRequestHash);

        // ************* TASK 3: CALCULATE THE SIGNATURE *************
        // Create the signing key using the function defined above.
        String derivationKey = HKDF.getDerKeySHA256(credential.getAk(), credential.getSk(), info);
        String signatureString = signature(stringToSign, derivationKey);

        // ************* TASK 4: ADD SIGNING INFORMATION TO THE REQUEST *************
        // The signing information can be either in a query string value or in
        // a header named Authorization. This code shows how to use a header.
        // Create authorization header and add to request headers
        StringBuilder authorization = new StringBuilder(V_11_HMAC_SHA_256).append(" ");
        authorization.append("Credential=").append(credential.getAk()).append("/").append(info).append(", ");
        authorization.append("SignedHeaders=").append(signedHeaderNames).append(", ");
        authorization.append("Signature=").append(signatureString);
        authenticationHeaders.put(Constants.AUTHORIZATION, authorization.toString());
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
}
