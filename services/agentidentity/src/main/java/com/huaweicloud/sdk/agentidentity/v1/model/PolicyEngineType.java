package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 策略集的类型。GATEWAY - 用于网关的策略集，可绑定到网关实例。TOKEN_VAULT - 用于 TokenVault 的策略集，只能绑定到 TokenVault 实例。
 */
public class PolicyEngineType {

    /**
     * Enum GATEWAY for value: "GATEWAY"
     */
    public static final PolicyEngineType GATEWAY = new PolicyEngineType("GATEWAY");

    /**
     * Enum TOKEN_VAULT for value: "TOKEN_VAULT"
     */
    public static final PolicyEngineType TOKEN_VAULT = new PolicyEngineType("TOKEN_VAULT");

    private static final Map<String, PolicyEngineType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PolicyEngineType> createStaticFields() {
        Map<String, PolicyEngineType> map = new HashMap<>();
        map.put("GATEWAY", GATEWAY);
        map.put("TOKEN_VAULT", TOKEN_VAULT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PolicyEngineType(String value) {
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
    public static PolicyEngineType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEngineType(value));
    }

    public static PolicyEngineType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PolicyEngineType) {
            return this.value.equals(((PolicyEngineType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
