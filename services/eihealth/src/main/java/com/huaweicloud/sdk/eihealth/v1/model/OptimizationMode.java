package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 侧链修饰
 */
public class OptimizationMode {

    /**
     * Enum GENERATION for value: "generation"
     */
    public static final OptimizationMode GENERATION = new OptimizationMode("generation");

    /**
     * Enum SIDE_CHAINS_DECORATION for value: "side_chains_decoration"
     */
    public static final OptimizationMode SIDE_CHAINS_DECORATION = new OptimizationMode("side_chains_decoration");

    private static final Map<String, OptimizationMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, OptimizationMode> createStaticFields() {
        Map<String, OptimizationMode> map = new HashMap<>();
        map.put("generation", GENERATION);
        map.put("side_chains_decoration", SIDE_CHAINS_DECORATION);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OptimizationMode(String value) {
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
    public static OptimizationMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptimizationMode(value));
    }

    public static OptimizationMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OptimizationMode) {
            return this.value.equals(((OptimizationMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
