package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模板类型枚举
 */
public class TemplateTypeEnum {

    /**
     * Enum SYSTEM for value: "system"
     */
    public static final TemplateTypeEnum SYSTEM = new TemplateTypeEnum("system");

    /**
     * Enum CUSTOM for value: "custom"
     */
    public static final TemplateTypeEnum CUSTOM = new TemplateTypeEnum("custom");

    private static final Map<String, TemplateTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, TemplateTypeEnum> createStaticFields() {
        Map<String, TemplateTypeEnum> map = new HashMap<>();
        map.put("system", SYSTEM);
        map.put("custom", CUSTOM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TemplateTypeEnum(String value) {
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
    public static TemplateTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TemplateTypeEnum(value));
    }

    public static TemplateTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TemplateTypeEnum) {
            return this.value.equals(((TemplateTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
