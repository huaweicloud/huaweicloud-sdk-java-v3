package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job状态 * &#x60;WAITING&#x60; - 等待 * &#x60;RUNNING&#x60; - 运行中 * &#x60;SUCCESS&#x60; - 完成 * &#x60;FAILED&#x60; - 失败
 */
public class JobStatus {

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final JobStatus WAITING = new JobStatus("WAITING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final JobStatus RUNNING = new JobStatus("RUNNING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final JobStatus SUCCESS = new JobStatus("SUCCESS");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final JobStatus FAILED = new JobStatus("FAILED");

    private static final Map<String, JobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobStatus> createStaticFields() {
        Map<String, JobStatus> map = new HashMap<>();
        map.put("WAITING", WAITING);
        map.put("RUNNING", RUNNING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAILED", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobStatus(String value) {
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
    public static JobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatus(value));
    }

    public static JobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobStatus) {
            return this.value.equals(((JobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
