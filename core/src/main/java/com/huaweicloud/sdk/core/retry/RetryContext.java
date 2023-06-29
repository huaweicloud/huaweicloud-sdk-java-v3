/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.retry;

import com.huaweicloud.sdk.core.exception.SdkException;

/**
 * Context used to build retry information.
 *
 * @param <T>
 * @author HuaweiCloud_SDK
 */
public final class RetryContext<T> {

    private final int retriesAttempted;

    private final int statusCode;

    private final T lastResponse;

    private final SdkException lastException;

    private RetryContext(int retriesAttempted, int statusCode, T lastResponse, SdkException lastException) {
        this.retriesAttempted = retriesAttempted;
        this.statusCode = statusCode;
        this.lastResponse = lastResponse;
        this.lastException = lastException;
    }

    public int getRetriesAttempted() {
        return retriesAttempted;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public T getLastResponse() {
        return lastResponse;
    }

    public SdkException getLastException() {
        return lastException;
    }

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static class Builder<S> {

        private int retriesAttempted;

        private int statusCode;

        private S lastResponse;

        private SdkException lastException;

        private Builder() {

        }

        public Builder<S> withRetriesAttempted(int retriesAttempted) {
            this.retriesAttempted = retriesAttempted;
            return this;
        }

        public Builder<S> withStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder<S> withLastResponse(S lastResponse) {
            this.lastResponse = lastResponse;
            return this;
        }

        public Builder<S> withLastException(SdkException lastException) {
            this.lastException = lastException;
            return this;
        }

        public RetryContext<S> build() {
            return new RetryContext<>(retriesAttempted, statusCode, lastResponse, lastException);
        }
    }

}
