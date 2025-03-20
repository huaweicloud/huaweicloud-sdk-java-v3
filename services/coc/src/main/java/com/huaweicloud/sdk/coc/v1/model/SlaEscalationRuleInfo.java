package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SLA上升规则
 */
public class SlaEscalationRuleInfo {

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
    @JsonProperty(value = "order")

    private Integer order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_obj_configuration")

    private List<NotificationObjConfiguration> notificationObjConfiguration = null;

    public SlaEscalationRuleInfo withDay(Integer day) {
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

    public SlaEscalationRuleInfo withHour(Integer hour) {
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

    public SlaEscalationRuleInfo withMinute(Integer minute) {
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

    public SlaEscalationRuleInfo withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * 顺序
     * minimum: 0
     * maximum: 5
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public SlaEscalationRuleInfo withProtocol(String protocol) {
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

    public SlaEscalationRuleInfo withNotificationObjConfiguration(
        List<NotificationObjConfiguration> notificationObjConfiguration) {
        this.notificationObjConfiguration = notificationObjConfiguration;
        return this;
    }

    public SlaEscalationRuleInfo addNotificationObjConfigurationItem(
        NotificationObjConfiguration notificationObjConfigurationItem) {
        if (this.notificationObjConfiguration == null) {
            this.notificationObjConfiguration = new ArrayList<>();
        }
        this.notificationObjConfiguration.add(notificationObjConfigurationItem);
        return this;
    }

    public SlaEscalationRuleInfo withNotificationObjConfiguration(
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
        SlaEscalationRuleInfo that = (SlaEscalationRuleInfo) obj;
        return Objects.equals(this.day, that.day) && Objects.equals(this.hour, that.hour)
            && Objects.equals(this.minute, that.minute) && Objects.equals(this.order, that.order)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.notificationObjConfiguration, that.notificationObjConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, hour, minute, order, protocol, notificationObjConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlaEscalationRuleInfo {\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
