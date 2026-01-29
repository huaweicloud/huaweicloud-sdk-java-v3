package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业模式 - STREAMING 流式处理 - BATCH 批处理 - SEARCH 检索  **约束限制** 不涉及 **取值范围**: - STREAMING - BATCH - SEARCH  **默认值** 不涉及
 */
public class JobMode {

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final JobMode STREAMING = new JobMode("STREAMING");

    /**
     * Enum BATCH for value: "BATCH"
     */
    public static final JobMode BATCH = new JobMode("BATCH");

    /**
     * Enum SEARCH for value: "SEARCH"
     */
    public static final JobMode SEARCH = new JobMode("SEARCH");

    private static final Map<String, JobMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobMode> createStaticFields() {
        Map<String, JobMode> map = new HashMap<>();
        map.put("STREAMING", STREAMING);
        map.put("BATCH", BATCH);
        map.put("SEARCH", SEARCH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobMode(String value) {
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
    public static JobMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobMode(value));
    }

    public static JobMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobMode) {
            return this.value.equals(((JobMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
