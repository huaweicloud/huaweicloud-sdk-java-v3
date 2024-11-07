package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - bwd (按需按带宽计费) - trf (按流量计费) - 95 (传统95计费) - 95avr (日95计费)
 */
public class ConnectionBandwidthChargeModeEnum {

    /**
     * Enum BWD for value: "bwd"
     */
    public static final ConnectionBandwidthChargeModeEnum BWD = new ConnectionBandwidthChargeModeEnum("bwd");

    /**
     * Enum TRF for value: "trf"
     */
    public static final ConnectionBandwidthChargeModeEnum TRF = new ConnectionBandwidthChargeModeEnum("trf");

    /**
     * Enum _95 for value: "95"
     */
    public static final ConnectionBandwidthChargeModeEnum _95 = new ConnectionBandwidthChargeModeEnum("95");

    /**
     * Enum _95AVR for value: "95avr"
     */
    public static final ConnectionBandwidthChargeModeEnum _95AVR = new ConnectionBandwidthChargeModeEnum("95avr");

    private static final Map<String, ConnectionBandwidthChargeModeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ConnectionBandwidthChargeModeEnum> createStaticFields() {
        Map<String, ConnectionBandwidthChargeModeEnum> map = new HashMap<>();
        map.put("bwd", BWD);
        map.put("trf", TRF);
        map.put("95", _95);
        map.put("95avr", _95AVR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ConnectionBandwidthChargeModeEnum(String value) {
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
    public static ConnectionBandwidthChargeModeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElse(new ConnectionBandwidthChargeModeEnum(value));
    }

    public static ConnectionBandwidthChargeModeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ConnectionBandwidthChargeModeEnum) {
            return this.value.equals(((ConnectionBandwidthChargeModeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
