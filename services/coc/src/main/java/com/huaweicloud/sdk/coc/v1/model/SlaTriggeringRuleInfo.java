package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SLA触发规则
 */
public class SlaTriggeringRuleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "day")

    private Integer day;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hour")

    private Integer hour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minute")

    private Integer minute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_ongoing_notification")

    private Boolean isOngoingNotification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_interval")

    private Integer notificationInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_obj_configuration")

    private List<NotificationObjConfiguration> notificationObjConfiguration = null;

    public SlaTriggeringRuleInfo withDay(Integer day) {
        this.day = day;
        return this;
    }

    /**
     * 天
     * minimum: 0
     * maximum: 60
     * @return day
     */
    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public SlaTriggeringRuleInfo withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 小时
     * minimum: 0
     * maximum: 23
     * @return hour
     */
    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public SlaTriggeringRuleInfo withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * 分钟
     * minimum: 0
     * maximum: 59
     * @return minute
     */
    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public SlaTriggeringRuleInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 通知类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SlaTriggeringRuleInfo withIsOngoingNotification(Boolean isOngoingNotification) {
        this.isOngoingNotification = isOngoingNotification;
        return this;
    }

    /**
     * 是否持续通知
     * @return isOngoingNotification
     */
    public Boolean getIsOngoingNotification() {
        return isOngoingNotification;
    }

    public void setIsOngoingNotification(Boolean isOngoingNotification) {
        this.isOngoingNotification = isOngoingNotification;
    }

    public SlaTriggeringRuleInfo withNotificationInterval(Integer notificationInterval) {
        this.notificationInterval = notificationInterval;
        return this;
    }

    /**
     * 通知间隔
     * minimum: 0
     * maximum: 2147483647
     * @return notificationInterval
     */
    public Integer getNotificationInterval() {
        return notificationInterval;
    }

    public void setNotificationInterval(Integer notificationInterval) {
        this.notificationInterval = notificationInterval;
    }

    public SlaTriggeringRuleInfo withNotificationObjConfiguration(
        List<NotificationObjConfiguration> notificationObjConfiguration) {
        this.notificationObjConfiguration = notificationObjConfiguration;
        return this;
    }

    public SlaTriggeringRuleInfo addNotificationObjConfigurationItem(
        NotificationObjConfiguration notificationObjConfigurationItem) {
        if (this.notificationObjConfiguration == null) {
            this.notificationObjConfiguration = new ArrayList<>();
        }
        this.notificationObjConfiguration.add(notificationObjConfigurationItem);
        return this;
    }

    public SlaTriggeringRuleInfo withNotificationObjConfiguration(
        Consumer<List<NotificationObjConfiguration>> notificationObjConfigurationSetter) {
        if (this.notificationObjConfiguration == null) {
            this.notificationObjConfiguration = new ArrayList<>();
        }
        notificationObjConfigurationSetter.accept(this.notificationObjConfiguration);
        return this;
    }

    /**
     * 通知配置
     * @return notificationObjConfiguration
     */
    public List<NotificationObjConfiguration> getNotificationObjConfiguration() {
        return notificationObjConfiguration;
    }

    public void setNotificationObjConfiguration(List<NotificationObjConfiguration> notificationObjConfiguration) {
        this.notificationObjConfiguration = notificationObjConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlaTriggeringRuleInfo that = (SlaTriggeringRuleInfo) obj;
        return Objects.equals(this.day, that.day) && Objects.equals(this.hour, that.hour)
            && Objects.equals(this.minute, that.minute) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.isOngoingNotification, that.isOngoingNotification)
            && Objects.equals(this.notificationInterval, that.notificationInterval)
            && Objects.equals(this.notificationObjConfiguration, that.notificationObjConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day,
            hour,
            minute,
            protocol,
            isOngoingNotification,
            notificationInterval,
            notificationObjConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlaTriggeringRuleInfo {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    isOngoingNotification: ").append(toIndentedString(isOngoingNotification)).append("\n");
        sb.append("    notificationInterval: ").append(toIndentedString(notificationInterval)).append("\n");
        sb.append("    notificationObjConfiguration: ")
            .append(toIndentedString(notificationObjConfiguration))
            .append("\n");
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
