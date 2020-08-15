package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 收费模式，支持provided、on_demanded、monthly三种模式。  默认provided，表示使用用户提供的已有资源，无需收费。 
 */
public class ChargeMode {
    
    /**
     * Enum PROVIDED for value: "provided"
     */
    public static final ChargeMode PROVIDED = new ChargeMode("provided");
    
    /**
     * Enum ON_DEMANDED for value: "on_demanded"
     */
    public static final ChargeMode ON_DEMANDED = new ChargeMode("on_demanded");
    
    /**
     * Enum MONTHLY for value: "monthly"
     */
    public static final ChargeMode MONTHLY = new ChargeMode("monthly");
    

    public static final Map<String, ChargeMode> staticFields = new HashMap<String, ChargeMode>() {
        { 
            put("provided", PROVIDED);
            put("on_demanded", ON_DEMANDED);
            put("monthly", MONTHLY);
        }
    };

    private String value;

    ChargeMode(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ChargeMode fromValue(String value) {
        if( value == null ){
            return null;
        }
        ChargeMode result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new ChargeMode(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static ChargeMode valueOf(String value) {
        if( value == null ){
            return null;
        }
        ChargeMode result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ChargeMode) {
            return this.value.equals(((ChargeMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

