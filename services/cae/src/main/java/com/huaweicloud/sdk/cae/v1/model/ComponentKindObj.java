package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Component”，该值不可修改。
 */
public class ComponentKindObj {

    /**
     * Enum COMPONENT for value: "Component"
     */
    public static final ComponentKindObj COMPONENT = new ComponentKindObj("Component");

    private static final Map<String, ComponentKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentKindObj> createStaticFields() {
        Map<String, ComponentKindObj> map = new HashMap<>();
        map.put("Component", COMPONENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentKindObj(String value) {
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
    public static ComponentKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentKindObj(value));
    }

    public static ComponentKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentKindObj) {
            return this.value.equals(((ComponentKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
