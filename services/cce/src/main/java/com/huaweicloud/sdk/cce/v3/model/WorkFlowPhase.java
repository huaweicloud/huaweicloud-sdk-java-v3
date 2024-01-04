package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 集群升级流程的执行状态： Init: 表示该升级流程中还未有任何任务开始运行 Running: 表示该升级流程中已有任务开始执行 Pending: 表示该升级流程中有任务执行失败 Success: 表示该升级流程中所有任务都已执行成功 Cancel: 表示该升级流程已被取消 
 */
public class WorkFlowPhase {

    /**
     * Enum INIT for value: "Init"
     */
    public static final WorkFlowPhase INIT = new WorkFlowPhase("Init");

    /**
     * Enum RUNNING for value: "Running"
     */
    public static final WorkFlowPhase RUNNING = new WorkFlowPhase("Running");

    /**
     * Enum PENDING for value: "Pending"
     */
    public static final WorkFlowPhase PENDING = new WorkFlowPhase("Pending");

    /**
     * Enum SUCCESS for value: "Success"
     */
    public static final WorkFlowPhase SUCCESS = new WorkFlowPhase("Success");

    /**
     * Enum CANCEL for value: "Cancel"
     */
    public static final WorkFlowPhase CANCEL = new WorkFlowPhase("Cancel");

    private static final Map<String, WorkFlowPhase> STATIC_FIELDS = createStaticFields();

    private static Map<String, WorkFlowPhase> createStaticFields() {
        Map<String, WorkFlowPhase> map = new HashMap<>();
        map.put("Init", INIT);
        map.put("Running", RUNNING);
        map.put("Pending", PENDING);
        map.put("Success", SUCCESS);
        map.put("Cancel", CANCEL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    WorkFlowPhase(String value) {
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
    public static WorkFlowPhase fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WorkFlowPhase(value));
    }

    public static WorkFlowPhase valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof WorkFlowPhase) {
            return this.value.equals(((WorkFlowPhase) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
