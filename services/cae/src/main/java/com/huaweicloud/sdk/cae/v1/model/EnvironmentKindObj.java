package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Environment”，该值不可修改。
 */
public class EnvironmentKindObj {

    /**
     * Enum ENVIRONMENT for value: "Environment"
     */
    public static final EnvironmentKindObj ENVIRONMENT = new EnvironmentKindObj("Environment");

    private static final Map<String, EnvironmentKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, EnvironmentKindObj> createStaticFields() {
        Map<String, EnvironmentKindObj> map = new HashMap<>();
        map.put("Environment", ENVIRONMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EnvironmentKindObj(String value) {
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
    public static EnvironmentKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EnvironmentKindObj(value));
    }

    public static EnvironmentKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EnvironmentKindObj) {
            return this.value.equals(((EnvironmentKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
