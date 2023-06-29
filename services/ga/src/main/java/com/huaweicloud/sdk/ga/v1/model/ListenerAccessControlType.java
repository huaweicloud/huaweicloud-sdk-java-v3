package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问控制策略类型,即黑名单还是白名单, 取值： - BLACK：黑名单 - WHITE：白名单
 */
public class ListenerAccessControlType {

    /**
     * Enum BLACK for value: "BLACK"
     */
    public static final ListenerAccessControlType BLACK = new ListenerAccessControlType("BLACK");

    /**
     * Enum WHITE for value: "WHITE"
     */
    public static final ListenerAccessControlType WHITE = new ListenerAccessControlType("WHITE");

    private static final Map<String, ListenerAccessControlType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ListenerAccessControlType> createStaticFields() {
        Map<String, ListenerAccessControlType> map = new HashMap<>();
        map.put("BLACK", BLACK);
        map.put("WHITE", WHITE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ListenerAccessControlType(String value) {
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
    public static ListenerAccessControlType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ListenerAccessControlType(value));
    }

    public static ListenerAccessControlType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListenerAccessControlType) {
            return this.value.equals(((ListenerAccessControlType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
