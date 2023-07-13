package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets MonitorPeriod
 */
public class MonitorPeriod {

    /**
     * Enum REAL_TIME for value: "real_time"
     */
    public static final MonitorPeriod REAL_TIME = new MonitorPeriod("real_time");

    /**
     * Enum FIVE_MINUTES for value: "five_minutes"
     */
    public static final MonitorPeriod FIVE_MINUTES = new MonitorPeriod("five_minutes");

    /**
     * Enum FIFTEEN_TO_TWENTY_MINUTES for value: "fifteen_to_twenty_minutes"
     */
    public static final MonitorPeriod FIFTEEN_TO_TWENTY_MINUTES = new MonitorPeriod("fifteen_to_twenty_minutes");

    /**
     * Enum ONE_HOUR for value: "one_hour"
     */
    public static final MonitorPeriod ONE_HOUR = new MonitorPeriod("one_hour");

    private static final Map<String, MonitorPeriod> STATIC_FIELDS = createStaticFields();

    private static Map<String, MonitorPeriod> createStaticFields() {
        Map<String, MonitorPeriod> map = new HashMap<>();
        map.put("real_time", REAL_TIME);
        map.put("five_minutes", FIVE_MINUTES);
        map.put("fifteen_to_twenty_minutes", FIFTEEN_TO_TWENTY_MINUTES);
        map.put("one_hour", ONE_HOUR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MonitorPeriod(String value) {
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
    public static MonitorPeriod fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MonitorPeriod(value));
    }

    public static MonitorPeriod valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MonitorPeriod) {
            return this.value.equals(((MonitorPeriod) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
