package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - PENDING_PAYMENT：待支付 - DELIVERING：交付中 - USING：使用中
 */
public class ServerStatus {

    /**
     * Enum PENDING_PAYMENT for value: "PENDING_PAYMENT"
     */
    public static final ServerStatus PENDING_PAYMENT = new ServerStatus("PENDING_PAYMENT");

    /**
     * Enum DELIVERING for value: "DELIVERING"
     */
    public static final ServerStatus DELIVERING = new ServerStatus("DELIVERING");

    /**
     * Enum USING for value: "USING"
     */
    public static final ServerStatus USING = new ServerStatus("USING");

    private static final Map<String, ServerStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ServerStatus> createStaticFields() {
        Map<String, ServerStatus> map = new HashMap<>();
        map.put("PENDING_PAYMENT", PENDING_PAYMENT);
        map.put("DELIVERING", DELIVERING);
        map.put("USING", USING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ServerStatus(String value) {
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
    public static ServerStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerStatus(value));
    }

    public static ServerStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServerStatus) {
            return this.value.equals(((ServerStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
