package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模板应用类型。ALL_DIMENSION：所有维度, ONE_DIMENSION：同一维度。
 */
public class TemplateApplicationType {

    /**
     * Enum ALL_DIMENSION for value: "ALL_DIMENSION"
     */
    public static final TemplateApplicationType ALL_DIMENSION = new TemplateApplicationType("ALL_DIMENSION");

    /**
     * Enum ONE_DIMENSION for value: "ONE_DIMENSION"
     */
    public static final TemplateApplicationType ONE_DIMENSION = new TemplateApplicationType("ONE_DIMENSION");

    private static final Map<String, TemplateApplicationType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TemplateApplicationType> createStaticFields() {
        Map<String, TemplateApplicationType> map = new HashMap<>();
        map.put("ALL_DIMENSION", ALL_DIMENSION);
        map.put("ONE_DIMENSION", ONE_DIMENSION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TemplateApplicationType(String value) {
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
    public static TemplateApplicationType fromValue(String value) {
        if (value == null) {
            return null;
        }
        TemplateApplicationType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new TemplateApplicationType(value);
        }
        return result;
    }

    public static TemplateApplicationType valueOf(String value) {
        if (value == null) {
            return null;
        }
        TemplateApplicationType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateApplicationType) {
            return this.value.equals(((TemplateApplicationType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
