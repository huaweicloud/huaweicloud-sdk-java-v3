package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 停机类型： * &#x60;SOFT&#x60; - 普通 * &#x60;HARD&#x60; - 强制
 */
public class ServerHaltType {

    /**
     * Enum SOFT for value: "SOFT"
     */
    public static final ServerHaltType SOFT = new ServerHaltType("SOFT");

    /**
     * Enum HARD for value: "HARD"
     */
    public static final ServerHaltType HARD = new ServerHaltType("HARD");

    private static final Map<String, ServerHaltType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ServerHaltType> createStaticFields() {
        Map<String, ServerHaltType> map = new HashMap<>();
        map.put("SOFT", SOFT);
        map.put("HARD", HARD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ServerHaltType(String value) {
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
    public static ServerHaltType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServerHaltType(value));
    }

    public static ServerHaltType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServerHaltType) {
            return this.value.equals(((ServerHaltType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
