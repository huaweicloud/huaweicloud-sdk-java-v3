package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API类型，固定值“Job”，该值不可修改。
 */
public class JobKindObj {

    /**
     * Enum JOB for value: "Job"
     */
    public static final JobKindObj JOB = new JobKindObj("Job");

    private static final Map<String, JobKindObj> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobKindObj> createStaticFields() {
        Map<String, JobKindObj> map = new HashMap<>();
        map.put("Job", JOB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobKindObj(String value) {
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
    public static JobKindObj fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobKindObj(value));
    }

    public static JobKindObj valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobKindObj) {
            return this.value.equals(((JobKindObj) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
