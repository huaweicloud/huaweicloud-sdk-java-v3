package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释** 资源分组健康状态 **取值范围** - health: 表示无告警 - unhealth: 表示告警中 - no_alarm_rule: 表示未设置告警规则 
 */
public class StatusSchemaResp {

    /**
     * Enum HEALTH for value: "health"
     */
    public static final StatusSchemaResp HEALTH = new StatusSchemaResp("health");

    /**
     * Enum UNHEALTH for value: "unhealth"
     */
    public static final StatusSchemaResp UNHEALTH = new StatusSchemaResp("unhealth");

    /**
     * Enum NO_ALARM_RULE for value: "no_alarm_rule"
     */
    public static final StatusSchemaResp NO_ALARM_RULE = new StatusSchemaResp("no_alarm_rule");

    private static final Map<String, StatusSchemaResp> STATIC_FIELDS = createStaticFields();

    private static Map<String, StatusSchemaResp> createStaticFields() {
        Map<String, StatusSchemaResp> map = new HashMap<>();
        map.put("health", HEALTH);
        map.put("unhealth", UNHEALTH);
        map.put("no_alarm_rule", NO_ALARM_RULE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StatusSchemaResp(String value) {
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
    public static StatusSchemaResp fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusSchemaResp(value));
    }

    public static StatusSchemaResp valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StatusSchemaResp) {
            return this.value.equals(((StatusSchemaResp) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
