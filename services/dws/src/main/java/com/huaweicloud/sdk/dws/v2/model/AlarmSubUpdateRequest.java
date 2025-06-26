package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmSubUpdateRequest
 */
public class AlarmSubUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Integer enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target")

    private String notificationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_type")

    private String notificationTargetType;

    public AlarmSubUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 告警订阅名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmSubUpdateRequest withEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 是否开启订阅。 **取值范围**： 不涉及。
     * @return enable
     */
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public AlarmSubUpdateRequest withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释**： 告警级别。 **取值范围**： 不涉及。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    public AlarmSubUpdateRequest withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * **参数解释**： 消息主题地址。 **取值范围**： 不涉及。
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public AlarmSubUpdateRequest withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * **参数解释**： 消息主题名称。 **取值范围**： 不涉及。
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public AlarmSubUpdateRequest withNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
        return this;
    }

    /**
     * **参数解释**： 消息主题类型，支持SMN。 **取值范围**： 不涉及。
     * @return notificationTargetType
     */
    public String getNotificationTargetType() {
        return notificationTargetType;
    }

    public void setNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmSubUpdateRequest that = (AlarmSubUpdateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.alarmLevel, that.alarmLevel)
            && Objects.equals(this.notificationTarget, that.notificationTarget)
            && Objects.equals(this.notificationTargetName, that.notificationTargetName)
            && Objects.equals(this.notificationTargetType, that.notificationTargetType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, enable, alarmLevel, notificationTarget, notificationTargetName, notificationTargetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmSubUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
        sb.append("    notificationTarget: ").append(toIndentedString(notificationTarget)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetType: ").append(toIndentedString(notificationTargetType)).append("\n");
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
