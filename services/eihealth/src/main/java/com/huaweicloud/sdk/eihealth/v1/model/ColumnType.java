package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ColumnType
 */
public class ColumnType {

    /**
     * Enum LONG for value: "Long"
     */
    public static final ColumnType LONG = new ColumnType("Long");

    /**
     * Enum STRING for value: "String"
     */
    public static final ColumnType STRING = new ColumnType("String");

    /**
     * Enum DOUBLE for value: "Double"
     */
    public static final ColumnType DOUBLE = new ColumnType("Double");

    private static final Map<String, ColumnType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ColumnType> createStaticFields() {
        Map<String, ColumnType> map = new HashMap<>();
        map.put("Long", LONG);
        map.put("String", STRING);
        map.put("Double", DOUBLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ColumnType(String value) {
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
    public static ColumnType fromValue(String value) {
        if (value == null) {
            return null;
        }
        ColumnType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ColumnType(value);
        }
        return result;
    }

    public static ColumnType valueOf(String value) {
        if (value == null) {
            return null;
        }
        ColumnType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ColumnType) {
            return this.value.equals(((ColumnType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
