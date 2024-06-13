package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlertLevel
 */
public class AlertLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_channel")

    private List<String> alertChannel = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertGroups")

    private List<AlertGroup> alertGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertTemplateId")

    private String alertTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertTimes")

    private Integer alertTimes;

    public AlertLevel withAlertChannel(List<String> alertChannel) {
        this.alertChannel = alertChannel;
        return this;
    }

    public AlertLevel addAlertChannelItem(String alertChannelItem) {
        if (this.alertChannel == null) {
            this.alertChannel = new ArrayList<>();
        }
        this.alertChannel.add(alertChannelItem);
        return this;
    }

    public AlertLevel withAlertChannel(Consumer<List<String>> alertChannelSetter) {
        if (this.alertChannel == null) {
            this.alertChannel = new ArrayList<>();
        }
        alertChannelSetter.accept(this.alertChannel);
        return this;
    }

    /**
     * 告警渠道列表
     * @return alertChannel
     */
    public List<String> getAlertChannel() {
        return alertChannel;
    }

    public void setAlertChannel(List<String> alertChannel) {
        this.alertChannel = alertChannel;
    }

    public AlertLevel withAlertGroups(List<AlertGroup> alertGroups) {
        this.alertGroups = alertGroups;
        return this;
    }

    public AlertLevel addAlertGroupsItem(AlertGroup alertGroupsItem) {
        if (this.alertGroups == null) {
            this.alertGroups = new ArrayList<>();
        }
        this.alertGroups.add(alertGroupsItem);
        return this;
    }

    public AlertLevel withAlertGroups(Consumer<List<AlertGroup>> alertGroupsSetter) {
        if (this.alertGroups == null) {
            this.alertGroups = new ArrayList<>();
        }
        alertGroupsSetter.accept(this.alertGroups);
        return this;
    }

    /**
     * 告警组列表
     * @return alertGroups
     */
    public List<AlertGroup> getAlertGroups() {
        return alertGroups;
    }

    public void setAlertGroups(List<AlertGroup> alertGroups) {
        this.alertGroups = alertGroups;
    }

    public AlertLevel withAlertTemplateId(String alertTemplateId) {
        this.alertTemplateId = alertTemplateId;
        return this;
    }

    /**
     * 告警模板ID
     * @return alertTemplateId
     */
    public String getAlertTemplateId() {
        return alertTemplateId;
    }

    public void setAlertTemplateId(String alertTemplateId) {
        this.alertTemplateId = alertTemplateId;
    }

    public AlertLevel withAlertTimes(Integer alertTimes) {
        this.alertTimes = alertTimes;
        return this;
    }

    /**
     * 告警次数
     * @return alertTimes
     */
    public Integer getAlertTimes() {
        return alertTimes;
    }

    public void setAlertTimes(Integer alertTimes) {
        this.alertTimes = alertTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertLevel that = (AlertLevel) obj;
        return Objects.equals(this.alertChannel, that.alertChannel)
            && Objects.equals(this.alertGroups, that.alertGroups)
            && Objects.equals(this.alertTemplateId, that.alertTemplateId)
            && Objects.equals(this.alertTimes, that.alertTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertChannel, alertGroups, alertTemplateId, alertTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertLevel {\n");
        sb.append("    alertChannel: ").append(toIndentedString(alertChannel)).append("\n");
        sb.append("    alertGroups: ").append(toIndentedString(alertGroups)).append("\n");
        sb.append("    alertTemplateId: ").append(toIndentedString(alertTemplateId)).append("\n");
        sb.append("    alertTimes: ").append(toIndentedString(alertTimes)).append("\n");
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
