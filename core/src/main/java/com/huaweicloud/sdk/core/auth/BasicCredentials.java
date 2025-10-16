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

package com.huaweicloud.sdk.core.auth;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.InnerIamMeta;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListProjectsResponse;
import com.huaweicloud.sdk.core.internal.model.Project;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author HuaweiCloud_SDK
 */
public class BasicCredentials extends AbstractCredentials<BasicCredentials> {

    private String projectId;

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
    public BasicCredentials withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (!StringUtils.isEmpty(projectId)) {
            pathParam.put(Constants.PROJECT_ID, projectId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.supplyAsync(() -> {
            if (!StringUtils.isEmpty(getIdpId()) || !StringUtils.isEmpty(getIdTokenFile())) {
                if (StringUtils.isEmpty(getIdpId())) {
                    throw new SdkException("idpId is required when using idpId&idTokenFile");
                } else if (StringUtils.isEmpty(getIdTokenFile())) {
                    throw new SdkException("idTokenFile is required when using idpId&idTokenFile");
                }
            }

            if (!StringUtils.isEmpty(projectId)) {
                return this;
            }

            // Confirm if current ak has been cached in AuthCache, key of authMap is ak+regionId
            String akWithName = getAk() + regionId;
            String cachedProjectId = AuthCache.getAuth(akWithName);
            if (!StringUtils.isEmpty(cachedProjectId)) {
                projectId = cachedProjectId;
                return this;
            }

            String iamEndpoint = getUsedIamEndpoint(regionId);
            HcClient inner = hcClient.overrideEndpoints(Collections.singletonList(iamEndpoint));

            Function<HttpRequest, Boolean> derivedPredicate = getDerivedPredicate();
            setDerivedPredicate(null);

            Logger logger = LoggerFactory.getLogger(hcClient.getClass());
            logger.info("project id of region '{}' not found in BasicCredentials, " +
                    "trying to get project id from IAM service automatically: {}", regionId, iamEndpoint);
            KeystoneListProjectsRequest request = new KeystoneListProjectsRequest().withName(regionId);
            KeystoneListProjectsResponse response = inner.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_PROJECTS);
            if (Objects.isNull(response)) {
                throw new SdkException(Constants.ErrorMessage.NO_PROJECT_ID_FOUND);
            }

            List<Project> projects = response.getProjects();
            if (projects.size() == 1) {
                projectId = projects.get(0).getId();
            } else if (projects.size() < 1) {

                throw new SdkException(String.format(Locale.US,
                        "Failed to get project id of region '%s' automatically, X-IAM-Trace-Id=%s."
                        , regionId, response.getTraceId()) +
                        " Confirm that the project exists in your account," +
                        " or set project id manually:" +
                        " new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);");
            } else {
                String projectIds = projects.stream().map(Project::getId).collect(Collectors.joining(","));

                throw new SdkException(String.format(Locale.US,
                        "Multiple project ids found: [%s], X-IAM-Trace-Id=%s. ",
                        projectIds, response.getTraceId()) +
                        "Please select one when initializing the credentials: " +
                        "new BasicCredentials().withAk(ak).withSk(sk).withProjectId(projectId);");
            }
            logger.info("Success to get project id of region '{}': {}", regionId, StringUtils.mask(projectId));
            AuthCache.putAuth(akWithName, projectId);

            setDerivedPredicate(derivedPredicate);

            return this;
        }, hcClient.getHttpConfig().getExecutorService());
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(syncProcessAuthRequest(httpRequest, httpClient));
    }

    @Override
    public HttpRequest syncProcessAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addAutoFilledPathParam(getPathParams());

        if (needUpdateFederalAuthToken()) {
            updateFederalAuthTokenByIdToken(httpClient);
        } else if (needUpdateSecurityTokenFromMetadata()) {
            updateSecurityTokenFromMetadata();
        }

        if (!StringUtils.isEmpty(getProjectId())) {
            builder.addHeader(Constants.X_PROJECT_ID, projectId);
        }

        if (!StringUtils.isEmpty(getSecurityToken())) {
            builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
        }

        if (Objects.nonNull(httpRequest.getContentType())
                && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)
                && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_BSON)) {
            builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
        }

        Map<String, String> headers;
        if (isDerivedAuth(httpRequest)) {
            headers = DerivedAKSKSigner.getInstance().sign(builder.build(), this);
        } else {
            IAKSKSigner signer = AKSKSignerFactory.getSigner(httpRequest.getSigningAlgorithm());
            headers = signer.sign(builder.build(), this);
        }

        builder.addHeaders(headers);
        return builder.build();
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
    public BasicCredentials deepClone() {
        BasicCredentials credentials = new BasicCredentials()
                .withProjectId(projectId)
                .withAk(getAk())
                .withSk(getSk())
                .withIdpId(getIdpId())
                .withIdTokenFile(getIdTokenFile())
                .withDerivedPredicate(getDerivedPredicate())
                .withIamEndpoint(getIamEndpoint())
                .withSecurityToken(getSecurityToken());

        credentials.processDerivedAuthParams(derivedAuthServiceName, regionId);
        return credentials;
    }
}
