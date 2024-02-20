package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 要校验的策略类型。
 */
public class PolicyType {

    /**
     * Enum IDENTITY_POLICY for value: "identity_policy"
     */
    public static final PolicyType IDENTITY_POLICY = new PolicyType("identity_policy");

    /**
     * Enum RESOURCE_POLICY for value: "resource_policy"
     */
    public static final PolicyType RESOURCE_POLICY = new PolicyType("resource_policy");

    /**
     * Enum SERVICE_CONTROL_POLICY for value: "service_control_policy"
     */
    public static final PolicyType SERVICE_CONTROL_POLICY = new PolicyType("service_control_policy");

    private static final Map<String, PolicyType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyType> createStaticFields() {
        Map<String, PolicyType> map = new HashMap<>();
        map.put("identity_policy", IDENTITY_POLICY);
        map.put("resource_policy", RESOURCE_POLICY);
        map.put("service_control_policy", SERVICE_CONTROL_POLICY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyType(String value) {
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
    public static PolicyType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyType(value));
    }

    public static PolicyType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyType) {
            return this.value.equals(((PolicyType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
