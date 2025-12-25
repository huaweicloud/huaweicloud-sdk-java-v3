package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 环境类型 - PROD 生产环境 - TEST 测试环境  **约束限制** 不涉及 **取值范围**: - PROD - TEST  **默认值** 不涉及     
 */
public class AlertRuleEnvironment {

    /**
     * Enum PROD for value: "PROD"
     */
    public static final AlertRuleEnvironment PROD = new AlertRuleEnvironment("PROD");

    /**
     * Enum TEST for value: "TEST"
     */
    public static final AlertRuleEnvironment TEST = new AlertRuleEnvironment("TEST");

    private static final Map<String, AlertRuleEnvironment> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlertRuleEnvironment> createStaticFields() {
        Map<String, AlertRuleEnvironment> map = new HashMap<>();
        map.put("PROD", PROD);
        map.put("TEST", TEST);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlertRuleEnvironment(String value) {
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
    public static AlertRuleEnvironment fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlertRuleEnvironment(value));
    }

    public static AlertRuleEnvironment valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlertRuleEnvironment) {
            return this.value.equals(((AlertRuleEnvironment) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
