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

package com.huaweicloud.sdk.core.retry;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.exception.ConnectionException;
import com.huaweicloud.sdk.core.exception.SdkException;
import com.huaweicloud.sdk.core.exception.ServiceResponseException;
import com.huaweicloud.sdk.core.retry.backoff.BackoffStrategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * A helper for concurrent safe delay when retry.
 *
 * @author HuaweiCloud_SDK
 */
public class RetryRecord<ResT> {
    private final ThreadFactory namedFactory = initNamedThreadFactory();

    /**
     * corePoolSize is set to 0 means that the thread will be exit when it's idle.
     */
    private final ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(0, namedFactory);

    /**
     * A CompletableFuture used to chain all results of the work supplier.
     * Once the result of the work is done, this future will be returned.
     */
    CompletableFuture<ResT> future;

    /**
     * Actual supplier needs to be retried.
     * Whether the request should be retried depends on the result of the work.
     */
    Supplier<CompletableFuture<ResT>> workSupplier;

    /**
     * The times has been retried.
     */
    AtomicInteger retriesAttempted = new AtomicInteger(0);

    SdkException currException = null;

    boolean shouldRetry = false;

    int retryTimes;

    BiFunction<ResT, SdkException, Boolean> func;

    BackoffStrategy backoffStrategy;

    public RetryRecord(int retryTimes, BiFunction<ResT, SdkException, Boolean> func,
        BackoffStrategy backoffStrategy) {
        this.retryTimes = retryTimes;
        this.func = func;
        this.backoffStrategy = backoffStrategy;
    }

    /**
     * This method should be override cuz the handling process differs in synchronous and asynchronous situation.
     * <p>
     * Actual action to be preformed when one work is done.
     * If a request needs to be retried, this method will call reschedule() method
     * to delay for the backoff time and rerun this method.
     *
     * @param executor the ScheduledExecutorService thread that initialize the delay and retry
     */
    public void perform(ScheduledExecutorService executor) {
        int currRetriesAttempted = retriesAttempted.incrementAndGet();
        workSupplier.get().whenComplete((resp, throwable) -> {
            if (Objects.isNull(resp) && Objects.isNull(throwable)) {
                future.completeExceptionally(new IllegalArgumentException("The response and exception of the "
                    + "request are both Null, please check the request or contact customer service"));
            }
            handleThrowable(throwable);

            shouldRetry = Objects.nonNull(func) && func.apply(resp, currException);
            if (shouldRetry && currRetriesAttempted <= retryTimes) {
                int statusCode = getStatusCodeFromResult(resp, currException);
                RetryContext<ResT> context = buildContext(resp, currException, statusCode, currRetriesAttempted);
                long delayBeforeNextRetry = backoffStrategy.computeDelayBeforeNextRetry(context);
                printRetryLog(currRetriesAttempted, delayBeforeNextRetry);
                reschedule(executor, delayBeforeNextRetry);
            } else if (Objects.nonNull(currException)) {
                future.completeExceptionally(currException);
            } else {
                future.complete(resp);
            }
        });
    }

    private void handleThrowable(Throwable throwable) {
        if (Objects.isNull(throwable)) {
            currException = null;
            return;
        }
        // In asynchronous cases, all throwable in retry would be thrown in CompletionException,
        // if this exception is thrown to the main thread, it could change to ExecutionException.
        if (CompletionException.class.isAssignableFrom(throwable.getClass())) {
            Throwable cause = throwable.getCause();
            if (SdkException.class.isAssignableFrom(cause.getClass())) {
                handleSdkException((SdkException) cause);
            }
        }
        // In synchronous cases, throwable in retry would be thrown by SdkException
        if (SdkException.class.isAssignableFrom(throwable.getClass())) {
            handleSdkException((SdkException) throwable);
        }

        if (Objects.isNull(currException)) {
            currException = new SdkException(throwable.getCause());
        }
    }

