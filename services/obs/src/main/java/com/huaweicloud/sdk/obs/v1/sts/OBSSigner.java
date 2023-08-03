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

package com.huaweicloud.sdk.obs.v1.sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class OBSSigner {
    private static final Logger logger = LoggerFactory.getLogger(OBSSigner.class);

    public static final List<String> ALLOWED_RESOURCE_PARAMTER_NAMES = Collections.unmodifiableList(
            Arrays.asList("acl", "backtosource", "policy", "torrent", "logging", "location", "storageinfo", "quota",
                    "storagepolicy", "storageclass", "requestpayment", "versions", "versioning", "versionid", "uploads",
                    "uploadid", "partnumber", "website", "notification", "lifecycle", "deletebucket", "delete", "cors",
                    "restore", "tagging", "replication", "metadata", "encryption", "directcoldaccess", "mirrorrefresh",
                    "mirrorbacktosource", "obsbucketalias", "obsalias", "replication_progress", "inventory",
                    "obsworkflowtriggerpolicy", "x-workflow-limit", "x-workflow-prefix", "x-workflow-start",
                    "x-workflow-template-name", "x-workflow-graph-name", "x-workflow-execution-state", "x-obs-security-token",
                    "x-workflow-category", "x-workflow-create", "customdomain", "cdnnotifyconfiguration", "dispolicy",
                    "obscompresspolicy", "template_name", "template_name_prefix", "x-workflow-status", "sfsumount",
                    "x-workflow-type", "x-workflow-forbid", "sfsacl", "attname", "object-lock", "retention",
                    "x_obs_resource_type", "x_obs_dnslevel", "extension_policy", "x_obs_resource_id", "synccallback",
                    "orchestration", "fscreatehardlink", "asyncfetchjob", "asynccallback", "sfsmount", "asyncfetchpolicy",
                    /**
                     * File System API
                     */
                    "append", "position", "truncate", "modify", "rename", "length", "name", "fileinterface",
                    "readahead", "response-content-type", "response-content-language", "response-expires",
                    "response-cache-control", "response-content-disposition", "response-content-encoding",
                    "x-image-save-bucket", "x-image-save-object", "x-image-process", "x-obs-sse-kms-key-project-id",
                    "x-oss-process", "ignore-sign-in-query", "listcontentsummary", "multilistcontentsummary",
                    "getcontentsummary", "select", "select-type"));

    private static Class<?> jdkBase64EncoderClass;

    private static Object jdkNewEncoder;

    static {
        try {
            Class<?> base64 = Class.forName("java.util.Base64");
            jdkNewEncoder = base64.getMethod("getEncoder").invoke(null);
        } catch (ClassNotFoundException e) {
            logger.warn("class not found exception.");
        } catch (IllegalAccessException e) {
            logger.warn("illegal access exception.");
        } catch (IllegalArgumentException e) {
            logger.warn("illegal argument exception.");
        } catch (InvocationTargetException e) {
            logger.warn("invocation target exception.");
        } catch (NoSuchMethodException e) {
            logger.warn("no such method exception.");
        } catch (SecurityException e) {
            logger.warn("security exception.");
        }

        try {
            jdkBase64EncoderClass = Class.forName("sun.misc.BASE64Encoder");
        } catch (ClassNotFoundException e) {
            logger.trace("class not found exception.");
        }
    }

    public void sign(Request request) throws Exception {
        String stringToSign = makeServiceCanonicalString(request.getMethod(), request.getUrl(), request.getHeaders());
        logger.debug("stringToSign: {}", stringToSign);
        String auth = "OBS " + request.getKey() + ":" + calculateSignature(stringToSign, request.getSecret());
        Map<String, String> headers = request.getHeaders();
        headers.put("Authorization", auth);
        request.setHeaders(headers);
    }

    private final String makeServiceCanonicalString(String method, String resource, Map<String, String> headersMap) throws UnsupportedEncodingException {
        String headerPrefix = "x-obs-";
        SortedMap<String, Object> interestingHeaders = transHeaders(headersMap, headerPrefix, null);
        StringBuilder canonicalStringBuf = transCanonicalString(method, headerPrefix, interestingHeaders);

        int queryIndex = resource.indexOf('?');
        if (queryIndex < 0) {
            canonicalStringBuf.append(resource);
        } else {
            canonicalStringBuf.append(resource, 0, queryIndex);

            SortedMap<String, String> sortedResourceParams = new TreeMap<>();

            String query = resource.substring(queryIndex + 1);
            for (String paramPair : query.split("&")) {
                String[] paramNameValue = paramPair.split("=");
                String name = URLDecoder.decode(paramNameValue[0], "UTF-8");
                String value = null;
                if (paramNameValue.length > 1) {
                    value = URLDecoder.decode(paramNameValue[1], "UTF-8");
                }
                if (ALLOWED_RESOURCE_PARAMTER_NAMES.contains(name.toLowerCase(Locale.ROOT))
                        || name.toLowerCase(Locale.ROOT).startsWith(headerPrefix)) {
                    sortedResourceParams.put(name, value);
                }
            }

            if (sortedResourceParams.size() > 0) {
                canonicalStringBuf.append("?");
            }
            boolean addedParam = false;
            for (Map.Entry<String, String> entry : sortedResourceParams.entrySet()) {
                if (addedParam) {
                    canonicalStringBuf.append("&");
                }
                canonicalStringBuf.append(entry.getKey());
                if (null != entry.getValue()) {
                    canonicalStringBuf.append("=").append(entry.getValue());
                }
                addedParam = true;
            }
        }

        return canonicalStringBuf.toString();
    }

    @SuppressWarnings("unchecked")
    private StringBuilder transCanonicalString(String method, String headerPrefix,
                                               SortedMap<String, Object> interestingHeaders) {
        StringBuilder canonicalStringBuf = new StringBuilder();
        canonicalStringBuf.append(method).append("\n");

        String headerMetaPrefix = "x-obs-meta-";

        for (Map.Entry<String, Object> entry : interestingHeaders.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value instanceof List) {
                value = join((List<String>) value, ",", true);
            } else if (value == null) {
                value = "";
            }

            if (key.startsWith(headerMetaPrefix)) {
                canonicalStringBuf.append(key).append(':').append(value.toString().trim());
            } else if (key.startsWith(headerPrefix)) {
                canonicalStringBuf.append(key).append(':').append(value);
            } else {
                canonicalStringBuf.append(value);
            }
            canonicalStringBuf.append("\n");
        }
        return canonicalStringBuf;
    }

    private String join(List<?> items, String delimiter, boolean needTrim) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i).toString();
            sb.append(needTrim ? item.trim() : item);
            if (i < items.size() - 1) {
                sb.append(delimiter);
            }
        }
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private SortedMap<String, Object> transHeaders(Map<String, String> headersMap,
                                                   String headerPrefix, String expires) {
        String dateHeader = "date";
        String contentTypeHeader = "content-type";
        String contentMd5Header = "content-md5";

        SortedMap<String, Object> interestingHeaders = new TreeMap<>();
        if (headersMap != null) {
            for (Map.Entry<String, String> entry : headersMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                if (null == key) {
                    continue;
                }

                String lk = key.toLowerCase(Locale.getDefault());

                if (lk.equals(contentTypeHeader) || lk.equals(contentMd5Header) || lk.equals(dateHeader)) {
                    interestingHeaders.put(lk, value);
                } else if (lk.startsWith(headerPrefix)) {
                    List<String> values;
                    if (interestingHeaders.containsKey(lk)) {
                        values = (List<String>) interestingHeaders.get(lk);
                    } else {
                        values = new ArrayList<>();
                        interestingHeaders.put(lk, values);
                    }
                    values.add(value);
                }
            }
        }
        if (interestingHeaders.containsKey("x-obs-date")) {
            interestingHeaders.put(dateHeader, "");
        }

        if (expires != null) {
            interestingHeaders.put(dateHeader, expires);
        }

        if (!interestingHeaders.containsKey(contentTypeHeader)) {
            interestingHeaders.put(contentTypeHeader, "");
        }
        if (!interestingHeaders.containsKey(contentMd5Header)) {
            interestingHeaders.put(contentMd5Header, "");
        }

        return interestingHeaders;
    }

    private String calculateSignature(String stringToSign, String sk) throws Exception {
        return signWithHmacSha1(sk, stringToSign);
    }

    private String signWithHmacSha1(String sk, String canonicalString) throws Exception {
        SecretKeySpec signingKey;
        signingKey = new SecretKeySpec(sk.getBytes(StandardCharsets.UTF_8), "HmacSHA1");

        Mac mac;
        try {
            mac = Mac.getInstance("HmacSHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException("Could not find sha1 algorithm", e);
        }
        try {
            mac.init(signingKey);
        } catch (InvalidKeyException e) {
            throw new InvalidKeyException("Could not initialize the MAC algorithm", e);
        }

        return toBase64(mac.doFinal(canonicalString.getBytes(StandardCharsets.UTF_8)));
    }

    private String toBase64(byte[] data) throws Exception {
        if (jdkNewEncoder != null) {
            Method m = jdkNewEncoder.getClass().getMethod("encode", byte[].class);
            return new String((byte[]) m.invoke(jdkNewEncoder, data), StandardCharsets.UTF_8).replaceAll("\\s", "");
        }

        if (jdkBase64EncoderClass != null) {
            Method m = jdkBase64EncoderClass.getMethod("encode", byte[].class);
            return ((String) m.invoke(jdkBase64EncoderClass.getConstructor().newInstance(), data)).replaceAll("\\s",
                    "");
        }

        throw new ClassNotFoundException("Failed to find a base64 encoder");
    }

    public static class Request {
        private String key = null;
        private String secret = null;
        private String method = null;
        private URI uri = null;
        private String body = null;
        private String fragment = null;
        Map<String, String> headers = new Hashtable<>();
        private Map<String, List<String>> queryString = new Hashtable<>();
        private String bucketName;

        public String getBucketName() {
            return bucketName;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public String getMethod() {
            return method;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public URI getUri() {
            return uri;
        }

        public void setUri(URI uri) {
            this.uri = uri;
        }

        public String getUrl() {
            if (isNotBlank(uri.getRawQuery())) {
                if (isNotBlank(bucketName)) {
                    return "/" + bucketName + uri.getRawPath() + "?" + uri.getRawQuery();
                } else {
                    return uri.getRawPath() + "?" + uri.getRawQuery();
                }
            } else {
                if (isNotBlank(bucketName)) {
                    return "/" + bucketName + uri.getRawPath();
                } else {
                    return uri.getRawPath();
                }
            }
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getFragment() {
            return fragment;
        }

        public void setFragment(String fragment) {
            this.fragment = fragment;
        }

        public Map<String, String> getHeaders() {
            return headers;
        }

        public void setHeaders(Map<String, String> headers) {
            this.headers = headers;
        }

        public Map<String, List<String>> getQueryString() {
            return queryString;
        }

        public void setQueryString(Map<String, List<String>> queryString) {
            this.queryString = queryString;
        }

        @Override
        public String toString() {
            return "Request{" +
                    "key='" + key + '\'' +
                    ", secret='" + secret + '\'' +
                    ", method='" + method + '\'' +
                    ", url='" + uri.toString() + '\'' +
                    ", body='" + body + '\'' +
                    ", fragment='" + fragment + '\'' +
                    ", headers=" + headers +
                    ", queryString=" + queryString +
                    '}';
        }

        public static boolean isNotBlank(String str) {
            return str != null && str.trim().length() > 0;
        }
    }
}
