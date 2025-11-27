package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听的网络传输协议类型。 取值范围：TCP、UDP
 */
public class HealthCheckProtocol {

    /**
     * Enum TCP for value: "TCP"
     */
    public static final HealthCheckProtocol TCP = new HealthCheckProtocol("TCP");

    /**
     * Enum UDP for value: "UDP"
     */
    public static final HealthCheckProtocol UDP = new HealthCheckProtocol("UDP");

    private static final Map<String, HealthCheckProtocol> STATIC_FIELDS = createStaticFields();

    private static Map<String, HealthCheckProtocol> createStaticFields() {
        Map<String, HealthCheckProtocol> map = new HashMap<>();
        map.put("TCP", TCP);
        map.put("UDP", UDP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HealthCheckProtocol(String value) {
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
    public static HealthCheckProtocol fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HealthCheckProtocol(value));
    }

    public static HealthCheckProtocol valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HealthCheckProtocol) {
            return this.value.equals(((HealthCheckProtocol) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
