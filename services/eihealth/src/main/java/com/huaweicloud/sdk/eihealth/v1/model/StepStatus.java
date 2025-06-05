package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets StepStatus
 */
public class StepStatus {

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final StepStatus RUNNING = new StepStatus("RUNNING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final StepStatus FAILED = new StepStatus("FAILED");

    /**
     * Enum FINISHED for value: "FINISHED"
     */
    public static final StepStatus FINISHED = new StepStatus("FINISHED");

    private static final Map<String, StepStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, StepStatus> createStaticFields() {
        Map<String, StepStatus> map = new HashMap<>();
        map.put("RUNNING", RUNNING);
        map.put("FAILED", FAILED);
        map.put("FINISHED", FINISHED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StepStatus(String value) {
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
    public static StepStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StepStatus(value));
    }

    public static StepStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StepStatus) {
            return this.value.equals(((StepStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
