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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.SdkResponse;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.utils.JsonUtils;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class StsHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(StsHelper.class);

    private static final Map<String, String> ENDPOINTS = processEndpoints();

    private static Map<String, String> processEndpoints() {
        try (InputStream inputStream = StsHelper.class.getClassLoader()
                .getResourceAsStream("sts_endpoints.json")) {
            if (inputStream == null) {
                LOGGER.warn("cannot find sts endpoints config file, use default");
                return new HashMap<>();
            }
            return JsonUtils.fromStream(inputStream, new TypeReference<Map<String, String>>() {
            });
        } catch (Exception e) {
            LOGGER.warn("load sts endpoints error, %s", e);
            return new HashMap<>();
        }
    }

    protected static final HttpRequestDef<Object, GetCallerIdentityResponse> GET_CALLER_IDENTITY =
            HttpRequestDef.builder(HttpMethod.GET, Object.class, GetCallerIdentityResponse.class)
                    .withName("GetCallerIdentity")
                    .withUri("/v5/caller-identity")
                    .withContentType("application/json").build();

    protected static String getEndpoint() {
        String endpoint = System.getProperty(Constants.STS_ENDPOINT_PROPERTY_NAME);
        if (!StringUtils.isEmpty(endpoint)) {
            return endpoint;
        }

        endpoint = System.getenv(Constants.STS_ENDPOINT_ENV_NAME);
        if (!StringUtils.isEmpty(endpoint)) {
            return endpoint;
        }

        return null;
    }

    protected static String getEndpoint(String id) {
        String endpoint = getEndpoint();
        if (StringUtils.isNotEmpty(endpoint)) {
            return endpoint;
        }

        return ENDPOINTS.get(id);
    }

    protected static class GetCallerIdentityResponse extends SdkResponse {
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "account_id")
        private String accountId;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "principal_urn")
        private String principalUrn;

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonProperty(value = "principal_id")
        private String principalId;

        public GetCallerIdentityResponse withAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public GetCallerIdentityResponse withPrincipalUrn(String principalUrn) {
            this.principalUrn = principalUrn;
            return this;
        }

        public String getPrincipalUrn() {
            return principalUrn;
        }

        public void setPrincipalUrn(String principalUrn) {
            this.principalUrn = principalUrn;
        }

        public GetCallerIdentityResponse withPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }

        public String getPrincipalId() {
            return principalId;
        }

        public void setPrincipalId(String principalId) {
            this.principalId = principalId;
        }

    }

}
