/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.retry;

import com.huaweicloud.sdk.core.exception.SdkException;

/**
 * Context used to build retry information.
 *
 * @param <ResT>
 * @author HuaweiCloud_SDK
 */
public final class RetryContext<ResT> {

    private final int retriesAttempted;

    private final int statusCode;

    private final ResT lastResponse;

    private final SdkException lastException;

    private RetryContext(int retriesAttempted, int statusCode, ResT lastResponse, SdkException lastException) {
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

    public ResT getLastResponse() {
        return lastResponse;
    }

    public SdkException getLastException() {
        return lastException;
    }

    public static <ResT> Builder<ResT> builder() {
        return new Builder<>();
    }

    public static class Builder<ResT> {

        private int retriesAttempted;

        private int statusCode;

        private ResT lastResponse;

        private SdkException lastException;

        private Builder() {

        }

        public Builder<ResT> withRetriesAttempted(int retriesAttempted) {
            this.retriesAttempted = retriesAttempted;
            return this;
        }

        public Builder<ResT> withStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder<ResT> withLastResponse(ResT lastResponse) {
            this.lastResponse = lastResponse;
            return this;
        }

        public Builder<ResT> withLastException(SdkException lastException) {
            this.lastException = lastException;
            return this;
        }

        public RetryContext<ResT> build() {
            return new RetryContext<>(retriesAttempted, statusCode, lastResponse, lastException);
        }
    }

}
