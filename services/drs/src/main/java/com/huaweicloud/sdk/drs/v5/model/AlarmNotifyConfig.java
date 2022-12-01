package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 异常通知信息设置信息体。配置该参数时，代表当任务状态异常时，系统将发送通知给指定的SMN Topic。
 */
public class AlarmNotifyConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_to_user")

    private Boolean alarmToUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_time")

    private Long delayTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rpo_delay")

    private Long rpoDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rto_delay")

    private Long rtoDelay;

    public AlarmNotifyConfig withAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
        return this;
    }

    /**
     * 异常告警是否通知用户。
     * @return alarmToUser
     */
    public Boolean getAlarmToUser() {
        return alarmToUser;
    }

    public void setAlarmToUser(Boolean alarmToUser) {
        this.alarmToUser = alarmToUser;
    }

    public AlarmNotifyConfig withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * SMN主题URN。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AlarmNotifyConfig withDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /**
     * 时延阈值(单位为s)。取值： - 最小值：1 - 最大值：3600 - 缺省值：0 - 说明： 1.源数据库和目标数据库之间的同步有时会存在一个时间差，称为时延，单位为秒。 2.时延阈值设置是指时延超过一定的值并持续6分钟后，DRS可以发送通知给指定收件人。（初次进入增量迁移阶段，会有较多数据等待同步，存在较大的时延，属于正常情况，不在此功能的监控范围之内。） 3.只有全量+增量的任务支持此选项。
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

    public AlarmNotifyConfig withRpoDelay(Long rpoDelay) {
        this.rpoDelay = rpoDelay;
        return this;
    }

    /**
     * RPO时延阈值(单位为s)。取值： - 最小值：1 - 最大值：3600 - 缺省值：0 - 说明： RPO时延阈值设置是业务数据库与DRS实例间同步的时延超过一定的值并持续6分钟后，DRS可以发送通知给指定收件人。（初次进入增量灾备阶段，会有较多数据等待同步，存在较大的时延，属于正常情况，不在此功能的监控范围之内。）
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

    public AlarmNotifyConfig withRtoDelay(Long rtoDelay) {
        this.rtoDelay = rtoDelay;
        return this;
    }

    /**
     * RTO时延阈值(s)。取值： - 最小值：1 - 最大值：3600 - 缺省值：0 - 说明： RTO时延阈值设置是DRS实例与灾备数据库间同步的时延超过一定的值并持续6分钟后，DRS可以发送通知给指定收件人。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlarmNotifyConfig alarmNotifyConfig = (AlarmNotifyConfig) o;
        return Objects.equals(this.alarmToUser, alarmNotifyConfig.alarmToUser)
            && Objects.equals(this.topicUrn, alarmNotifyConfig.topicUrn)
            && Objects.equals(this.delayTime, alarmNotifyConfig.delayTime)
            && Objects.equals(this.rpoDelay, alarmNotifyConfig.rpoDelay)
            && Objects.equals(this.rtoDelay, alarmNotifyConfig.rtoDelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmToUser, topicUrn, delayTime, rpoDelay, rtoDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmNotifyConfig {\n");
        sb.append("    alarmToUser: ").append(toIndentedString(alarmToUser)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("    rpoDelay: ").append(toIndentedString(rpoDelay)).append("\n");
        sb.append("    rtoDelay: ").append(toIndentedString(rtoDelay)).append("\n");
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
