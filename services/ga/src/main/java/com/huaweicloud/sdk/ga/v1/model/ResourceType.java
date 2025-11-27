package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源类型，取值范围： - ga-accelerators：加速实例 - ga-listeners：监听器
 */
public class ResourceType {

    /**
     * Enum GA_ACCELERATORS for value: "ga-accelerators"
     */
    public static final ResourceType GA_ACCELERATORS = new ResourceType("ga-accelerators");

    /**
     * Enum GA_LISTENERS for value: "ga-listeners"
     */
    public static final ResourceType GA_LISTENERS = new ResourceType("ga-listeners");

    private static final Map<String, ResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResourceType> createStaticFields() {
        Map<String, ResourceType> map = new HashMap<>();
        map.put("ga-accelerators", GA_ACCELERATORS);
        map.put("ga-listeners", GA_LISTENERS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResourceType(String value) {
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
    public static ResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceType(value));
    }

    public static ResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResourceType) {
            return this.value.equals(((ResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
