package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络连接点类型定义： - ER (EnterpriseRouter) - GDGW (Global DC Gateway) - ER_ROUTE_TABLE (Route Table)
 */
public class ConnectionPointTypeEnum {

    /**
     * Enum ER for value: "ER"
     */
    public static final ConnectionPointTypeEnum ER = new ConnectionPointTypeEnum("ER");

    /**
     * Enum GDGW for value: "GDGW"
     */
    public static final ConnectionPointTypeEnum GDGW = new ConnectionPointTypeEnum("GDGW");

    /**
     * Enum ER_ROUTE_TABLE for value: "ER_ROUTE_TABLE"
     */
    public static final ConnectionPointTypeEnum ER_ROUTE_TABLE = new ConnectionPointTypeEnum("ER_ROUTE_TABLE");

    private static final Map<String, ConnectionPointTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConnectionPointTypeEnum> createStaticFields() {
        Map<String, ConnectionPointTypeEnum> map = new HashMap<>();
        map.put("ER", ER);
        map.put("GDGW", GDGW);
        map.put("ER_ROUTE_TABLE", ER_ROUTE_TABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConnectionPointTypeEnum(String value) {
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
    public static ConnectionPointTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConnectionPointTypeEnum(value));
    }

    public static ConnectionPointTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConnectionPointTypeEnum) {
            return this.value.equals(((ConnectionPointTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
