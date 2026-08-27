package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * API协议类型（OpenAI/Anthropic）。
 */
public class ApiType {

    /**
     * Enum OPENAI for value: "OpenAI"
     */
    public static final ApiType OPENAI = new ApiType("OpenAI");

    /**
     * Enum ANTHROPIC for value: "Anthropic"
     */
    public static final ApiType ANTHROPIC = new ApiType("Anthropic");

    private static final Map<String, ApiType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApiType> createStaticFields() {
        Map<String, ApiType> map = new HashMap<>();
        map.put("OpenAI", OPENAI);
        map.put("Anthropic", ANTHROPIC);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApiType(String value) {
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
    public static ApiType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApiType(value));
    }

    public static ApiType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApiType) {
            return this.value.equals(((ApiType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
