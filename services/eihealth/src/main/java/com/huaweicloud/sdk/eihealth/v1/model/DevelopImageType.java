package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets DevelopImageType
 */
public class DevelopImageType {

    /**
     * Enum SYSTEM for value: "SYSTEM"
     */
    public static final DevelopImageType SYSTEM = new DevelopImageType("SYSTEM");

    /**
     * Enum CUSTOMER for value: "CUSTOMER"
     */
    public static final DevelopImageType CUSTOMER = new DevelopImageType("CUSTOMER");

    private static final Map<String, DevelopImageType> STATIC_FIELDS = createStaticFields();

    private static Map<String, DevelopImageType> createStaticFields() {
        Map<String, DevelopImageType> map = new HashMap<>();
        map.put("SYSTEM", SYSTEM);
        map.put("CUSTOMER", CUSTOMER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DevelopImageType(String value) {
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
    public static DevelopImageType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DevelopImageType(value));
    }

    public static DevelopImageType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DevelopImageType) {
            return this.value.equals(((DevelopImageType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
