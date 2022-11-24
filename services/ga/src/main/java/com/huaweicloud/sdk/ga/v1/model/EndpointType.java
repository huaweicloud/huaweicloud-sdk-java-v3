package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 终端节点类型。
 */
public class EndpointType {

    /**
     * Enum EIP for value: "EIP"
     */
    public static final EndpointType EIP = new EndpointType("EIP");

    private static final Map<String, EndpointType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EndpointType> createStaticFields() {
        Map<String, EndpointType> map = new HashMap<>();
        map.put("EIP", EIP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EndpointType(String value) {
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
    public static EndpointType fromValue(String value) {
        if (value == null) {
            return null;
        }
        EndpointType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new EndpointType(value);
        }
        return result;
    }

    public static EndpointType valueOf(String value) {
        if (value == null) {
            return null;
        }
        EndpointType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EndpointType) {
            return this.value.equals(((EndpointType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
