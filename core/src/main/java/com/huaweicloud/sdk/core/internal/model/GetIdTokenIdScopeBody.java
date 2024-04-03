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

public class GetIdTokenIdScopeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private GetIdTokenScopeDomainOrProjectBody domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project")

    private GetIdTokenScopeDomainOrProjectBody project;

    public GetIdTokenIdScopeBody withDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
        return this;
    }

    public GetIdTokenIdScopeBody withDomain(Consumer<GetIdTokenScopeDomainOrProjectBody> domainSetter) {
        if (this.domain == null) {
            this.domain = new GetIdTokenScopeDomainOrProjectBody();
            domainSetter.accept(this.domain);
        }

        return this;
    }

    public GetIdTokenScopeDomainOrProjectBody getDomain() {
        return domain;
    }

    public void setDomain(GetIdTokenScopeDomainOrProjectBody domain) {
        this.domain = domain;
    }

    public GetIdTokenIdScopeBody withProject(GetIdTokenScopeDomainOrProjectBody project) {
        this.project = project;
        return this;
    }

    public GetIdTokenIdScopeBody withProject(Consumer<GetIdTokenScopeDomainOrProjectBody> projectSetter) {
        if (this.project == null) {
            this.project = new GetIdTokenScopeDomainOrProjectBody();
            projectSetter.accept(this.project);
        }

        return this;
    }

    public GetIdTokenScopeDomainOrProjectBody getProject() {
        return project;
    }

    public void setProject(GetIdTokenScopeDomainOrProjectBody project) {
        this.project = project;
    }
}
