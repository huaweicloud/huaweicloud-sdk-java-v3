package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 来源类型。支持源码code和artifact软件包。
 */
public class SourceKind {
    
    /**
     * Enum CODE for value: "code"
     */
    public static final SourceKind CODE = new SourceKind("code");
    
    /**
     * Enum ARTIFACT for value: "artifact"
     */
    public static final SourceKind ARTIFACT = new SourceKind("artifact");
    

    private static final Map<String, SourceKind> STATIC_FIELDS = createStaticFields();

    private static Map<String, SourceKind> createStaticFields() {
        Map<String, SourceKind> map = new HashMap<>();
        map.put("code", CODE);
        map.put("artifact", ARTIFACT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SourceKind(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static SourceKind fromValue(String value) {
        if( value == null ){
            return null;
        }
        SourceKind result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new SourceKind(value);
        }
        return result;
    }

    public static SourceKind valueOf(String value) {
        if( value == null ){
            return null;
        }
        SourceKind result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SourceKind) {
            return this.value.equals(((SourceKind) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

