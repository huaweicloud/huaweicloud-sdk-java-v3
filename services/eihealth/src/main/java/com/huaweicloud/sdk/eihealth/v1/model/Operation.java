package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets Operation
 */
public class Operation {

    /**
     * Enum OPEN for value: "OPEN"
     */
    public static final Operation OPEN = new Operation("OPEN");

    /**
     * Enum CLOSE for value: "CLOSE"
     */
    public static final Operation CLOSE = new Operation("CLOSE");

    private static final Map<String, Operation> STATIC_FIELDS = createStaticFields();

    private static Map<String, Operation> createStaticFields() {
        Map<String, Operation> map = new HashMap<>();
        map.put("OPEN", OPEN);
        map.put("CLOSE", CLOSE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Operation(String value) {
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
    public static Operation fromValue(String value) {
        if (value == null) {
            return null;
        }
        Operation result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new Operation(value);
        }
        return result;
    }

    public static Operation valueOf(String value) {
        if (value == null) {
            return null;
        }
        Operation result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operation) {
            return this.value.equals(((Operation) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
