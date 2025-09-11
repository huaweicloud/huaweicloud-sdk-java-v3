package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释** 聚合规则 **取值范围** - last:最新值 - max:最大值 - min:最小值 - average:平均值 - sum:求和值 
 */
public class RollupFilterResp {

    /**
     * Enum LAST for value: "last"
     */
    public static final RollupFilterResp LAST = new RollupFilterResp("last");

    /**
     * Enum MAX for value: "max"
     */
    public static final RollupFilterResp MAX = new RollupFilterResp("max");

    /**
     * Enum MIN for value: "min"
     */
    public static final RollupFilterResp MIN = new RollupFilterResp("min");

    /**
     * Enum AVERAGE for value: "average"
     */
    public static final RollupFilterResp AVERAGE = new RollupFilterResp("average");

    /**
     * Enum SUM for value: "sum"
     */
    public static final RollupFilterResp SUM = new RollupFilterResp("sum");

    private static final Map<String, RollupFilterResp> STATIC_FIELDS = createStaticFields();

    private static Map<String, RollupFilterResp> createStaticFields() {
        Map<String, RollupFilterResp> map = new HashMap<>();
        map.put("last", LAST);
        map.put("max", MAX);
        map.put("min", MIN);
        map.put("average", AVERAGE);
        map.put("sum", SUM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RollupFilterResp(String value) {
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
    public static RollupFilterResp fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RollupFilterResp(value));
    }

    public static RollupFilterResp valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RollupFilterResp) {
            return this.value.equals(((RollupFilterResp) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
