package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 频率单位 - MINUTE 分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及           
 */
public class FrequencyUnit {

    /**
     * Enum MINUTE for value: "MINUTE"
     */
    public static final FrequencyUnit MINUTE = new FrequencyUnit("MINUTE");

    /**
     * Enum HOUR for value: "HOUR"
     */
    public static final FrequencyUnit HOUR = new FrequencyUnit("HOUR");

    /**
     * Enum DAY for value: "DAY"
     */
    public static final FrequencyUnit DAY = new FrequencyUnit("DAY");

    private static final Map<String, FrequencyUnit> STATIC_FIELDS = createStaticFields();

    private static Map<String, FrequencyUnit> createStaticFields() {
        Map<String, FrequencyUnit> map = new HashMap<>();
        map.put("MINUTE", MINUTE);
        map.put("HOUR", HOUR);
        map.put("DAY", DAY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FrequencyUnit(String value) {
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
    public static FrequencyUnit fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrequencyUnit(value));
    }

    public static FrequencyUnit valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FrequencyUnit) {
            return this.value.equals(((FrequencyUnit) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
