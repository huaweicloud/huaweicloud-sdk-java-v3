/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
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

package com.huaweicloud.sdk.iotda.v5.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.AKSKSigner;
import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.AuthCache;
import com.huaweicloud.sdk.core.auth.DerivedAKSKSigner;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.InnerIamMeta;
import com.huaweicloud.sdk.core.internal.model.KeystoneCreateProjectRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneCreateProjectResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsResponse;
import com.huaweicloud.sdk.core.internal.model.KeystoneListRegionsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListRegionsResponse;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.iotda.v5.region.IoTDARegion;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * @author HuaweiCloud_SDK
 * @deprecated Use BasicCredentials instead.
 */
@Deprecated
public class IoTDACredentials extends AbstractCredentials<IoTDACredentials> {
    private String projectId;

    /**
     * 是否为默认端点
     * <p>
     * true：默认端点，使用 {@link com.huaweicloud.sdk.core.auth.BasicCredentials} 方式相同的
     * false or null：非默认端点。
     */
    private Boolean isDefaultEndpoint;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * @param projectId id of project showed in console
     * @return BasicCredentials
     */
    public IoTDACredentials withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public IoTDACredentials withDefaultEndpoint(Boolean defaultEndpoint) {
        isDefaultEndpoint = defaultEndpoint;
        return this;
    }

    Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (Objects.nonNull(projectId)) {
            pathParam.put(Constants.PROJECT_ID, projectId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        if (!StringUtils.isEmpty(this.projectId)) {
            return CompletableFuture.completedFuture(this);
        }
        // Confirm if current ak has been cached in AuthCache, key of authMap is ak+regionId
        String akWithName = getAk() + regionId;
        if (Objects.nonNull(AuthCache.getAuth(akWithName)) && !StringUtils.isEmpty(AuthCache.getAuth(akWithName))) {
            this.projectId = AuthCache.getAuth(akWithName);
            return CompletableFuture.completedFuture(this);
        }

        Boolean tmpDefaultEndpoint = isDefaultEndpoint;
        isDefaultEndpoint = true;

        String iamEndpoint = StringUtils.isEmpty(getIamEndpoint()) ? Constants.DEFAULT_IAM_ENDPOINT : getIamEndpoint();
        HcClient inner = hcClient.overrideEndpoints(Collections.singletonList(iamEndpoint));
        KeystoneListProjectsRequest request = new KeystoneListProjectsRequest().withName(regionId);
        KeystoneListProjectsResponse response = inner.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_PROJECTS);
        if (Objects.isNull(response)) {
            throw new SdkException(
                    "Failed to get project id, " + "please input project id when initializing BasicCredentials");
        }
        if (response.getProjects().size() == 1) {
            this.projectId = response.getProjects().get(0).getId();
        } else {
            this.projectId = keystoneCreateProject(inner, regionId);
        }
        AuthCache.putAuth(akWithName, projectId);

        isDefaultEndpoint = tmpDefaultEndpoint;

        return CompletableFuture.completedFuture(this);
    }

    private String keystoneCreateProject(HcClient client, String regionId) {
        List<String> supportedRegions = getSupportedRegions(client);
        if (Objects.isNull(supportedRegions) || supportedRegions.size() == 0) {
            throw new SdkException("failed to list regions");
        }
        if (!supportedRegions.contains(regionId)) {
            throw new SdkException("the region input is not supported to create project automatically");
        }
        String domainId = getDomainId(client);
        if (StringUtils.isEmpty(domainId)) {
            throw new SdkException(Constants.ErrorMessage.NO_DOMAIN_ID_FOUND);
        }
        return getCreateProjectId(client, regionId, domainId);
    }

    private List<String> getSupportedRegions(HcClient hcClient) {
        final String publicRegionType = "public";
        KeystoneListRegionsRequest request = new KeystoneListRegionsRequest();
        KeystoneListRegionsResponse response = hcClient.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_REGIONS);
        if (Objects.isNull(response)) {
            throw new SdkException("failed to list all regions");
        }
        return response.getRegions().stream().map(region -> {
            if (publicRegionType.equals(region.getType())) {
                return region.getId();
            }
            return null;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

    private String getDomainId(HcClient hcClient) {
        KeystoneListAuthDomainsRequest request = new KeystoneListAuthDomainsRequest();
        KeystoneListAuthDomainsResponse response = hcClient.syncInvokeHttp(request,
                InnerIamMeta.KEYSTONE_LIST_AUTH_DOMAINS);
        if (Objects.isNull(response)) {
            throw new SdkException(Constants.ErrorMessage.NO_DOMAIN_ID_FOUND);
        }
        return response.getDomains().get(0).getId();
    }

    private String getCreateProjectId(HcClient hcClient, String regionId, String domainId) {
        GlobalCredentials globalCredentials = new GlobalCredentials().withAk(getAk()).withSk(getSk())
                .withDomainId(domainId);
        HcClient innerGlobal = hcClient.overrideCredential(globalCredentials);
        KeystoneCreateProjectRequest request = new KeystoneCreateProjectRequest()
                .withBody(body -> body.withProject(project -> {
                    project.withName(regionId);
                    project.withDomainId(domainId);
                }));
        KeystoneCreateProjectResponse response = innerGlobal.syncInvokeHttp(request,
                InnerIamMeta.KEYSTONE_CREATE_PROJECT);
        if (Objects.isNull(response.getProject())) {
            throw new SdkException("failed to create project");
        }
        return response.getProject().getId();
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addAutoFilledPathParam(getPathParams());
            if (Objects.nonNull(getProjectId())) {
                builder.addHeader(Constants.X_PROJECT_ID, projectId);
            }
            if (Objects.nonNull(getSecurityToken())) {
                builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
            }
            if (Objects.nonNull(httpRequest.getContentType())
                    && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
                builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
            }
            Map<String, String> header = isDefaultEndpoint(httpRequest)
                    ? AKSKSigner.getInstance().sign(builder.build(), this)
                    : DerivedAKSKSigner.getInstance().sign(builder.build(), this);
            builder.addHeaders(header);
            return builder.build();
        });
    }

    private boolean isDefaultEndpoint(HttpRequest httpRequest) {
        // 配置优先级最高
        if (Objects.nonNull(this.isDefaultEndpoint)) {
            return this.isDefaultEndpoint;
        }
        // 根据请求判断
        try {
            return Objects.equals(IoTDARegion.valueOf(regionId).getEndpoints().get(0), httpRequest.getEndpoint());
        } catch (IllegalArgumentException exp) {
            return false;
        }
    }

    @Override
    public IoTDACredentials deepClone() {
        return new IoTDACredentials().withProjectId(this.projectId).withAk(this.getAk()).withSk(this.getSk())
                .withIamEndpoint(this.getIamEndpoint()).withSecurityToken(this.getSecurityToken());
    }

    @Override
    public void processDerivedAuthParams(String derivedAuthServiceName, String regionId) {
        if (this.derivedAuthServiceName == null) {
            this.derivedAuthServiceName = derivedAuthServiceName;
        }

        if (this.regionId == null) {
            this.regionId = regionId;
        }
    }

    @Override
    protected void updateAuthTokenByIdToken(HttpClient httpClient) {

    }
}