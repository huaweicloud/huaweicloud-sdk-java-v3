package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 类别，可选值如下： RAY_JOB: Ray Job,  PYTHON_JOB: Python Job,  SPARK_JOB: Spark Job
 */
public class JobType {

    /**
     * Enum RAY_JOB for value: "RAY_JOB"
     */
    public static final JobType RAY_JOB = new JobType("RAY_JOB");

    /**
     * Enum PYTHON_JOB for value: "PYTHON_JOB"
     */
    public static final JobType PYTHON_JOB = new JobType("PYTHON_JOB");

    /**
     * Enum SPARK_JOB for value: "SPARK_JOB"
     */
    public static final JobType SPARK_JOB = new JobType("SPARK_JOB");

    private static final Map<String, JobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobType> createStaticFields() {
        Map<String, JobType> map = new HashMap<>();
        map.put("RAY_JOB", RAY_JOB);
        map.put("PYTHON_JOB", PYTHON_JOB);
        map.put("SPARK_JOB", SPARK_JOB);
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
