package com.huaweicloud.sdk.core.impl;

import okhttp3.Headers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DefaultHttpUtils {

    public static Map<String, List<String>> headersToMap(Headers headers) {
        if (Objects.isNull(headers)) {
            return null;
        }
        Map<String, List<String>> result = new LinkedHashMap<>();
        headers.names().forEach(name -> {
            result.put(name, headers.values(name));
        });
        return result;
    }
}
