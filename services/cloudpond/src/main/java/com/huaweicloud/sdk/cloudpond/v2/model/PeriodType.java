package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 包周期类型 - year：包年
 */
public class PeriodType {

    /**
     * Enum YEAR for value: "year"
     */
    public static final PeriodType YEAR = new PeriodType("year");

    private static final Map<String, PeriodType> STATIC_FIELDS = createStaticFields();

    private static Map<String, PeriodType> createStaticFields() {
        Map<String, PeriodType> map = new HashMap<>();
        map.put("year", YEAR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PeriodType(String value) {
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
    public static PeriodType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeriodType(value));
    }

    public static PeriodType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PeriodType) {
            return this.value.equals(((PeriodType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
