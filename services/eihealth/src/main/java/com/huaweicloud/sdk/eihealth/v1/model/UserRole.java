package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets UserRole
 */
public class UserRole {

    /**
     * Enum ADMIN for value: "ADMIN"
     */
    public static final UserRole ADMIN = new UserRole("ADMIN");

    /**
     * Enum OPERATOR for value: "OPERATOR"
     */
    public static final UserRole OPERATOR = new UserRole("OPERATOR");

    private static final Map<String, UserRole> STATIC_FIELDS = createStaticFields();

    private static Map<String, UserRole> createStaticFields() {
        Map<String, UserRole> map = new HashMap<>();
        map.put("ADMIN", ADMIN);
        map.put("OPERATOR", OPERATOR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    UserRole(String value) {
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
    public static UserRole fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UserRole(value));
    }

    public static UserRole valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UserRole) {
            return this.value.equals(((UserRole) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
