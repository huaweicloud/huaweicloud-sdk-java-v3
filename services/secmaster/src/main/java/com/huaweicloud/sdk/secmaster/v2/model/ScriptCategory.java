package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 脚本分类 - RETRIEVE 检索 - ANALYSIS 分析  **约束限制** 不涉及 **取值范围**: - RETRIEVE - ANALYSIS  **默认值** 不涉及          
 */
public class ScriptCategory {

    /**
     * Enum RETRIEVE for value: "RETRIEVE"
     */
    public static final ScriptCategory RETRIEVE = new ScriptCategory("RETRIEVE");

    /**
     * Enum ANALYSIS for value: "ANALYSIS"
     */
    public static final ScriptCategory ANALYSIS = new ScriptCategory("ANALYSIS");

    private static final Map<String, ScriptCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, ScriptCategory> createStaticFields() {
        Map<String, ScriptCategory> map = new HashMap<>();
        map.put("RETRIEVE", RETRIEVE);
        map.put("ANALYSIS", ANALYSIS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ScriptCategory(String value) {
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
    public static ScriptCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScriptCategory(value));
    }

    public static ScriptCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ScriptCategory) {
            return this.value.equals(((ScriptCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
