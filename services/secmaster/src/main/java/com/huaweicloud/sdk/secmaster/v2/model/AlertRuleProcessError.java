package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 告警规则处理错误 - NONE 无  **约束限制** 不涉及 **取值范围**: - NONE  **默认值** 不涉及       
 */
public class AlertRuleProcessError {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final AlertRuleProcessError NONE = new AlertRuleProcessError("NONE");

    private static final Map<String, AlertRuleProcessError> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlertRuleProcessError> createStaticFields() {
        Map<String, AlertRuleProcessError> map = new HashMap<>();
        map.put("NONE", NONE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlertRuleProcessError(String value) {
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
    public static AlertRuleProcessError fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlertRuleProcessError(value));
    }

    public static AlertRuleProcessError valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlertRuleProcessError) {
            return this.value.equals(((AlertRuleProcessError) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
