package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 删除任务状态。
 */
public class DeletionTaskStatus {

    /**
     * Enum SUCCEEDED for value: "succeeded"
     */
    public static final DeletionTaskStatus SUCCEEDED = new DeletionTaskStatus("succeeded");

    /**
     * Enum IN_PROGRESS for value: "in_progress"
     */
    public static final DeletionTaskStatus IN_PROGRESS = new DeletionTaskStatus("in_progress");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final DeletionTaskStatus FAILED = new DeletionTaskStatus("failed");

    /**
     * Enum NOT_STARTED for value: "not_started"
     */
    public static final DeletionTaskStatus NOT_STARTED = new DeletionTaskStatus("not_started");

    private static final Map<String, DeletionTaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, DeletionTaskStatus> createStaticFields() {
        Map<String, DeletionTaskStatus> map = new HashMap<>();
        map.put("succeeded", SUCCEEDED);
        map.put("in_progress", IN_PROGRESS);
        map.put("failed", FAILED);
        map.put("not_started", NOT_STARTED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DeletionTaskStatus(String value) {
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
    public static DeletionTaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DeletionTaskStatus(value));
    }

    public static DeletionTaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DeletionTaskStatus) {
            return this.value.equals(((DeletionTaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
