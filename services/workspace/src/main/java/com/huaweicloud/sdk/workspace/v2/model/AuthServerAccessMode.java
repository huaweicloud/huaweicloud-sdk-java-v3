package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 辅助认证服务接入模式 INTERNET：互联网接入 DEDICATED：专线接入 SYSTEM_DEFAULT：系统默认
 */
public class AuthServerAccessMode {

    /**
     * Enum INTERNET for value: "INTERNET"
     */
    public static final AuthServerAccessMode INTERNET = new AuthServerAccessMode("INTERNET");

    /**
     * Enum DEDICATED for value: "DEDICATED"
     */
    public static final AuthServerAccessMode DEDICATED = new AuthServerAccessMode("DEDICATED");

    /**
     * Enum SYSTEM_DEFAULT for value: "SYSTEM_DEFAULT"
     */
    public static final AuthServerAccessMode SYSTEM_DEFAULT = new AuthServerAccessMode("SYSTEM_DEFAULT");

    private static final Map<String, AuthServerAccessMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, AuthServerAccessMode> createStaticFields() {
        Map<String, AuthServerAccessMode> map = new HashMap<>();
        map.put("INTERNET", INTERNET);
        map.put("DEDICATED", DEDICATED);
        map.put("SYSTEM_DEFAULT", SYSTEM_DEFAULT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AuthServerAccessMode(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static AuthServerAccessMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthServerAccessMode(value));
    }

    public static AuthServerAccessMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AuthServerAccessMode) {
            return this.value.equals(((AuthServerAccessMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
