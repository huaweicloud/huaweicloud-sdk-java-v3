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

package com.huaweicloud.sdk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.EnvCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.core.impl.DefaultHttpClient;
import com.huaweicloud.sdk.core.region.Region;

public class ClientBuilder<T> {
    private Function<HcClient, T> creator;
    private ICredential credential;
    private HttpConfig httpConfig;
    private Region region;
    private String endpoint;
    private List<String> credentialType = new ArrayList<>(Arrays.asList(BasicCredentials.class.getSimpleName()));

    private static final String CUSTOMIZATION = "Customization";

    public ClientBuilder(Function<HcClient, T> creator) {
        this.creator = creator;
    }

    public ClientBuilder(Function<HcClient, T> creator, String credentialType) {
        this.creator = creator;
        this.credentialType = Arrays.asList(credentialType.split(","));
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

    public ClientBuilder<T> withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public T build() {
        if (Objects.isNull(this.httpConfig)) {
            this.httpConfig = HttpConfig.getDefaultHttpConfig();
        }

        HttpClient httpClient = new DefaultHttpClient(this.httpConfig);
        HcClient hcClient = new HcClient(this.httpConfig, httpClient);

        // If credential hasn't been assigned when initialing, SDK will try to load credential from environment variable
        if (Objects.isNull(this.credential)) {
            credential = EnvCredentials.loadCredentialFromEnv(credentialType.get(0));
        }

        if (Objects.isNull(this.credential)) {
            throw new SdkException("credential can not be null, " + credentialType.toString()
                    + "credential objects are required");
        }

        if (!credentialType.contains(credential.getClass().getSimpleName())) {
            throw new SdkException("credential type error, supported credential type is " + credentialType.toString());
        }

        if (Objects.nonNull(region)) {
            this.endpoint = region.getEndpoint();
            try {
                hcClient.withCredential(credential);
                this.credential = credential.processAuthParams(hcClient, region.getId()).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new SdkException(e);
            }
        }

        if (!endpoint.startsWith(Constants.HTTP_SCHEME)) {
            this.endpoint = Constants.HTTPS_SCHEME + "://" + endpoint;
        }

        hcClient.withEndpoint(this.endpoint).withCredential(this.credential);

        T t = creator.apply(hcClient);
        ClientCustomization clientCustomization = loadClientCustomization(t);
        if (Objects.nonNull(clientCustomization)) {
            clientCustomization.customize(hcClient);
        }

        return t;
    }

    private ClientCustomization loadClientCustomization(T t) {
        String strClientCustomizationClassName = t.getClass().getName() + CUSTOMIZATION;
        try {
            Class customizationClass = Class.forName(strClientCustomizationClassName);
            ClientCustomization clientCustomization = (ClientCustomization) customizationClass.newInstance();
            return clientCustomization;
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

    public String getEndpoint() {
        return endpoint;
    }

}
