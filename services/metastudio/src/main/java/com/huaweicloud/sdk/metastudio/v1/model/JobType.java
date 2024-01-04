package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 训练类型。 * BASIC: 基础版(20句话) * MIDDLE: 进阶版(100句话) * ADVANCE: 高级版
 */
public class JobType {

    /**
     * Enum BASIC for value: "BASIC"
     */
    public static final JobType BASIC = new JobType("BASIC");

    /**
     * Enum MIDDLE for value: "MIDDLE"
     */
    public static final JobType MIDDLE = new JobType("MIDDLE");

    /**
     * Enum ADVANCE for value: "ADVANCE"
     */
    public static final JobType ADVANCE = new JobType("ADVANCE");

    private static final Map<String, JobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobType> createStaticFields() {
        Map<String, JobType> map = new HashMap<>();
        map.put("BASIC", BASIC);
        map.put("MIDDLE", MIDDLE);
        map.put("ADVANCE", ADVANCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobType(String value) {
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
    public static JobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobType(value));
    }

    public static JobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobType) {
            return this.value.equals(((JobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
