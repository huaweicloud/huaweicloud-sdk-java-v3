package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.drs.v3.model.SubscriptionInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 异常通知信息
 */
public class AlarmNotifyInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay_time")
    
    private Long delayTime = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rto_delay")
    
    private Long rtoDelay = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rpo_delay")
    
    private Long rpoDelay = 0l;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_to_user")
    
    private Boolean alarmToUser = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subscriptions")
    
    private List<SubscriptionInfo> subscriptions = null;
    
    public AlarmNotifyInfo withDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    


    /**
     * 订阅延迟时间(单位为s)
     * minimum: 1
     * maximum: 3600
     * @return delayTime
     */
    public Long getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
    }

    public AlarmNotifyInfo withRtoDelay(Long rtoDelay) {
        this.rtoDelay = rtoDelay;
        return this;
    }

    


    /**
     * rto延迟时间
     * minimum: 1
     * maximum: 3600
     * @return rtoDelay
     */
    public Long getRtoDelay() {
        return rtoDelay;
    }

    public void setRtoDelay(Long rtoDelay) {
        this.rtoDelay = rtoDelay;
    }

    public AlarmNotifyInfo withRpoDelay(Long rpoDelay) {
        this.rpoDelay = rpoDelay;
        return this;
    }

    


    /**
     * rpo延迟时间
     * minimum: 1
     * maximum: 3600
     * @return rpoDelay
     */
    public Long getRpoDelay() {
        return rpoDelay;
    }

    public void setRpoDelay(Long rpoDelay) {
        this.rpoDelay = rpoDelay;
    }

    public AlarmNotifyInfo withAlarmToUser(Boolean alarmToUser) {
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

    public AlarmNotifyInfo withSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    
    public AlarmNotifyInfo addSubscriptionsItem(SubscriptionInfo subscriptionsItem) {
        if (this.subscriptions == null) {
            this.subscriptions = new ArrayList<>();
        }
        this.subscriptions.add(subscriptionsItem);
        return this;
    }

    public AlarmNotifyInfo withSubscriptions(Consumer<List<SubscriptionInfo>> subscriptionsSetter) {
        if(this.subscriptions == null ){
            this.subscriptions = new ArrayList<>();
        }
        subscriptionsSetter.accept(this.subscriptions);
        return this;
    }

    /**
     * 收件方式与信息体
     * @return subscriptions
     */
    public List<SubscriptionInfo> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionInfo> subscriptions) {
        this.subscriptions = subscriptions;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlarmNotifyInfo alarmNotifyInfo = (AlarmNotifyInfo) o;
        return Objects.equals(this.delayTime, alarmNotifyInfo.delayTime) &&
            Objects.equals(this.rtoDelay, alarmNotifyInfo.rtoDelay) &&
            Objects.equals(this.rpoDelay, alarmNotifyInfo.rpoDelay) &&
            Objects.equals(this.alarmToUser, alarmNotifyInfo.alarmToUser) &&
            Objects.equals(this.subscriptions, alarmNotifyInfo.subscriptions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(delayTime, rtoDelay, rpoDelay, alarmToUser, subscriptions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmNotifyInfo {\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    rtoDelay: ").append(toIndentedString(rtoDelay)).append("\n");
        sb.append("    rpoDelay: ").append(toIndentedString(rpoDelay)).append("\n");
        sb.append("    alarmToUser: ").append(toIndentedString(alarmToUser)).append("\n");
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

