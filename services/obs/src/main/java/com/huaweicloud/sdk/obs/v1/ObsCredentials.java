/*
 * Copyright 2023 Huawei Technologies Co.,Ltd.
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

package com.huaweicloud.sdk.obs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.AbstractCredentials;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.util.concurrent.CompletableFuture;

public class ObsCredentials extends AbstractCredentials<ObsCredentials> {

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(new ObsSigner(this).sign(httpRequest));
    }

    @Override
    public ICredential deepClone() {
        return new ObsCredentials().withAk(this.getAk()).withSk(this.getSk());
    }

    @Override
    public void processDerivedAuthParams(String derivedAuthServiceName, String regionId) {
    }

    @Override
    protected void updateFederalAuthTokenByIdToken(HttpClient httpClient) {
    }
}