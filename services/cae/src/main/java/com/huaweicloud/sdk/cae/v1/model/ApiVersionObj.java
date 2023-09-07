package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API版本，固定值“v1”，该值不可修改。
 */
public class ApiVersionObj {

    /**
     * Enum V1 for value: "v1"
     */
    public static final ApiVersionObj V1 = new ApiVersionObj("v1");

    private static final Map<String, ApiVersionObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApiVersionObj> createStaticFields() {
        Map<String, ApiVersionObj> map = new HashMap<>();
        map.put("v1", V1);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApiVersionObj(String value) {
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
    public static ApiVersionObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiVersionObj(value));
    }

    public static ApiVersionObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApiVersionObj) {
            return this.value.equals(((ApiVersionObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
