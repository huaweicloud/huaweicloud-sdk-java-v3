package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmInfoResponseAlarmInfo
 */
public class AlarmInfoResponseAlarmInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_time")

    private Long alarmTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_type")

    private Integer scheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_msg")

    private String sendMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remind_type")

    private Integer remindType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_status")

    private Integer sendStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    public AlarmInfoResponseAlarmInfo withAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
        return this;
    }

    /**
     * 告警通知时间
     * @return alarmTime
     */
    public Long getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Long alarmTime) {
        this.alarmTime = alarmTime;
    }

    public AlarmInfoResponseAlarmInfo withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public AlarmInfoResponseAlarmInfo withScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }

    /**
     * 作业实例调度方式，取值范围：0 正常调度，2手工调度，5补数据，6子作业调度，7单次调度
     * @return scheduleType
     */
    public Integer getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(Integer scheduleType) {
        this.scheduleType = scheduleType;
    }

    public AlarmInfoResponseAlarmInfo withSendMsg(String sendMsg) {
        this.sendMsg = sendMsg;
        return this;
    }

    /**
     * 发送信息
     * @return sendMsg
     */
    public String getSendMsg() {
        return sendMsg;
    }

    public void setSendMsg(String sendMsg) {
        this.sendMsg = sendMsg;
    }

    public AlarmInfoResponseAlarmInfo withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * 计划时间
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public AlarmInfoResponseAlarmInfo withRemindType(Integer remindType) {
        this.remindType = remindType;
        return this;
    }

    /**
     * 告警通知类型，取值范围：0 运行成功，1 运行异常/失败， 12 未完成，13 运行取消
     * @return remindType
     */
    public Integer getRemindType() {
        return remindType;
    }

    public void setRemindType(Integer remindType) {
        this.remindType = remindType;
    }

    public AlarmInfoResponseAlarmInfo withSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }

    /**
     * 发送状态，取值范围：0 发送成功，1：发送失败
     * @return sendStatus
     */
    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public AlarmInfoResponseAlarmInfo withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmInfoResponseAlarmInfo that = (AlarmInfoResponseAlarmInfo) obj;
        return Objects.equals(this.alarmTime, that.alarmTime) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.scheduleType, that.scheduleType) && Objects.equals(this.sendMsg, that.sendMsg)
            && Objects.equals(this.planTime, that.planTime) && Objects.equals(this.remindType, that.remindType)
            && Objects.equals(this.sendStatus, that.sendStatus) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmTime, jobName, scheduleType, sendMsg, planTime, remindType, sendStatus, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmInfoResponseAlarmInfo {\n");
        sb.append("    alarmTime: ").append(toIndentedString(alarmTime)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
        sb.append("    sendMsg: ").append(toIndentedString(sendMsg)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    remindType: ").append(toIndentedString(remindType)).append("\n");
        sb.append("    sendStatus: ").append(toIndentedString(sendStatus)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
