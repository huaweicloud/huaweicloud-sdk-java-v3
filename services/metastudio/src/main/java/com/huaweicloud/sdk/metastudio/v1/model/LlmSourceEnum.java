package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用的大语言模型来源 * LLM_CONFIG：大语言模型配置 * DEEP_SEEK：内置的DEEPSEEK
 */
public class LlmSourceEnum {

    /**
     * Enum LLM_CONFIG for value: "LLM_CONFIG"
     */
    public static final LlmSourceEnum LLM_CONFIG = new LlmSourceEnum("LLM_CONFIG");

    /**
     * Enum DEEP_SEEK for value: "DEEP_SEEK"
     */
    public static final LlmSourceEnum DEEP_SEEK = new LlmSourceEnum("DEEP_SEEK");

    private static final Map<String, LlmSourceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, LlmSourceEnum> createStaticFields() {
        Map<String, LlmSourceEnum> map = new HashMap<>();
        map.put("LLM_CONFIG", LLM_CONFIG);
        map.put("DEEP_SEEK", DEEP_SEEK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LlmSourceEnum(String value) {
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
    public static LlmSourceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LlmSourceEnum(value));
    }

    public static LlmSourceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LlmSourceEnum) {
            return this.value.equals(((LlmSourceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
