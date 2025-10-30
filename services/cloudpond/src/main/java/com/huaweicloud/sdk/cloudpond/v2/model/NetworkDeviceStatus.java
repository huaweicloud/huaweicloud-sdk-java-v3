package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - PENDING_PAYMENT：待支付 - DELIVERING：交付中 - USING：使用中
 */
public class NetworkDeviceStatus {

    /**
     * Enum PENDING_PAYMENT for value: "PENDING_PAYMENT"
     */
    public static final NetworkDeviceStatus PENDING_PAYMENT = new NetworkDeviceStatus("PENDING_PAYMENT");

    /**
     * Enum DELIVERING for value: "DELIVERING"
     */
    public static final NetworkDeviceStatus DELIVERING = new NetworkDeviceStatus("DELIVERING");

    /**
     * Enum USING for value: "USING"
     */
    public static final NetworkDeviceStatus USING = new NetworkDeviceStatus("USING");

    private static final Map<String, NetworkDeviceStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, NetworkDeviceStatus> createStaticFields() {
        Map<String, NetworkDeviceStatus> map = new HashMap<>();
        map.put("PENDING_PAYMENT", PENDING_PAYMENT);
        map.put("DELIVERING", DELIVERING);
        map.put("USING", USING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NetworkDeviceStatus(String value) {
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
    public static NetworkDeviceStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkDeviceStatus(value));
    }

    public static NetworkDeviceStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NetworkDeviceStatus) {
            return this.value.equals(((NetworkDeviceStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
