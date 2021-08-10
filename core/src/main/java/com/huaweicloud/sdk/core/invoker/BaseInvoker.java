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
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exchange.SdkExchange;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.retry.RetryRecord;
import com.huaweicloud.sdk.core.retry.backoff.BackoffStrategy;
import com.huaweicloud.sdk.core.retry.backoff.SdkBackoffStrategy;
import com.huaweicloud.sdk.core.utils.ValidationUtils;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** @param <ReqT>
 * @param <ResT>
 * @param <DerivedT>
 * @author HuaweiCloud_SDK */
public class BaseInvoker<ReqT, ResT, DerivedT extends BaseInvoker<ReqT, ResT, DerivedT>> {

    SdkExchange exchange;

    HcClient hcClient;

    HttpRequestDef<ReqT, ResT> meta;

    ReqT req;

    Map<String, String> extraHeader;

    int maxRetryTimes;

    BiFunction<ResT, SdkException, Boolean> func;

    BackoffStrategy backoffStrategy;

    /** The default constructor for BaseInvoker.
     *
     * @param req original request
     * @param meta definitions for request and response used to build original HttpRequest and extract original
     *            HttpResponse
     * @param hcClient encapsulated client before default http client */
    public BaseInvoker(ReqT req, HttpRequestDef<ReqT, ResT> meta, HcClient hcClient) {
        exchange = new SdkExchange().withApiReference(apiReference -> apiReference.withName(meta.getName())
            .withMethod(meta.getMethod().toString())
            .withUri(meta.getUri()));
        this.hcClient = hcClient;
        this.meta = meta;
        this.req = req;
    }

    /** 重新构造一个临时鉴权对象进行重置
     *
     * @param <T> type of credential
     * @param clazz class of credential
     * @param func function that handle credential
     * @return DeriveT */
    public <T extends ICredential> DerivedT replaceCredentialWhen(Class<T> clazz, Consumer<T> func) {
        ICredential credential = hcClient.getCredential().deepClone();
        if (clazz.isAssignableFrom(credential.getClass())) {
            func.accept((T) credential);
            hcClient = hcClient.overrideCredential(credential);
        }
        return (DerivedT) this;
    }

    /** 在http请求中增加header
     *
     * @param headerKey key of header
     * @param headerValue value of header
     * @return DerivedT */
    public DerivedT addHeader(String headerKey, String headerValue) {
        if (Objects.isNull(extraHeader)) {
            extraHeader = new TreeMap<>();
        }
        extraHeader.put(headerKey, headerValue);
        return (DerivedT) this;
    }

    /** Add exchange to http request.
     *
     * @param func consume a function with SdkExchange
     * @return DerivedT */
    public DerivedT withExchange(Consumer<SdkExchange> func) {
        if (Objects.nonNull(func)) {
            func.accept(exchange);
        }
        return (DerivedT) this;
    }

    /** The user could use .withRetry() method to set retry infos.
     *
     * @param maxRetryTimes the max times could be retried
     * @param func retry condition
     * @return DerivedT */
    public DerivedT withRetry(int maxRetryTimes, BiFunction<ResT, SdkException, Boolean> func) {
        return this.withRetry(maxRetryTimes, func, backoffStrategy);
    }

    /** The user could use .withRetry() method to set retry infos.
     *
     * @param maxRetryTimes the max times could be retried
     * @param func retry condition
     * @param backoffStrategy strategy to be backoff
     * @return DerivedT */
    public DerivedT withRetry(int maxRetryTimes, BiFunction<ResT, SdkException, Boolean> func,
        BackoffStrategy backoffStrategy) {
        this.maxRetryTimes = ValidationUtils.assertIntIsPositive(maxRetryTimes, "maxRetryTimes");
        this.func = func;
        this.initBackoffStrategy(backoffStrategy);
        return (DerivedT) this;
    }

    /** Set max retry times separately.
     *
     * @param maxRetryTimes the max times could be retried
     * @return DerivedT */
    public DerivedT retryTimes(int maxRetryTimes) {
        this.maxRetryTimes = ValidationUtils.assertIntIsPositive(maxRetryTimes, "maxRetryTimes");
        return (DerivedT) this;
    }

    /** Set retry condition separately.
     *
     * @param func the function which determines whether to retry
     * @return DerivedT */
    public DerivedT retryCondition(BiFunction<ResT, SdkException, Boolean> func) {
        this.func = func;
        return (DerivedT) this;
    }

    /** Set backoff strategy separately.
     *
     * @param backoffStrategy the strategy which calculate the wait duration before next retry
     * @return DerivedT */
    public DerivedT backoffStrategy(BackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
        return (DerivedT) this;
    }

    /** The default built-in retry condition could be used by the user.
     *
     * @param <ResT> response type
     * @return BiFunction */
    public static <ResT> BiFunction<ResT, SdkException, Boolean> defaultRetryCondition() {
        return (resp, exception) -> {
            if (Objects.nonNull(exception)) {
                return ConnectionException.class.isAssignableFrom(exception.getClass());
            }
            return false;
        };
    }

    public void initBackoffStrategy(BackoffStrategy backoffStrategy) {
        if (Objects.isNull(backoffStrategy)) {
            if (Objects.nonNull(func)) {
                this.backoffStrategy = SdkBackoffStrategy.getDefaultBackoffStrategy();
            } else {
                this.backoffStrategy = BackoffStrategy.NO_BACKOFF;
            }
        } else {
            this.backoffStrategy = backoffStrategy;
        }
    }

    /** This method combine a list of suppliers which would be sequential execution.
     *
     * @param work the actual action needs to be retried.
     * @return CompletableFuture */
    CompletableFuture<ResT> retry(Supplier<CompletableFuture<ResT>> work) {
        CompletableFuture<ResT> future = new CompletableFuture<>();
        initBackoffStrategy(backoffStrategy);
        RetryRecord<ResT> record = new RetryRecord<>(maxRetryTimes, func, backoffStrategy);
        record.setFuture(future);
        record.setWorkSupplier(work);
        // start the first call of the interface
        record.schedule();
        return future;
    }

}
