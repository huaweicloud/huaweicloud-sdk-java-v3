package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 目标连接类型。目前支持webhook：http连接；kafka：华为云官方kafka实例
 */
public class ConnectionType {

    /**
     * Enum WEBHOOK for value: "WEBHOOK"
     */
    public static final ConnectionType WEBHOOK = new ConnectionType("WEBHOOK");

    /**
     * Enum KAFKA for value: "KAFKA"
     */
    public static final ConnectionType KAFKA = new ConnectionType("KAFKA");

    private static final Map<String, ConnectionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConnectionType> createStaticFields() {
        Map<String, ConnectionType> map = new HashMap<>();
        map.put("WEBHOOK", WEBHOOK);
        map.put("KAFKA", KAFKA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConnectionType(String value) {
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
    public static ConnectionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        ConnectionType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ConnectionType(value);
        }
        return result;
    }

    public static ConnectionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        ConnectionType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConnectionType) {
            return this.value.equals(((ConnectionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
