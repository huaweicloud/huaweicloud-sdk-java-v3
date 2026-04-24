package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 域类型 KERBEROS：对接AD OPEN_API：使用OPEN_API的方式对接统信域控
 */
public class DomainType {

    /**
     * Enum KERBEROS for value: "KERBEROS"
     */
    public static final DomainType KERBEROS = new DomainType("KERBEROS");

    /**
     * Enum OPEN_API for value: "OPEN_API"
     */
    public static final DomainType OPEN_API = new DomainType("OPEN_API");

    private static final Map<String, DomainType> STATIC_FIELDS = createStaticFields();

    private static Map<String, DomainType> createStaticFields() {
        Map<String, DomainType> map = new HashMap<>();
        map.put("KERBEROS", KERBEROS);
        map.put("OPEN_API", OPEN_API);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DomainType(String value) {
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
    public static DomainType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainType(value));
    }

    public static DomainType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DomainType) {
            return this.value.equals(((DomainType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
