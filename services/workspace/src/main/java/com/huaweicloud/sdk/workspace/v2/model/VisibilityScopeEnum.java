package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 可见性范围枚举。
 */
public class VisibilityScopeEnum {

    /**
     * Enum OWNER_ONLY for value: "OWNER_ONLY"
     */
    public static final VisibilityScopeEnum OWNER_ONLY = new VisibilityScopeEnum("OWNER_ONLY");

    /**
     * Enum ALL_TENANTS for value: "ALL_TENANTS"
     */
    public static final VisibilityScopeEnum ALL_TENANTS = new VisibilityScopeEnum("ALL_TENANTS");

    /**
     * Enum SPECIFIC_TENANTS for value: "SPECIFIC_TENANTS"
     */
    public static final VisibilityScopeEnum SPECIFIC_TENANTS = new VisibilityScopeEnum("SPECIFIC_TENANTS");

    private static final Map<String, VisibilityScopeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, VisibilityScopeEnum> createStaticFields() {
        Map<String, VisibilityScopeEnum> map = new HashMap<>();
        map.put("OWNER_ONLY", OWNER_ONLY);
        map.put("ALL_TENANTS", ALL_TENANTS);
        map.put("SPECIFIC_TENANTS", SPECIFIC_TENANTS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    VisibilityScopeEnum(String value) {
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
    public static VisibilityScopeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VisibilityScopeEnum(value));
    }

    public static VisibilityScopeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof VisibilityScopeEnum) {
            return this.value.equals(((VisibilityScopeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
