package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets WeakConstraintType
 */
public class WeakConstraintType {

    /**
     * Enum BOOL for value: "bool"
     */
    public static final WeakConstraintType BOOL = new WeakConstraintType("bool");

    /**
     * Enum RANGE for value: "range"
     */
    public static final WeakConstraintType RANGE = new WeakConstraintType("range");

    /**
     * Enum STRUCT for value: "struct"
     */
    public static final WeakConstraintType STRUCT = new WeakConstraintType("struct");

    /**
     * Enum MINIMIZE for value: "minimize"
     */
    public static final WeakConstraintType MINIMIZE = new WeakConstraintType("minimize");

    /**
     * Enum MAXIMIZE for value: "maximize"
     */
    public static final WeakConstraintType MAXIMIZE = new WeakConstraintType("maximize");

    private static final Map<String, WeakConstraintType> STATIC_FIELDS = createStaticFields();

    private static Map<String, WeakConstraintType> createStaticFields() {
        Map<String, WeakConstraintType> map = new HashMap<>();
        map.put("bool", BOOL);
        map.put("range", RANGE);
        map.put("struct", STRUCT);
        map.put("minimize", MINIMIZE);
        map.put("maximize", MAXIMIZE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    WeakConstraintType(String value) {
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
    public static WeakConstraintType fromValue(String value) {
        if (value == null) {
            return null;
        }
        WeakConstraintType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new WeakConstraintType(value);
        }
        return result;
    }

    public static WeakConstraintType valueOf(String value) {
        if (value == null) {
            return null;
        }
        WeakConstraintType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WeakConstraintType) {
            return this.value.equals(((WeakConstraintType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
