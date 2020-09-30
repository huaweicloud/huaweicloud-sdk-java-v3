package com.huaweicloud.sdk.servicestage.v2.model;





import java.util.function.Consumer;
import java.util.Objects;

import java.util.Collections;
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
    

    private static final Map<String, Template> STATIC_FIELDS = createStaticFields();

    private static Map<String, Template> createStaticFields() {
        Map<String, Template> map = new HashMap<>();
        map.put("magento", MAGENTO);
        map.put("mbaas", MBAAS);
        map.put("wordpress", WORDPRESS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Template(String value) {
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
    public static Template fromValue(String value) {
        if( value == null ){
            return null;
        }
        Template result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new Template(value);
        }
        return result;
    }

    public static Template valueOf(String value) {
        if( value == null ){
            return null;
        }
        Template result = STATIC_FIELDS.get(value);
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

