/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2026-2026. All rights reserved.
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

package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AssumeAgencyWithOidcRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_seconds")
    private Integer durationSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")
    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")
    private List<String> policyIds;

    @JsonProperty(value = "provider_urn")
    private String providerUrn;

    @JsonProperty(value = "agency_urn")
    private String agencyUrn;

    @JsonProperty(value = "agency_session_name")
    private String agencySessionName;

    @JsonProperty(value = "id_token")
    private String idToken;

    public Integer getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public AssumeAgencyWithOidcRequestBody withDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public AssumeAgencyWithOidcRequestBody withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    public AssumeAgencyWithOidcRequestBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public String getProviderUrn() {
        return providerUrn;
    }

    public void setProviderUrn(String providerUrn) {
        this.providerUrn = providerUrn;
    }

    public AssumeAgencyWithOidcRequestBody withProviderUrn(String providerUrn) {
        this.providerUrn = providerUrn;
        return this;
    }

    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    public AssumeAgencyWithOidcRequestBody withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    public String getAgencySessionName() {
        return agencySessionName;
    }

    public void setAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
    }

    public AssumeAgencyWithOidcRequestBody withAgencySessionName(String agencySessionName) {
        this.agencySessionName = agencySessionName;
        return this;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public AssumeAgencyWithOidcRequestBody withIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
}
