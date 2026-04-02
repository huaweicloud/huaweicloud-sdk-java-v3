/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2025-2025. All rights reserved.
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

import com.huaweicloud.sdk.core.http.HttpClient;

public class AccessorOptions {
    private final HttpClient httpClient;
    private final String iamEndpoint;
    private final String idpId;
    private final String idTokenFile;

    public HttpClient getHttpClient() {
        return httpClient;
    }

    public String getIamEndpoint() {
        return iamEndpoint;
    }

    public String getIdpId() {
        return idpId;
    }

    public String getIdTokenFile() {
        return idTokenFile;
    }

    private AccessorOptions(Builder builder) {
        this.httpClient = builder.httpClient;
        this.iamEndpoint = builder.iamEndpoint;
        this.idpId = builder.idpId;
        this.idTokenFile = builder.idTokenFile;
    }

    public static class Builder {
        private HttpClient httpClient;
        private String iamEndpoint;
        private String idpId;
        private String idTokenFile;

        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public Builder iamEndpoint(String iamEndpoint) {
            this.iamEndpoint = iamEndpoint;
            return this;
        }

        public Builder idpId(String idpId) {
            this.idpId = idpId;
            return this;
        }

        public Builder idTokenFile(String idTokenFile) {
            this.idTokenFile = idTokenFile;
            return this;
        }

        public AccessorOptions build() {
            return new AccessorOptions(this);
        }
    }
}
