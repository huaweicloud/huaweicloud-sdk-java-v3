/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
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
import com.huaweicloud.sdk.core.utils.SignUtils;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.openeuler.BGMProvider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SM3AKSKSigner {
    private static final String EMPTY_BODY_SM3 =
            "1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b";

    private static final String HMAC_SM3 = "HmacSM3";

    public static <T extends AbstractCredentials<T>> Map<String, String>
        sign(HttpRequest request, T credentials) {

        HashMap<String, String> authenticationHeaders = new HashMap<>();

        authenticationHeaders.put(Constants.HOST, request.getUrl().getAuthority());

        String dateTimeStamp;
        if (request.getHeader(Constants.X_SDK_DATE) == null) {
            SimpleDateFormat sdf = new SimpleDateFormat(Constants.ISO_8601_BASIC_FORMAT);
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            dateTimeStamp = sdf.format(new Date());
            authenticationHeaders.put(Constants.X_SDK_DATE, dateTimeStamp);
        } else {
            dateTimeStamp = request.getHeader(Constants.X_SDK_DATE);
        }

        Map<String, String> allHeaders = new TreeMap<>(authenticationHeaders);
        for (String key : request.getHeaders().keySet()) {
            allHeaders.put(key, request.getHeader(key));
        }

        String messageDigestContent = calculateContentHash(request);
        String canonicalRequest = createCanonicalRequest(request, allHeaders, messageDigestContent);
        byte[] signingKey = deriveSigningKey(credentials.getSk());
        String stringToSign = createStringToSign(canonicalRequest, dateTimeStamp);
        byte[] signature = computeSignature(stringToSign, signingKey);
        String signatureResult = buildAuthorizationHeader(allHeaders, signature, credentials.getAk());
        authenticationHeaders.put(Constants.AUTHORIZATION, signatureResult);

        return authenticationHeaders;
    }

    private static String getCanonicalizedResourcePath(String resourcePath) {
        if (resourcePath == null || resourcePath.isEmpty()) {
            return "/";
        }

        try {
            resourcePath = (new URI(resourcePath)).getPath();
        } catch (URISyntaxException e) {
            throw new SdkException("Unable to resolve resource path", e);
        }

        String value = SignUtils.urlEncode(resourcePath, true);
        if (!value.startsWith("/")) {
            value = "/".concat(value);
        }

        if (!value.endsWith("/")) {
            value = value.concat("/");
        }

        return value;
    }

    private static String getCanonicalizedQueryString(Map<String, List<String>> parameters) {
        SortedMap<String, List<String>> sorted = new TreeMap<>();

        for (Map.Entry<String, List<String>> entry : parameters.entrySet()) {
            String encodedParamName = SignUtils.urlEncode(entry.getKey(), false);
            List<String> paramValues = entry.getValue();
            List<String> encodeValues = paramValues.stream().map(
                    paramValue -> SignUtils.urlEncode(paramValue, false)).sorted().collect(Collectors.toList());
            sorted.put(encodedParamName, encodeValues);
        }

        return SignUtils.convertSortedMap2QueryString(sorted);
    }

    private static String createCanonicalRequest(
            HttpRequest request,Map<String, String> headers, String messageDigestContent) {
        return String.join(
                Constants.LINE_SEPARATOR,
                request.getMethod().toString(),
                getCanonicalizedResourcePath(request.getUrl().getPath()),
                getCanonicalizedQueryString(request.getQueryParams()),
                getCanonicalizedHeaderString(headers),
                getSignedHeadersString(headers), messageDigestContent
        );
    }

    private static String createStringToSign(String canonicalRequest, String singerDate) {
        return String.join(Constants.LINE_SEPARATOR,
                Constants.SM3_SIGNING_ALGORITHM, singerDate, BinaryUtils.toHex(hashSm3(canonicalRequest)));
    }

    private static byte[] deriveSigningKey(String secret) {
        return secret.getBytes(StandardCharsets.UTF_8);
    }

    private static byte[] signSM3(byte[] data, byte[] key) {
        try {
            Mac mac = Mac.getInstance(HMAC_SM3);
            mac.init(new SecretKeySpec(key, HMAC_SM3));
            return mac.doFinal(data);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new SdkException("Unable to calculate a request signature", e);
        }
    }

    private static byte[] computeSignature(String stringToSign, byte[] signingKey) {
        return signSM3(stringToSign.getBytes(StandardCharsets.UTF_8), signingKey);
    }

    private static String buildAuthorizationHeader(Map<String, String> headers, byte[] signature, String accessKey) {
        String credential = "Access=" + accessKey;
        String signerHeaders = "SignedHeaders=" + getSignedHeadersString(headers);
        String signatureHeader = "Signature=" + BinaryUtils.toHex(signature);
        return Constants.SM3_SIGNING_ALGORITHM + " " + credential + ", " + signerHeaders + ", " + signatureHeader;
    }

    private static String[] getSignedHeaders(Map<String, String> headers) {
        String[] signedHeaders = headers.keySet().toArray(new String[0]);
        Arrays.sort(signedHeaders, String.CASE_INSENSITIVE_ORDER);
        return signedHeaders;
    }

    private static String getCanonicalizedHeaderString(Map<String, String> headers) {
        StringBuilder buffer = new StringBuilder();
        for (String signedHeader : getSignedHeaders(headers)) {
            String value = headers.get(signedHeader);
            String key = signedHeader.toLowerCase(Locale.ROOT);
            buffer.append(key).append(":");
            if (value != null) {
                buffer.append(value.trim());
            }
            buffer.append("\n");
        }
        return buffer.toString();
    }

    private static String getSignedHeadersString(Map<String, String> headers) {
        String[] signedHeaders = getSignedHeaders(headers);
        if (signedHeaders.length == 0) {
            return "";
        }
        return Arrays.stream(signedHeaders).map(
                s -> s.toLowerCase(Locale.ROOT)).collect(Collectors.joining(";"));
    }

    private static String calculateContentHash(HttpRequest request) {
        String body = request.getBodyAsString();
        if (body == null || body.equals("")) {
            return EMPTY_BODY_SM3;
        }
        return BinaryUtils.toHex(hashSm3(body));
    }

    private static byte[] hashSm3(String content) {
        byte[] srcData = content.getBytes(StandardCharsets.UTF_8);
        SM3Digest digest = new SM3Digest();
        digest.update(srcData, 0, srcData.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash, 0);
        return hash;
    }

    static {
        if (Security.getProvider(Constants.SECURITY_PROVIDER_BGM) == null) {
            Security.addProvider(new BGMProvider());
        }
    }
}
