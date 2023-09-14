package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 机柜状态。 - CREATING：创建中 - AVAILABLE：可用 - EXPANDING：扩容中 - PENDING_PAYMENT: 待支付
 */
public class RackStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final RackStatus CREATING = new RackStatus("CREATING");

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final RackStatus AVAILABLE = new RackStatus("AVAILABLE");

    /**
     * Enum EXPANDING for value: "EXPANDING"
     */
    public static final RackStatus EXPANDING = new RackStatus("EXPANDING");

    /**
     * Enum PENDING_PAYMENT for value: "PENDING_PAYMENT"
     */
    public static final RackStatus PENDING_PAYMENT = new RackStatus("PENDING_PAYMENT");

    private static final Map<String, RackStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, RackStatus> createStaticFields() {
        Map<String, RackStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("AVAILABLE", AVAILABLE);
        map.put("EXPANDING", EXPANDING);
        map.put("PENDING_PAYMENT", PENDING_PAYMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RackStatus(String value) {
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
    public static RackStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RackStatus(value));
    }

    public static RackStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RackStatus) {
            return this.value.equals(((RackStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
