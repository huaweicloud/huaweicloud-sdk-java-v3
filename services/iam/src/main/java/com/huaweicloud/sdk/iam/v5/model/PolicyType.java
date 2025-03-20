package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 身份策略类型，可以为“自定义”（custom）或“系统预置”（system）。
 */
public class PolicyType {

    /**
     * Enum CUSTOM for value: "custom"
     */
    public static final PolicyType CUSTOM = new PolicyType("custom");

    /**
     * Enum SYSTEM for value: "system"
     */
    public static final PolicyType SYSTEM = new PolicyType("system");

    private static final Map<String, PolicyType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyType> createStaticFields() {
        Map<String, PolicyType> map = new HashMap<>();
        map.put("custom", CUSTOM);
        map.put("system", SYSTEM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyType(String value) {
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
    public static PolicyType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyType(value));
    }

    public static PolicyType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyType) {
            return this.value.equals(((PolicyType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
