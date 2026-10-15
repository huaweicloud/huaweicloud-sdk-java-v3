package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Flink作业恢复类型枚举。 **约束限制**：不涉及。 **取值范围**：   - NONE：无状态启动。   - FROM_SAVEPOINT_ID：从指定快照恢复。   - FROM_CHECKPOINT_PATH：从指定Checkpoint路径恢复。   - FROM_SPECIFIED_TIMESTAMP：从指定时间戳恢复。 **默认取值**：NONE。 
 */
public class FlinkJobRestoreType {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final FlinkJobRestoreType NONE = new FlinkJobRestoreType("NONE");

    /**
     * Enum FROM_SAVEPOINT_ID for value: "FROM_SAVEPOINT_ID"
     */
    public static final FlinkJobRestoreType FROM_SAVEPOINT_ID = new FlinkJobRestoreType("FROM_SAVEPOINT_ID");

    /**
     * Enum FROM_CHECKPOINT_PATH for value: "FROM_CHECKPOINT_PATH"
     */
    public static final FlinkJobRestoreType FROM_CHECKPOINT_PATH = new FlinkJobRestoreType("FROM_CHECKPOINT_PATH");

    /**
     * Enum FROM_SPECIFIED_TIMESTAMP for value: "FROM_SPECIFIED_TIMESTAMP"
     */
    public static final FlinkJobRestoreType FROM_SPECIFIED_TIMESTAMP =
        new FlinkJobRestoreType("FROM_SPECIFIED_TIMESTAMP");

    private static final Map<String, FlinkJobRestoreType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkJobRestoreType> createStaticFields() {
        Map<String, FlinkJobRestoreType> map = new HashMap<>();
        map.put("NONE", NONE);
        map.put("FROM_SAVEPOINT_ID", FROM_SAVEPOINT_ID);
        map.put("FROM_CHECKPOINT_PATH", FROM_CHECKPOINT_PATH);
        map.put("FROM_SPECIFIED_TIMESTAMP", FROM_SPECIFIED_TIMESTAMP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkJobRestoreType(String value) {
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
    public static FlinkJobRestoreType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkJobRestoreType(value));
    }

    public static FlinkJobRestoreType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkJobRestoreType) {
            return this.value.equals(((FlinkJobRestoreType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
