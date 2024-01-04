package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 集群升级状态： Init: 任务初始状态 Queuing: 任务已进入执行队列 Running: 任务开始执行 Success: 任务执行成功 Failed: 任务执行失败 
 */
public class UpgradeWorkflowTaskStatus {

    /**
     * Enum INIT for value: "Init"
     */
    public static final UpgradeWorkflowTaskStatus INIT = new UpgradeWorkflowTaskStatus("Init");

    /**
     * Enum QUEUING for value: "Queuing"
     */
    public static final UpgradeWorkflowTaskStatus QUEUING = new UpgradeWorkflowTaskStatus("Queuing");

    /**
     * Enum RUNNING for value: "Running"
     */
    public static final UpgradeWorkflowTaskStatus RUNNING = new UpgradeWorkflowTaskStatus("Running");

    /**
     * Enum SUCCESS for value: "Success"
     */
    public static final UpgradeWorkflowTaskStatus SUCCESS = new UpgradeWorkflowTaskStatus("Success");

    /**
     * Enum FAILED for value: "Failed"
     */
    public static final UpgradeWorkflowTaskStatus FAILED = new UpgradeWorkflowTaskStatus("Failed");

    private static final Map<String, UpgradeWorkflowTaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, UpgradeWorkflowTaskStatus> createStaticFields() {
        Map<String, UpgradeWorkflowTaskStatus> map = new HashMap<>();
        map.put("Init", INIT);
        map.put("Queuing", QUEUING);
        map.put("Running", RUNNING);
        map.put("Success", SUCCESS);
        map.put("Failed", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    UpgradeWorkflowTaskStatus(String value) {
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
    public static UpgradeWorkflowTaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UpgradeWorkflowTaskStatus(value));
    }

    public static UpgradeWorkflowTaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UpgradeWorkflowTaskStatus) {
            return this.value.equals(((UpgradeWorkflowTaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
