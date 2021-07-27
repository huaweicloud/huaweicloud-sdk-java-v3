package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 应用组件类型包括：Webapp、MicroService、Common。
 */
public class ComponentCategory {
    
    /**
     * Enum WEBAPP for value: "Webapp"
     */
    public static final ComponentCategory WEBAPP = new ComponentCategory("Webapp");
    
    /**
     * Enum MICROSERVICE for value: "MicroService"
     */
    public static final ComponentCategory MICROSERVICE = new ComponentCategory("MicroService");
    
    /**
     * Enum COMMON for value: "Common"
     */
    public static final ComponentCategory COMMON = new ComponentCategory("Common");
    

    private static final Map<String, ComponentCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentCategory> createStaticFields() {
        Map<String, ComponentCategory> map = new HashMap<>();
        map.put("Webapp", WEBAPP);
        map.put("MicroService", MICROSERVICE);
        map.put("Common", COMMON);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentCategory(String value) {
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
    public static ComponentCategory fromValue(String value) {
        if( value == null ){
            return null;
        }
        ComponentCategory result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ComponentCategory(value);
        }
        return result;
    }

    public static ComponentCategory valueOf(String value) {
        if( value == null ){
            return null;
        }
        ComponentCategory result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentCategory) {
            return this.value.equals(((ComponentCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

