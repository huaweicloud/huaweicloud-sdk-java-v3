package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改收件方式与信息体
 */
public class BatchSetAlarmNotifyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriptions")

    private List<SubscriptionInfo> subscriptions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

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

    public BatchSetAlarmNotifyInfo withSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    public BatchSetAlarmNotifyInfo addSubscriptionsItem(SubscriptionInfo subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public BatchSetAlarmNotifyInfo withSubscriptions(Consumer<List<SubscriptionInfo>> subscriptionsSetter) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 手动输入手机号、邮箱模式时填写
     * @return subscriptions
     */
    public List<SubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public BatchSetAlarmNotifyInfo withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 主题资源标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public BatchSetAlarmNotifyInfo withDelayTime(Long delayTime) {
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

    public BatchSetAlarmNotifyInfo withRtoDelay(Long rtoDelay) {
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

    public BatchSetAlarmNotifyInfo withRpoDelay(Long rpoDelay) {
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

    public BatchSetAlarmNotifyInfo withAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
        return this;
    }

    /**
     * 异常告警是否通知用户，不填默认为false
     * @return alarmToUser
     */
    public Boolean getAlarmToUser() {
        return alarmToUser;
    }

    public void setAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSetAlarmNotifyInfo that = (BatchSetAlarmNotifyInfo) obj;
        return Objects.equals(this.subscriptions, that.subscriptions) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.delayTime, that.delayTime) && Objects.equals(this.rtoDelay, that.rtoDelay)
            && Objects.equals(this.rpoDelay, that.rpoDelay) && Objects.equals(this.alarmToUser, that.alarmToUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, topicUrn, delayTime, rtoDelay, rpoDelay, alarmToUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSetAlarmNotifyInfo {\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
