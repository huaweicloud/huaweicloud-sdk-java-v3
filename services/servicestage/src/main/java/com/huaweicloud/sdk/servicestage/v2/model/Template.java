package com.huaweicloud.sdk.servicestage.v2.model;




import java.util.function.Consumer;
import java.util.Objects;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 模板名称。
 */
public class Template {
    
    /**
     * Enum MAGENTO for value: "magento"
     */
    public static final Template MAGENTO = new Template("magento");
    
    /**
     * Enum MBAAS for value: "mbaas"
     */
    public static final Template MBAAS = new Template("mbaas");
    
    /**
     * Enum WORDPRESS for value: "wordpress"
     */
    public static final Template WORDPRESS = new Template("wordpress");
    

    public static final Map<String, Template> staticFields = new HashMap<String, Template>() {
        { 
            put("magento", MAGENTO);
            put("mbaas", MBAAS);
            put("wordpress", WORDPRESS);
        }
    };

    private String value;

    Template(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Template fromValue(String value) {
        if( value == null ){
            return null;
        }
        Template result = staticFields.get(value);
        if (result == null) {
            result = staticFields.putIfAbsent(value, new Template(value));
            if (result == null) {
                result = staticFields.get(value);
            }
        }
        return result;
    }

    public static Template valueOf(String value) {
        if( value == null ){
            return null;
        }
        Template result = staticFields.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Template) {
            return this.value.equals(((Template) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

