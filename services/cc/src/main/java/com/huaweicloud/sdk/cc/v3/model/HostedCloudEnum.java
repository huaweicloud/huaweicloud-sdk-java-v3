package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * - HWCloud (华为云) - Ireland (爱尔兰)
 */
public class HostedCloudEnum {

    /**
     * Enum HWCLOUD for value: "HWCloud"
     */
    public static final HostedCloudEnum HWCLOUD = new HostedCloudEnum("HWCloud");

    /**
     * Enum IRELAND for value: "Ireland"
     */
    public static final HostedCloudEnum IRELAND = new HostedCloudEnum("Ireland");

    private static final Map<String, HostedCloudEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, HostedCloudEnum> createStaticFields() {
        Map<String, HostedCloudEnum> map = new HashMap<>();
        map.put("HWCloud", HWCLOUD);
        map.put("Ireland", IRELAND);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HostedCloudEnum(String value) {
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
    public static HostedCloudEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostedCloudEnum(value));
    }

    public static HostedCloudEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HostedCloudEnum) {
            return this.value.equals(((HostedCloudEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
