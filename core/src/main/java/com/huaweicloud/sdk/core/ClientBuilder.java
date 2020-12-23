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
import java.util.function.Function;

import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.http.HttpConfig;
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
        HcClient hcClient = new HcClient(Objects.nonNull(this.httpConfig)
            ? this.httpConfig : HttpConfig.getDefaultHttpConfig());
        // apply credential to hcClient
        if (Objects.isNull(this.credential)) {
            credential = AbstractCredentials.getCredentialFromEnvironment(creator.apply(hcClient),
                credentialType.get(0));
        }

        if (Objects.nonNull(credential)) {
            if (!credentialType.contains(credential.getClass().getSimpleName())) {
                throw new SdkException("This client need input " + credentialType.toString() + " credential object");
            }
        }

        if (Objects.nonNull(region)) {
            hcClient.withRegion(region)
                .withCredential(credential);
        } else {
            hcClient.withEndpoint(this.endpoint)
                .withCredential(this.credential);
        }

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
