package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Domain”，该值不可修改。
 */
public class DomainKindObj {

    /**
     * Enum DOMAIN for value: "Domain"
     */
    public static final DomainKindObj DOMAIN = new DomainKindObj("Domain");

    private static final Map<String, DomainKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, DomainKindObj> createStaticFields() {
        Map<String, DomainKindObj> map = new HashMap<>();
        map.put("Domain", DOMAIN);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DomainKindObj(String value) {
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
    public static DomainKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainKindObj(value));
    }

    public static DomainKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DomainKindObj) {
            return this.value.equals(((DomainKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
