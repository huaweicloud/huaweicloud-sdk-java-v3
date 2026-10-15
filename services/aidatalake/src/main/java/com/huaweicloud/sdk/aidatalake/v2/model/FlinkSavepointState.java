package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Savepoint状态枚举。 **约束限制**：不涉及。 **取值范围**：   - TRIGGER_PENDING：排队等待执行。   - IN_PROGRESS：执行中。   - COMPLETED：触发成功。   - FAILED：触发失败。   - ABANDONED：放弃/失效。 **默认取值**：不涉及。 
 */
public class FlinkSavepointState {

    /**
     * Enum TRIGGER_PENDING for value: "TRIGGER_PENDING"
     */
    public static final FlinkSavepointState TRIGGER_PENDING = new FlinkSavepointState("TRIGGER_PENDING");

    /**
     * Enum IN_PROGRESS for value: "IN_PROGRESS"
     */
    public static final FlinkSavepointState IN_PROGRESS = new FlinkSavepointState("IN_PROGRESS");

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final FlinkSavepointState COMPLETED = new FlinkSavepointState("COMPLETED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final FlinkSavepointState FAILED = new FlinkSavepointState("FAILED");

    /**
     * Enum ABANDONED for value: "ABANDONED"
     */
    public static final FlinkSavepointState ABANDONED = new FlinkSavepointState("ABANDONED");

    private static final Map<String, FlinkSavepointState> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkSavepointState> createStaticFields() {
        Map<String, FlinkSavepointState> map = new HashMap<>();
        map.put("TRIGGER_PENDING", TRIGGER_PENDING);
        map.put("IN_PROGRESS", IN_PROGRESS);
        map.put("COMPLETED", COMPLETED);
        map.put("FAILED", FAILED);
        map.put("ABANDONED", ABANDONED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkSavepointState(String value) {
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
    public static FlinkSavepointState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkSavepointState(value));
    }

    public static FlinkSavepointState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkSavepointState) {
            return this.value.equals(((FlinkSavepointState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
