package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 连接类型 - FILTER 过滤 - INPUT 输入 - OUTPUT 输出  **约束限制** 不涉及 **取值范围**: - FILTER - INPUT - OUTPUT  **默认值** 不涉及
 */
public class FilterConnectionType {

    /**
     * Enum FILTER for value: "FILTER"
     */
    public static final FilterConnectionType FILTER = new FilterConnectionType("FILTER");

    /**
     * Enum INPUT for value: "INPUT"
     */
    public static final FilterConnectionType INPUT = new FilterConnectionType("INPUT");

    /**
     * Enum OUTPUT for value: "OUTPUT"
     */
    public static final FilterConnectionType OUTPUT = new FilterConnectionType("OUTPUT");

    private static final Map<String, FilterConnectionType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FilterConnectionType> createStaticFields() {
        Map<String, FilterConnectionType> map = new HashMap<>();
        map.put("FILTER", FILTER);
        map.put("INPUT", INPUT);
        map.put("OUTPUT", OUTPUT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FilterConnectionType(String value) {
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
    public static FilterConnectionType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterConnectionType(value));
    }

    public static FilterConnectionType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FilterConnectionType) {
            return this.value.equals(((FilterConnectionType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
