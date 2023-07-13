package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ActionType
 */
public class ActionType {

    /**
     * Enum START for value: "start"
     */
    public static final ActionType START = new ActionType("start");

    /**
     * Enum STOP for value: "stop"
     */
    public static final ActionType STOP = new ActionType("stop");

    private static final Map<String, ActionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ActionType> createStaticFields() {
        Map<String, ActionType> map = new HashMap<>();
        map.put("start", START);
        map.put("stop", STOP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ActionType(String value) {
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
    public static ActionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionType(value));
    }

    public static ActionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ActionType) {
            return this.value.equals(((ActionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
