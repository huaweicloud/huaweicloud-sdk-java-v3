package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 下一跳类型: - vif_peer: 虚拟接口对等体 - gdgw: 全域接入网关
 */
public class RouteTypeOfGdgw {

    /**
     * Enum VIF_PEER for value: "vif_peer"
     */
    public static final RouteTypeOfGdgw VIF_PEER = new RouteTypeOfGdgw("vif_peer");

    /**
     * Enum GDGW for value: "gdgw"
     */
    public static final RouteTypeOfGdgw GDGW = new RouteTypeOfGdgw("gdgw");

    private static final Map<String, RouteTypeOfGdgw> STATIC_FIELDS = createStaticFields();

    private static Map<String, RouteTypeOfGdgw> createStaticFields() {
        Map<String, RouteTypeOfGdgw> map = new HashMap<>();
        map.put("vif_peer", VIF_PEER);
        map.put("gdgw", GDGW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RouteTypeOfGdgw(String value) {
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
    public static RouteTypeOfGdgw fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RouteTypeOfGdgw(value));
    }

    public static RouteTypeOfGdgw valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RouteTypeOfGdgw) {
            return this.value.equals(((RouteTypeOfGdgw) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
