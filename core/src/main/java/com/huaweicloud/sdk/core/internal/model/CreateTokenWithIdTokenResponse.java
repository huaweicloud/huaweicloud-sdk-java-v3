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
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.function.Consumer;

public class CreateTokenWithIdTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private ScopedTokenInfo token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")

    private String subjectToken;

    public CreateTokenWithIdTokenResponse withToken(ScopedTokenInfo token) {
        this.token = token;
        return this;
    }

    public CreateTokenWithIdTokenResponse withToken(Consumer<ScopedTokenInfo> tokenSetter) {
        if (this.token == null) {
            this.token = new ScopedTokenInfo();
            tokenSetter.accept(this.token);
        }

        return this;
    }

    public ScopedTokenInfo getToken() {
        return token;
    }

    public void setToken(ScopedTokenInfo token) {
        this.token = token;
    }

    public CreateTokenWithIdTokenResponse withSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Subject-Token")
    public String getSubjectToken() {
        return subjectToken;
    }

    public void setSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
    }
}
