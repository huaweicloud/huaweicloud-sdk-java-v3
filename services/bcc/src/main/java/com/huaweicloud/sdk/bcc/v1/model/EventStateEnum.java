package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件状态，取值范围：normal,warning,incident
 */
public class EventStateEnum {

    /**
     * Enum NORMAL for value: "normal"
     */
    public static final EventStateEnum NORMAL = new EventStateEnum("normal");

    /**
     * Enum WARNING for value: "warning"
     */
    public static final EventStateEnum WARNING = new EventStateEnum("warning");

    /**
     * Enum INCIDENT for value: "incident"
     */
    public static final EventStateEnum INCIDENT = new EventStateEnum("incident");

    private static final Map<String, EventStateEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, EventStateEnum> createStaticFields() {
        Map<String, EventStateEnum> map = new HashMap<>();
        map.put("normal", NORMAL);
        map.put("warning", WARNING);
        map.put("incident", INCIDENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EventStateEnum(String value) {
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
    public static EventStateEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventStateEnum(value));
    }

    public static EventStateEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EventStateEnum) {
            return this.value.equals(((EventStateEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
