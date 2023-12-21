package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job详情的状态 * &#x60;WAITING&#x60; - 等待 * &#x60;RUNNING&#x60; - 运行中 * &#x60;SUCCESS&#x60; - 成功 * &#x60;FAILED&#x60; - 失败 * &#x60;ABNORMAL&#x60; - 异常 * &#x60;ROLLBACK&#x60; - 回滚中 * &#x60;ABORTING&#x60; - 终止中
 */
public class JobDetailStatus {

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final JobDetailStatus WAITING = new JobDetailStatus("WAITING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final JobDetailStatus RUNNING = new JobDetailStatus("RUNNING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final JobDetailStatus SUCCESS = new JobDetailStatus("SUCCESS");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final JobDetailStatus FAILED = new JobDetailStatus("FAILED");

    /**
     * Enum ABNORMAL for value: "ABNORMAL"
     */
    public static final JobDetailStatus ABNORMAL = new JobDetailStatus("ABNORMAL");

    /**
     * Enum ROLLBACK for value: "ROLLBACK"
     */
    public static final JobDetailStatus ROLLBACK = new JobDetailStatus("ROLLBACK");

    /**
     * Enum ABORTING for value: "ABORTING"
     */
    public static final JobDetailStatus ABORTING = new JobDetailStatus("ABORTING");

    private static final Map<String, JobDetailStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobDetailStatus> createStaticFields() {
        Map<String, JobDetailStatus> map = new HashMap<>();
        map.put("WAITING", WAITING);
        map.put("RUNNING", RUNNING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAILED", FAILED);
        map.put("ABNORMAL", ABNORMAL);
        map.put("ROLLBACK", ROLLBACK);
        map.put("ABORTING", ABORTING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobDetailStatus(String value) {
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
    public static JobDetailStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobDetailStatus(value));
    }

    public static JobDetailStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobDetailStatus) {
            return this.value.equals(((JobDetailStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
