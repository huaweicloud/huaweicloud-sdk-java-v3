package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * * &#x60;ALL_USER&#x60; - 全部用户 * &#x60;ASSIGN_USER&#x60; - 授权指定用户
 */
public class AssignType {

    /**
     * Enum ALL_USER for value: "ALL_USER"
     */
    public static final AssignType ALL_USER = new AssignType("ALL_USER");

    /**
     * Enum ASSIGN_USER for value: "ASSIGN_USER"
     */
    public static final AssignType ASSIGN_USER = new AssignType("ASSIGN_USER");

    private static final Map<String, AssignType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AssignType> createStaticFields() {
        Map<String, AssignType> map = new HashMap<>();
        map.put("ALL_USER", ALL_USER);
        map.put("ASSIGN_USER", ASSIGN_USER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AssignType(String value) {
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
    public static AssignType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssignType(value));
    }

    public static AssignType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AssignType) {
            return this.value.equals(((AssignType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
