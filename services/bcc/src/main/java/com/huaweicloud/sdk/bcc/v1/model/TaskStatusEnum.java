package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务状态枚举
 */
public class TaskStatusEnum {

    /**
     * Enum SUCCESS for value: "success"
     */
    public static final TaskStatusEnum SUCCESS = new TaskStatusEnum("success");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final TaskStatusEnum FAILED = new TaskStatusEnum("failed");

    /**
     * Enum RUNNING for value: "running"
     */
    public static final TaskStatusEnum RUNNING = new TaskStatusEnum("running");

    /**
     * Enum SKIPPED for value: "skipped"
     */
    public static final TaskStatusEnum SKIPPED = new TaskStatusEnum("skipped");

    /**
     * Enum TIMEOUT for value: "timeout"
     */
    public static final TaskStatusEnum TIMEOUT = new TaskStatusEnum("timeout");

    private static final Map<String, TaskStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, TaskStatusEnum> createStaticFields() {
        Map<String, TaskStatusEnum> map = new HashMap<>();
        map.put("success", SUCCESS);
        map.put("failed", FAILED);
        map.put("running", RUNNING);
        map.put("skipped", SKIPPED);
        map.put("timeout", TIMEOUT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TaskStatusEnum(String value) {
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
    public static TaskStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStatusEnum(value));
    }

    public static TaskStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TaskStatusEnum) {
            return this.value.equals(((TaskStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
