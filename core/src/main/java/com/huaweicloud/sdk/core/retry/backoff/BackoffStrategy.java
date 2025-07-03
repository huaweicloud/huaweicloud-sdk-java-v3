/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.retry.backoff;

import com.huaweicloud.sdk.core.retry.RetryContext;

/**
 * @author HuaweiCloud_SDK
 */
public interface BackoffStrategy {
    BackoffStrategy NO_BACKOFF = new BackoffStrategy() {
        @Override
        public <S> long computeDelayBeforeNextRetry(RetryContext<S> context) {
            return 0;
        }

        @Override
        public long computeDelayBeforeNextRetry(int retries) {
            return 0;
        }
    };

    /**
     * Async compute wait duration between two retried requests.
     *
     * @param <S>     type of response
     * @param context the context which stored retry related information
     * @return milliseconds to wait
     */
    <S> long computeDelayBeforeNextRetry(RetryContext<S> context);

    /**
     * Sync compute wait duration between two retried requests.
     * @param retries retry times
     * @return milliseconds to wait
     */
    long computeDelayBeforeNextRetry(int retries);
}
