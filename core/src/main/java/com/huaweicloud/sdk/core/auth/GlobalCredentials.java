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
import com.huaweicloud.sdk.core.exception.HostUnreachableException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.InnerIamMeta;
import com.huaweicloud.sdk.core.internal.model.KeystoneListAuthDomainsResponse;
import com.huaweicloud.sdk.core.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

/**
 * @author HuaweiCloud_SDK
 */
public class GlobalCredentials extends AbstractCredentials<GlobalCredentials> {

    private String domainId;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * @param domainId id of the account
     * @return GlobalCredentials
     */
    public GlobalCredentials withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    Map<String, Object> getPathParams() {
        Map<String, Object> pathParam = new LinkedHashMap<>();
        if (StringUtils.isNotEmpty(domainId)) {
            pathParam.put(Constants.DOMAIN_ID, domainId);
        }
        return pathParam;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.supplyAsync(() -> {
            checkRequiredIdpParams();

            if (StringUtils.isNotEmpty(domainId)) {
                return this;
            }

            String cacheName = null;
            if (StringUtils.isNotEmpty(getAk())) {
                cacheName = getAk();
            } else if (StringUtils.isNotEmpty(getIdpId())) {
                cacheName = getIdpId();
            }

            if (cache.containsKey(cacheName)) {
                domainId = cache.get(cacheName);
                return this;
            }

            Function<HttpRequest, Boolean> derivedPredicate = getDerivedPredicate();
            setDerivedPredicate(null);

            domainId = autoGetDomainId(hcClient, regionId);
            if (StringUtils.isNotEmpty(cacheName)) {
                cache.put(cacheName, domainId);
            }

            setDerivedPredicate(derivedPredicate);

            return this;
        }, hcClient.getHttpConfig().getExecutorService());
    }

    private String autoGetDomainId(HcClient hcClient, String regionId) {
        String iamEndpoint = getUsedIamEndpoint(regionId);
        HcClient inner = hcClient.overrideEndpoints(Collections.singletonList(iamEndpoint));

        Logger logger = LoggerFactory.getLogger(hcClient.getClass());
        logger.info("domain id not found in GlobalCredentials," +
                " trying to get domain id from {}", iamEndpoint);
        KeystoneListAuthDomainsResponse response = inner.syncInvokeHttp(new Object(),
                InnerIamMeta.KEYSTONE_LIST_AUTH_DOMAINS);

        if (response != null && response.getDomains() != null && !response.getDomains().isEmpty()) {
            String id = response.getDomains().get(0).getId();
            logger.info("success to get domain id: {}", StringUtils.mask(id));
            return id;
        }

        String stsEndpoint = StsHelper.getEndpoint(regionId);
        if (StringUtils.isNotEmpty(stsEndpoint)) {
            logger.info("domain id is empty, trying to get domain id from {}", stsEndpoint);
            inner = hcClient.overrideEndpoints(Collections.singletonList(stsEndpoint));
            try {
                StsHelper.GetCallerIdentityResponse stsResp = inner.syncInvokeHttp(
                        new Object(), StsHelper.GET_CALLER_IDENTITY);
                if (stsResp != null && StringUtils.isNotEmpty(stsResp.getAccountId())) {
                    logger.info("success to get domain id: {}", StringUtils.mask(stsResp.getAccountId()));
                    return stsResp.getAccountId();
                }
            } catch (HostUnreachableException hue) {
                throw new SdkException("failed to get domain id automatically, " + hue, hue);
            } catch (ServiceResponseException sre) {
                if (sre.getHttpStatusCode() == 404) {
                    String msg = "failed to get domain id automatically, "
                            + String.format(Locale.ENGLISH, "%d, requestId: %s",
                            sre.getHttpStatusCode(), sre.getRequestId());
                    throw new SdkException(msg, sre);
                }
                throw new SdkException("failed to get domain id automatically, " + sre, sre);
            }
        }
        throw new SdkException(Constants.ErrorMessage.NO_DOMAIN_ID_FOUND);
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

        if (StringUtils.isNotEmpty(getDomainId())) {
            builder.addHeader(Constants.X_DOMAIN_ID, getDomainId());
        }

        if (StringUtils.isNotEmpty(getSecurityToken())) {
            builder.addHeader(Constants.X_SECURITY_TOKEN, getSecurityToken());
        }

        if (Objects.nonNull(httpRequest.getContentType())
                && !httpRequest.getContentType().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
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
            this.regionId = Constants.GLOBAL_REGION_ID;
        }
    }

    @Override
    public GlobalCredentials deepClone() {
        GlobalCredentials credentials = new GlobalCredentials()
                .withDomainId(domainId)
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
