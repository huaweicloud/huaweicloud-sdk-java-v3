/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.retry.backoff;

import static com.huaweicloud.sdk.core.utils.ValidationUtils.assertIntIsPositive;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.retry.RetryContext;
import com.huaweicloud.sdk.core.utils.RandomUtils;

import java.security.SecureRandom;

/**
 * Default backoff strategy in SDK.
 *
 * @author HuaweiCloud_SDK
 */
public class SdkBackoffStrategy implements BackoffStrategy {
    /**
     * If MAX_RETRY_TIMES > 30, it's likely to meet integer overflow.
     */
    public static final int MAX_RETRY_TIMES = 30;

    public static final int BASE_DELAY = 5;

    /**
     * The longest delay time is 60 seconds.
     */
    public static final int MAX_BACKOFF_IN_MILLISECOND = 60 * 1000;

    /**
     * If current status code of response is 429 or throttling exception,
     * take 1000 times in 5 minutes as maximum flow control.
     */
    public static final int MIN_THROTTLE_DELAY = 300;

    /**
     * If current status code of response is not 429 or throttling exception,
     * take 1000 times in 1 minutes as minimum flow control.
     */
    public static final int MIN_RETRY_DELAY = 60;

    public static final int BASE_OF_EXPONENT = 2;

    private final ThrottlingBackoffStrategy throttlingBackoffStrategy;

    private final NonThrottlingBackoffStrategy nonThrottlingBackoffStrategy;

    private SdkBackoffStrategy() {
        this.throttlingBackoffStrategy = new ThrottlingBackoffStrategy();
        this.nonThrottlingBackoffStrategy = new NonThrottlingBackoffStrategy();
    }

    /**
     * The public constructor which can assign the specified value to the private variables.
     *
     * @param baseDelay the base delay to be calculated.
     * @param maxBackoffInMillisecond the maximum time to be backoff.
     */
    public SdkBackoffStrategy(int baseDelay, int maxBackoffInMillisecond) {
        this.throttlingBackoffStrategy = new ThrottlingBackoffStrategy(baseDelay, maxBackoffInMillisecond);
        this.nonThrottlingBackoffStrategy = new NonThrottlingBackoffStrategy(baseDelay, maxBackoffInMillisecond);
    }

    public static SdkBackoffStrategy getDefaultBackoffStrategy() {
        return new SdkBackoffStrategy();
    }

    private <ResT> boolean isThrottleException(RetryContext<ResT> context) {
        return context.getStatusCode() == Constants.StatusCode.TOO_MANY_REQUEST;
    }

    @Override
    public <ResT> long computeDelayBeforeNextRetry(RetryContext<ResT> context) {
        if (isThrottleException(context)) {
            return throttlingBackoffStrategy.computeDelayBeforeNextRetry(context);
        } else {
            return nonThrottlingBackoffStrategy.computeDelayBeforeNextRetry(context);
        }
    }

    private static int calculateExponentialDelay(int retriesAttempted, int baseDelay, int maxBackoffTime) {
        int retries = Math.min(retriesAttempted, MAX_RETRY_TIMES);
        return (int) Math.min(Math.pow(BASE_OF_EXPONENT, retries) * baseDelay, maxBackoffTime);
    }

    /**
     * The backoff strategy recommended to be used when meet the 429 status code of a request.
     */
    public static class ThrottlingBackoffStrategy implements BackoffStrategy {
        private final int baseDelay;

        private final int maxBackoffTime;

        private final SecureRandom random = RandomUtils.getDefaultSecureRandom();

        /**
         * The default constructor, assign the base value to the private variables.
         */
        public ThrottlingBackoffStrategy() {
            this.baseDelay = BASE_DELAY;
            this.maxBackoffTime = MAX_BACKOFF_IN_MILLISECOND;
        }

        /**
         * The public constructor which can assign the specified value to the private variables.
         *
         * @param baseDelay the base delay to be calculated.
         * @param maxBackoffTime the maximum time to be backoff.
         */
        public ThrottlingBackoffStrategy(final int baseDelay, final int maxBackoffTime) {
            this.baseDelay = assertIntIsPositive(baseDelay, "baseDelay");
            this.maxBackoffTime = assertIntIsPositive(maxBackoffTime, "maxBackoffTime");
        }

        @Override
        public <ResT> long computeDelayBeforeNextRetry(RetryContext<ResT> context) {
            int expo = calculateExponentialDelay(context.getRetriesAttempted(), baseDelay, maxBackoffTime);
            return MIN_THROTTLE_DELAY + (expo / BASE_OF_EXPONENT) + random.nextInt((expo / BASE_OF_EXPONENT) + 1);
        }
    }

    /**
     * The backoff strategy recommended to be used when meet the status code except 429 of a request.
     */
    public static class NonThrottlingBackoffStrategy implements BackoffStrategy {
        private final int baseDelay;

        private final int maxBackoffTime;

        private final SecureRandom random = RandomUtils.getDefaultSecureRandom();

        /**
         * The default constructor, assign the base value to the private variables.
         */
        public NonThrottlingBackoffStrategy() {
            this.baseDelay = BASE_DELAY;
            this.maxBackoffTime = MAX_BACKOFF_IN_MILLISECOND;
        }

        /**
         * The public constructor which can assign the specified value to the private variables.
         *
         * @param baseDelay the base delay to be calculated.
         * @param maxBackoffTime the maximum time to be backoff.
         */
        public NonThrottlingBackoffStrategy(int baseDelay, int maxBackoffTime) {
            this.baseDelay = assertIntIsPositive(baseDelay, "baseDelay");
            this.maxBackoffTime = assertIntIsPositive(maxBackoffTime, "maxBackoffTime");
        }

        @Override
        public <ResT> long computeDelayBeforeNextRetry(RetryContext<ResT> context) {
            int expo = calculateExponentialDelay(context.getRetriesAttempted(), baseDelay, maxBackoffTime);
            return MIN_RETRY_DELAY + random.nextInt(expo);
        }
    }

}
