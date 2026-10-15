package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：作业状态的枚举字段。 **约束限制**：不涉及。 **取值范围**：   - CREATED：已创建。   - STARTING：启动中。   - RUNNING：运行中。   - CANCELLING：停止中。   - FAILED：已失败。   - CANCELLED：已停止。   - FINISHED：已完成。 **默认取值**：不涉及。 
 */
public class FlinkJobState {

    /**
     * Enum CREATED for value: "CREATED"
     */
    public static final FlinkJobState CREATED = new FlinkJobState("CREATED");

    /**
     * Enum STARTING for value: "STARTING"
     */
    public static final FlinkJobState STARTING = new FlinkJobState("STARTING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final FlinkJobState RUNNING = new FlinkJobState("RUNNING");

    /**
     * Enum CANCELLING for value: "CANCELLING"
     */
    public static final FlinkJobState CANCELLING = new FlinkJobState("CANCELLING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final FlinkJobState FAILED = new FlinkJobState("FAILED");

    /**
     * Enum CANCELLED for value: "CANCELLED"
     */
    public static final FlinkJobState CANCELLED = new FlinkJobState("CANCELLED");

    /**
     * Enum FINISHED for value: "FINISHED"
     */
    public static final FlinkJobState FINISHED = new FlinkJobState("FINISHED");

    private static final Map<String, FlinkJobState> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkJobState> createStaticFields() {
        Map<String, FlinkJobState> map = new HashMap<>();
        map.put("CREATED", CREATED);
        map.put("STARTING", STARTING);
        map.put("RUNNING", RUNNING);
        map.put("CANCELLING", CANCELLING);
        map.put("FAILED", FAILED);
        map.put("CANCELLED", CANCELLED);
        map.put("FINISHED", FINISHED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkJobState(String value) {
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
    public static FlinkJobState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkJobState(value));
    }

    public static FlinkJobState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkJobState) {
            return this.value.equals(((FlinkJobState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
