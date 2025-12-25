package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业模式 - STREAMING 流式处理 - BATCH 批处理 - SEARCH 检索  **约束限制** 不涉及 **取值范围**: - STREAMING - BATCH - SEARCH  **默认值** 不涉及  
 */
public class IsapJobMode {

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final IsapJobMode STREAMING = new IsapJobMode("STREAMING");

    /**
     * Enum BATCH for value: "BATCH"
     */
    public static final IsapJobMode BATCH = new IsapJobMode("BATCH");

    /**
     * Enum SEARCH for value: "SEARCH"
     */
    public static final IsapJobMode SEARCH = new IsapJobMode("SEARCH");

    private static final Map<String, IsapJobMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapJobMode> createStaticFields() {
        Map<String, IsapJobMode> map = new HashMap<>();
        map.put("STREAMING", STREAMING);
        map.put("BATCH", BATCH);
        map.put("SEARCH", SEARCH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapJobMode(String value) {
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
    public static IsapJobMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapJobMode(value));
    }

    public static IsapJobMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapJobMode) {
            return this.value.equals(((IsapJobMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