    private void handleSdkException(SdkException e) {
        currException = e;
        if (e instanceof ConnectionException) {
            shouldRetry = true;
        }
        if (e instanceof ServiceResponseException) {
            ServiceResponseException temp = (ServiceResponseException) e;
            if (temp.getHttpStatusCode() == Constants.StatusCode.TOO_MANY_REQUEST
                || temp.getHttpStatusCode() >= Constants.StatusCode.SERVER_ERROR) {
                shouldRetry = true;
            }
        }
    }

    /**
     * The entry to send request and handle the result of the asynchronous request.
     */
    public void schedule() {
        executorService.submit(() -> perform(executorService));
    }

    /**
     * The synchronous retry entry for the request.
     *
     * @param executor the thread executed for delay
     * @param delay the duration waited before next retry
     */
    public void reschedule(ScheduledExecutorService executor, long delay) {
        executor.schedule(() -> perform(executor), delay, TimeUnit.MILLISECONDS);
    }

    private static ThreadFactory initNamedThreadFactory() {
        return (Runnable r) -> {
            Thread thread = new Thread(r);
            thread.setName("thread-retry-timer");
            return thread;
        };
    }

    /**
     * Build retry context to be used in determining backoff strategy and delay.
     *
     * @param resT response
     * @param e exception
     * @param statusCode status code
     * @param retriesAttempted retries has been attempted
     * @return context
     */
    @SuppressWarnings("unchecked")
    RetryContext<ResT> buildContext(ResT resT, SdkException e, int statusCode, int retriesAttempted) {
        return (RetryContext<ResT>) RetryContext.builder()
            .withLastResponse(resT)
            .withLastException(e)
            .withStatusCode(statusCode)
            .withRetriesAttempted(retriesAttempted)
            .build();
    }

    /**
     * Get the status code from response or exception.
     * The default value of status code is 0, if response and exception are null, the return value is 0.
     * If the exception is subclass of ServiceResponseException, the status code could be set.
     *
     * @param resT response
     * @param e sdk exception
     * @return the value of status code
     */
    public int getStatusCodeFromResult(ResT resT, SdkException e) {
        int statusCode = 0;
        if (Objects.nonNull(resT)) {
            try {
                Method getStatusCodeFunc = resT.getClass().getMethod("getHttpStatusCode");
                getStatusCodeFunc.setAccessible(true);
                statusCode = (int) getStatusCodeFunc.invoke(resT);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException noSuchFieldException) {
                throw new SdkException(noSuchFieldException);
            }
        } else {
            if (e instanceof ServiceResponseException) {
                statusCode = ((ServiceResponseException) e).getHttpStatusCode();
            }
        }
        return statusCode;
    }

    public CompletableFuture<ResT> getFuture() {
        return future;
    }

    public void setFuture(CompletableFuture<ResT> future) {
        this.future = future;
    }

    public Supplier<CompletableFuture<ResT>> getWorkSupplier() {
        return workSupplier;
    }

    public void setWorkSupplier(Supplier<CompletableFuture<ResT>> workSupplier) {
        this.workSupplier = workSupplier;
    }

    /**
     * Log for retry.
     */
    public static class RetryLog {
        private static final Logger logger = LoggerFactory.getLogger("HuaweiCloud-SDK-Retry");

        /**
         * Get the logger.
         *
         * @return Logger
         */
        public static Logger get() {
            return logger;
        }
    }

    /**
     * print retry log.
     * Notice:
     * - in synchronous retry request, this log would be print before the request is sent
     * - in asynchronous retry request, this log would be print after the request is sent
     *
     * @param retriesAttempted the attempted times of retry
     * @param waitBeforeNextRetry the wait duration before next retry
     */
    public void printRetryLog(int retriesAttempted, long waitBeforeNextRetry) {
        RetryLog.get()
            .info("The request will retry for the {} time after {} milliseconds, "
                + "and the max retry times is {}.", retriesAttempted, waitBeforeNextRetry, retryTimes);
    }
}
