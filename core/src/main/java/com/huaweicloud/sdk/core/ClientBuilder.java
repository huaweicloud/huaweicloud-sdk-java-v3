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

package com.huaweicloud.sdk.core;

import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.CredentialProviderChain;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.ExceptionHandler;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import com.huaweicloud.sdk.core.region.Region;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

/**
 * @author HuaweiCloud_SDK
 */
public class ClientBuilder<T> {
    private final Function<HcClient, T> creator;

    private ICredential credential;

    private HttpConfig httpConfig;

    private Region region;

    private List<String> endpoints;

    private ExceptionHandler exceptionHandler;

    private List<String> credentialType = new ArrayList<>(
            Collections.singletonList(BasicCredentials.class.getSimpleName()));

    private String derivedAuthServiceName;

    public ClientBuilder(Function<HcClient, T> creator) {
        this.creator = creator;
    }

    public ClientBuilder(Function<HcClient, T> creator, String credentialType) {
        this.creator = creator;
        this.credentialType = Arrays.asList(credentialType.split(","));
    }

    public ClientBuilder<T> withDerivedAuthServiceName(String derivedAuthServiceName) {
        this.derivedAuthServiceName = derivedAuthServiceName;
        return this;
    }

    public ClientBuilder<T> withCredential(ICredential credential) {
        this.credential = credential;
        return this;
    }

    public ClientBuilder<T> withHttpConfig(HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
        return this;
    }

    public ClientBuilder<T> withRegion(Region region) {
        this.region = region;
        return this;
    }

    /**
     * @deprecated As of 3.1.27, because of the support of the multi-endpoint feature,
     * use {@link #withEndpoints(List<String> endpoints)} instead
     */
    @Deprecated
    public ClientBuilder<T> withEndpoint(String endpoint) {
        return withEndpoints(Arrays.asList(endpoint));
    }

    public ClientBuilder<T> withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public ClientBuilder<T> withExceptionHandler(ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return this;
    }

    public T build() {
        if (Objects.isNull(httpConfig)) {
            httpConfig = HttpConfig.getDefaultHttpConfig();
        }

        HttpClient httpClient = new DefaultHttpClient(httpConfig);
        HcClient hcClient = new HcClient(httpConfig, httpClient);

        if (Objects.isNull(credential)) {
            CredentialProviderChain providerChain = CredentialProviderChain.getDefaultCredentialProviderChain(
                    credentialType.get(0));
            credential = providerChain.getCredentials();
        }

        if (Objects.isNull(credential)) {
            throw new SdkException(
                    "credential can not be null, " + credentialType.toString() + "credential objects are required");
        }

        if (!credentialType.contains(credential.getClass().getSimpleName())) {
            throw new SdkException("credential type error, supported credential type is " + credentialType);
        }

        if (Objects.nonNull(region)) {
            if (region.getEndpoints() != null) {
                endpoints = region.getEndpoints();
            }

            try {
                hcClient.withCredential(credential);
                credential = credential.processAuthParams(hcClient, region.getId()).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new SdkException(e);
            }

            if (credential instanceof AbstractCredentials) {
                ((AbstractCredentials<?>) credential).processDerivedAuthParams(derivedAuthServiceName, region.getId());
            }
        }

        if (endpoints.isEmpty()) {
            throw new SdkException("Could not find any endpoints, at least one endpoint is required");
        }
        try {
            endpoints.replaceAll(endpoint -> endpoint.startsWith(Constants.HTTP_SCHEME)
                    ? endpoint : Constants.HTTPS_SCHEME + "://" + endpoint);
        } catch (UnsupportedOperationException exception) {
            // handle unsupported operation list
            List<String> replacedEndpoints = new ArrayList<>();
            for (String endpoint : endpoints) {
                replacedEndpoints.add(endpoint.startsWith(Constants.HTTP_SCHEME) ?
                        endpoint : Constants.HTTPS_SCHEME + "://" + endpoint);
            }
            endpoints = replacedEndpoints;
        }

        hcClient.withEndpoints(endpoints).withCredential(credential);
        if (Objects.nonNull(exceptionHandler)) {
            hcClient.withExceptionHandler(exceptionHandler);
        }

        T t = creator.apply(hcClient);
        ClientCustomization clientCustomization = loadClientCustomization(t);
        if (Objects.nonNull(clientCustomization)) {
            clientCustomization.customize(hcClient);
        }

        return t;
    }

    private ClientCustomization loadClientCustomization(T t) {
        String strClientCustomizationClassName = t.getClass().getName() + Constants.CUSTOMIZATION;
        try {
            Class<?> customizationClass = Class.forName(strClientCustomizationClassName);
            return (ClientCustomization) customizationClass.newInstance();
        } catch (ClassNotFoundException e) {
            return null;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SdkException(e);
        }
    }

    public Function<HcClient, T> getCreator() {
        return creator;
    }

    public ICredential getCredential() {
        return credential;
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    /**
     * @deprecated As of 3.1.27, because of the support of the multi-endpoint feature,
     * use {@link #getEndpoints()} instead
     */
    @Deprecated
    public String getEndpoint() {
        return endpoints.isEmpty() ? null : endpoints.get(0);
    }

    public List<String> getEndpoints() {
        return endpoints;
    }
}
