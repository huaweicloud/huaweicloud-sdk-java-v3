package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 运行时类型。
 */
public class RuntimeType {
    
    /**
     * Enum TOMCAT8 for value: "Tomcat8"
     */
    public static final RuntimeType TOMCAT8 = new RuntimeType("Tomcat8");
    
    /**
     * Enum JAVA8 for value: "Java8"
     */
    public static final RuntimeType JAVA8 = new RuntimeType("Java8");
    
    /**
     * Enum PHP7 for value: "Php7"
     */
    public static final RuntimeType PHP7 = new RuntimeType("Php7");
    
    /**
     * Enum NODEJS8 for value: "Nodejs8"
     */
    public static final RuntimeType NODEJS8 = new RuntimeType("Nodejs8");
    
    /**
     * Enum DOCKER for value: "Docker"
     */
    public static final RuntimeType DOCKER = new RuntimeType("Docker");
    
    /**
     * Enum PYTHON3 for value: "Python3"
     */
    public static final RuntimeType PYTHON3 = new RuntimeType("Python3");
    
    /**
     * Enum CUSTOM for value: "Custom"
     */
    public static final RuntimeType CUSTOM = new RuntimeType("Custom");
    

    private static final Map<String, RuntimeType> STATIC_FIELDS = createStaticFields();

    private static Map<String, RuntimeType> createStaticFields() {
        Map<String, RuntimeType> map = new HashMap<>();
        map.put("Tomcat8", TOMCAT8);
        map.put("Java8", JAVA8);
        map.put("Php7", PHP7);
        map.put("Nodejs8", NODEJS8);
        map.put("Docker", DOCKER);
        map.put("Python3", PYTHON3);
        map.put("Custom", CUSTOM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RuntimeType(String value) {
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
    public static RuntimeType fromValue(String value) {
        if( value == null ){
            return null;
        }
        RuntimeType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new RuntimeType(value);
        }
        return result;
    }

    public static RuntimeType valueOf(String value) {
        if( value == null ){
            return null;
        }
        RuntimeType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RuntimeType) {
            return this.value.equals(((RuntimeType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

