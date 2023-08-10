package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建配体相似度图的模式：中心模式
 */
public class LigandSimilarityGraphMode {

    /**
     * Enum CENTER for value: "CENTER"
     */
    public static final LigandSimilarityGraphMode CENTER = new LigandSimilarityGraphMode("CENTER");

    private static final Map<String, LigandSimilarityGraphMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, LigandSimilarityGraphMode> createStaticFields() {
        Map<String, LigandSimilarityGraphMode> map = new HashMap<>();
        map.put("CENTER", CENTER);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LigandSimilarityGraphMode(String value) {
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
    public static LigandSimilarityGraphMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LigandSimilarityGraphMode(value));
    }

    public static LigandSimilarityGraphMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LigandSimilarityGraphMode) {
            return this.value.equals(((LigandSimilarityGraphMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
