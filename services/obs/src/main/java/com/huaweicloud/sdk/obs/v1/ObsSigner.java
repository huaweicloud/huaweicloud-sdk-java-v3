/*
 * Copyright 2023 Huawei Technologies Co.,Ltd.
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

package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.HttpRequest;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ObsSigner {
    private static final String SIGN_SEP = "\n";

    private static final String OBS_PREFIX = "x-obs-";

    private static final String DEFAULT_ENCODING = "UTF-8";

    private static final String X_OBS_PREFIX = "x-obs-";

    private static final String CONTENT_TYPE = "Content-Type";

    private static final String X_OBS_DATE = "x-obs-date";

    private static final String CONTENT_MD5 = "Content-MD5";

    private static final String X_OBS_SECURITY_TOKEN = "x-obs-security-token";

    private static final String DATE = "date";

    private static final String DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z";

    private static final String FILE = "file";

    private static final List<String> SUB_RESOURCES = Collections.unmodifiableList(
            Arrays.asList("CDNNotifyConfiguration", "acl", "append", "attname", "backtosource", "cors", "customdomain",
                    "delete", "deletebucket", "directcoldaccess", "encryption", "inventory", "length", "lifecycle", "location",
                    "logging", "metadata", "modify", "name", "notification", "orchestration", "partNumber", "policy",
                    "position", "quota", "rename", "replication", "response-cache-control", "response-content-disposition",
                    "response-content-encoding", "response-content-language", "response-content-type", "response-expires",
                    "restore", "storageClass", "storagePolicy", "storageinfo", "tagging", "torrent", "truncate", "uploadId",
                    "uploads", "versionId", "versioning", "versions", "website", "x-image-process", "x-image-save-bucket",
                    "x-image-save-object", "x-obs-security-token"));

    private static final Base64.Encoder BASE64_ENCODER = Base64.getEncoder();

    private static final MessageDigest MESSAGE_DIGEST;

    static {
        try {
            MESSAGE_DIGEST = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new SdkException("Failed to sign request", e);
        }
    }

    private final ObsCredentials credentials;

    private String contentMd5 = "";

    private String contentType = "";

    private String date = "";

    public ObsSigner(ObsCredentials credentials) {
        this.credentials = credentials;
    }

    public HttpRequest sign(HttpRequest httpRequest) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder();

        URL url = httpRequest.getUrl();
        String bucketName = url.getHost().split("\\.")[0];
        bucketName = "obs".equals(bucketName) ? "" : bucketName;
        String objectName = url.getPath();
        objectName = "/".equals(objectName) ? "" : objectName.substring(1);


        Map<String, List<String>> headers = httpRequest.getHeaders().entrySet().stream().filter(
                entry -> entry.getKey().startsWith(X_OBS_PREFIX)
                        || entry.getKey().equalsIgnoreCase(CONTENT_TYPE)
                        || entry.getKey().equalsIgnoreCase(CONTENT_MD5)).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (!httpRequest.haveHeader(X_OBS_DATE) && !httpRequest.haveHeader(DATE)) {
            SimpleDateFormat format = new SimpleDateFormat(DATE_FORMAT, Locale.US);
            format.setTimeZone(TimeZone.getTimeZone("GMT"));
            String formatDate = format.format(new Date());
            headers.put(DATE, Collections.singletonList(formatDate));
            builder.addHeader(DATE, formatDate);
        }


        if (httpRequest.getBodyAsString() != null && !httpRequest.haveHeader(CONTENT_MD5)) {
            byte[] md5 = MESSAGE_DIGEST.digest(httpRequest.getBodyAsString().getBytes(StandardCharsets.UTF_8));
            String encode = BASE64_ENCODER.encodeToString(md5);
            headers.put(CONTENT_MD5, Collections.singletonList(encode));
            builder.addHeader(CONTENT_MD5, encode);
        }

        String securityToken = credentials.getSecurityToken();
        if (securityToken != null) {
            builder.addHeader(X_OBS_SECURITY_TOKEN, securityToken);
            headers.put(X_OBS_SECURITY_TOKEN, Collections.singletonList(securityToken));
        }

        Map<String, FormDataPart<?>> formData = httpRequest.getFormData();
        if (formData != null && formData.containsKey(FILE)) {
            FormDataPart<?> file = formData.remove(FILE);
            formData.put(FILE, file);
        } else {
            String signature;
            try {
                signature = headerSignature(httpRequest.getMethod().toString(), headers, httpRequest.getQueryParams(),
                        bucketName, objectName);
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException e) {
                throw new SdkException("Failed to sign request", e);
            }
            builder.addHeader(Constants.AUTHORIZATION, signature);
        }

        return builder.build();
    }

    public String urlEncode(String input) throws UnsupportedEncodingException {
        return URLEncoder.encode(input, DEFAULT_ENCODING)
                .replaceAll("%7E", "~")
                .replaceAll("%2F", "/")
                .replaceAll("%20", "+");
    }


    private String join(List<?> items, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i).toString();
            sb.append(item);
            if (i < items.size() - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    private boolean isValid(String input) {
        return input != null && !input.equals("");
    }

    private String hmacSha1(String input)
            throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec signingKey = new SecretKeySpec(
                this.credentials.getSk().getBytes(StandardCharsets.UTF_8), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(signingKey);
        return BASE64_ENCODER.encodeToString(mac.doFinal(input.getBytes(StandardCharsets.UTF_8)));
    }

    private String stringToSign(String httpMethod, Map<String, List<String>> headers, Map<String, List<String>> queries,
                                String bucketName, String objectName) throws UnsupportedEncodingException {
        TreeMap<String, String> canonicalizedHeaders = new TreeMap<>();
        List<String> temp = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            if (key == null || entry.getValue() == null || entry.getValue().size() == 0) {
                continue;
            }

            key = key.trim().toLowerCase(Locale.ENGLISH);
            if (key.equals("content-md5")) {
                contentMd5 = entry.getValue().get(0);
                continue;
            }

            if (key.equals("content-type")) {
                contentType = entry.getValue().get(0);
                continue;
            }

            if (key.equals("date")) {
                date = entry.getValue().get(0);
                continue;
            }

            if (key.startsWith(OBS_PREFIX)) {
                for (String value : entry.getValue()) {
                    if (value != null) {
                        temp.add(value.trim());
                    }
                }
                canonicalizedHeaders.put(key, this.join(temp, ","));
                temp.clear();
            }
        }

        if (canonicalizedHeaders.containsKey("x-obs-date")) {
            date = "";
        }

        // handle method/content-md5/content-type/date
        StringBuilder stringToSign = new StringBuilder();
        stringToSign.append(httpMethod)
                .append(SIGN_SEP)
                .append(contentMd5)
                .append(SIGN_SEP)
                .append(contentType)
                .append(SIGN_SEP)
                .append(date)
                .append(SIGN_SEP);

        // handle canonicalizedHeaders
        for (Map.Entry<String, String> entry : canonicalizedHeaders.entrySet()) {
            stringToSign.append(entry.getKey()).append(":").append(entry.getValue()).append(SIGN_SEP);
        }

        // handle CanonicalizedResource
        stringToSign.append("/");
        if (this.isValid(bucketName)) {
            stringToSign.append(bucketName).append("/");
            if (this.isValid(objectName)) {
                stringToSign.append(this.urlEncode(objectName));
            }
        }

        TreeMap<String, String> canonicalizedResource = new TreeMap<>();
        for (Map.Entry<String, List<String>> entry : queries.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                continue;
            }
            if (SUB_RESOURCES.contains(key)) {
                canonicalizedResource.put(key, entry.getValue().get(0));
            }
        }

        if (canonicalizedResource.size() > 0) {
            String resource = canonicalizeResource(canonicalizedResource);
            stringToSign.append(resource);
        }

        return stringToSign.toString();
    }

    private String canonicalizeResource(Map<String, String> canonicalizedResource) {
        StringBuilder resource = new StringBuilder();
        resource.append("?");

        for (Map.Entry<String, String> entry : canonicalizedResource.entrySet()) {
            resource.append(entry.getKey());
            if (this.isValid(entry.getValue())) {
                resource.append("=").append(entry.getValue());
            }
            resource.append("&");
        }

        resource.deleteCharAt(resource.length() - 1);
        return resource.toString();
    }

    private String headerSignature(String httpMethod,Map<String, List<String>> headers,
        Map<String, List<String>> queries, String bucketName, String objectName)
            throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        // 1. stringToSign
        String stringToSign = this.stringToSign(httpMethod, headers, queries, bucketName, objectName);
        // 2. signature
        return String.format("OBS %s:%s", this.credentials.getAk(), this.hmacSha1(stringToSign));
    }
}