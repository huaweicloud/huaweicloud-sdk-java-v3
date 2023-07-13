package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 实例状态。
 */
public class InstanceStatusType {

    /**
     * Enum INITIALIZING for value: "INITIALIZING"
     */
    public static final InstanceStatusType INITIALIZING = new InstanceStatusType("INITIALIZING");

    /**
     * Enum UPGRADING for value: "UPGRADING"
     */
    public static final InstanceStatusType UPGRADING = new InstanceStatusType("UPGRADING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final InstanceStatusType FAILED = new InstanceStatusType("FAILED");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final InstanceStatusType RUNNING = new InstanceStatusType("RUNNING");

    /**
     * Enum DOWN for value: "DOWN"
     */
    public static final InstanceStatusType DOWN = new InstanceStatusType("DOWN");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final InstanceStatusType DELETING = new InstanceStatusType("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final InstanceStatusType DELETED = new InstanceStatusType("DELETED");

    /**
     * Enum RESERVED for value: "RESERVED"
     */
    public static final InstanceStatusType RESERVED = new InstanceStatusType("RESERVED");

    /**
     * Enum STARTING for value: "STARTING"
     */
    public static final InstanceStatusType STARTING = new InstanceStatusType("STARTING");

    /**
     * Enum STOPPING for value: "STOPPING"
     */
    public static final InstanceStatusType STOPPING = new InstanceStatusType("STOPPING");

    /**
     * Enum STOPPED for value: "STOPPED"
     */
    public static final InstanceStatusType STOPPED = new InstanceStatusType("STOPPED");

    /**
     * Enum RESTARTING for value: "RESTARTING"
     */
    public static final InstanceStatusType RESTARTING = new InstanceStatusType("RESTARTING");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final InstanceStatusType PENDING = new InstanceStatusType("PENDING");

    /**
     * Enum UNKNOWN for value: "UNKNOWN"
     */
    public static final InstanceStatusType UNKNOWN = new InstanceStatusType("UNKNOWN");

    /**
     * Enum PARTIALLY_FAILED for value: "PARTIALLY_FAILED"
     */
    public static final InstanceStatusType PARTIALLY_FAILED = new InstanceStatusType("PARTIALLY_FAILED");

    private static final Map<String, InstanceStatusType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceStatusType> createStaticFields() {
        Map<String, InstanceStatusType> map = new HashMap<>();
        map.put("INITIALIZING", INITIALIZING);
        map.put("UPGRADING", UPGRADING);
        map.put("FAILED", FAILED);
        map.put("RUNNING", RUNNING);
        map.put("DOWN", DOWN);
        map.put("DELETING", DELETING);
        map.put("DELETED", DELETED);
        map.put("RESERVED", RESERVED);
        map.put("STARTING", STARTING);
        map.put("STOPPING", STOPPING);
        map.put("STOPPED", STOPPED);
        map.put("RESTARTING", RESTARTING);
        map.put("PENDING", PENDING);
        map.put("UNKNOWN", UNKNOWN);
        map.put("PARTIALLY_FAILED", PARTIALLY_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstanceStatusType(String value) {
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
    public static InstanceStatusType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceStatusType(value));
    }

    public static InstanceStatusType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceStatusType) {
            return this.value.equals(((InstanceStatusType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
