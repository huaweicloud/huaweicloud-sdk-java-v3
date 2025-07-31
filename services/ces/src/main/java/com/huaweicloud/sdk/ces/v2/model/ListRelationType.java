package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 屏蔽告警通知或者屏蔽告警计算的实现方式。ALARM_RULE：通过告警规则屏蔽告警通知，RESOURCE：通过资源屏蔽告警通知，RESOURCE_POLICY_NOTIFICATION：通过告警策略和告警资源屏蔽告警通知，RESOURCE_POLICY_ALARM：通过告警策略和告警资源屏蔽计算告警，DEFAULT：默认包含RESOURCE、RESOURCE_POLICY_NOTIFICATION（查询告警屏蔽列表时使用）。
 */
public class ListRelationType {

    /**
     * Enum ALARM_RULE for value: "ALARM_RULE"
     */
    public static final ListRelationType ALARM_RULE = new ListRelationType("ALARM_RULE");

    /**
     * Enum RESOURCE for value: "RESOURCE"
     */
    public static final ListRelationType RESOURCE = new ListRelationType("RESOURCE");

    /**
     * Enum RESOURCE_POLICY_NOTIFICATION for value: "RESOURCE_POLICY_NOTIFICATION"
     */
    public static final ListRelationType RESOURCE_POLICY_NOTIFICATION =
        new ListRelationType("RESOURCE_POLICY_NOTIFICATION");

    /**
     * Enum RESOURCE_POLICY_ALARM for value: "RESOURCE_POLICY_ALARM"
     */
    public static final ListRelationType RESOURCE_POLICY_ALARM = new ListRelationType("RESOURCE_POLICY_ALARM");

    /**
     * Enum DEFAULT for value: "DEFAULT"
     */
    public static final ListRelationType DEFAULT = new ListRelationType("DEFAULT");

    private static final Map<String, ListRelationType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ListRelationType> createStaticFields() {
        Map<String, ListRelationType> map = new HashMap<>();
        map.put("ALARM_RULE", ALARM_RULE);
        map.put("RESOURCE", RESOURCE);
        map.put("RESOURCE_POLICY_NOTIFICATION", RESOURCE_POLICY_NOTIFICATION);
        map.put("RESOURCE_POLICY_ALARM", RESOURCE_POLICY_ALARM);
        map.put("DEFAULT", DEFAULT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ListRelationType(String value) {
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
    public static ListRelationType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ListRelationType(value));
    }

    public static ListRelationType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListRelationType) {
            return this.value.equals(((ListRelationType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
