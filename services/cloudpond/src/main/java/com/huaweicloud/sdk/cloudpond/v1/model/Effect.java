package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源运营功能： DELETABLE：可删除 UNDELETABLE：不可删除
 */
public class Effect {

    /**
     * Enum DELETABLE for value: "DELETABLE"
     */
    public static final Effect DELETABLE = new Effect("DELETABLE");

    /**
     * Enum UNDELETABLE for value: "UNDELETABLE"
     */
    public static final Effect UNDELETABLE = new Effect("UNDELETABLE");

    private static final Map<String, Effect> STATIC_FIELDS = createStaticFields();

    private static Map<String, Effect> createStaticFields() {
        Map<String, Effect> map = new HashMap<>();
        map.put("DELETABLE", DELETABLE);
        map.put("UNDELETABLE", UNDELETABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Effect(String value) {
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
    public static Effect fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Effect(value));
    }

    public static Effect valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Effect) {
            return this.value.equals(((Effect) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
