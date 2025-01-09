package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job状态： * &#x60;WAITING&#x60; - 等待 * &#x60;RUNNING&#x60; - 运行中 * &#x60;SUCCESS&#x60; - 完成 * &#x60;FAILED&#x60; - 失败
 */
public class ScheduleTaskStatus {

    /**
     * Enum WAITING for value: "WAITING"
     */
    public static final ScheduleTaskStatus WAITING = new ScheduleTaskStatus("WAITING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final ScheduleTaskStatus RUNNING = new ScheduleTaskStatus("RUNNING");

    /**
     * Enum SUCCESS for value: "SUCCESS"
     */
    public static final ScheduleTaskStatus SUCCESS = new ScheduleTaskStatus("SUCCESS");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final ScheduleTaskStatus FAILED = new ScheduleTaskStatus("FAILED");

    private static final Map<String, ScheduleTaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ScheduleTaskStatus> createStaticFields() {
        Map<String, ScheduleTaskStatus> map = new HashMap<>();
        map.put("WAITING", WAITING);
        map.put("RUNNING", RUNNING);
        map.put("SUCCESS", SUCCESS);
        map.put("FAILED", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ScheduleTaskStatus(String value) {
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
    public static ScheduleTaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleTaskStatus(value));
    }

    public static ScheduleTaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScheduleTaskStatus) {
            return this.value.equals(((ScheduleTaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
