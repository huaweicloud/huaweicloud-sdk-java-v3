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

public class GetIdTokenAuthParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_token")

    private GetIdTokenIdTokenBody idToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private GetIdTokenIdScopeBody scope;

    public GetIdTokenAuthParams withIdToken(GetIdTokenIdTokenBody idToken) {
        this.idToken = idToken;
        return this;
    }

    public GetIdTokenAuthParams withIdToken(Consumer<GetIdTokenIdTokenBody> idTokenSetter) {
        if (this.idToken == null) {
            this.idToken = new GetIdTokenIdTokenBody();
            idTokenSetter.accept(this.idToken);
        }

        return this;
    }

    public GetIdTokenIdTokenBody getIdToken() {
        return idToken;
    }

    public void setIdToken(GetIdTokenIdTokenBody idToken) {
        this.idToken = idToken;
    }

    public GetIdTokenAuthParams withScope(GetIdTokenIdScopeBody scope) {
        this.scope = scope;
        return this;
    }

    public GetIdTokenAuthParams withScope(Consumer<GetIdTokenIdScopeBody> scopeSetter) {
        if (this.scope == null) {
            this.scope = new GetIdTokenIdScopeBody();
            scopeSetter.accept(this.scope);
        }

        return this;
    }

    public GetIdTokenIdScopeBody getScope() {
        return scope;
    }

    public void setScope(GetIdTokenIdScopeBody scope) {
        this.scope = scope;
    }
}
