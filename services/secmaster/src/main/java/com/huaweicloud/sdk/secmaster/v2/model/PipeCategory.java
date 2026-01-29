package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 管道目录 - STREAMING_TO_INDEX 流式写入索引 - STREAMING_TO_LAKE 流式写入数据湖 - STREAMING_TO_INDEX_LAKE 流式写入索引和数据湖 - STREAMING  流式传输中  **约束限制** 不涉及  **取值范围**: - STREAMING_TO_INDEX - STREAMING_TO_LAKE - STREAMING_TO_INDEX_LAKE - STREAMING  **默认值** 不涉及
 */
public class PipeCategory {

    /**
     * Enum STREAMING_TO_INDEX for value: "STREAMING_TO_INDEX"
     */
    public static final PipeCategory STREAMING_TO_INDEX = new PipeCategory("STREAMING_TO_INDEX");

    /**
     * Enum STREAMING_TO_LAKE for value: "STREAMING_TO_LAKE"
     */
    public static final PipeCategory STREAMING_TO_LAKE = new PipeCategory("STREAMING_TO_LAKE");

    /**
     * Enum STREAMING_TO_INDEX_LAKE for value: "STREAMING_TO_INDEX_LAKE"
     */
    public static final PipeCategory STREAMING_TO_INDEX_LAKE = new PipeCategory("STREAMING_TO_INDEX_LAKE");

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final PipeCategory STREAMING = new PipeCategory("STREAMING");

    private static final Map<String, PipeCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, PipeCategory> createStaticFields() {
        Map<String, PipeCategory> map = new HashMap<>();
        map.put("STREAMING_TO_INDEX", STREAMING_TO_INDEX);
        map.put("STREAMING_TO_LAKE", STREAMING_TO_LAKE);
        map.put("STREAMING_TO_INDEX_LAKE", STREAMING_TO_INDEX_LAKE);
        map.put("STREAMING", STREAMING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PipeCategory(String value) {
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
    public static PipeCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PipeCategory(value));
    }

    public static PipeCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PipeCategory) {
            return this.value.equals(((PipeCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
