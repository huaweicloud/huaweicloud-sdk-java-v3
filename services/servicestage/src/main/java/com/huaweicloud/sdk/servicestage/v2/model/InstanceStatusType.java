package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
    

    public static final Map<String, InstanceStatusType> staticFields = new HashMap<String, InstanceStatusType>() {
        { 
            put("INITIALIZING", INITIALIZING);
            put("UPGRADING", UPGRADING);
            put("FAILED", FAILED);
            put("RUNNING", RUNNING);
            put("DOWN", DOWN);
            put("DELETING", DELETING);
            put("DELETED", DELETED);
            put("RESERVED", RESERVED);
            put("STARTING", STARTING);
            put("STOPPING", STOPPING);
            put("STOPPED", STOPPED);
            put("RESTARTING", RESTARTING);
            put("PENDING", PENDING);
            put("UNKNOWN", UNKNOWN);
            put("PARTIALLY_FAILED", PARTIALLY_FAILED);
        }
    };

    private String value;

    InstanceStatusType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static InstanceStatusType fromValue(String value) {
        if( value == null ){
            return null;
        }
        InstanceStatusType result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new InstanceStatusType(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static InstanceStatusType valueOf(String value) {
        if( value == null ){
            return null;
        }
        InstanceStatusType result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof InstanceStatusType) {
            return this.value.equals(((InstanceStatusType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

