package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 告警等级 - TIPS 提示 - LOW 低危 - MEDIUM 中危 - HIGH 高危 - FATAL 致命  **约束限制** 不涉及 **取值范围**: - TIPS - LOW - MEDIUM - HIGH - FATAL  **默认值** 不涉及
 */
public class Serverity {

    /**
     * Enum TIPS for value: "TIPS"
     */
    public static final Serverity TIPS = new Serverity("TIPS");

    /**
     * Enum LOW for value: "LOW"
     */
    public static final Serverity LOW = new Serverity("LOW");

    /**
     * Enum MEDIUM for value: "MEDIUM"
     */
    public static final Serverity MEDIUM = new Serverity("MEDIUM");

    /**
     * Enum HIGH for value: "HIGH"
     */
    public static final Serverity HIGH = new Serverity("HIGH");

    /**
     * Enum FATAL for value: "FATAL"
     */
    public static final Serverity FATAL = new Serverity("FATAL");

    private static final Map<String, Serverity> STATIC_FIELDS = createStaticFields();

    private static Map<String, Serverity> createStaticFields() {
        Map<String, Serverity> map = new HashMap<>();
        map.put("TIPS", TIPS);
        map.put("LOW", LOW);
        map.put("MEDIUM", MEDIUM);
        map.put("HIGH", HIGH);
        map.put("FATAL", FATAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Serverity(String value) {
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
    public static Serverity fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Serverity(value));
    }

    public static Serverity valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Serverity) {
            return this.value.equals(((Serverity) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
