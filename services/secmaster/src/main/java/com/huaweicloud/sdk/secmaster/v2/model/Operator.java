package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 操作符类型 - GT 大于 - LT 小于 - EQ 等于 - NE 不等于  **约束限制** 不涉及 **取值范围**: - GT - LT - EQ - NE  **默认值** 不涉及
 */
public class Operator {

    /**
     * Enum GT for value: "GT"
     */
    public static final Operator GT = new Operator("GT");

    /**
     * Enum LT for value: "LT"
     */
    public static final Operator LT = new Operator("LT");

    /**
     * Enum EQ for value: "EQ"
     */
    public static final Operator EQ = new Operator("EQ");

    /**
     * Enum NE for value: "NE"
     */
    public static final Operator NE = new Operator("NE");

    private static final Map<String, Operator> STATIC_FIELDS = createStaticFields();

    private static Map<String, Operator> createStaticFields() {
        Map<String, Operator> map = new HashMap<>();
        map.put("GT", GT);
        map.put("LT", LT);
        map.put("EQ", EQ);
        map.put("NE", NE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Operator(String value) {
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
    public static Operator fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Operator(value));
    }

    public static Operator valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Operator) {
            return this.value.equals(((Operator) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
