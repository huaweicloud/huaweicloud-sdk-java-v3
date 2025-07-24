package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 硬件启用状态： Enabled：启用 Unenabled：未启用 Unknown：未知
 */
public class State {

    /**
     * Enum ENABLED for value: "Enabled"
     */
    public static final State ENABLED = new State("Enabled");

    /**
     * Enum UNENABLED for value: "Unenabled"
     */
    public static final State UNENABLED = new State("Unenabled");

    /**
     * Enum UNKNOWN for value: "Unknown"
     */
    public static final State UNKNOWN = new State("Unknown");

    private static final Map<String, State> STATIC_FIELDS = createStaticFields();

    private static Map<String, State> createStaticFields() {
        Map<String, State> map = new HashMap<>();
        map.put("Enabled", ENABLED);
        map.put("Unenabled", UNENABLED);
        map.put("Unknown", UNKNOWN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    State(String value) {
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
    public static State fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new State(value));
    }

    public static State valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof State) {
            return this.value.equals(((State) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
