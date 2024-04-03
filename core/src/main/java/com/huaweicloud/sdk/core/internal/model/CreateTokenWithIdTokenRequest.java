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

import java.util.function.Consumer;

public class CreateTokenWithIdTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")

    private String idpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private GetIdTokenRequestBody body;

    public CreateTokenWithIdTokenRequest withIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Idp-Id")
    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public CreateTokenWithIdTokenRequest withBody(GetIdTokenRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTokenWithIdTokenRequest withBody(Consumer<GetIdTokenRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new GetIdTokenRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public GetIdTokenRequestBody getBody() {
        return body;
    }

    public void setBody(GetIdTokenRequestBody body) {
        this.body = body;
    }
}
