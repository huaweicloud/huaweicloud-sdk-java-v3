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
import com.huaweicloud.sdk.core.utils.SignUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * signature certification with AK/SK
 *
 * @author HuaweiCloud_SDK
 */
public class AKSKSigner implements IAKSKSigner {
    private static volatile AKSKSigner instance;
    protected static final Map<String, ISigningKey> SIGNING_KEY_CACHE = new ConcurrentHashMap<>();
    protected AbstractHasher hasher = new SHA256Hasher();
    protected String algorithm = Constants.SDK_HMAC_SHA256;
    protected String contentHeader = Constants.X_SDK_CONTENT_SHA256;
    protected String emptyHash = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";

    protected AKSKSigner() {
    }

    public static AKSKSigner getInstance() {
        if (Objects.nonNull(instance)) {
            return instance;
        }

        synchronized (AKSKSigner.class) {
            if (instance == null) {
                instance = new AKSKSigner();
            }
            return instance;
        }
    }

    protected <T extends AbstractCredentials<T>> void checkRequired(T credential) {
        if (Objects.isNull(credential)) {
            throw new SdkException("credentials is required");
        }

        if (StringUtils.isEmpty(credential.getAk())) {
            throw new SdkException("ak is required in credentials");
        }
        if (StringUtils.isEmpty(credential.getSk())) {
            throw new SdkException("sk in credentials is required");
        }
    }

    public <T extends AbstractCredentials<T>> Map<String, String> sign(HttpRequest request, T credentials) {
        checkRequired(credentials);
        // ************* TASK 1: CONSTRUCT CANONICAL REQUEST *************
        HashMap<String, String> authenticationHeaders = new HashMap<>();

        // Step 1: add basic headers required by V4
        URL url = request.getUrl();
        // Step 1.1: Add Host header
        String canonicalHost = url.getAuthority();
        authenticationHeaders.put(Constants.HOST, canonicalHost);
        // Step 1.2: Add X-Sdk-Date
        String dateTimeStamp = extractTimeStamp(request, authenticationHeaders);
        // Step 1.3 combine all headers
        Map<String, String> allHeaders = combineAllHeaders(request, authenticationHeaders);
        // Step 2: Create Canonical URI -- the part of the URI from domain to query
        String canonicalUri = buildCanonicalUri(url);
        // Step 3: Create the canonical query string. In this example (a GET request),
        // request parameters are in the query string. Query string values must
        // be URL-encoded (space=%20). The parameters must be sorted by name.
        // For this example, the query string is pre-formatted in the request_parameters variable.
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
        String canonicalRequest = buildCanonicalRequest(request.getMethod().name(), canonicalUri,
                canonicalQueryString, canonicalHeaders, signedHeaderNames, payloadHash);
        String canonicalRequestHash = hasher.hashHexString(canonicalRequest.getBytes(StandardCharsets.UTF_8));
        // ************* TASK 2: CREATE THE STRING TO SIGN*************
        // Match the algorithm to the hashing algorithm you use, either SHA-1 or SHA-256 (recommended)
        String stringToSign = buildStringToSign(algorithm, dateTimeStamp, canonicalRequestHash);
        // ************* TASK 3: CALCULATE THE SIGNATURE *************
        // Create the signing key using the function defined above.
        ISigningKey signingKey = getSigningKey(credentials);
        String signature = buildSignature(stringToSign, signingKey);
        // ************* TASK 4: ADD SIGNING INFORMATION TO THE REQUEST *************
        // The signing information can be either in a query string value or in
        // a header named Authorization. This code shows how to use a header.
        // Create authorization header and add to request headers
        String authorization = String.format(Locale.ROOT, "%s Access=%s, SignedHeaders=%s, Signature=%s",
                algorithm, credentials.getAk(), signedHeaderNames, signature);
        authenticationHeaders.put(Constants.AUTHORIZATION, authorization);
        return authenticationHeaders;
    }

    public <T extends AbstractCredentials<T>> ISigningKey getSigningKey(T credentials) {
        String key = algorithm + credentials.getAk();
        if (SIGNING_KEY_CACHE.containsKey(key)) {
            return SIGNING_KEY_CACHE.get(key);
        }

        HmacSigningKey signingKey = new HmacSigningKey(hasher, credentials.getSk().getBytes(StandardCharsets.UTF_8));
        SIGNING_KEY_CACHE.put(key, signingKey);
        return signingKey;
    }

