/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
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

package com.huaweicloud.sdk.core.http;

import com.huaweicloud.sdk.core.exception.SdkException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public interface HttpRequest {

    static HttpRequestBuilder newBuilder() {
        return new HttpRequestBuilder();
    }

    class HttpRequestBuilder {
        private Impl httpRequest;

        private HttpRequestBuilder() {
            this.httpRequest = new Impl();
        }

        private HttpRequestBuilder(Impl httpRequest) {
            this.httpRequest = httpRequest;
        }

        public HttpRequestBuilder withEndpoint(String endpoint) {
            httpRequest.endpoint = endpoint;
            return this;
        }

        public HttpRequestBuilder withPath(String path) {
            httpRequest.path = path;
            return this;
        }

        public HttpRequestBuilder withContentType(String contentType) {
            httpRequest.contentType = contentType;
            return this;
        }

        public HttpRequestBuilder withMethod(HttpMethod method) {
            httpRequest.method = method;
            return this;
        }

        public HttpRequestBuilder withBodyAsString(String bodyAsString) {
            httpRequest.bodyAsString = bodyAsString;
            return this;
        }

        public HttpRequestBuilder addHeader(String key, Object value) {
            httpRequest.headers.putIfAbsent(key, value);
            return this;
        }

        public HttpRequestBuilder addHeaders(Map<String, String> headers) {
            httpRequest.headers.putAll(headers);
            return this;
        }

        public HttpRequestBuilder addQueryParam(String key, List<Object> value) {
            httpRequest.queryParams.putIfAbsent(key, value);
            return this;
        }

        public HttpRequestBuilder addPathParam(String key, Object value) {
            httpRequest.pathParams.putIfAbsent(key, value);
            return this;
        }

        public HttpRequestBuilder addPathParam(Map<String, Object> pathParam) {
            httpRequest.pathParams.putAll(pathParam);
            return this;
        }

        public HttpRequest build() {

            return httpRequest.buildPathParamsString().buildQueryParamsString().buildUrl();
        }
    }

    class Impl implements HttpRequest {
        private static final Logger LOG = LoggerFactory.getLogger(Impl.class);
        private String endpoint;
        private String path;
        private HttpMethod method = HttpMethod.GET;
        private Map<String, List<Object>> queryParams = new LinkedHashMap<>();
        private Map<String, Object> headers = new HashMap();
        private Map<String, Object> pathParams = new LinkedHashMap<>();
        private String contentType = "application/json";
        private String bodyAsString;
        private String queryParamsString;
        private String pathParamsString;
        private URL url;

        public HttpRequestBuilder builder() {
            return new HttpRequestBuilder(this);
        }

        @Override
        public String getEndpoint() {
            return endpoint;
        }

        @Override
        public String getPath() {
            return path;
        }

        @Override
        public HttpMethod getMethod() {
            return method;
        }

        @Override
        public Map<String, List<Object>> getQueryParams() {
            return queryParams;
        }

        @Override
        public Map<String, Object> getHeaders() {
            return headers;
        }

        @Override
        public String getContentType() {
            return contentType;
        }

        @Override
        public String getBodyAsString() {
            return bodyAsString;
        }

        @Override
        public String getQueryParamsString() {
            return queryParamsString;
        }

        @Override
        public String getPathParamsString() {
            return pathParamsString;
        }

        @Override
        public URL getUrl() {
            return url;
        }

        private Impl buildPathParamsString() {
            this.pathParamsString = Objects.isNull(path) ? "" : path;
            pathParams.forEach((key, value) ->
                pathParamsString =
                    pathParamsString.replace(String.format("{%s}", key), value.toString()));
            return this;
        }

        private Impl buildQueryParamsString() {
            StringBuilder sb = new StringBuilder();
            queryParams.forEach((key, values) -> values.forEach(value -> {
                sb.append(String.format("%s=%s&", key, value));
            }));
            this.queryParamsString = sb.length() > 0 ? sb.deleteCharAt(sb.length() - 1).toString() : sb.toString();
            return this;
        }

        private Impl buildUrl() {
            try {
                if (!StringUtils.isEmpty(queryParamsString)) {
                    this.url = new URL(endpoint + pathParamsString + "?" + queryParamsString);
                } else {
                    this.url = new URL(endpoint + pathParamsString);
                }
            } catch (MalformedURLException e) {
                LOG.error("region endpoint can not be found");
                throw new SdkException(e);
            }
            return this;
        }
    }

    HttpRequestBuilder builder();

    String getEndpoint();

    String getPath();

    HttpMethod getMethod();

    Map<String, List<Object>> getQueryParams();

    Map<String, Object> getHeaders();

    String getContentType();

    String getBodyAsString();

    String getQueryParamsString();

    String getPathParamsString();

    URL getUrl();
}
