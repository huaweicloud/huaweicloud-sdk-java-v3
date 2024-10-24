package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 模型的类型，可选值： - LLM_MODEL：大语言模型
 */
public class ModelType {

    /**
     * Enum LLM_MODEL for value: "LLM_MODEL"
     */
    public static final ModelType LLM_MODEL = new ModelType("LLM_MODEL");

    private static final Map<String, ModelType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ModelType> createStaticFields() {
        Map<String, ModelType> map = new HashMap<>();
        map.put("LLM_MODEL", LLM_MODEL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ModelType(String value) {
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
    public static ModelType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelType(value));
    }

    public static ModelType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ModelType) {
            return this.value.equals(((ModelType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
