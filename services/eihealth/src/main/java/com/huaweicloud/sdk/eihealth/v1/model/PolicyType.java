package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets PolicyType
 */
public class PolicyType {

    /**
     * Enum ALLOW for value: "allow"
     */
    public static final PolicyType ALLOW = new PolicyType("allow");

    /**
     * Enum DENY for value: "deny"
     */
    public static final PolicyType DENY = new PolicyType("deny");

    private static final Map<String, PolicyType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyType> createStaticFields() {
        Map<String, PolicyType> map = new HashMap<>();
        map.put("allow", ALLOW);
        map.put("deny", DENY);
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
