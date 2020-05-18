/*
 * Copyright 2020 Huawei Technologies Co.,Ltd.
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

import com.huaweicloud.sdk.core.http.HttpRequest;
import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class BasicCredentials implements ICredential {

    private String ak;
    private String sk;
    private String projectId;
    private String domainId;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public BasicCredentials withAk(String ak) {
        this.ak = ak;
        return this;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public BasicCredentials withSk(String sk) {
        this.sk = sk;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BasicCredentials withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BasicCredentials withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    private Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (Objects.nonNull(projectId)) {
            pathParam.put("project_id", projectId);
        }
        if (Objects.nonNull(domainId)) {
            pathParam.put("domain_id", domainId);
        }
        return pathParam;
    }

    @Override
    public HttpRequest processAuthRequest(HttpRequest httpRequest) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addPathParam(getPathParams());

        if (!StringUtils.isEmpty(projectId)) {
            builder.addHeader("X-Project-Id", projectId);
        }

        if (!StringUtils.isEmpty(domainId)) {
            builder.addHeader("X-Domain-Id", domainId);
        }

        Map<String, String> header = AKSKSigner.sign(builder.build(), this);
        builder.addHeaders(header);


        return builder.build();
    }
}
