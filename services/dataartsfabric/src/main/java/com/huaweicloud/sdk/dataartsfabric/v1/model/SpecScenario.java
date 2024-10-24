package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 规格使用场景，不填表示不限制： COMPUTE: 用于购买Ray计算资源时配置的物理节点规格 ENDPOINT: 用于创建Endpoint时配置的资源组规格大小
 */
public class SpecScenario {

    /**
     * Enum COMPUTE for value: "COMPUTE"
     */
    public static final SpecScenario COMPUTE = new SpecScenario("COMPUTE");

    /**
     * Enum ENDPOINT for value: "ENDPOINT"
     */
    public static final SpecScenario ENDPOINT = new SpecScenario("ENDPOINT");

    private static final Map<String, SpecScenario> STATIC_FIELDS = createStaticFields();

    private static Map<String, SpecScenario> createStaticFields() {
        Map<String, SpecScenario> map = new HashMap<>();
        map.put("COMPUTE", COMPUTE);
        map.put("ENDPOINT", ENDPOINT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SpecScenario(String value) {
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
    public static SpecScenario fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecScenario(value));
    }

    public static SpecScenario valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SpecScenario) {
            return this.value.equals(((SpecScenario) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
