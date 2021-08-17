/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 */

package com.huaweicloud.sdk.core.utils;

import java.util.Locale;

/**
 * @author HuaweiCloud_SDK
 */
public final class ValidationUtils {
    /**
     * The utility class should hide the public constructor
     */
    private ValidationUtils() {

    }

    /**
     * @param value the value need to be checked
     * @param name value name
     * @return if value >= 0, returns the value;else throw IllegalArgumentException
     */
    public static int assertIntIsPositive(int value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "%s must be positive", name));
        }
        return value;
    }
}
