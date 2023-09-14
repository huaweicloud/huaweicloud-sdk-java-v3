package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 包周期付款类型 - FULL: 全预付 - HALF：半预付
 */
public class PayMode {

    /**
     * Enum FULL for value: "FULL"
     */
    public static final PayMode FULL = new PayMode("FULL");

    /**
     * Enum HALF for value: "HALF"
     */
    public static final PayMode HALF = new PayMode("HALF");

    private static final Map<String, PayMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, PayMode> createStaticFields() {
        Map<String, PayMode> map = new HashMap<>();
        map.put("FULL", FULL);
        map.put("HALF", HALF);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PayMode(String value) {
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
    public static PayMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PayMode(value));
    }

    public static PayMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PayMode) {
            return this.value.equals(((PayMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
