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

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.utils.StringUtils;

public class GlobalCredentials extends AbstractCredentials {

    private String domainId;

    private String iamEndpoint;

    public GlobalCredentials withAk(String ak) {
        setAk(ak);
        return this;
    }

    public GlobalCredentials withSk(String sk) {
        setSk(sk);
        return this;
    }

    public GlobalCredentials withSecurityToken(String securityToken) {
        setSecurityToken(securityToken);
        return this;
    }

    public String getIamEndpoint() {
        return iamEndpoint;
    }

    public void setIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
    }

    /**
     * @param iamEndpoint endpoint can be override when using development environment.
     * @return GlobalCredentials with override endpoint.
     */
    public GlobalCredentials withIamEndpoint(String iamEndpoint) {
        setIamEndpoint(iamEndpoint);
        return this;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GlobalCredentials withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (Objects.nonNull(domainId)) {
            pathParam.put(Constants.DOMAIN_ID, domainId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HttpClient httpClient, String regionId) {
        if (!StringUtils.isEmpty(this.domainId)) {
            return CompletableFuture.completedFuture(this);
        }

        HttpRequest signedRequest = null;
        try {
            // When using `getCredentialFromEnvironment`, iamEndpoint will lose while initializing Credentials.
            iamEndpoint = Objects.nonNull(iamEndpoint) ? iamEndpoint : Iam.DEFAULT_IAM_ENDPOINT;
            signedRequest = this.processAuthRequest(
                Iam.getKeystoneListAuthDomainsRequest(iamEndpoint), httpClient).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new SdkException(e);
        }

        this.domainId = Iam.keystoneListAuthDomains(httpClient, signedRequest);
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest.HttpRequestBuilder builder = httpRequest.builder().addAutoFilledPathParam(getPathParams());

            if (Objects.nonNull(getDomainId())) {
                builder.addHeader(Constants.X_DOMAIN_ID, getDomainId());
            }

            if (Objects.nonNull(getSecurityToken())) {
                builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
            }

            if (Objects.nonNull(httpRequest.getContentType()) && !httpRequest.getContentType()
                .startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
                builder.addHeader(Constants.X_SDK_CONTENT_SHA256, Constants.UNSIGNED_PAYLOAD);
            }

            Map<String, String> header = AKSKSigner.sign(builder.build(), this);
            builder.addHeaders(header);

            return builder.build();
        });
    }

}