    protected String extractTimeStamp(HttpRequest request, Map<String, String> authenticationHeaders) {
        if (request.haveHeader(Constants.X_SDK_DATE)) {
            return request.getHeader(Constants.X_SDK_DATE);
        }

        SimpleDateFormat isoDateFormat = new SimpleDateFormat(Constants.ISO_8601_BASIC_FORMAT);
        isoDateFormat.setTimeZone(new SimpleTimeZone(0, "UTC"));
        String dateTimeStamp = isoDateFormat.format(new Date());
        authenticationHeaders.put(Constants.X_SDK_DATE, dateTimeStamp);
        return dateTimeStamp;
    }

    protected Map<String, String> combineAllHeaders(HttpRequest request,
                                                    Map<String, String> authenticationHeaders) {
        Map<String, String> allHeaders = new TreeMap<>();

        allHeaders.putAll(request.getHeaders()
                .entrySet().stream()
                .filter(entry -> !entry.getKey().equalsIgnoreCase(Constants.CONTENT_TYPE))
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toLowerCase(Locale.ROOT), entry -> entry.getValue().get(0))));
        allHeaders.putAll(authenticationHeaders.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey().toLowerCase(Locale.ROOT), Map.Entry::getValue)));
        return allHeaders;
    }

    protected String buildCanonicalUri(URL url) {
        String pathOld = url.getPath();
        if (pathOld.equals("/")) {
            return pathOld;
        }

        StringBuilder canonicalUri = new StringBuilder();
        String[] split = pathOld.split("/");
        for (String urlSplit : split) {
            canonicalUri.append(SignUtils.urlEncode(urlSplit, false)).append("/");
        }
        return canonicalUri.toString();
    }

    protected String buildCanonicalQueryString(String query, Map<String, List<String>> parameters) {
        SortedMap<String, List<String>> sorted = SignUtils.convertQuery2SortedMap(query);

        if (parameters == null || parameters.isEmpty()) {
            return "";
        }

        Iterator<Map.Entry<String, List<String>>> iterator = parameters.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> pair = iterator.next();
            String key = pair.getKey();
            List<String> values = pair.getValue();
            List<String> escapedValues = new ArrayList<>();
            for (String value : values) {
                escapedValues.add(SignUtils.urlEncode(value, false));
            }
            sorted.put(SignUtils.urlEncode(key, false), escapedValues);
        }

        return SignUtils.convertSortedMap2QueryString(sorted);
    }

    /**
     * Create the canonical headers and signed headers. Header names
     * and value must be trimmed and lowercase, and sorted in ASCII order.
     * Note that there is a trailing \n.
     *
     * @param headers
     * @return
     */
    protected String buildCanonicalHeaders(Map<String, String> headers) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            sb.append(entry.getKey().toLowerCase(Locale.ROOT)).append(":").append(entry.getValue())
                    .append(Constants.LINE_SEPARATOR);
        }
        return sb.toString();
    }

    /**
     * @param request
     * @return
     */
    protected String buildPayloadHash(HttpRequest request) {
        if (request.haveHeader(contentHeader)) {
            return request.getHeader(contentHeader);
        }
        if (Objects.nonNull(request.getBodyAsString()) && !request.getBodyAsString().isEmpty()) {
            return hasher.hashHexString(request.getBodyAsString().getBytes(StandardCharsets.UTF_8));
        }

        return emptyHash;
    }

    /**
     * @param segments param1 method
     *                 param2 canonicalURI
     *                 param3 canonicalQueryString
     *                 param4 canonicalHeaders
     *                 param5 signedHeaderNames
     *                 param6 payloadHash
     * @return
     */
    protected String buildCanonicalRequest(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    /**
     * @param segments param1 sdkSigningAlgorithm
     *                 param2 dateTimeStamp
     *                 param3 credentialScope
     *                 param4 canonicalRequestHash
     * @return
     */
    protected String buildStringToSign(String... segments) {
        return String.join(Constants.LINE_SEPARATOR, segments);
    }

    protected String buildSignature(String stringToSign, ISigningKey signingKey) {
        byte[] signed = signingKey.sign(stringToSign.getBytes(StandardCharsets.UTF_8));
        return BinaryUtils.toHex(signed);
    }

    protected static class HmacSigningKey implements ISigningKey {

        private final AbstractHasher hasher;

        private final byte[] key;

        HmacSigningKey(AbstractHasher hasher, byte[] key) {
            this.hasher = hasher;
            this.key = key;
        }

        @Override
        public byte[] sign(byte[] data) {
            return hasher.hmac(data, key);
        }

        @Override
        public boolean verify(byte[] signature, byte[] data) {
            byte[] hmac = hasher.hmac(data, key);
            return Arrays.equals(signature, hmac);
        }
    }
}
