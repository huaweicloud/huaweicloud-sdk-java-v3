package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储声明的类型： * &#x60;USER&#x60; -  用户目录 * &#x60;SHARE&#x60; - 共享目录
 */
public class ClaimMode {

    /**
     * Enum USER for value: "USER"
     */
    public static final ClaimMode USER = new ClaimMode("USER");

    /**
     * Enum SHARE for value: "SHARE"
     */
    public static final ClaimMode SHARE = new ClaimMode("SHARE");

    private static final Map<String, ClaimMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, ClaimMode> createStaticFields() {
        Map<String, ClaimMode> map = new HashMap<>();
        map.put("USER", USER);
        map.put("SHARE", SHARE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ClaimMode(String value) {
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
    public static ClaimMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClaimMode(value));
    }

    public static ClaimMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClaimMode) {
            return this.value.equals(((ClaimMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
