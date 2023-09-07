package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Application”，该值不可修改。
 */
public class ApplicationKindObj {

    /**
     * Enum APPLICATION for value: "Application"
     */
    public static final ApplicationKindObj APPLICATION = new ApplicationKindObj("Application");

    private static final Map<String, ApplicationKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApplicationKindObj> createStaticFields() {
        Map<String, ApplicationKindObj> map = new HashMap<>();
        map.put("Application", APPLICATION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApplicationKindObj(String value) {
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
    public static ApplicationKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApplicationKindObj(value));
    }

    public static ApplicationKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApplicationKindObj) {
            return this.value.equals(((ApplicationKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
