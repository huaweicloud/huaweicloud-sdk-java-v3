package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 关联对象类型 * &#x60;USER&#x60; -  用户 * &#x60;USER_GROUP&#x60; - 用户组
 */
public class AttachType {

    /**
     * Enum USER for value: "USER"
     */
    public static final AttachType USER = new AttachType("USER");

    /**
     * Enum USER_GROUP for value: "USER_GROUP"
     */
    public static final AttachType USER_GROUP = new AttachType("USER_GROUP");

    private static final Map<String, AttachType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AttachType> createStaticFields() {
        Map<String, AttachType> map = new HashMap<>();
        map.put("USER", USER);
        map.put("USER_GROUP", USER_GROUP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AttachType(String value) {
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
    public static AttachType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AttachType(value));
    }

    public static AttachType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AttachType) {
            return this.value.equals(((AttachType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
