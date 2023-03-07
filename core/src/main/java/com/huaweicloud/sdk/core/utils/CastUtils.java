package com.huaweicloud.sdk.core.utils;

public class CastUtils {
    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj) {
        return (T) obj;
    }

    private CastUtils() {
        throw new UnsupportedOperationException();
    }
}
