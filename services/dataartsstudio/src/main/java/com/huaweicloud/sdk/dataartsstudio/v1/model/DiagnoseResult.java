package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 检测结果 * NO_RISK 无风险 * MEDIUM_RISK 中风险 * HIGH_RISK 高风险 * NOT_SCANNED 未扫描
 */
public class DiagnoseResult {

    /**
     * Enum NO_RISK for value: "NO_RISK"
     */
    public static final DiagnoseResult NO_RISK = new DiagnoseResult("NO_RISK");

    /**
     * Enum MEDIUM_RISK for value: "MEDIUM_RISK"
     */
    public static final DiagnoseResult MEDIUM_RISK = new DiagnoseResult("MEDIUM_RISK");

    /**
     * Enum HIGH_RISK for value: "HIGH_RISK"
     */
    public static final DiagnoseResult HIGH_RISK = new DiagnoseResult("HIGH_RISK");

    /**
     * Enum NOT_SCANNED for value: "NOT_SCANNED"
     */
    public static final DiagnoseResult NOT_SCANNED = new DiagnoseResult("NOT_SCANNED");

    private static final Map<String, DiagnoseResult> STATIC_FIELDS = createStaticFields();

    private static Map<String, DiagnoseResult> createStaticFields() {
        Map<String, DiagnoseResult> map = new HashMap<>();
        map.put("NO_RISK", NO_RISK);
        map.put("MEDIUM_RISK", MEDIUM_RISK);
        map.put("HIGH_RISK", HIGH_RISK);
        map.put("NOT_SCANNED", NOT_SCANNED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DiagnoseResult(String value) {
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
    public static DiagnoseResult fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DiagnoseResult(value));
    }

    public static DiagnoseResult valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DiagnoseResult) {
            return this.value.equals(((DiagnoseResult) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
