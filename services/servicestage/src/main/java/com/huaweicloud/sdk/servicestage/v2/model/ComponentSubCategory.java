package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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

    private static final Map<String, ComponentSubCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, ComponentSubCategory> createStaticFields() {
        Map<String, ComponentSubCategory> map = new HashMap<>();
        map.put("Web", WEB);
        map.put("Magento", MAGENTO);
        map.put("Wordpress", WORDPRESS);
        map.put("SpringCloud", SPRINGCLOUD);
        map.put("Java Chassis", JAVA_CHASSIS);
        map.put("Go Chassis", GO_CHASSIS);
        map.put("Mesher", MESHER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ComponentSubCategory(String value) {
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
    public static ComponentSubCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        ComponentSubCategory result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ComponentSubCategory(value);
        }
        return result;
    }

    public static ComponentSubCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        ComponentSubCategory result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComponentSubCategory) {
            return this.value.equals(((ComponentSubCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
