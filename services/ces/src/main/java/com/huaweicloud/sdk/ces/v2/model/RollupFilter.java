package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 聚合规则，last:最新值,max:最大值,min:最小值,average:平均值,sum:求和值
 */
public class RollupFilter {

    /**
     * Enum LAST for value: "last"
     */
    public static final RollupFilter LAST = new RollupFilter("last");

    /**
     * Enum MAX for value: "max"
     */
    public static final RollupFilter MAX = new RollupFilter("max");

    /**
     * Enum MIN for value: "min"
     */
    public static final RollupFilter MIN = new RollupFilter("min");

    /**
     * Enum AVERAGE for value: "average"
     */
    public static final RollupFilter AVERAGE = new RollupFilter("average");

    /**
     * Enum SUM for value: "sum"
     */
    public static final RollupFilter SUM = new RollupFilter("sum");

    private static final Map<String, RollupFilter> STATIC_FIELDS = createStaticFields();

    private static Map<String, RollupFilter> createStaticFields() {
        Map<String, RollupFilter> map = new HashMap<>();
        map.put("last", LAST);
        map.put("max", MAX);
        map.put("min", MIN);
        map.put("average", AVERAGE);
        map.put("sum", SUM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RollupFilter(String value) {
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
    public static RollupFilter fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RollupFilter(value));
    }

    public static RollupFilter valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RollupFilter) {
            return this.value.equals(((RollupFilter) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
