package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 告警条件判断周期，单位为秒，支持的值为1，300，1200，3600，14400，86400。说明：当period设置为1时，表示以原始的指标数据判断告警。当alarm_type为（EVENT.SYS| EVENT.CUSTOM）时允许为0。
 */
public class Period {

    /**
     * Enum NUMBER_0 for value: 0
     */
    public static final Period NUMBER_0 = new Period(0);

    /**
     * Enum NUMBER_1 for value: 1
     */
    public static final Period NUMBER_1 = new Period(1);

    /**
     * Enum NUMBER_300 for value: 300
     */
    public static final Period NUMBER_300 = new Period(300);

    /**
     * Enum NUMBER_1200 for value: 1200
     */
    public static final Period NUMBER_1200 = new Period(1200);

    /**
     * Enum NUMBER_3600 for value: 3600
     */
    public static final Period NUMBER_3600 = new Period(3600);

    /**
     * Enum NUMBER_14400 for value: 14400
     */
    public static final Period NUMBER_14400 = new Period(14400);

    /**
     * Enum NUMBER_86400 for value: 86400
     */
    public static final Period NUMBER_86400 = new Period(86400);

    private static final Map<Integer, Period> STATIC_FIELDS = createStaticFields();

    private static Map<Integer, Period> createStaticFields() {
        Map<Integer, Period> map = new HashMap<>();
        map.put(0, NUMBER_0);
        map.put(1, NUMBER_1);
        map.put(300, NUMBER_300);
        map.put(1200, NUMBER_1200);
        map.put(3600, NUMBER_3600);
        map.put(14400, NUMBER_14400);
        map.put(86400, NUMBER_86400);
        return Collections.unmodifiableMap(map);
    }

    private Integer value;

    Period(Integer value) {
        this.value = value;
    }

    @JsonValue
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static Period fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Period(value));
    }

    public static Period valueOf(Integer value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Period) {
            return this.value.equals(((Period) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
