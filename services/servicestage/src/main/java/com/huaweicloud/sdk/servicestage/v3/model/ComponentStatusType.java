package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ComponentStatusType
 */
public class ComponentStatusType {

    /**
     * Enum INITIALIZING for value: "INITIALIZING"
     */
    public static final ComponentStatusType INITIALIZING = new ComponentStatusType("INITIALIZING");

    /**
     * Enum UPGRADING for value: "UPGRADING"
     */
    public static final ComponentStatusType UPGRADING = new ComponentStatusType("UPGRADING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final ComponentStatusType FAILED = new ComponentStatusType("FAILED");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final ComponentStatusType RUNNING = new ComponentStatusType("RUNNING");

    /**
     * Enum DOWN for value: "DOWN"
     */
    public static final ComponentStatusType DOWN = new ComponentStatusType("DOWN");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final ComponentStatusType DELETING = new ComponentStatusType("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final ComponentStatusType DELETED = new ComponentStatusType("DELETED");

    /**
     * Enum RESERVED for value: "RESERVED"
     */
    public static final ComponentStatusType RESERVED = new ComponentStatusType("RESERVED");

    /**
     * Enum STARTING for value: "STARTING"
     */
    public static final ComponentStatusType STARTING = new ComponentStatusType("STARTING");

    /**
     * Enum STOPPING for value: "STOPPING"
     */
    public static final ComponentStatusType STOPPING = new ComponentStatusType("STOPPING");

    /**
     * Enum STOPPED for value: "STOPPED"
     */
    public static final ComponentStatusType STOPPED = new ComponentStatusType("STOPPED");

    /**
     * Enum RESTARTING for value: "RESTARTING"
     */
    public static final ComponentStatusType RESTARTING = new ComponentStatusType("RESTARTING");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final ComponentStatusType PENDING = new ComponentStatusType("PENDING");

    /**
     * Enum UNKNOWN for value: "UNKNOWN"
     */
    public static final ComponentStatusType UNKNOWN = new ComponentStatusType("UNKNOWN");

    /**
     * Enum PARTIALLY_FAILED for value: "PARTIALLY_FAILED"
     */
    public static final ComponentStatusType PARTIALLY_FAILED = new ComponentStatusType("PARTIALLY_FAILED");

    private static final Map<String, ComponentStatusType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentStatusType> createStaticFields() {
        Map<String, ComponentStatusType> map = new HashMap<>();
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

    ComponentStatusType(String value) {
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
    public static ComponentStatusType fromValue(String value) {
        if (value == null) {
            return null;
        }
        ComponentStatusType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ComponentStatusType(value);
        }
        return result;
    }

    public static ComponentStatusType valueOf(String value) {
        if (value == null) {
            return null;
        }
        ComponentStatusType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentStatusType) {
            return this.value.equals(((ComponentStatusType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
