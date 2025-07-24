package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 硬件健康状态： OK：健康 Warning：警告 Critical：严重 Unknown：未知
 */
public class Health {

    /**
     * Enum OK for value: "OK"
     */
    public static final Health OK = new Health("OK");

    /**
     * Enum WARNING for value: "Warning"
     */
    public static final Health WARNING = new Health("Warning");

    /**
     * Enum CRITICAL for value: "Critical"
     */
    public static final Health CRITICAL = new Health("Critical");

    /**
     * Enum UNKNOWN for value: "Unknown"
     */
    public static final Health UNKNOWN = new Health("Unknown");

    private static final Map<String, Health> STATIC_FIELDS = createStaticFields();

    private static Map<String, Health> createStaticFields() {
        Map<String, Health> map = new HashMap<>();
        map.put("OK", OK);
        map.put("Warning", WARNING);
        map.put("Critical", CRITICAL);
        map.put("Unknown", UNKNOWN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Health(String value) {
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
    public static Health fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Health(value));
    }

    public static Health valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Health) {
            return this.value.equals(((Health) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
