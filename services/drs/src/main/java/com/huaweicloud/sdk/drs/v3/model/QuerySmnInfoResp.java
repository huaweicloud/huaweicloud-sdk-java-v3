package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 已录入SMN信息体
 */
public class QuerySmnInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<SubscriptionInfo> subscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Long delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_delay")

    private Long rtoDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_delay")

    private Long rpoDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_to_user")

    private Boolean alarmToUser;

    public QuerySmnInfoResp withSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public QuerySmnInfoResp addSubscriptionsItem(SubscriptionInfo subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public QuerySmnInfoResp withSubscriptions(Consumer<List<SubscriptionInfo>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * SMN信息
     * @return subscriptions
     */
    public List<SubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public QuerySmnInfoResp withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * 主题名称
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public QuerySmnInfoResp withDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 订阅延迟时间
     * @return delayTime
     */
    public Long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
    }

    public QuerySmnInfoResp withRtoDelay(Long rtoDelay) {
        this.rtoDelay = rtoDelay;
        return this;
    }

    /**
     * rto延迟时间
     * @return rtoDelay
     */
    public Long getRtoDelay() {
        return rtoDelay;
    }

    public void setRtoDelay(Long rtoDelay) {
        this.rtoDelay = rtoDelay;
    }

    public QuerySmnInfoResp withRpoDelay(Long rpoDelay) {
        this.rpoDelay = rpoDelay;
        return this;
    }

    /**
     * rpo延迟时间
     * @return rpoDelay
     */
    public Long getRpoDelay() {
        return rpoDelay;
    }

    public void setRpoDelay(Long rpoDelay) {
        this.rpoDelay = rpoDelay;
    }

    public QuerySmnInfoResp withAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
        return this;
    }

    /**
     * 异常告警是否通知用户
     * @return alarmToUser
     */
    public Boolean getAlarmToUser() {
        return alarmToUser;
    }

    public void setAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySmnInfoResp querySmnInfoResp = (QuerySmnInfoResp) o;
        return Objects.equals(this.subscriptions, querySmnInfoResp.subscriptions)
            && Objects.equals(this.topicName, querySmnInfoResp.topicName)
            && Objects.equals(this.delayTime, querySmnInfoResp.delayTime)
            && Objects.equals(this.rtoDelay, querySmnInfoResp.rtoDelay)
            && Objects.equals(this.rpoDelay, querySmnInfoResp.rpoDelay)
            && Objects.equals(this.alarmToUser, querySmnInfoResp.alarmToUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, topicName, delayTime, rtoDelay, rpoDelay, alarmToUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySmnInfoResp {\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    rtoDelay: ").append(toIndentedString(rtoDelay)).append("\n");
        sb.append("    rpoDelay: ").append(toIndentedString(rpoDelay)).append("\n");
        sb.append("    alarmToUser: ").append(toIndentedString(alarmToUser)).append("\n");
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
