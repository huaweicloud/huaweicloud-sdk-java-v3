package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：执行模式枚举。 **约束限制**：不涉及。 **取值范围**：   - STREAMING：流模式。   - BATCH：批模式。 **默认取值**：不涉及。 
 */
public class FlinkJobExecutionMode {

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final FlinkJobExecutionMode STREAMING = new FlinkJobExecutionMode("STREAMING");

    /**
     * Enum BATCH for value: "BATCH"
     */
    public static final FlinkJobExecutionMode BATCH = new FlinkJobExecutionMode("BATCH");

    private static final Map<String, FlinkJobExecutionMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkJobExecutionMode> createStaticFields() {
        Map<String, FlinkJobExecutionMode> map = new HashMap<>();
        map.put("STREAMING", STREAMING);
        map.put("BATCH", BATCH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkJobExecutionMode(String value) {
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
    public static FlinkJobExecutionMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkJobExecutionMode(value));
    }

    public static FlinkJobExecutionMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkJobExecutionMode) {
            return this.value.equals(((FlinkJobExecutionMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
