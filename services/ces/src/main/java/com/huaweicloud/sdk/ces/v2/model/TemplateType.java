package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模板类型(custom代表默认自定义模板，system代表系统模板)
 */
public class TemplateType {

    /**
     * Enum SYSTEM for value: "system"
     */
    public static final TemplateType SYSTEM = new TemplateType("system");

    /**
     * Enum CUSTOM for value: "custom"
     */
    public static final TemplateType CUSTOM = new TemplateType("custom");

    private static final Map<String, TemplateType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TemplateType> createStaticFields() {
        Map<String, TemplateType> map = new HashMap<>();
        map.put("system", SYSTEM);
        map.put("custom", CUSTOM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TemplateType(String value) {
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
    public static TemplateType fromValue(String value) {
        if (value == null) {
            return null;
        }
        TemplateType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new TemplateType(value);
        }
        return result;
    }

    public static TemplateType valueOf(String value) {
        if (value == null) {
            return null;
        }
        TemplateType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateType) {
            return this.value.equals(((TemplateType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
