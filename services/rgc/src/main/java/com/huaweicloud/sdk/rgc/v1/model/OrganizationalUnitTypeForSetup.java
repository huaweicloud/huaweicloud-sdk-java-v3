package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 可设置的注册OU类型。包括核心注册OU和自定义注册OU。
 */
public class OrganizationalUnitTypeForSetup {

    /**
     * Enum CORE for value: "CORE"
     */
    public static final OrganizationalUnitTypeForSetup CORE = new OrganizationalUnitTypeForSetup("CORE");

    /**
     * Enum CUSTOM for value: "CUSTOM"
     */
    public static final OrganizationalUnitTypeForSetup CUSTOM = new OrganizationalUnitTypeForSetup("CUSTOM");

    private static final Map<String, OrganizationalUnitTypeForSetup> STATIC_FIELDS = createStaticFields();

    private static Map<String, OrganizationalUnitTypeForSetup> createStaticFields() {
        Map<String, OrganizationalUnitTypeForSetup> map = new HashMap<>();
        map.put("CORE", CORE);
        map.put("CUSTOM", CUSTOM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OrganizationalUnitTypeForSetup(String value) {
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
    public static OrganizationalUnitTypeForSetup fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElse(new OrganizationalUnitTypeForSetup(value));
    }

    public static OrganizationalUnitTypeForSetup valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OrganizationalUnitTypeForSetup) {
            return this.value.equals(((OrganizationalUnitTypeForSetup) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
