package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 集群升级任务类型： Cluster: 集群升级任务 PreCheck: 集群升级预检查任务 Rollback: 集群升级回归任务 Snapshot: 集群升级快照任务 PostCheck: 集群升级后检查任务 
 */
public class TaskType {

    /**
     * Enum CLUSTER for value: "Cluster"
     */
    public static final TaskType CLUSTER = new TaskType("Cluster");

    /**
     * Enum PRECHECK for value: "PreCheck"
     */
    public static final TaskType PRECHECK = new TaskType("PreCheck");

    /**
     * Enum ROLLBACK for value: "Rollback"
     */
    public static final TaskType ROLLBACK = new TaskType("Rollback");

    /**
     * Enum SNAPSHOT for value: "Snapshot"
     */
    public static final TaskType SNAPSHOT = new TaskType("Snapshot");

    /**
     * Enum POSTCHECK for value: "PostCheck"
     */
    public static final TaskType POSTCHECK = new TaskType("PostCheck");

    private static final Map<String, TaskType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TaskType> createStaticFields() {
        Map<String, TaskType> map = new HashMap<>();
        map.put("Cluster", CLUSTER);
        map.put("PreCheck", PRECHECK);
        map.put("Rollback", ROLLBACK);
        map.put("Snapshot", SNAPSHOT);
        map.put("PostCheck", POSTCHECK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TaskType(String value) {
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
    public static TaskType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskType(value));
    }

    public static TaskType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TaskType) {
            return this.value.equals(((TaskType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
