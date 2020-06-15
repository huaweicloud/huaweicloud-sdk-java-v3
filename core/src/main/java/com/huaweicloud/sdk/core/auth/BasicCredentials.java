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

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

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
            pathParam.put(Constants.PROJECT_ID, projectId);
        }
        if (Objects.nonNull(domainId)) {
            pathParam.put(Constants.DOMAIN_ID, domainId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addPathParam(getPathParams());

            if (!StringUtils.isEmpty(projectId)) {
                builder.addHeader(Constants.X_PROJECT_ID, projectId);
            }

            if (!StringUtils.isEmpty(domainId)) {
                builder.addHeader(Constants.X_DOMAIN_ID, domainId);
            }

            if (Objects.nonNull(httpRequest.getContentType())
                    && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
                builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
            }

            Map<String, String> header = AKSKSigner.sign(builder.build(), this);
            builder.addHeaders(header);

            return builder.build();
        });
    }

    @Override
    public List<String> getSensitiveHeaders() {
        String[] sensitives = new String[]{"authorization", "x-auth-token", "x-subject-token", "x-service-token"};
        List<String> sensitiveHeaders = new ArrayList<>(Arrays.asList(sensitives));
        return sensitiveHeaders;
    }
}
