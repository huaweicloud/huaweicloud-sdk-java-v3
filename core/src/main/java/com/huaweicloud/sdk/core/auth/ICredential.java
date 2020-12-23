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

import java.util.concurrent.CompletableFuture;

import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

public interface ICredential {
    /**
     * Handle endpoint resolver and fill projectId/domainId automatically.
     *
     * @param httpClient instance of HttpClient
     * @param regionId   region id such as "cn-north-4"
     * @return null
     */
    CompletableFuture<ICredential> processAuthParams(HttpClient httpClient, String regionId);

    /**
     * Handle auth request before sending to API Gateway.
     *
     * @param httpRequest instance of HttpRequest
     * @param httpClient  instance of HttpClient
     * @return null
     */
    CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient);
}