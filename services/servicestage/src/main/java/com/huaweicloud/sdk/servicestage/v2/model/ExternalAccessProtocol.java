package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 协议。
 */
public class ExternalAccessProtocol {
    
    /**
     * Enum HTTP for value: "HTTP"
     */
    public static final ExternalAccessProtocol HTTP = new ExternalAccessProtocol("HTTP");
    
    /**
     * Enum HTTPS for value: "HTTPS"
     */
    public static final ExternalAccessProtocol HTTPS = new ExternalAccessProtocol("HTTPS");
    

    private static final Map<String, ExternalAccessProtocol> STATIC_FIELDS = createStaticFields();

    private static Map<String, ExternalAccessProtocol> createStaticFields() {
        Map<String, ExternalAccessProtocol> map = new HashMap<>();
        map.put("HTTP", HTTP);
        map.put("HTTPS", HTTPS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ExternalAccessProtocol(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ExternalAccessProtocol fromValue(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessProtocol result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ExternalAccessProtocol(value);
        }
        return result;
    }

    public static ExternalAccessProtocol valueOf(String value) {
        if( value == null ){
            return null;
        }
        ExternalAccessProtocol result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ExternalAccessProtocol) {
            return this.value.equals(((ExternalAccessProtocol) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

