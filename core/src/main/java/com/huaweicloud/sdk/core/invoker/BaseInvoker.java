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

/**
 * @param <R> Request type
 * @param <S> Response type
 * @param <D> Derived type
 * @author HuaweiCloud_SDK
 */
public class BaseInvoker<R, S, D extends BaseInvoker<R, S, D>> {
    SdkExchange exchange;

    HcClient hcClient;

    HttpRequestDef<R, S> meta;

    R req;

    Map<String, String> extraHeaders;

    int retryTimes;

    BiFunction<S, SdkException, Boolean> func;

    BackoffStrategy backoffStrategy;

    public static final int MAX_RETRY_TIME = 30;

    /**
     * The default constructor for BaseInvoker.
     *
     * @param req      original request
     * @param meta     definitions for request and response used to build original HttpRequest
     *                 and extract original HttpResponse
     * @param hcClient encapsulated client before default http client
     */
    public BaseInvoker(R req, HttpRequestDef<R, S> meta, HcClient hcClient) {
        exchange = new SdkExchange().withApiReference(apiReference -> apiReference.withName(meta.getName())
                .withMethod(meta.getMethod().toString())
                .withUri(meta.getUri()));
        this.hcClient = hcClient;
        this.meta = meta;
        this.req = req;
    }

    /**
     * 重新构造一个临时鉴权对象进行重置
     *
     * @param <T>   type of credential
     * @param clazz class of credential
     * @param func  function that handle credential
     * @return DeriveT
     */
    @SuppressWarnings("unchecked")
    public <T extends ICredential> D replaceCredentialWhen(Class<T> clazz, Consumer<T> func) {
        ICredential credential = hcClient.getCredential().deepClone();
        if (clazz.isAssignableFrom(credential.getClass())) {
            func.accept((T) credential);
            hcClient = hcClient.overrideCredential(credential);
        }
        return (D) this;
    }

    /**
     * 在http请求中增加header
     *
     * @param headerKey   key of header
     * @param headerValue value of header
     * @return DerivedT
     */
    public D addHeader(String headerKey, String headerValue) {
        if (Objects.isNull(extraHeaders)) {
            extraHeaders = new TreeMap<>();
        }
        extraHeaders.put(headerKey, headerValue);
        return toDerivedT();
    }

    /**
     * Add exchange to http request.
     *
     * @param func consume a function with SdkExchange
     * @return DerivedT
     */
    public D withExchange(Consumer<SdkExchange> func) {
        if (Objects.nonNull(func)) {
            func.accept(exchange);
        }
        return toDerivedT();
    }

    /**
     * The user could use .withRetry() method to set retry infos.
     *
     * @param retryTimes the max times could be retried
     * @param func       retry condition
     * @return DerivedT
     */
    public D withRetry(int retryTimes, BiFunction<S, SdkException, Boolean> func) {
        return this.withRetry(retryTimes, func, backoffStrategy);
    }

    /**
     * The user could use .withRetry() method to set retry infos.
     *
     * @param retryTimes      the max times could be retried
     * @param func            retry condition
     * @param backoffStrategy strategy to be backoff
     * @return DerivedT
     */
    public D withRetry(int retryTimes, BiFunction<S, SdkException, Boolean> func,
                       BackoffStrategy backoffStrategy) {
        this.retryTimes = ValidationUtils.assertIntIsInRange(retryTimes, 0, MAX_RETRY_TIME, "retryTimes");
        this.func = func;
        this.initBackoffStrategy(backoffStrategy);
        return toDerivedT();
    }

    /**
     * Set max retry times separately.
     *
     * @param retryTimes the max times could be retried
     * @return DerivedT
     */
    public D retryTimes(int retryTimes) {
        this.retryTimes = ValidationUtils.assertIntIsInRange(retryTimes, 0, MAX_RETRY_TIME, "retryTimes");
        return toDerivedT();
    }

    /**
     * Set retry condition separately.
     *
     * @param func the function which determines whether to retry
     * @return DerivedT
     */
    public D retryCondition(BiFunction<S, SdkException, Boolean> func) {
        this.func = func;
        return toDerivedT();
    }

    /**
     * Set backoff strategy separately.
     *
     * @param backoffStrategy the strategy which calculate the wait duration before next retry
     * @return DerivedT
     */
    public D backoffStrategy(BackoffStrategy backoffStrategy) {
        this.backoffStrategy = backoffStrategy;
        return toDerivedT();
    }

    /**
     * The default built-in retry condition could be used by the user.
     *
     * @param <S> response type
     * @return BiFunction
     */
    public static <S> BiFunction<S, SdkException, Boolean> defaultRetryCondition() {
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

    @SuppressWarnings("unchecked")
    private D toDerivedT() {
        return (D) this;
    }

}
