package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 应用来源： * &#x60;CUSTOM&#x60; - 用户上传 * &#x60;SYSTEM&#x60; - 内置应用 * &#x60;MARKET&#x60; - 市场应用
 */
public class AppSourceType {

    /**
     * Enum CUSTOM for value: "CUSTOM"
     */
    public static final AppSourceType CUSTOM = new AppSourceType("CUSTOM");

    /**
     * Enum SYSTEM for value: "SYSTEM"
     */
    public static final AppSourceType SYSTEM = new AppSourceType("SYSTEM");

    /**
     * Enum MARKET for value: "MARKET"
     */
    public static final AppSourceType MARKET = new AppSourceType("MARKET");

    private static final Map<String, AppSourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppSourceType> createStaticFields() {
        Map<String, AppSourceType> map = new HashMap<>();
        map.put("CUSTOM", CUSTOM);
        map.put("SYSTEM", SYSTEM);
        map.put("MARKET", MARKET);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppSourceType(String value) {
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
    public static AppSourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppSourceType(value));
    }

    public static AppSourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppSourceType) {
            return this.value.equals(((AppSourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
