package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 机柜状态。 - CREATING：创建中 - AVAILABLE：可用 - EXPANDING：扩容中 - PENDING_PAYMENT：待支付
 */
public class StoragePoolStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final StoragePoolStatus CREATING = new StoragePoolStatus("CREATING");

    /**
     * Enum AVAILABLE for value: "AVAILABLE"
     */
    public static final StoragePoolStatus AVAILABLE = new StoragePoolStatus("AVAILABLE");

    /**
     * Enum EXPANDING for value: "EXPANDING"
     */
    public static final StoragePoolStatus EXPANDING = new StoragePoolStatus("EXPANDING");

    /**
     * Enum PENDING_PAYMENT for value: "PENDING_PAYMENT"
     */
    public static final StoragePoolStatus PENDING_PAYMENT = new StoragePoolStatus("PENDING_PAYMENT");

    private static final Map<String, StoragePoolStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, StoragePoolStatus> createStaticFields() {
        Map<String, StoragePoolStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("AVAILABLE", AVAILABLE);
        map.put("EXPANDING", EXPANDING);
        map.put("PENDING_PAYMENT", PENDING_PAYMENT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StoragePoolStatus(String value) {
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
    public static StoragePoolStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StoragePoolStatus(value));
    }

    public static StoragePoolStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StoragePoolStatus) {
            return this.value.equals(((StoragePoolStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
