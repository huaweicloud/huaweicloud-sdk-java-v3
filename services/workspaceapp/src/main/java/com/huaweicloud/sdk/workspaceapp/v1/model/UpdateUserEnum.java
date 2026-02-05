package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 更新用户类型。 * &#x60;ADD&#x60; - 添加。 * &#x60;DELETE&#x60; - 按照应用组授权。
 */
public class UpdateUserEnum {

    /**
     * Enum ADD for value: "ADD"
     */
    public static final UpdateUserEnum ADD = new UpdateUserEnum("ADD");

    /**
     * Enum DELETE for value: "DELETE"
     */
    public static final UpdateUserEnum DELETE = new UpdateUserEnum("DELETE");

    private static final Map<String, UpdateUserEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, UpdateUserEnum> createStaticFields() {
        Map<String, UpdateUserEnum> map = new HashMap<>();
        map.put("ADD", ADD);
        map.put("DELETE", DELETE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    UpdateUserEnum(String value) {
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
    public static UpdateUserEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpdateUserEnum(value));
    }

    public static UpdateUserEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UpdateUserEnum) {
            return this.value.equals(((UpdateUserEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
