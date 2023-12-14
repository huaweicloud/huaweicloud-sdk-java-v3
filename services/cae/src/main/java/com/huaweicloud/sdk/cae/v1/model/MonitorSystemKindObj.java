package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“MonitorSystem”，该值不可修改。
 */
public class MonitorSystemKindObj {

    /**
     * Enum MONITORSYSTEM for value: "MonitorSystem"
     */
    public static final MonitorSystemKindObj MONITORSYSTEM = new MonitorSystemKindObj("MonitorSystem");

    private static final Map<String, MonitorSystemKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, MonitorSystemKindObj> createStaticFields() {
        Map<String, MonitorSystemKindObj> map = new HashMap<>();
        map.put("MonitorSystem", MONITORSYSTEM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MonitorSystemKindObj(String value) {
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
    public static MonitorSystemKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MonitorSystemKindObj(value));
    }

    public static MonitorSystemKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MonitorSystemKindObj) {
            return this.value.equals(((MonitorSystemKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
