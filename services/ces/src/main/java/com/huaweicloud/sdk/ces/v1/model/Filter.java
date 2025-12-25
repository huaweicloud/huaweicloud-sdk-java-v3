package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 数据聚合的方式。 **约束限制**： period为1（原始值）时，filter字段不生效，参数值默认为average。period大于1时filter才起作用。 **取值范围**： 支持 average、variance、min、max、sum。 - average： 平均值 - variance：方差 - min：最小值 - max：最大值 - sum：求和 **默认取值**： 不涉及。 
 */
public class Filter {

    /**
     * Enum AVERAGE for value: "average"
     */
    public static final Filter AVERAGE = new Filter("average");

    /**
     * Enum VARIANCE for value: "variance"
     */
    public static final Filter VARIANCE = new Filter("variance");

    /**
     * Enum MIN for value: "min"
     */
    public static final Filter MIN = new Filter("min");

    /**
     * Enum MAX for value: "max"
     */
    public static final Filter MAX = new Filter("max");

    /**
     * Enum SUM for value: "sum"
     */
    public static final Filter SUM = new Filter("sum");

    private static final Map<String, Filter> STATIC_FIELDS = createStaticFields();

    private static Map<String, Filter> createStaticFields() {
        Map<String, Filter> map = new HashMap<>();
        map.put("average", AVERAGE);
        map.put("variance", VARIANCE);
        map.put("min", MIN);
        map.put("max", MAX);
        map.put("sum", SUM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Filter(String value) {
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
    public static Filter fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Filter(value));
    }

    public static Filter valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Filter) {
            return this.value.equals(((Filter) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
