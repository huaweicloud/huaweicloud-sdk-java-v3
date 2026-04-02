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
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;
import com.huaweicloud.sdk.core.internal.model.Credential;
import com.huaweicloud.sdk.core.utils.StringUtils;
import com.huaweicloud.sdk.core.utils.TimeUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/**
 * @param <T> derived class such as BasicCredentials and
 *            GlobalCredentials
 * @author HuaweiCloud_SDK
 */
public abstract class AbstractCredentials<T extends AbstractCredentials<T>> implements ICredential {
    private static final long DEFAULT_EXPIRATION_THRESHOLD_SECONDS = 40 * 60; // 40min

    private long expirationThresholdSeconds = DEFAULT_EXPIRATION_THRESHOLD_SECONDS;

    private String ak;

    private String sk;

    private String securityToken;

    private String idpId;

    private String idTokenFile;

    private String iamEndpoint;

    protected String regionId;

    protected String derivedAuthServiceName;

    protected AbstractStsAccessor stsAccessor;

    private Function<HttpRequest, Boolean> derivedPredicate;

    private final AtomicBoolean done = new AtomicBoolean(false);

    protected long expireAt;

    public static final Function<HttpRequest, Boolean> DEFAULT_DERIVED_PREDICATE = httpRequest ->
            !httpRequest.getEndpoint().replace(Constants.HTTPS_SCHEME + "://", "")
                    .matches(Constants.DEFAULT_ENDPOINT_REG);

    protected static final Map<String, String> cache = new ConcurrentHashMap<>();

    public abstract void processDerivedAuthParams(String derivedAuthServiceName, String regionId);

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        if (StringUtils.isEmpty(ak)) {
            throw new IllegalArgumentException("input ak cannot be null or empty.");
        }
        this.ak = ak;
    }

    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        if (StringUtils.isEmpty(sk)) {
            throw new IllegalArgumentException("input sk cannot be null or empty.");
        }
        this.sk = sk;
    }

    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public String getIdpId() {
        return idpId;
    }

    public void setIdpId(String idpId) {
        this.idpId = idpId;
    }

    public String getIdTokenFile() {
        return idTokenFile;
    }

    public void setIdTokenFile(String idTokenFile) {
        this.idTokenFile = idTokenFile;
    }

    public String getIamEndpoint() {
        return iamEndpoint;
    }

    public void setIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
    }

    public Function<HttpRequest, Boolean> getDerivedPredicate() {
        return derivedPredicate;
    }

    public void setDerivedPredicate(Function<HttpRequest, Boolean> derivedPredicate) {
        this.derivedPredicate = derivedPredicate;
    }

    /**
     * @param ak access key
     * @return DerivedT with ak set
     * @throws IllegalArgumentException the exception is thrown when the ak is null or an empty string.
     */
    public T withAk(String ak) {
        setAk(ak);
        return toDerivedT();
    }

    /**
     * @param sk access secret key
     * @return DerivedT with sk set
     * @throws IllegalArgumentException the exception is thrown when the sk is null or an empty string.
     */
    public T withSk(String sk) {
        setSk(sk);
        return toDerivedT();
    }

    /**
     * @param securityToken temporary token from temporary ak and sk
     * @return DerivedT with securityToken set
     */
    public T withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return toDerivedT();
    }

    /**
     * @param idpId identity provider id
     * @return DerivedT with idpId set
     */
    public T withIdpId(String idpId) {
        this.idpId = idpId;
        return toDerivedT();
    }

    /**
     * @param idTokenFile file path of the id token
     * @return DerivedT with idTokenFile set
     */
    public T withIdTokenFile(String idTokenFile) {
        this.idTokenFile = idTokenFile;
        return toDerivedT();
    }

    /**
     * @param iamEndpoint optional property
     * @return DerivedT with iamEndpoint set
     */
    public T withIamEndpoint(String iamEndpoint) {
        this.iamEndpoint = iamEndpoint;
        return toDerivedT();
    }

    /**
     * @param derivedPredicate optional property, judge whether to use the DerivedAKSKSigner
     * @return DerivedT with derived set
     */
    public T withDerivedPredicate(Function<HttpRequest, Boolean> derivedPredicate) {
        this.derivedPredicate = derivedPredicate;
        return toDerivedT();
    }

    /**
     * @deprecated This method will be removed in future.
     */
    public long getExpirationThresholdSeconds() {
        return expirationThresholdSeconds;
    }

    /**
     * @deprecated This method will be removed in future, do not set this option if no problems occur.
     * If this option needs to be set, the recommended value range is 1200~2400.
     */
    @Deprecated
    public void setExpirationThresholdSeconds(long expirationThresholdSeconds) {
        this.expirationThresholdSeconds = expirationThresholdSeconds;
    }

    protected long getExpirationThresholdMillis() {
        return expirationThresholdSeconds * 1000L;
    }

    protected String getUsedIamEndpoint() {
        if (StringUtils.isNotEmpty(iamEndpoint)) {
            return iamEndpoint;
        }

        return IamHelper.getEndpoint();
    }

    protected String getUsedIamEndpoint(String regionId) {
        if (StringUtils.isNotEmpty(iamEndpoint)) {
            return iamEndpoint;
        }

        return IamHelper.getEndpoint(regionId);
    }

    protected boolean isDerivedAuth(HttpRequest httpRequest) {
        if (derivedPredicate == null) {
            return false;
        }

        return derivedPredicate.apply(httpRequest);
    }

    protected void checkRequiredIdpParams() {
        if (StringUtils.isNotEmpty(getIdpId()) || StringUtils.isNotEmpty(getIdTokenFile())) {
            if (StringUtils.isEmpty(getIdpId())) {
                throw new SdkException("idpId is required when using idpId&idTokenFile");
            } else if (StringUtils.isEmpty(getIdTokenFile())) {
                throw new SdkException("idTokenFile is required when using idpId&idTokenFile");
            }
        }
    }

    private void doOnce(Runnable action) {
        if (!done.get()) {
            synchronized (this) {
                if (!done.get()) {
                    try {
                        action.run();
                    } finally {
                        done.set(true);
                    }
                }
            }
        }
    }

    protected void processSts(HttpClient httpClient) {
        // Compatibility Handling
        doOnce(() -> {
            if (stsAccessor == null) {
                if (idpId != null && idTokenFile != null) {
                    stsAccessor = new FederalAccessor();
                } else if (ak == null && sk == null) {
                    stsAccessor = new MetadataAccessor();
                }
            }
        });

        if (needRefreshSts()) {
            AccessorOptions options = new AccessorOptions.Builder()
                    .iamEndpoint(getUsedIamEndpoint()).httpClient(httpClient)
                    .idpId(idpId).idTokenFile(idTokenFile).build();
            updateSts(stsAccessor.getCredential(options));
        }
    }

    protected boolean needRefreshSts() {
        return stsAccessor != null && isExpired();
    }

    private boolean isExpired() {
        return expireAt - TimeUtils.getTimeInMillis() < getExpirationThresholdMillis();
    }

    @SuppressWarnings("unchecked")
    private T toDerivedT() {
        return (T) this;
    }

    protected void updateSts(Credential credential) {
        if (credential == null) {
            throw new SdkException("update temp credential failed, credential is null");
        }
        ak = credential.getAccess();
        sk = credential.getSecret();
        securityToken = credential.getSecurityToken();
        expireAt = credential.getExpiresAt();
    }
}
