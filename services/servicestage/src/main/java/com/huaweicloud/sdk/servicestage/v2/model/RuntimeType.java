package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

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
    

    public static final Map<String, RuntimeType> staticFields = new HashMap<String, RuntimeType>() {
        { 
            put("Tomcat8", TOMCAT8);
            put("Java8", JAVA8);
            put("Php7", PHP7);
            put("Nodejs8", NODEJS8);
            put("Docker", DOCKER);
            put("Python3", PYTHON3);
            put("Custom", CUSTOM);
        }
    };

    private String value;

    RuntimeType(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static RuntimeType fromValue(String value) {
        if( value == null ){
            return null;
        }
        RuntimeType result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new RuntimeType(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static RuntimeType valueOf(String value) {
        if( value == null ){
            return null;
        }
        RuntimeType result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof RuntimeType) {
            return this.value.equals(((RuntimeType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

