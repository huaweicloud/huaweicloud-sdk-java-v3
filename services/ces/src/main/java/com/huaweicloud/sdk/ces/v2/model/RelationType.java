package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 屏蔽告警通知的实现方式。 **约束限制**： 不涉及。 **取值范围**： - ALARM_RULE：通过告警规则屏蔽告警通知(不支持通过该接口修改，请通过接口“[批量设置告警通知屏蔽规则](BatchUpdateNotificationMasks.xml)”设置)。 - RESOURCE：通过资源屏蔽告警通知。 - RESOURCE_POLICY_NOTIFICATION：通过告警策略屏蔽告警通知。 - EVENT.SYS: 通过事件来蔽告警通知。 - RESOURCE_POLICY_ALARM：（已废弃）通过屏蔽告警计算来屏蔽告警通知。 **默认取值**： 不涉及。 
 */
public class RelationType {

    /**
     * Enum ALARM_RULE for value: "ALARM_RULE"
     */
    public static final RelationType ALARM_RULE = new RelationType("ALARM_RULE");

    /**
     * Enum RESOURCE for value: "RESOURCE"
     */
    public static final RelationType RESOURCE = new RelationType("RESOURCE");

    /**
     * Enum RESOURCE_POLICY_NOTIFICATION for value: "RESOURCE_POLICY_NOTIFICATION"
     */
    public static final RelationType RESOURCE_POLICY_NOTIFICATION = new RelationType("RESOURCE_POLICY_NOTIFICATION");

    /**
     * Enum RESOURCE_POLICY_ALARM for value: "RESOURCE_POLICY_ALARM"
     */
    public static final RelationType RESOURCE_POLICY_ALARM = new RelationType("RESOURCE_POLICY_ALARM");

    /**
     * Enum EVENT_SYS for value: "EVENT.SYS"
     */
    public static final RelationType EVENT_SYS = new RelationType("EVENT.SYS");

    private static final Map<String, RelationType> STATIC_FIELDS = createStaticFields();

    private static Map<String, RelationType> createStaticFields() {
        Map<String, RelationType> map = new HashMap<>();
        map.put("ALARM_RULE", ALARM_RULE);
        map.put("RESOURCE", RESOURCE);
        map.put("RESOURCE_POLICY_NOTIFICATION", RESOURCE_POLICY_NOTIFICATION);
        map.put("RESOURCE_POLICY_ALARM", RESOURCE_POLICY_ALARM);
        map.put("EVENT.SYS", EVENT_SYS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    RelationType(String value) {
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
    public static RelationType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RelationType(value));
    }

    public static RelationType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RelationType) {
            return this.value.equals(((RelationType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
