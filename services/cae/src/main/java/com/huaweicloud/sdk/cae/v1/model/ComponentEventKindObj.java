package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“ComponentEvent”，该值不可修改。
 */
public class ComponentEventKindObj {

    /**
     * Enum COMPONENTEVENT for value: "ComponentEvent"
     */
    public static final ComponentEventKindObj COMPONENTEVENT = new ComponentEventKindObj("ComponentEvent");

    private static final Map<String, ComponentEventKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentEventKindObj> createStaticFields() {
        Map<String, ComponentEventKindObj> map = new HashMap<>();
        map.put("ComponentEvent", COMPONENTEVENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentEventKindObj(String value) {
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
    public static ComponentEventKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentEventKindObj(value));
    }

    public static ComponentEventKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentEventKindObj) {
            return this.value.equals(((ComponentEventKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
