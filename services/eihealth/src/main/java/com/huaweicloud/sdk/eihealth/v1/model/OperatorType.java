package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets OperatorType
 */
public class OperatorType {

    /**
     * Enum OR for value: "or"
     */
    public static final OperatorType OR = new OperatorType("or");

    /**
     * Enum AND for value: "and"
     */
    public static final OperatorType AND = new OperatorType("and");

    private static final Map<String, OperatorType> STATIC_FIELDS = createStaticFields();

    private static Map<String, OperatorType> createStaticFields() {
        Map<String, OperatorType> map = new HashMap<>();
        map.put("or", OR);
        map.put("and", AND);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OperatorType(String value) {
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
    public static OperatorType fromValue(String value) {
        if (value == null) {
            return null;
        }
        OperatorType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new OperatorType(value);
        }
        return result;
    }

    public static OperatorType valueOf(String value) {
        if (value == null) {
            return null;
        }
        OperatorType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OperatorType) {
            return this.value.equals(((OperatorType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
