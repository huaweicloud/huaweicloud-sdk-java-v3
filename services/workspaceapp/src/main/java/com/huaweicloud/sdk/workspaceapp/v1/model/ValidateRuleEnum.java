package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 校验类型： * &#x60;naming&#x60; - 命名规范 * &#x60;duplicate&#x60; - 重复
 */
public class ValidateRuleEnum {

    /**
     * Enum NAMING for value: "naming"
     */
    public static final ValidateRuleEnum NAMING = new ValidateRuleEnum("naming");

    /**
     * Enum DUPLICATE for value: "duplicate"
     */
    public static final ValidateRuleEnum DUPLICATE = new ValidateRuleEnum("duplicate");

    private static final Map<String, ValidateRuleEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ValidateRuleEnum> createStaticFields() {
        Map<String, ValidateRuleEnum> map = new HashMap<>();
        map.put("naming", NAMING);
        map.put("duplicate", DUPLICATE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ValidateRuleEnum(String value) {
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
    public static ValidateRuleEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ValidateRuleEnum(value));
    }

    public static ValidateRuleEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ValidateRuleEnum) {
            return this.value.equals(((ValidateRuleEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
