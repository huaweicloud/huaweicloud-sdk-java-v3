package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * GDGW资源状态，DOWN (未连接状态), PENDING_UPDATE（连接状态更新中），ACTIVE (已连接状态), ERROR (出错)。
 */
public class GlobalDcGatewayStatus {

    /**
     * Enum DOWN for value: "DOWN"
     */
    public static final GlobalDcGatewayStatus DOWN = new GlobalDcGatewayStatus("DOWN");

    /**
     * Enum PENDING_UPDATE for value: "PENDING_UPDATE"
     */
    public static final GlobalDcGatewayStatus PENDING_UPDATE = new GlobalDcGatewayStatus("PENDING_UPDATE");

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final GlobalDcGatewayStatus ACTIVE = new GlobalDcGatewayStatus("ACTIVE");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final GlobalDcGatewayStatus ERROR = new GlobalDcGatewayStatus("ERROR");

    private static final Map<String, GlobalDcGatewayStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, GlobalDcGatewayStatus> createStaticFields() {
        Map<String, GlobalDcGatewayStatus> map = new HashMap<>();
        map.put("DOWN", DOWN);
        map.put("PENDING_UPDATE", PENDING_UPDATE);
        map.put("ACTIVE", ACTIVE);
        map.put("ERROR", ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    GlobalDcGatewayStatus(String value) {
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
    public static GlobalDcGatewayStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GlobalDcGatewayStatus(value));
    }

    public static GlobalDcGatewayStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GlobalDcGatewayStatus) {
            return this.value.equals(((GlobalDcGatewayStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
