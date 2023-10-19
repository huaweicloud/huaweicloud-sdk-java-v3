package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 中心网络连接类型定义： - ER-ER (ER-ER Connection) - ER-GDGW (ER-GDGW Attachment Connection) - ER-ER_ROUTE_TABLE (ER-ER_ROUTE_TABLE Attachment Connection)
 */
public class ConnectionTypeEnum {

    /**
     * Enum ER_ER for value: "ER-ER"
     */
    public static final ConnectionTypeEnum ER_ER = new ConnectionTypeEnum("ER-ER");

    /**
     * Enum ER_GDGW for value: "ER-GDGW"
     */
    public static final ConnectionTypeEnum ER_GDGW = new ConnectionTypeEnum("ER-GDGW");

    /**
     * Enum ER_ER_ROUTE_TABLE for value: "ER-ER_ROUTE_TABLE"
     */
    public static final ConnectionTypeEnum ER_ER_ROUTE_TABLE = new ConnectionTypeEnum("ER-ER_ROUTE_TABLE");

    private static final Map<String, ConnectionTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConnectionTypeEnum> createStaticFields() {
        Map<String, ConnectionTypeEnum> map = new HashMap<>();
        map.put("ER-ER", ER_ER);
        map.put("ER-GDGW", ER_GDGW);
        map.put("ER-ER_ROUTE_TABLE", ER_ER_ROUTE_TABLE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConnectionTypeEnum(String value) {
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
    public static ConnectionTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConnectionTypeEnum(value));
    }

    public static ConnectionTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConnectionTypeEnum) {
            return this.value.equals(((ConnectionTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
