package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 云日志的资源类型。
 */
public class LogtankResourceType {

    /**
     * Enum LISTENER for value: "LISTENER"
     */
    public static final LogtankResourceType LISTENER = new LogtankResourceType("LISTENER");

    private static final Map<String, LogtankResourceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, LogtankResourceType> createStaticFields() {
        Map<String, LogtankResourceType> map = new HashMap<>();
        map.put("LISTENER", LISTENER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LogtankResourceType(String value) {
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
    public static LogtankResourceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogtankResourceType(value));
    }

    public static LogtankResourceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LogtankResourceType) {
            return this.value.equals(((LogtankResourceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
