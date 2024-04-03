/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2022. All rights reserved.
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

package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class IAMCredentials implements ICredential {
    private static final String X_AUTH_TOKEN = "X-Auth-Token";
    private String authToken;

    public String getXAuthToken() {
        return this.authToken;
    }

    public IAMCredentials withXAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest.HttpRequestBuilder builder = httpRequest.builder();

            if (!httpRequest.haveHeader(X_AUTH_TOKEN) && Objects.nonNull(getXAuthToken())) {
                builder.addHeader(X_AUTH_TOKEN, authToken);
            }

            return builder.build();
        });
    }


    @Override
    public IAMCredentials deepClone() {
        return new IAMCredentials().withXAuthToken(authToken);
    }
}


