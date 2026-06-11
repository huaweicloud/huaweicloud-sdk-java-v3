package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 状态(允许、禁用)： * &#x60;Allow&#x60; - 允许 * &#x60;Deny&#x60; - 禁用
 */
public class PolicyEffectEnum {

    /**
     * Enum ALLOW for value: "Allow"
     */
    public static final PolicyEffectEnum ALLOW = new PolicyEffectEnum("Allow");

    /**
     * Enum DENY for value: "Deny"
     */
    public static final PolicyEffectEnum DENY = new PolicyEffectEnum("Deny");

    private static final Map<String, PolicyEffectEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyEffectEnum> createStaticFields() {
        Map<String, PolicyEffectEnum> map = new HashMap<>();
        map.put("Allow", ALLOW);
        map.put("Deny", DENY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyEffectEnum(String value) {
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
    public static PolicyEffectEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEffectEnum(value));
    }

    public static PolicyEffectEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyEffectEnum) {
            return this.value.equals(((PolicyEffectEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
