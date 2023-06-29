package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听的网络传输协议类型。
 */
public class ListenerProtocol {

    /**
     * Enum TCP for value: "TCP"
     */
    public static final ListenerProtocol TCP = new ListenerProtocol("TCP");

    /**
     * Enum UDP for value: "UDP"
     */
    public static final ListenerProtocol UDP = new ListenerProtocol("UDP");

    private static final Map<String, ListenerProtocol> STATIC_FIELDS = createStaticFields();

    private static Map<String, ListenerProtocol> createStaticFields() {
        Map<String, ListenerProtocol> map = new HashMap<>();
        map.put("TCP", TCP);
        map.put("UDP", UDP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ListenerProtocol(String value) {
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
    public static ListenerProtocol fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ListenerProtocol(value));
    }

    public static ListenerProtocol valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListenerProtocol) {
            return this.value.equals(((ListenerProtocol) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
