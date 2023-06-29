package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 触发器的判断模式
 */
public class TriggerJudgeMode {

    /**
     * Enum GTE for value: "gte"
     */
    public static final TriggerJudgeMode GTE = new TriggerJudgeMode("gte");

    /**
     * Enum LTE for value: "lte"
     */
    public static final TriggerJudgeMode LTE = new TriggerJudgeMode("lte");

    /**
     * Enum GT for value: "gt"
     */
    public static final TriggerJudgeMode GT = new TriggerJudgeMode("gt");

    /**
     * Enum LT for value: "lt"
     */
    public static final TriggerJudgeMode LT = new TriggerJudgeMode("lt");

    /**
     * Enum LIKE for value: "like"
     */
    public static final TriggerJudgeMode LIKE = new TriggerJudgeMode("like");

    /**
     * Enum NOTLIKE for value: "notlike"
     */
    public static final TriggerJudgeMode NOTLIKE = new TriggerJudgeMode("notlike");

    /**
     * Enum EQUAL for value: "equal"
     */
    public static final TriggerJudgeMode EQUAL = new TriggerJudgeMode("equal");

    /**
     * Enum NOTEQUAL for value: "notequal"
     */
    public static final TriggerJudgeMode NOTEQUAL = new TriggerJudgeMode("notequal");

    private static final Map<String, TriggerJudgeMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, TriggerJudgeMode> createStaticFields() {
        Map<String, TriggerJudgeMode> map = new HashMap<>();
        map.put("gte", GTE);
        map.put("lte", LTE);
        map.put("gt", GT);
        map.put("lt", LT);
        map.put("like", LIKE);
        map.put("notlike", NOTLIKE);
        map.put("equal", EQUAL);
        map.put("notequal", NOTEQUAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TriggerJudgeMode(String value) {
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
    public static TriggerJudgeMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TriggerJudgeMode(value));
    }

    public static TriggerJudgeMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TriggerJudgeMode) {
            return this.value.equals(((TriggerJudgeMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
