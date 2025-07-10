package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 组织单元类型。 * CORE - 基础组织单元 * CUSTOM - 组织单元 * ROOT - ROOT
 */
public class OrganizationalUnitType {

    /**
     * Enum CORE for value: "CORE"
     */
    public static final OrganizationalUnitType CORE = new OrganizationalUnitType("CORE");

    /**
     * Enum CUSTOM for value: "CUSTOM"
     */
    public static final OrganizationalUnitType CUSTOM = new OrganizationalUnitType("CUSTOM");

    /**
     * Enum ROOT for value: "ROOT"
     */
    public static final OrganizationalUnitType ROOT = new OrganizationalUnitType("ROOT");

    private static final Map<String, OrganizationalUnitType> STATIC_FIELDS = createStaticFields();

    private static Map<String, OrganizationalUnitType> createStaticFields() {
        Map<String, OrganizationalUnitType> map = new HashMap<>();
        map.put("CORE", CORE);
        map.put("CUSTOM", CUSTOM);
        map.put("ROOT", ROOT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OrganizationalUnitType(String value) {
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
    public static OrganizationalUnitType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrganizationalUnitType(value));
    }

    public static OrganizationalUnitType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OrganizationalUnitType) {
            return this.value.equals(((OrganizationalUnitType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
