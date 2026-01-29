package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 时间单位 - MINUTE 分钟 - HOUR 小时 - DAY 天 - MONTH 月  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY - MONTH  **默认值** 不涉及
 */
public class IsapTimeUnit {

    /**
     * Enum MINUTE for value: "MINUTE"
     */
    public static final IsapTimeUnit MINUTE = new IsapTimeUnit("MINUTE");

    /**
     * Enum HOUR for value: "HOUR"
     */
    public static final IsapTimeUnit HOUR = new IsapTimeUnit("HOUR");

    /**
     * Enum DAY for value: "DAY"
     */
    public static final IsapTimeUnit DAY = new IsapTimeUnit("DAY");

    /**
     * Enum MONTH for value: "MONTH"
     */
    public static final IsapTimeUnit MONTH = new IsapTimeUnit("MONTH");

    private static final Map<String, IsapTimeUnit> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapTimeUnit> createStaticFields() {
        Map<String, IsapTimeUnit> map = new HashMap<>();
        map.put("MINUTE", MINUTE);
        map.put("HOUR", HOUR);
        map.put("DAY", DAY);
        map.put("MONTH", MONTH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapTimeUnit(String value) {
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
    public static IsapTimeUnit fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapTimeUnit(value));
    }

    public static IsapTimeUnit valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapTimeUnit) {
            return this.value.equals(((IsapTimeUnit) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
