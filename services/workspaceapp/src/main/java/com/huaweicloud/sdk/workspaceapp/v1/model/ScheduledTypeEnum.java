package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 执行周期： * &#x60;FIXED_TIME&#x60; - 指定时间 * &#x60;DAY&#x60; - 按天 * &#x60;WEEK&#x60; - 按周 * &#x60;MONTH&#x60; - 按月
 */
public class ScheduledTypeEnum {

    /**
     * Enum FIXED_TIME for value: "FIXED_TIME"
     */
    public static final ScheduledTypeEnum FIXED_TIME = new ScheduledTypeEnum("FIXED_TIME");

    /**
     * Enum DAY for value: "DAY"
     */
    public static final ScheduledTypeEnum DAY = new ScheduledTypeEnum("DAY");

    /**
     * Enum WEEK for value: "WEEK"
     */
    public static final ScheduledTypeEnum WEEK = new ScheduledTypeEnum("WEEK");

    /**
     * Enum MONTH for value: "MONTH"
     */
    public static final ScheduledTypeEnum MONTH = new ScheduledTypeEnum("MONTH");

    private static final Map<String, ScheduledTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ScheduledTypeEnum> createStaticFields() {
        Map<String, ScheduledTypeEnum> map = new HashMap<>();
        map.put("FIXED_TIME", FIXED_TIME);
        map.put("DAY", DAY);
        map.put("WEEK", WEEK);
        map.put("MONTH", MONTH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ScheduledTypeEnum(String value) {
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
    public static ScheduledTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduledTypeEnum(value));
    }

    public static ScheduledTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScheduledTypeEnum) {
            return this.value.equals(((ScheduledTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
