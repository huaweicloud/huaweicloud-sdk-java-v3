package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * The type of entity that can be attached to a policy engine.
 */
public class EntityType {

    /**
     * Enum GATEWAY for value: "GATEWAY"
     */
    public static final EntityType GATEWAY = new EntityType("GATEWAY");

    /**
     * Enum TOKEN_VAULT for value: "TOKEN_VAULT"
     */
    public static final EntityType TOKEN_VAULT = new EntityType("TOKEN_VAULT");

    private static final Map<String, EntityType> STATIC_FIELDS = createStaticFields();

    private static Map<String, EntityType> createStaticFields() {
        Map<String, EntityType> map = new HashMap<>();
        map.put("GATEWAY", GATEWAY);
        map.put("TOKEN_VAULT", TOKEN_VAULT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EntityType(String value) {
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
    public static EntityType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EntityType(value));
    }

    public static EntityType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EntityType) {
            return this.value.equals(((EntityType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
