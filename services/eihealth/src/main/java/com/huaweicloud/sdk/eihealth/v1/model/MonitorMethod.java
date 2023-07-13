package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets MonitorMethod
 */
public class MonitorMethod {

    /**
     * Enum MAX for value: "max"
     */
    public static final MonitorMethod MAX = new MonitorMethod("max");

    /**
     * Enum MIN for value: "min"
     */
    public static final MonitorMethod MIN = new MonitorMethod("min");

    /**
     * Enum AVERAGE for value: "average"
     */
    public static final MonitorMethod AVERAGE = new MonitorMethod("average");

    private static final Map<String, MonitorMethod> STATIC_FIELDS = createStaticFields();

    private static Map<String, MonitorMethod> createStaticFields() {
        Map<String, MonitorMethod> map = new HashMap<>();
        map.put("max", MAX);
        map.put("min", MIN);
        map.put("average", AVERAGE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MonitorMethod(String value) {
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
    public static MonitorMethod fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MonitorMethod(value));
    }

    public static MonitorMethod valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MonitorMethod) {
            return this.value.equals(((MonitorMethod) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
