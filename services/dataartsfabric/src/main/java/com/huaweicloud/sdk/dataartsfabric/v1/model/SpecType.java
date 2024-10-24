package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源规格类型： 1.APU：APU类型, 2.DPU：DPU类型, 3.MU：MU类型,  4.RESOURCE_USAGE_UNIT：资源使用量类型,  5.TOKENS_USAGE_UNIT：Tokens数使用量类型
 */
public class SpecType {

    /**
     * Enum APU for value: "APU"
     */
    public static final SpecType APU = new SpecType("APU");

    /**
     * Enum DPU for value: "DPU"
     */
    public static final SpecType DPU = new SpecType("DPU");

    /**
     * Enum MU for value: "MU"
     */
    public static final SpecType MU = new SpecType("MU");

    /**
     * Enum RESOURCE_USAGE_UNIT for value: "RESOURCE_USAGE_UNIT"
     */
    public static final SpecType RESOURCE_USAGE_UNIT = new SpecType("RESOURCE_USAGE_UNIT");

    /**
     * Enum TOKENS_USAGE_UNIT for value: "TOKENS_USAGE_UNIT"
     */
    public static final SpecType TOKENS_USAGE_UNIT = new SpecType("TOKENS_USAGE_UNIT");

    private static final Map<String, SpecType> STATIC_FIELDS = createStaticFields();

    private static Map<String, SpecType> createStaticFields() {
        Map<String, SpecType> map = new HashMap<>();
        map.put("APU", APU);
        map.put("DPU", DPU);
        map.put("MU", MU);
        map.put("RESOURCE_USAGE_UNIT", RESOURCE_USAGE_UNIT);
        map.put("TOKENS_USAGE_UNIT", TOKENS_USAGE_UNIT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SpecType(String value) {
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
    public static SpecType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecType(value));
    }

    public static SpecType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SpecType) {
            return this.value.equals(((SpecType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
