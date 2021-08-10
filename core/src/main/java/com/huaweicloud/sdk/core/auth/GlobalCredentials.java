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
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsRequest;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.huaweicloud.sdk.core.utils.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

/** @author HuaweiCloud_SDK */
public class GlobalCredentials extends AbstractCredentials<GlobalCredentials> {

    private String domainId;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /** @param domainId id of the account
     * @return GlobalCredentials */
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
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        if (!StringUtils.isEmpty(this.domainId)) {
            return CompletableFuture.completedFuture(this);
        }

        // Confirm if current ak has been cached in AuthCache, key of authMap when searching domain info is ak
        String akWithName = getAk();
        if (Objects.nonNull(AuthCache.getAuth(akWithName)) && !StringUtils.isEmpty(AuthCache.getAuth(akWithName))) {
            this.domainId = AuthCache.getAuth(akWithName);
            return CompletableFuture.completedFuture(this);
        }

        String iamEndpoint = StringUtils.isEmpty(getIamEndpoint()) ? Constants.DEFAULT_IAM_ENDPOINT : getIamEndpoint();
        HcClient inner = hcClient.overrideEndpoint(iamEndpoint);

        KeystoneListAuthDomainsRequest request = new KeystoneListAuthDomainsRequest();
        KeystoneListAuthDomainsResponse response =
            inner.syncInvokeHttp(request, InnerIamMeta.KEYSTONE_LIST_AUTH_DOMAINS);
        if (Objects.isNull(response) || Objects.isNull(response.getDomains()) || response.getDomains().size() == 0) {
            throw new SdkException("No domain id found, please select one of the following solutions:\n\t"
                + "1. Manually specify domain_id when initializing the credentials.\n\t"
                + "2. Use the domain account to grant the current account permissions of the IAM service.\n\t"
                + "3. Use AK/SK of the domain account.");
        }
        this.domainId = response.getDomains().get(0).getId();
        AuthCache.putAuth(akWithName, domainId);
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
    public GlobalCredentials deepClone() {
        return new GlobalCredentials().withDomainId(this.domainId)
            .withAk(this.getAk())
            .withSk(this.getSk())
            .withIamEndpoint(this.getIamEndpoint())
            .withSecurityToken(this.getSecurityToken());
    }

}
