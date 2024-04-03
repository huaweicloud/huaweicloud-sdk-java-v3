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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OsFederationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private IdpIdInfo identityProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolIdInfo protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<Object> groups = null;

    public OsFederationInfo withIdentityProvider(IdpIdInfo identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public OsFederationInfo withIdentityProvider(Consumer<IdpIdInfo> identityProviderSetter) {
        if (this.identityProvider == null) {
            this.identityProvider = new IdpIdInfo();
            identityProviderSetter.accept(this.identityProvider);
        }

        return this;
    }

    public IdpIdInfo getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdpIdInfo identityProvider) {
        this.identityProvider = identityProvider;
    }

    public OsFederationInfo withProtocol(ProtocolIdInfo protocol) {
        this.protocol = protocol;
        return this;
    }

    public OsFederationInfo withProtocol(Consumer<ProtocolIdInfo> protocolSetter) {
        if (this.protocol == null) {
            this.protocol = new ProtocolIdInfo();
            protocolSetter.accept(this.protocol);
        }

        return this;
    }

    public ProtocolIdInfo getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolIdInfo protocol) {
        this.protocol = protocol;
    }

    public OsFederationInfo withGroups(List<Object> groups) {
        this.groups = groups;
        return this;
    }

    public OsFederationInfo addGroupsItem(Object groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public OsFederationInfo withGroups(Consumer<List<Object>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }
}
