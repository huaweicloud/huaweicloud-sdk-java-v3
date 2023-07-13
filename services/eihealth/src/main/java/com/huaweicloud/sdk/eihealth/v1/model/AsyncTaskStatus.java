package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 异步任务的状态：等待中、运行中、已完成、失败
 */
public class AsyncTaskStatus {

    /**
     * Enum WAITING for value: "waiting"
     */
    public static final AsyncTaskStatus WAITING = new AsyncTaskStatus("waiting");

    /**
     * Enum RUNNING for value: "running"
     */
    public static final AsyncTaskStatus RUNNING = new AsyncTaskStatus("running");

    /**
     * Enum FINISHED for value: "finished"
     */
    public static final AsyncTaskStatus FINISHED = new AsyncTaskStatus("finished");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final AsyncTaskStatus FAILED = new AsyncTaskStatus("failed");

    private static final Map<String, AsyncTaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, AsyncTaskStatus> createStaticFields() {
        Map<String, AsyncTaskStatus> map = new HashMap<>();
        map.put("waiting", WAITING);
        map.put("running", RUNNING);
        map.put("finished", FINISHED);
        map.put("failed", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AsyncTaskStatus(String value) {
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
    public static AsyncTaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AsyncTaskStatus(value));
    }

    public static AsyncTaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AsyncTaskStatus) {
            return this.value.equals(((AsyncTaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
