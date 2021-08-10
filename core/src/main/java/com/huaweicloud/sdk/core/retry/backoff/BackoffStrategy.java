/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.retry.backoff;

import com.huaweicloud.sdk.core.retry.RetryContext;

/** @author HuaweiCloud_SDK */
public interface BackoffStrategy {

    BackoffStrategy NO_BACKOFF = new BackoffStrategy() {

        @Override
        public <ResT> long computeDelayBeforeNextRetry(RetryContext<ResT> context) {
            return 0;
        }
    };

    /** Compute wait duration between two retried requests.
     *
     * @param <ResT> type of response
     * @param context the context which stored retry related information
     * @return milliseconds to wait */
    <ResT> long computeDelayBeforeNextRetry(RetryContext<ResT> context);
}
