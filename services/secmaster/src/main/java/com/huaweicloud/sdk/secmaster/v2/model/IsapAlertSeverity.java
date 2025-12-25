package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及  
 */
public class IsapAlertSeverity {

    /**
     * Enum TIPS for value: "TIPS"
     */
    public static final IsapAlertSeverity TIPS = new IsapAlertSeverity("TIPS");

    /**
     * Enum LOW for value: "LOW"
     */
    public static final IsapAlertSeverity LOW = new IsapAlertSeverity("LOW");

    /**
     * Enum MEDIUM for value: "MEDIUM"
     */
    public static final IsapAlertSeverity MEDIUM = new IsapAlertSeverity("MEDIUM");

    /**
     * Enum HIGH for value: "HIGH"
     */
    public static final IsapAlertSeverity HIGH = new IsapAlertSeverity("HIGH");

    /**
     * Enum FATAL for value: "FATAL"
     */
    public static final IsapAlertSeverity FATAL = new IsapAlertSeverity("FATAL");

    private static final Map<String, IsapAlertSeverity> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapAlertSeverity> createStaticFields() {
        Map<String, IsapAlertSeverity> map = new HashMap<>();
        map.put("TIPS", TIPS);
        map.put("LOW", LOW);
        map.put("MEDIUM", MEDIUM);
        map.put("HIGH", HIGH);
        map.put("FATAL", FATAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapAlertSeverity(String value) {
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
    public static IsapAlertSeverity fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapAlertSeverity(value));
    }

    public static IsapAlertSeverity valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapAlertSeverity) {
            return this.value.equals(((IsapAlertSeverity) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
