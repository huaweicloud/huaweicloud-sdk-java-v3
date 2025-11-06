package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 数据聚合的方式。 **取值范围**： 支持 average、variance、min、max、sum。 - average： 平均值 - variance：方差 - min：最小值 - max：最大值 - sum：求和 
 */
public class FilterResp {

    /**
     * Enum AVERAGE for value: "average"
     */
    public static final FilterResp AVERAGE = new FilterResp("average");

    /**
     * Enum VARIANCE for value: "variance"
     */
    public static final FilterResp VARIANCE = new FilterResp("variance");

    /**
     * Enum MIN for value: "min"
     */
    public static final FilterResp MIN = new FilterResp("min");

    /**
     * Enum MAX for value: "max"
     */
    public static final FilterResp MAX = new FilterResp("max");

    /**
     * Enum SUM for value: "sum"
     */
    public static final FilterResp SUM = new FilterResp("sum");

    private static final Map<String, FilterResp> STATIC_FIELDS = createStaticFields();

    private static Map<String, FilterResp> createStaticFields() {
        Map<String, FilterResp> map = new HashMap<>();
        map.put("average", AVERAGE);
        map.put("variance", VARIANCE);
        map.put("min", MIN);
        map.put("max", MAX);
        map.put("sum", SUM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FilterResp(String value) {
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
    public static FilterResp fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterResp(value));
    }

    public static FilterResp valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FilterResp) {
            return this.value.equals(((FilterResp) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
