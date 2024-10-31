package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Service的类型，可选值： - PGSQL_SERVICE：DWS Pay-By-Query - LLM_MODEL：大语言模型
 */
public class ServiceType {

    /**
     * Enum PGSQL_SERVICE for value: "PGSQL_SERVICE"
     */
    public static final ServiceType PGSQL_SERVICE = new ServiceType("PGSQL_SERVICE");

    /**
     * Enum LLM_MODEL for value: "LLM_MODEL"
     */
    public static final ServiceType LLM_MODEL = new ServiceType("LLM_MODEL");

    private static final Map<String, ServiceType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ServiceType> createStaticFields() {
        Map<String, ServiceType> map = new HashMap<>();
        map.put("PGSQL_SERVICE", PGSQL_SERVICE);
        map.put("LLM_MODEL", LLM_MODEL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ServiceType(String value) {
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
    public static ServiceType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ServiceType(value));
    }

    public static ServiceType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ServiceType) {
            return this.value.equals(((ServiceType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
