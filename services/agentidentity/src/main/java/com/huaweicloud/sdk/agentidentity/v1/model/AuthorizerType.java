package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The authorizer type.
 */
public class AuthorizerType {

    /**
     * Enum CUSTOM_JWT for value: "CUSTOM_JWT"
     */
    public static final AuthorizerType CUSTOM_JWT = new AuthorizerType("CUSTOM_JWT");

    /**
     * Enum IAM for value: "IAM"
     */
    public static final AuthorizerType IAM = new AuthorizerType("IAM");

    /**
     * Enum API_KEY for value: "API_KEY"
     */
    public static final AuthorizerType API_KEY = new AuthorizerType("API_KEY");

    /**
     * Enum NONE for value: "NONE"
     */
    public static final AuthorizerType NONE = new AuthorizerType("NONE");

    private static final Map<String, AuthorizerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AuthorizerType> createStaticFields() {
        Map<String, AuthorizerType> map = new HashMap<>();
        map.put("CUSTOM_JWT", CUSTOM_JWT);
        map.put("IAM", IAM);
        map.put("API_KEY", API_KEY);
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AuthorizerType(String value) {
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
    public static AuthorizerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthorizerType(value));
    }

    public static AuthorizerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AuthorizerType) {
            return this.value.equals(((AuthorizerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
