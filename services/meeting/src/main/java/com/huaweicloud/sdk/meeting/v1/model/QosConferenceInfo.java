package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会议QoS告警信息。
 */
public class QosConferenceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduserName")

    private String scheduserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm")

    private String alarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audioAlarm")

    private String audioAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videoAlarm")

    private String videoAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screenAlarm")

    private String screenAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpuAlarm")

    private String cpuAlarm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneID")

    private String timeZoneID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participants")

    private Integer participants;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webinar")

    private Boolean webinar;

    public QosConferenceInfo withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 会议UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public QosConferenceInfo withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public QosConferenceInfo withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 会议主题。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public QosConferenceInfo withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    /**
     * 会议预订者名称。
     * @return scheduserName
     */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    public QosConferenceInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public QosConferenceInfo withAlarm(String alarm) {
        this.alarm = alarm;
        return this;
    }

    /**
     * 总体告警 。 * YES：会议的音频、视频、屏幕共享、CPU任一项产生告警，总体告警就为YES * NO：无告警
     * @return alarm
     */
    public String getAlarm() {
        return alarm;
    }

    public void setAlarm(String alarm) {
        this.alarm = alarm;
    }

    public QosConferenceInfo withAudioAlarm(String audioAlarm) {
        this.audioAlarm = audioAlarm;
        return this;
    }

    /**
     * 音频告警 。 * YES：会议中任一与会者存在音频告警，会议音频告警就为YES * NO：无音频告警
     * @return audioAlarm
     */
    public String getAudioAlarm() {
        return audioAlarm;
    }

    public void setAudioAlarm(String audioAlarm) {
        this.audioAlarm = audioAlarm;
    }

    public QosConferenceInfo withVideoAlarm(String videoAlarm) {
        this.videoAlarm = videoAlarm;
        return this;
    }

    /**
     * 视频告警。 * YES：会议中任一与会者存在视频告警，会议视频告警就为YES * NO：无音视频警
     * @return videoAlarm
     */
    public String getVideoAlarm() {
        return videoAlarm;
    }

    public void setVideoAlarm(String videoAlarm) {
        this.videoAlarm = videoAlarm;
    }

    public QosConferenceInfo withScreenAlarm(String screenAlarm) {
        this.screenAlarm = screenAlarm;
        return this;
    }

    /**
     * 屏幕共享告警 YES/NO。 * YES：会议中任一与会者存在屏幕共享告警，会议屏幕共享告警就为YES * NO：无屏幕共享告警
     * @return screenAlarm
     */
    public String getScreenAlarm() {
        return screenAlarm;
    }

    public void setScreenAlarm(String screenAlarm) {
        this.screenAlarm = screenAlarm;
    }

    public QosConferenceInfo withCpuAlarm(String cpuAlarm) {
        this.cpuAlarm = cpuAlarm;
        return this;
    }

    /**
     * CPU告警。 * YES：会议中任一与会者存在CPU告警，会议CPU告警就为YES * NO：无CPU告警
     * @return cpuAlarm
     */
    public String getCpuAlarm() {
        return cpuAlarm;
    }

    public void setCpuAlarm(String cpuAlarm) {
        this.cpuAlarm = cpuAlarm;
    }

    public QosConferenceInfo withTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
        return this;
    }

    /**
     * 时区信息，参考[[时区映射关系](https://support.huaweicloud.com/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hws)[[时区映射关系](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hk)。 > 举例：“timeZoneID”:\"26\"，则通过华为云会议发送的会议通知中的时间将会标记为如“2021/11/11 星期四 00:00 - 02:00 (GMT) 格林威治标准时间:都柏林, 爱丁堡, 里斯本, 伦敦”。 
     * @return timeZoneID
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    public QosConferenceInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 会议开始时间(UTC时间), Unix时间戳（单位毫秒）。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public QosConferenceInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 会议结束时间(UTC时间), Unix时间戳（单位毫秒）。 > * 在线会议：会议召开中，endTime = 会议预计结束时间 > * 历史会议：会议已结束，endTime = 会议实际结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public QosConferenceInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 会议召开时长（分钟）。 > * 在线会议：会议召开中，duration = 0 > * 历史会议：会议已结束，duration = 会议实际召开时间
     * minimum: 0
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public QosConferenceInfo withParticipants(Integer participants) {
        this.participants = participants;
        return this;
    }

    /**
     * 与会方数。 > 同一用户多次进出会议属于不同的与会方，与会方数计算多次。
     * minimum: 0
     * @return participants
     */
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    public QosConferenceInfo withWebinar(Boolean webinar) {
        this.webinar = webinar;
        return this;
    }

    /**
     * 是否网络研讨会。
     * @return webinar
     */
    public Boolean getWebinar() {
        return webinar;
    }

    public void setWebinar(Boolean webinar) {
        this.webinar = webinar;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QosConferenceInfo qosConferenceInfo = (QosConferenceInfo) o;
        return Objects.equals(this.confUUID, qosConferenceInfo.confUUID)
            && Objects.equals(this.conferenceID, qosConferenceInfo.conferenceID)
            && Objects.equals(this.subject, qosConferenceInfo.subject)
            && Objects.equals(this.scheduserName, qosConferenceInfo.scheduserName)
            && Objects.equals(this.deptName, qosConferenceInfo.deptName)
            && Objects.equals(this.alarm, qosConferenceInfo.alarm)
            && Objects.equals(this.audioAlarm, qosConferenceInfo.audioAlarm)
            && Objects.equals(this.videoAlarm, qosConferenceInfo.videoAlarm)
            && Objects.equals(this.screenAlarm, qosConferenceInfo.screenAlarm)
            && Objects.equals(this.cpuAlarm, qosConferenceInfo.cpuAlarm)
            && Objects.equals(this.timeZoneID, qosConferenceInfo.timeZoneID)
            && Objects.equals(this.startTime, qosConferenceInfo.startTime)
            && Objects.equals(this.endTime, qosConferenceInfo.endTime)
            && Objects.equals(this.duration, qosConferenceInfo.duration)
            && Objects.equals(this.participants, qosConferenceInfo.participants)
            && Objects.equals(this.webinar, qosConferenceInfo.webinar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confUUID,
            conferenceID,
            subject,
            scheduserName,
            deptName,
            alarm,
            audioAlarm,
            videoAlarm,
            screenAlarm,
            cpuAlarm,
            timeZoneID,
            startTime,
            endTime,
            duration,
            participants,
            webinar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QosConferenceInfo {\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    alarm: ").append(toIndentedString(alarm)).append("\n");
        sb.append("    audioAlarm: ").append(toIndentedString(audioAlarm)).append("\n");
        sb.append("    videoAlarm: ").append(toIndentedString(videoAlarm)).append("\n");
        sb.append("    screenAlarm: ").append(toIndentedString(screenAlarm)).append("\n");
        sb.append("    cpuAlarm: ").append(toIndentedString(cpuAlarm)).append("\n");
        sb.append("    timeZoneID: ").append(toIndentedString(timeZoneID)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
        sb.append("    webinar: ").append(toIndentedString(webinar)).append("\n");
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
