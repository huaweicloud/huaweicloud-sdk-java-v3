package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“ComponentConfiguration”，该值不可修改。
 */
public class ComponentConfigurationKindObj {

    /**
     * Enum COMPONENTCONFIGURATION for value: "ComponentConfiguration"
     */
    public static final ComponentConfigurationKindObj COMPONENTCONFIGURATION =
        new ComponentConfigurationKindObj("ComponentConfiguration");

    private static final Map<String, ComponentConfigurationKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentConfigurationKindObj> createStaticFields() {
        Map<String, ComponentConfigurationKindObj> map = new HashMap<>();
        map.put("ComponentConfiguration", COMPONENTCONFIGURATION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentConfigurationKindObj(String value) {
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
    public static ComponentConfigurationKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComponentConfigurationKindObj(value));
    }

    public static ComponentConfigurationKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentConfigurationKindObj) {
            return this.value.equals(((ComponentConfigurationKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
