package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 作业的名称类型
 */
public class JobNameType {

    /**
     * Enum DATABASE for value: "DATABASE"
     */
    public static final JobNameType DATABASE = new JobNameType("DATABASE");

    /**
     * Enum MANUAL for value: "MANUAL"
     */
    public static final JobNameType MANUAL = new JobNameType("MANUAL");

    /**
     * Enum AUTO for value: "AUTO"
     */
    public static final JobNameType AUTO = new JobNameType("AUTO");

    private static final Map<String, JobNameType> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobNameType> createStaticFields() {
        Map<String, JobNameType> map = new HashMap<>();
        map.put("DATABASE", DATABASE);
        map.put("MANUAL", MANUAL);
        map.put("AUTO", AUTO);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobNameType(String value) {
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
    public static JobNameType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobNameType(value));
    }

    public static JobNameType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobNameType) {
            return this.value.equals(((JobNameType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
