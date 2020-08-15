package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 应用组件子类型。  Webapp的子类型有Web、Magento、Wordpress。  MicroService的子类型有Java Chassis、Go Chassis、Mesher、SpringCloud。  Common的子类型可以为空。 
 */
public class ComponentSubCategory {
    
    /**
     * Enum WEB for value: "Web"
     */
    public static final ComponentSubCategory WEB = new ComponentSubCategory("Web");
    
    /**
     * Enum MAGENTO for value: "Magento"
     */
    public static final ComponentSubCategory MAGENTO = new ComponentSubCategory("Magento");
    
    /**
     * Enum WORDPRESS for value: "Wordpress"
     */
    public static final ComponentSubCategory WORDPRESS = new ComponentSubCategory("Wordpress");
    
    /**
     * Enum SPRINGCLOUD for value: "SpringCloud"
     */
    public static final ComponentSubCategory SPRINGCLOUD = new ComponentSubCategory("SpringCloud");
    
    /**
     * Enum JAVA_CHASSIS for value: "Java Chassis"
     */
    public static final ComponentSubCategory JAVA_CHASSIS = new ComponentSubCategory("Java Chassis");
    
    /**
     * Enum GO_CHASSIS for value: "Go Chassis"
     */
    public static final ComponentSubCategory GO_CHASSIS = new ComponentSubCategory("Go Chassis");
    
    /**
     * Enum MESHER for value: "Mesher"
     */
    public static final ComponentSubCategory MESHER = new ComponentSubCategory("Mesher");
    

    public static final Map<String, ComponentSubCategory> staticFields = new HashMap<String, ComponentSubCategory>() {
        { 
            put("Web", WEB);
            put("Magento", MAGENTO);
            put("Wordpress", WORDPRESS);
            put("SpringCloud", SPRINGCLOUD);
            put("Java Chassis", JAVA_CHASSIS);
            put("Go Chassis", GO_CHASSIS);
            put("Mesher", MESHER);
        }
    };

    private String value;

    ComponentSubCategory(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static ComponentSubCategory fromValue(String value) {
        if( value == null ){
            return null;
        }
        ComponentSubCategory result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new ComponentSubCategory(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static ComponentSubCategory valueOf(String value) {
        if( value == null ){
            return null;
        }
        ComponentSubCategory result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ComponentSubCategory) {
            return this.value.equals(((ComponentSubCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

