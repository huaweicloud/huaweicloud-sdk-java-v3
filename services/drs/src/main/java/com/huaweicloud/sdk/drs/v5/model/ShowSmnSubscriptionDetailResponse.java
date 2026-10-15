package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSmnSubscriptionDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Integer delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_delay")

    private Integer rpoDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_delay")

    private Integer rtoDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_alarm_user")

    private Boolean isAlarmUser;

    public ShowSmnSubscriptionDetailResponse withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * SMN主题名称
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ShowSmnSubscriptionDetailResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * SMN主题的唯一资源标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ShowSmnSubscriptionDetailResponse withDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 延迟时间，单位秒
     * @return delayTime
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public ShowSmnSubscriptionDetailResponse withRpoDelay(Integer rpoDelay) {
        this.rpoDelay = rpoDelay;
        return this;
    }

    /**
     * RPO延迟时间，单位秒
     * @return rpoDelay
     */
    public Integer getRpoDelay() {
        return rpoDelay;
    }

    public void setRpoDelay(Integer rpoDelay) {
        this.rpoDelay = rpoDelay;
    }

    public ShowSmnSubscriptionDetailResponse withRtoDelay(Integer rtoDelay) {
        this.rtoDelay = rtoDelay;
        return this;
    }

    /**
     * RTO延迟时间，单位秒
     * @return rtoDelay
     */
    public Integer getRtoDelay() {
        return rtoDelay;
    }

    public void setRtoDelay(Integer rtoDelay) {
        this.rtoDelay = rtoDelay;
    }

    public ShowSmnSubscriptionDetailResponse withIsAlarmUser(Boolean isAlarmUser) {
        this.isAlarmUser = isAlarmUser;
        return this;
    }

    /**
     * 是否发送告警给订阅用户
     * @return isAlarmUser
     */
    public Boolean getIsAlarmUser() {
        return isAlarmUser;
    }

    public void setIsAlarmUser(Boolean isAlarmUser) {
        this.isAlarmUser = isAlarmUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSmnSubscriptionDetailResponse that = (ShowSmnSubscriptionDetailResponse) obj;
        return Objects.equals(this.topicName, that.topicName) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.delayTime, that.delayTime) && Objects.equals(this.rpoDelay, that.rpoDelay)
            && Objects.equals(this.rtoDelay, that.rtoDelay) && Objects.equals(this.isAlarmUser, that.isAlarmUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicName, topicUrn, delayTime, rpoDelay, rtoDelay, isAlarmUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSmnSubscriptionDetailResponse {\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    rpoDelay: ").append(toIndentedString(rpoDelay)).append("\n");
        sb.append("    rtoDelay: ").append(toIndentedString(rtoDelay)).append("\n");
        sb.append("    isAlarmUser: ").append(toIndentedString(isAlarmUser)).append("\n");
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
