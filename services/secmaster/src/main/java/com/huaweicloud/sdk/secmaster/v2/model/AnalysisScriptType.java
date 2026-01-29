package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 分析脚本类型 - SEC_MASTER_SQL 安全云脑SQL - RETRIEVE_SQL 检索SQL  **约束限制** 不涉及 **取值范围**: - SEC_MASTER_SQL - RETRIEVE_SQL  **默认值** 不涉及
 */
public class AnalysisScriptType {

    /**
     * Enum SEC_MASTER_SQL for value: "SEC_MASTER_SQL"
     */
    public static final AnalysisScriptType SEC_MASTER_SQL = new AnalysisScriptType("SEC_MASTER_SQL");

    /**
     * Enum RETRIEVE_SQL for value: "RETRIEVE_SQL"
     */
    public static final AnalysisScriptType RETRIEVE_SQL = new AnalysisScriptType("RETRIEVE_SQL");

    private static final Map<String, AnalysisScriptType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AnalysisScriptType> createStaticFields() {
        Map<String, AnalysisScriptType> map = new HashMap<>();
        map.put("SEC_MASTER_SQL", SEC_MASTER_SQL);
        map.put("RETRIEVE_SQL", RETRIEVE_SQL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AnalysisScriptType(String value) {
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
    public static AnalysisScriptType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AnalysisScriptType(value));
    }

    public static AnalysisScriptType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AnalysisScriptType) {
            return this.value.equals(((AnalysisScriptType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
