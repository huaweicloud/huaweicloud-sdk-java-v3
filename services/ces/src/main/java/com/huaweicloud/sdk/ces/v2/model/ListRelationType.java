package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 屏蔽告警通知的实现方式。 **约束限制**： 不涉及。 **取值范围**： 枚举值，长度为[1,32]个字符，取值为: - ALARM_RULE：通过告警规则屏蔽告警通知。 - RESOURCE：通过资源屏蔽告警通知。使用方式：《告警屏蔽》页面点击《创建告警屏蔽》按钮，选择资源屏蔽。 - RESOURCE_POLICY_NOTIFICATION：通过告警策略屏蔽告警通知。使用方式：《告警屏蔽》页面点击《创建告警屏蔽》按钮，选择策略屏蔽。 - EVENT.SYS：屏蔽事件类告警通知。使用方式：《告警屏蔽》页面点击《创建告警屏蔽》按钮，选择事件屏蔽。 - RESOURCE_POLICY_ALARM：（已废弃，不推荐使用）通过屏蔽告警计算来屏蔽告警通知。 - DEFAULT：（已废弃，不推荐使用）默认包含RESOURCE、RESOURCE_POLICY_NOTIFICATION、EVENT.SYS **默认取值**： 不涉及。 
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
