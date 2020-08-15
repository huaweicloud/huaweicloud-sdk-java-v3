package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 状态。
 */
public class ExternalAccessStatus {
    
    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final ExternalAccessStatus NORMAL = new ExternalAccessStatus("NORMAL");
    
    /**
     * Enum EXPIRED for value: "EXPIRED"
     */
    public static final ExternalAccessStatus EXPIRED = new ExternalAccessStatus("EXPIRED");
    

    public static final Map<String, ExternalAccessStatus> staticFields = new HashMap<String, ExternalAccessStatus>() {
        { 
            put("NORMAL", NORMAL);
            put("EXPIRED", EXPIRED);
        }
    };

    private String value;

    ExternalAccessStatus(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExternalAccessStatus fromValue(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessStatus result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new ExternalAccessStatus(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static ExternalAccessStatus valueOf(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessStatus result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ExternalAccessStatus) {
            return this.value.equals(((ExternalAccessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

