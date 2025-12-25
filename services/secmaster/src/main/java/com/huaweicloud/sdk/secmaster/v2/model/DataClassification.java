package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 数据分类 - FACTUAL_DATA 事实数据 - DIMENSION_DATA 维度数据  **约束限制** 不涉及 **取值范围**: - FACTUAL_DATA - DIMENSION_DATA  **默认值** 不涉及      
 */
public class DataClassification {

    /**
     * Enum FACTUAL_DATA for value: "FACTUAL_DATA"
     */
    public static final DataClassification FACTUAL_DATA = new DataClassification("FACTUAL_DATA");

    /**
     * Enum DIMENSION_DATA for value: "DIMENSION_DATA"
     */
    public static final DataClassification DIMENSION_DATA = new DataClassification("DIMENSION_DATA");

    private static final Map<String, DataClassification> STATIC_FIELDS = createStaticFields();

    private static Map<String, DataClassification> createStaticFields() {
        Map<String, DataClassification> map = new HashMap<>();
        map.put("FACTUAL_DATA", FACTUAL_DATA);
        map.put("DIMENSION_DATA", DIMENSION_DATA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DataClassification(String value) {
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
    public static DataClassification fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataClassification(value));
    }

    public static DataClassification valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataClassification) {
            return this.value.equals(((DataClassification) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
