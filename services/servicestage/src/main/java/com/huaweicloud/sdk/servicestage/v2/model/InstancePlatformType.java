package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 运行平台类型。  应用可以在不同的平台上运行，可选用的平台的类型有以下几种：cce、vmapp。 
 */
public class InstancePlatformType {
    
    /**
     * Enum CCE for value: "cce"
     */
    public static final InstancePlatformType CCE = new InstancePlatformType("cce");
    
    /**
     * Enum VMAPP for value: "vmapp"
     */
    public static final InstancePlatformType VMAPP = new InstancePlatformType("vmapp");
    

    public static final Map<String, InstancePlatformType> staticFields = new HashMap<String, InstancePlatformType>() {
        { 
            put("cce", CCE);
            put("vmapp", VMAPP);
        }
    };

    private String value;

    InstancePlatformType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static InstancePlatformType fromValue(String value) {
        if( value == null ){
            return null;
        }
        InstancePlatformType result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new InstancePlatformType(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static InstancePlatformType valueOf(String value) {
        if( value == null ){
            return null;
        }
        InstancePlatformType result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof InstancePlatformType) {
            return this.value.equals(((InstancePlatformType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

