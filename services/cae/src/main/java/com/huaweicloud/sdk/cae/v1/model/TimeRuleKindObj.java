package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“TimerRule”，该值不可修改。
 */
public class TimeRuleKindObj {

    /**
     * Enum TIMERRULE for value: "TimerRule"
     */
    public static final TimeRuleKindObj TIMERRULE = new TimeRuleKindObj("TimerRule");

    private static final Map<String, TimeRuleKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, TimeRuleKindObj> createStaticFields() {
        Map<String, TimeRuleKindObj> map = new HashMap<>();
        map.put("TimerRule", TIMERRULE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TimeRuleKindObj(String value) {
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
    public static TimeRuleKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeRuleKindObj(value));
    }

    public static TimeRuleKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TimeRuleKindObj) {
            return this.value.equals(((TimeRuleKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
