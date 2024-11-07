package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 网关的类型。 - GDGW
 */
public class GatewayTypeEnum {

    /**
     * Enum GDGW for value: "GDGW"
     */
    public static final GatewayTypeEnum GDGW = new GatewayTypeEnum("GDGW");

    private static final Map<String, GatewayTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, GatewayTypeEnum> createStaticFields() {
        Map<String, GatewayTypeEnum> map = new HashMap<>();
        map.put("GDGW", GDGW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    GatewayTypeEnum(String value) {
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
    public static GatewayTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GatewayTypeEnum(value));
    }

    public static GatewayTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GatewayTypeEnum) {
            return this.value.equals(((GatewayTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
