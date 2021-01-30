package com.huaweicloud.sdk.core.auth;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;


public class AuthCache {
    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    public static String getAuth(String akWithName) {
        return StringUtils.isEmpty(akWithName) ? null : authMap.get(akWithName);
    }

    public static void putAuth(String akWithName, String id) {
        authMap.put(akWithName, id);
    }

    public static void removeAuth(String akWithName) {
        authMap.remove(akWithName);
    }
}
