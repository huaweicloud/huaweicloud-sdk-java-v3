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

package com.huaweicloud.sdk.core.internal.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Credential {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access")

    private String access;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret")

    private String secret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securitytoken")

    private String securitytoken;

    public Credential withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Credential withAccess(String access) {
        this.access = access;
        return this;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Credential withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public Credential withSecuritytoken(String securitytoken) {
        this.securitytoken = securitytoken;
        return this;
    }

    public String getSecurityToken() {
        return securitytoken;
    }

    public void setSecurityToken(String securitytoken) {
        this.securitytoken = securitytoken;
    }
}
