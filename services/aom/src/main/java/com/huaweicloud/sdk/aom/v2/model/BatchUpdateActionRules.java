package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchUpdateActionRules
 */
public class BatchUpdateActionRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private Long alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_name")

    private String alarmRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_type")

    private String alarmRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_notification_rule_id")

    private String bindNotificationRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_enable")

    private Boolean notificationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private String notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_resolved")

    private Boolean notifyResolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_triggered")

    private Boolean notifyTriggered;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_enable")

    private Boolean routeGroupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_group_rule")

    private String routeGroupRule;

    public BatchUpdateActionRules withAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则id。
     * @return alarmRuleId
     */
    public Long getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public BatchUpdateActionRules withAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
        return this;
    }

    /**
     * 告警规则名称。
     * @return alarmRuleName
     */
    public String getAlarmRuleName() {
        return alarmRuleName;
    }

    public void setAlarmRuleName(String alarmRuleName) {
        this.alarmRuleName = alarmRuleName;
    }

    public BatchUpdateActionRules withAlarmRuleType(String alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
        return this;
    }

    /**
     * 告警规则类型。
     * @return alarmRuleType
     */
    public String getAlarmRuleType() {
        return alarmRuleType;
    }

    public void setAlarmRuleType(String alarmRuleType) {
        this.alarmRuleType = alarmRuleType;
    }

    public BatchUpdateActionRules withBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
        return this;
    }

    /**
     * 待绑定的告警行动规则名称。
     * @return bindNotificationRuleId
     */
    public String getBindNotificationRuleId() {
        return bindNotificationRuleId;
    }

    public void setBindNotificationRuleId(String bindNotificationRuleId) {
        this.bindNotificationRuleId = bindNotificationRuleId;
    }

    public BatchUpdateActionRules withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 通知频率 - 当通知类型为“alarm_policy”时，填“-1” - 当通知类型为“direct”时，    - “0”：只告警一次    - “300”：每5分钟    - “600”：每10分钟    - “900”：每15分钟    - “1800”：每30分钟    - “3600”：每1小时    - “10800”：每3小时    - “21600”：每6小时    - “43200”：每12小时    - “86400”：每天
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public BatchUpdateActionRules withNotificationEnable(Boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
        return this;
    }

    /**
     * 是否启用告警通知规则。 - 当通知类型为“direct”时，填true - 当通知类型为“alarm_policy”时，填false 如果告警触发“notify_triggered”或告警恢复“notify_resolved”都设置为false（即都不进行告警通知），则notification_enable需设置为false。
     * @return notificationEnable
     */
    public Boolean getNotificationEnable() {
        return notificationEnable;
    }

    public void setNotificationEnable(Boolean notificationEnable) {
        this.notificationEnable = notificationEnable;
    }

    public BatchUpdateActionRules withNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * 通知类型。 - “direct”：直接告警 - “alarm_policy”：告警降噪
     * @return notificationType
     */
    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public BatchUpdateActionRules withNotifyResolved(Boolean notifyResolved) {
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

    public BatchUpdateActionRules withNotifyTriggered(Boolean notifyTriggered) {
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

    public BatchUpdateActionRules withRouteGroupEnable(Boolean routeGroupEnable) {
        this.routeGroupEnable = routeGroupEnable;
        return this;
    }

    /**
     * 启用告警分组规则。 - 当通知类型为“alarm_policy”时：true - 当通知类型为“direct”时：false 如果告警触发“notify_triggered”或告警恢复“notify_resolved”都设置为false（即都不进行告警通知），则route_group_enable需设置为false。
     * @return routeGroupEnable
     */
    public Boolean getRouteGroupEnable() {
        return routeGroupEnable;
    }

    public void setRouteGroupEnable(Boolean routeGroupEnable) {
        this.routeGroupEnable = routeGroupEnable;
    }

    public BatchUpdateActionRules withRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
        return this;
    }

    /**
     * 告警分组规则名称。 - 当route_group_enable 为true时，填告警分组规则名称 - 当route_group_enable 为false时，填“”
     * @return routeGroupRule
     */
    public String getRouteGroupRule() {
        return routeGroupRule;
    }

    public void setRouteGroupRule(String routeGroupRule) {
        this.routeGroupRule = routeGroupRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateActionRules that = (BatchUpdateActionRules) obj;
        return Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.alarmRuleName, that.alarmRuleName)
            && Objects.equals(this.alarmRuleType, that.alarmRuleType)
            && Objects.equals(this.bindNotificationRuleId, that.bindNotificationRuleId)
            && Objects.equals(this.frequency, that.frequency)
            && Objects.equals(this.notificationEnable, that.notificationEnable)
            && Objects.equals(this.notificationType, that.notificationType)
            && Objects.equals(this.notifyResolved, that.notifyResolved)
            && Objects.equals(this.notifyTriggered, that.notifyTriggered)
            && Objects.equals(this.routeGroupEnable, that.routeGroupEnable)
            && Objects.equals(this.routeGroupRule, that.routeGroupRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmRuleId,
            alarmRuleName,
            alarmRuleType,
            bindNotificationRuleId,
            frequency,
            notificationEnable,
            notificationType,
            notifyResolved,
            notifyTriggered,
            routeGroupEnable,
            routeGroupRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateActionRules {\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    alarmRuleName: ").append(toIndentedString(alarmRuleName)).append("\n");
        sb.append("    alarmRuleType: ").append(toIndentedString(alarmRuleType)).append("\n");
        sb.append("    bindNotificationRuleId: ").append(toIndentedString(bindNotificationRuleId)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    notificationEnable: ").append(toIndentedString(notificationEnable)).append("\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    notifyResolved: ").append(toIndentedString(notifyResolved)).append("\n");
        sb.append("    notifyTriggered: ").append(toIndentedString(notifyTriggered)).append("\n");
        sb.append("    routeGroupEnable: ").append(toIndentedString(routeGroupEnable)).append("\n");
        sb.append("    routeGroupRule: ").append(toIndentedString(routeGroupRule)).append("\n");
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
