package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 操作，支持start, stop, restart, scale, rollback。
 */
public class InstanceActionType {
    
    /**
     * Enum START for value: "start"
     */
    public static final InstanceActionType START = new InstanceActionType("start");
    
    /**
     * Enum STOP for value: "stop"
     */
    public static final InstanceActionType STOP = new InstanceActionType("stop");
    
    /**
     * Enum RESTART for value: "restart"
     */
    public static final InstanceActionType RESTART = new InstanceActionType("restart");
    
    /**
     * Enum SCALE for value: "scale"
     */
    public static final InstanceActionType SCALE = new InstanceActionType("scale");
    
    /**
     * Enum ROLLBACK for value: "rollback"
     */
    public static final InstanceActionType ROLLBACK = new InstanceActionType("rollback");
    

    private static final Map<String, InstanceActionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceActionType> createStaticFields() {
        Map<String, InstanceActionType> map = new HashMap<>();
        map.put("start", START);
        map.put("stop", STOP);
        map.put("restart", RESTART);
        map.put("scale", SCALE);
        map.put("rollback", ROLLBACK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstanceActionType(String value) {
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
    public static InstanceActionType fromValue(String value) {
        if( value == null ){
            return null;
        }
        InstanceActionType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new InstanceActionType(value);
        }
        return result;
    }

    public static InstanceActionType valueOf(String value) {
        if( value == null ){
            return null;
        }
        InstanceActionType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceActionType) {
            return this.value.equals(((InstanceActionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

