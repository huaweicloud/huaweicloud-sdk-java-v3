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

package com.huaweicloud.sdk.core.invoker;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.retry.RetryRecord;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * @param <R> Request type
 * @param <S> Response type
 * @author HuaweiCloud_SDK
 */
public class AsyncInvoker<R, S> extends BaseInvoker<R, S, AsyncInvoker<R, S>> {
    /**
     * The default constructor for AsyncInvoker.
     *
     * @param req original request
     * @param meta definitions for request and response used to build original HttpRequest
     * and extract original HttpResponse
     * @param hcClient encapsulated client before default http client
     */
    public AsyncInvoker(R req, HttpRequestDef<R, S> meta, HcClient hcClient) {
        super(req, meta, hcClient);
    }

    /**
     * This method combine a list of suppliers which would be sequential execution.
     *
     * @param work the actual action needs to be retried.
     * @return CompletableFuture
     */
    CompletableFuture<S> retry(Supplier<CompletableFuture<S>> work) {
        CompletableFuture<S> future = new CompletableFuture<>();
        initBackoffStrategy(backoffStrategy);
        RetryRecord<S> record = new RetryRecord<>(retryTimes, func, backoffStrategy);
        record.setFuture(future);
        record.setWorkSupplier(work);
        // start the first call of the interface
        record.schedule();
        return future;
    }

    /**
     * This method will invoke asynchronous request for specified interface.
     *
     * @return CompletableFuture
     */
    public CompletableFuture<S> invoke() {
        return retry(() -> this.hcClient.asyncInvokeHttp(req, meta, exchange, extraHeaders));
    }
}
