package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 告警规则通知模块。
 */
public class AlarmNotification {

    /**
     * 通知类型。 - “direct”：直接告警 - “alarm_policy”：告警降噪
     */
    public static final class NotificationTypeEnum {

        /**
         * Enum DIRECT for value: "direct"
         */
        public static final NotificationTypeEnum DIRECT = new NotificationTypeEnum("direct");

        /**
         * Enum ALARM_POLICY for value: "alarm_policy"
         */
        public static final NotificationTypeEnum ALARM_POLICY = new NotificationTypeEnum("alarm_policy");

        private static final Map<String, NotificationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationTypeEnum> createStaticFields() {
            Map<String, NotificationTypeEnum> map = new HashMap<>();
            map.put("direct", DIRECT);
            map.put("alarm_policy", ALARM_POLICY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationTypeEnum(String value) {
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
        public static NotificationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationTypeEnum(value));
        }

        public static NotificationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationTypeEnum) {
                return this.value.equals(((NotificationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private NotificationTypeEnum notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_enable")

    private Boolean routeGroupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_rule")

    private String routeGroupRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enable")

    private Boolean notificationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_notification_rule_id")

    private String bindNotificationRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_resolved")

    private Boolean notifyResolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_triggered")

    private Boolean notifyTriggered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_frequency")

    private Integer notifyFrequency;

    public AlarmNotification withNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * 通知类型。 - “direct”：直接告警 - “alarm_policy”：告警降噪
     * @return notificationType
     */
    public NotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
    }

    public AlarmNotification withRouteGroupEnable(Boolean routeGroupEnable) {
        this.routeGroupEnable = routeGroupEnable;
        return this;
    }

    /**
     * 启用分组规则。 - 当通知类型为“alarm_policy”时：true - 当通知类型为“direct”时：false
     * @return routeGroupEnable
     */
    public Boolean getRouteGroupEnable() {
        return routeGroupEnable;
    }

    public void setRouteGroupEnable(Boolean routeGroupEnable) {
        this.routeGroupEnable = routeGroupEnable;
    }

    public AlarmNotification withRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
        return this;
    }

    /**
     * 分组规则名称。 - 当route_group_enable 为true时，填分组规则名称 - 当route_group_enable 为false时，填“”
     * @return routeGroupRule
     */
    public String getRouteGroupRule() {
        return routeGroupRule;
    }

    public void setRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
    }

    public AlarmNotification withNotificationEnable(Boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
        return this;
    }

    /**
     * 是否启用告警行动规则。 - 当通知类型为“direct”时，填true - 当通知类型为“alarm_policy”时，填false
     * @return notificationEnable
     */
    public Boolean getNotificationEnable() {
        return notificationEnable;
    }

    public void setNotificationEnable(Boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
    }

    public AlarmNotification withBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
        return this;
    }

    /**
     * 告警行动策略id。 - 当notification_enable为true时，填告警行动策略id - 当notification_enable为false时，填“”
     * @return bindNotificationRuleId
     */
    public String getBindNotificationRuleId() {
        return bindNotificationRuleId;
    }

    public void setBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
    }

    public AlarmNotification withNotifyResolved(Boolean notifyResolved) {
        this.notifyResolved = notifyResolved;
        return this;
    }

    /**
     * 告警解决是否通知。 - true：通知 - false：不通知
     * @return notifyResolved
     */
    public Boolean getNotifyResolved() {
        return notifyResolved;
    }

    public void setNotifyResolved(Boolean notifyResolved) {
        this.notifyResolved = notifyResolved;
    }

    public AlarmNotification withNotifyTriggered(Boolean notifyTriggered) {
        this.notifyTriggered = notifyTriggered;
        return this;
    }

    /**
     * 告警触发是否通知。 - true：通知 - false：不通知
     * @return notifyTriggered
     */
    public Boolean getNotifyTriggered() {
        return notifyTriggered;
    }

    public void setNotifyTriggered(Boolean notifyTriggered) {
        this.notifyTriggered = notifyTriggered;
    }

    public AlarmNotification withNotifyFrequency(Integer notifyFrequency) {
        this.notifyFrequency = notifyFrequency;
        return this;
    }

    /**
     * 通知频率 - 当通知类型为“alarm_policy”时，填“-1” - 当通知类型为“direct”时，    - “0”：只告警一次    - “300”：每5分钟    - “600”：每10分钟    - “900”：每15分钟    - “1800”：每30分钟    - “3600”：每1小时    - “10800”：每3小时    - “21600”：每6小时    - “43200”：每12小时    - “86400”：每天
     * @return notifyFrequency
     */
    public Integer getNotifyFrequency() {
        return notifyFrequency;
    }

    public void setNotifyFrequency(Integer notifyFrequency) {
        this.notifyFrequency = notifyFrequency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmNotification that = (AlarmNotification) obj;
        return Objects.equals(this.notificationType, that.notificationType)
            && Objects.equals(this.routeGroupEnable, that.routeGroupEnable)
            && Objects.equals(this.routeGroupRule, that.routeGroupRule)
            && Objects.equals(this.notificationEnable, that.notificationEnable)
            && Objects.equals(this.bindNotificationRuleId, that.bindNotificationRuleId)
            && Objects.equals(this.notifyResolved, that.notifyResolved)
            && Objects.equals(this.notifyTriggered, that.notifyTriggered)
            && Objects.equals(this.notifyFrequency, that.notifyFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationType,
            routeGroupEnable,
            routeGroupRule,
            notificationEnable,
            bindNotificationRuleId,
            notifyResolved,
            notifyTriggered,
            notifyFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmNotification {\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    routeGroupEnable: ").append(toIndentedString(routeGroupEnable)).append("\n");
        sb.append("    routeGroupRule: ").append(toIndentedString(routeGroupRule)).append("\n");
        sb.append("    notificationEnable: ").append(toIndentedString(notificationEnable)).append("\n");
        sb.append("    bindNotificationRuleId: ").append(toIndentedString(bindNotificationRuleId)).append("\n");
        sb.append("    notifyResolved: ").append(toIndentedString(notifyResolved)).append("\n");
        sb.append("    notifyTriggered: ").append(toIndentedString(notifyTriggered)).append("\n");
        sb.append("    notifyFrequency: ").append(toIndentedString(notifyFrequency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
