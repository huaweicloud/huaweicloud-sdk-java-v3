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

import java.util.List;

public class AccessorOptions {
    private final HttpClient httpClient;
    private final String iamEndpoint;
    private final String idpId;
    private final String idTokenFile;
    private final String idToken;
    private final String oidcIdTokenFile;
    private final String providerUrn;
    private final String agencyUrn;
    private final String agencySessionName;
    private final Integer durationSeconds;
    private final String policy;
    private final List<String> policyIds;
    private final String regionId;

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

    public String getIdToken() {
        return idToken;
    }

    public String getOidcIdTokenFile() {
        return oidcIdTokenFile;
    }

    public String getProviderUrn() {
        return providerUrn;
    }

    public String getAgencyUrn() {
        return agencyUrn;
    }

    public String getAgencySessionName() {
        return agencySessionName;
    }

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public String getPolicy() {
        return policy;
    }

    public List<String> getPolicyIds() {
        return policyIds;
    }

    public String getRegionId() {
        return regionId;
    }

    private AccessorOptions(Builder builder) {
        this.httpClient = builder.httpClient;
        this.iamEndpoint = builder.iamEndpoint;
        this.idpId = builder.idpId;
        this.idTokenFile = builder.idTokenFile;
        this.idToken = builder.idToken;
        this.oidcIdTokenFile = builder.oidcIdTokenFile;
        this.providerUrn = builder.providerUrn;
        this.agencyUrn = builder.agencyUrn;
        this.agencySessionName = builder.agencySessionName;
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.policyIds = builder.policyIds;
        this.regionId = builder.regionId;
    }

    public static class Builder {
        private HttpClient httpClient;
        private String iamEndpoint;
        private String idpId;
        private String idTokenFile;
        private String idToken;
        private String oidcIdTokenFile;
        private String providerUrn;
        private String agencyUrn;
        private String agencySessionName;
        private Integer durationSeconds;
        private String policy;
        private List<String> policyIds;
        private String regionId;

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

        public Builder idToken(String idToken) {
            this.idToken = idToken;
            return this;
        }

        public Builder oidcIdTokenFile(String oidcIdTokenFile) {
            this.oidcIdTokenFile = oidcIdTokenFile;
            return this;
        }

        public Builder providerUrn(String providerUrn) {
            this.providerUrn = providerUrn;
            return this;
        }

        public Builder agencyUrn(String agencyUrn) {
            this.agencyUrn = agencyUrn;
            return this;
        }

        public Builder agencySessionName(String agencySessionName) {
            this.agencySessionName = agencySessionName;
            return this;
        }

        public Builder durationSeconds(Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        public Builder policyIds(List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }

        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public AccessorOptions build() {
            return new AccessorOptions(this);
        }
    }
}
