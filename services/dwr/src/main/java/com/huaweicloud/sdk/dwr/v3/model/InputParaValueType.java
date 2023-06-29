package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 只支持string,integer,float
 */
public class InputParaValueType {

    /**
     * Enum STRING for value: "string"
     */
    public static final InputParaValueType STRING = new InputParaValueType("string");

    /**
     * Enum INTEGER for value: "integer"
     */
    public static final InputParaValueType INTEGER = new InputParaValueType("integer");

    /**
     * Enum FLOAT for value: "float"
     */
    public static final InputParaValueType FLOAT = new InputParaValueType("float");

    private static final Map<String, InputParaValueType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InputParaValueType> createStaticFields() {
        Map<String, InputParaValueType> map = new HashMap<>();
        map.put("string", STRING);
        map.put("integer", INTEGER);
        map.put("float", FLOAT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InputParaValueType(String value) {
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
    public static InputParaValueType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InputParaValueType(value));
    }

    public static InputParaValueType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InputParaValueType) {
            return this.value.equals(((InputParaValueType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
