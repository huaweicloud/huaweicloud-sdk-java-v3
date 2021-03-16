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

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


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
            if (Objects.nonNull(contentType)) {
                addHeader(Constants.CONTENT_TYPE, contentType);
            }
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

        public HttpRequestBuilder withBody(InputStream body) {
            httpRequest.body = body;
            return this;
        }

        public HttpRequestBuilder addHeader(String key, String value) {
            if (httpRequest.headers.containsKey(key) && Objects.nonNull(httpRequest.headers.get(key))) {
                httpRequest.headers.get(key).add(value);
            } else {
                httpRequest.headers.put(key, Arrays.asList(value));
            }
            return this;
        }

        public HttpRequestBuilder addHeaders(Map<String, String> headers) {
            headers.entrySet().forEach(entry -> this.addHeader(entry.getKey(), entry.getValue()));
            return this;
        }

        public HttpRequestBuilder addQueryParam(String key, List<String> value) {
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

        public HttpRequestBuilder addAutoFilledPathParam(String key, String value) {
            httpRequest.autoFilledPathParams.putIfAbsent(key, value);
            return this;
        }

        public HttpRequestBuilder addAutoFilledPathParam(Map<String, Object> pathParam) {
            httpRequest.autoFilledPathParams.putAll(pathParam);
            return this;
        }

        public HttpRequestBuilder addFormDataPart(String name, FormDataPart formDataPart) {
            httpRequest.formData.put(name, formDataPart);
            return this;
        }

        public HttpRequestBuilder withFormDataPart(Map<String, FormDataPart> fromData) {
            httpRequest.formData = fromData;
            return this;
        }

        public HttpRequest build() {
            return httpRequest.buildPathParamsString().buildQueryParamsString().buildUrl();
        }
    }

    class Impl implements HttpRequest, Cloneable {
        private static final Logger LOG = LoggerFactory.getLogger(Impl.class);

        private String endpoint;

        private String path;

        private HttpMethod method = HttpMethod.GET;

        private Map<String, List<String>> queryParams = new LinkedHashMap<>();

        private Map<String, List<String>> headers = new HashMap();

        private Map<String, Object> pathParams = new LinkedHashMap<>();

        private Map<String, Object> autoFilledPathParams = new LinkedHashMap<>();

        private String contentType = Constants.MEDIATYPE.APPLICATION_JSON;

        private String bodyAsString;

        private String queryParamsString;

        private String pathParamsString;

        private URL url;

        private InputStream body;

        private Map<String, FormDataPart> formData = new TreeMap<>();

        @Override
        public HttpRequestBuilder builder() {
            try {
                return new HttpRequestBuilder(this.clone());
            } catch (CloneNotSupportedException e) {
                throw new SdkException("Can not create a new builder", e);
            }
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
        public Map<String, List<String>> getQueryParams() {
            return queryParams;
        }

        @Override
        public Map<String, List<String>> getHeaders() {
            return headers;
        }

        @Override
        public Boolean haveHeader(String name) {
            if (Objects.isNull(headers)) {
                return false;
            }
            return headers.containsKey(name);
        }

        @Override
        public String getHeader(String name) {
            if (Objects.isNull(headers)) {
                return null;
            }
            List<String> values = headers.get(name);
            return Objects.isNull(values) || values.isEmpty() ? null : values.get(0);
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

        @Override
        public InputStream getBody() {
            return body;
        }

        @Override
        public Map<String, FormDataPart> getFormData() {
            return formData;
        }

        @Override
        public Impl clone() throws CloneNotSupportedException {
            Impl impl = (Impl) super.clone();
            impl.method = this.method;
            impl.bodyAsString = this.bodyAsString;
            impl.contentType = this.contentType;
            impl.endpoint = this.endpoint;
            impl.path = this.path;
            impl.pathParams = new HashMap<>(this.pathParams);
            impl.autoFilledPathParams = new HashMap<>(this.autoFilledPathParams);
            impl.queryParams = new HashMap<>(this.queryParams);
            impl.headers = new HashMap<>(this.headers);
            return impl.buildPathParamsString().buildQueryParamsString().buildUrl();
        }

        private Impl buildPathParamsString() {
            this.pathParamsString = Objects.isNull(path) ? "" : path;
            pathParams.forEach((key, value) -> pathParamsString = pathParamsString.replace(String.format("{%s}", key),
                value.toString()));
            autoFilledPathParams.forEach(
                (key, value) -> pathParamsString = pathParamsString.replace(String.format("{%s}", key),
                    value.toString()));
            return this;
        }

        private Impl buildQueryParamsString() {
            StringBuilder sb = new StringBuilder();
            queryParams.forEach((key, values) -> {
                if (values.size() == 0) {
                    sb.append(String.format("%s=&", key));
                }
                values.forEach(value -> {
                    if (value.isEmpty()) {
                        sb.append(String.format("%s=&", key));
                    } else {
                        sb.append(String.format("%s=%s&", key, value));
                    }
                });
            });
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

    Map<String, List<String>> getQueryParams();

    Map<String, List<String>> getHeaders();

    Boolean haveHeader(String name);

    String getHeader(String name);

    String getContentType();

    String getBodyAsString();

    String getQueryParamsString();

    String getPathParamsString();

    URL getUrl();

    InputStream getBody();

    Map<String, FormDataPart> getFormData();
}
