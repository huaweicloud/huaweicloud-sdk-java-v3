package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Eip”，该值不可修改。
 */
public class EipKindObj {

    /**
     * Enum EIP for value: "Eip"
     */
    public static final EipKindObj EIP = new EipKindObj("Eip");

    private static final Map<String, EipKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, EipKindObj> createStaticFields() {
        Map<String, EipKindObj> map = new HashMap<>();
        map.put("Eip", EIP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EipKindObj(String value) {
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
    public static EipKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EipKindObj(value));
    }

    public static EipKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EipKindObj) {
            return this.value.equals(((EipKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
