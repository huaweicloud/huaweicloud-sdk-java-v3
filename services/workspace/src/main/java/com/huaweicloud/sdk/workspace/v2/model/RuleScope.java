package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 规则范围： * &#x60;PRODUCT&#x60; - 产品 * &#x60;PATH&#x60; - 路径
 */
public class RuleScope {

    /**
     * Enum PRODUCT for value: "PRODUCT"
     */
    public static final RuleScope PRODUCT = new RuleScope("PRODUCT");

    /**
     * Enum PATH for value: "PATH"
     */
    public static final RuleScope PATH = new RuleScope("PATH");

    private static final Map<String, RuleScope> STATIC_FIELDS = createStaticFields();

    private static Map<String, RuleScope> createStaticFields() {
        Map<String, RuleScope> map = new HashMap<>();
        map.put("PRODUCT", PRODUCT);
        map.put("PATH", PATH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RuleScope(String value) {
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
    public static RuleScope fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleScope(value));
    }

    public static RuleScope valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RuleScope) {
            return this.value.equals(((RuleScope) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
