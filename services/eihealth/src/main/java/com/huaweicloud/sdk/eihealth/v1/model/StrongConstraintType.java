package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets StrongConstraintType
 */
public class StrongConstraintType {

    /**
     * Enum BOOL for value: "bool"
     */
    public static final StrongConstraintType BOOL = new StrongConstraintType("bool");

    /**
     * Enum RANGE for value: "range"
     */
    public static final StrongConstraintType RANGE = new StrongConstraintType("range");

    /**
     * Enum STRUCT for value: "struct"
     */
    public static final StrongConstraintType STRUCT = new StrongConstraintType("struct");

    private static final Map<String, StrongConstraintType> STATIC_FIELDS = createStaticFields();

    private static Map<String, StrongConstraintType> createStaticFields() {
        Map<String, StrongConstraintType> map = new HashMap<>();
        map.put("bool", BOOL);
        map.put("range", RANGE);
        map.put("struct", STRUCT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StrongConstraintType(String value) {
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
    public static StrongConstraintType fromValue(String value) {
        if (value == null) {
            return null;
        }
        StrongConstraintType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new StrongConstraintType(value);
        }
        return result;
    }

    public static StrongConstraintType valueOf(String value) {
        if (value == null) {
            return null;
        }
        StrongConstraintType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StrongConstraintType) {
            return this.value.equals(((StrongConstraintType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
