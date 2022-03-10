/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2022-2022. All rights reserved.
 */

package com.huaweicloud.sdk.core.utils;

import java.util.Calendar;
import java.util.Date;

public final class TimeUtils {
    private TimeUtils() {

    }

    public static Date getTime() {
        return getCalendar().getTime();
    }

    public static long getTimeInMillis() {
        return getCalendar().getTimeInMillis();
    }

    private static Calendar getCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MILLISECOND, -(calendar.get(Calendar.ZONE_OFFSET) + calendar.get(Calendar.DST_OFFSET)));
        return calendar;
    }
}
