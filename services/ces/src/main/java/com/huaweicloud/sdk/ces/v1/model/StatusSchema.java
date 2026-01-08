package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释** 资源分组健康状态 **约束限制** 不涉及 **取值范围** - health: 表示无告警 - unhealth: 表示告警中 - no_alarm_rule: 表示未设置告警规则 **默认取值** 不涉及 
 */
public class StatusSchema {

    /**
     * Enum HEALTH for value: "health"
     */
    public static final StatusSchema HEALTH = new StatusSchema("health");

    /**
     * Enum UNHEALTH for value: "unhealth"
     */
    public static final StatusSchema UNHEALTH = new StatusSchema("unhealth");

    /**
     * Enum NO_ALARM_RULE for value: "no_alarm_rule"
     */
    public static final StatusSchema NO_ALARM_RULE = new StatusSchema("no_alarm_rule");

    private static final Map<String, StatusSchema> STATIC_FIELDS = createStaticFields();

    private static Map<String, StatusSchema> createStaticFields() {
        Map<String, StatusSchema> map = new HashMap<>();
        map.put("health", HEALTH);
        map.put("unhealth", UNHEALTH);
        map.put("no_alarm_rule", NO_ALARM_RULE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StatusSchema(String value) {
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
    public static StatusSchema fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusSchema(value));
    }

    public static StatusSchema valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StatusSchema) {
            return this.value.equals(((StatusSchema) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
