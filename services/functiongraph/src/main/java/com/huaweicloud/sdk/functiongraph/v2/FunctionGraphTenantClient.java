/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2024-2024. All rights reserved.
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

package com.huaweicloud.sdk.functiongraph.v2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.exchange.SdkExchangeCache;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.AsyncInvokeFunctionResponse;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionRequest;
import com.huaweicloud.sdk.functiongraph.v2.model.InvokeFunctionResponse;

public class FunctionGraphTenantClient extends FunctionGraphClient {
    private static final Logger logger = LoggerFactory.getLogger(FunctionGraphTenantClient.class);

    private String domainName = null;

    private final List<String> endpoints;

    public static ClientBuilder<FunctionGraphClient> newBuilder() {
        return new CustomClientBuilder<>(FunctionGraphTenantClient::new);
    }

    public FunctionGraphTenantClient(HcClient hcClient) {
        super(hcClient);
        this.endpoints = hcClient.getEndpoints();
        if (this.endpoints != null && this.endpoints.size() > 0) {
            this.domainName = this.endpoints.get(this.endpoints.size() - 1);
        }
    }

    private <R, S> S invokeFunctionWithRetries(R request, HttpRequestDef<R, S> meta, Class<S> responseType) {
        CopyOnWriteArrayList<String> shuffleEndpoints = new CopyOnWriteArrayList<>(endpoints);
        Collections.shuffle(shuffleEndpoints);
        S response = null;
        SdkExchange sdkExchange = new SdkExchange();
        int retryCount = 0;

        for (int i = 0; i < shuffleEndpoints.size(); i++) {
            String endpoint = shuffleEndpoints.get(i);
            try {
                this.hcClient.withEndpoints(Collections.singletonList(endpoint));
                response = this.hcClient.syncInvokeHttp(request, meta, sdkExchange, genApigHeader());
                break; // 如果请求成功，退出循环
            } catch (ConnectionException e) {
                retryCount++;
                String exchangeId = SdkExchangeCache.putExchange(sdkExchange);
                logger.error("request failed, exchangeId: " + exchangeId + " endpoint: " + endpoint,
                    " message: " + e.getMessage() + " retry times: " + retryCount);
                if (i == shuffleEndpoints.size() - 1) {
                    throw e;
                }
            }
        }

        return response;
    }

    @Override
    public AsyncInvokeFunctionResponse asyncInvokeFunction(AsyncInvokeFunctionRequest request) {
        return invokeFunctionWithRetries(request, FunctionGraphMeta.asyncInvokeFunction, AsyncInvokeFunctionResponse.class);
    }

    @Override
    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) {
        return invokeFunctionWithRetries(request, FunctionGraphMeta.invokeFunction, InvokeFunctionResponse.class);
    }
    private Map<String, String> genApigHeader() {
        Map<String, String> extraHeaders = new HashMap<>();
        if (domainName == null) {
            return new HashMap<>();
        }
        String host = domainName.replace(Constants.HTTPS_SCHEME + "://", "");
        extraHeaders.put(Constants.HOST, host);
        return extraHeaders;
    }

}
