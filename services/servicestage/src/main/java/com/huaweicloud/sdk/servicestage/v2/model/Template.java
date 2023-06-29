package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Template fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Template(value));
    }

    public static Template valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Template) {
            return this.value.equals(((Template) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
