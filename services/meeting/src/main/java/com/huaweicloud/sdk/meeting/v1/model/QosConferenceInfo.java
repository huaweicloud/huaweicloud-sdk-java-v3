package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QoS会议信息。
 */
public class QosConferenceInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confUUID")
    
    private String confUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private String subject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserName")
    
    private String scheduserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm")
    
    private String alarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audioAlarm")
    
    private String audioAlarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="videoAlarm")
    
    private String videoAlarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="screenAlarm")
    
    private String screenAlarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpuAlarm")
    
    private String cpuAlarm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeZoneID")
    
    private String timeZoneID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="participants")
    
    private Integer participants;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="webinar")
    
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
     * 部门。
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
     * 总体告警 YES/NO。 说明： * 会议的音频，视频，屏幕共享，CPU任一项产生告警，总体告警就为YES。
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
     * 音频告警 YES/NO。 说明： * 会议中任一与会者存在音频告警，会议音频告警就为YES。
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
     * 视频告警 YES/NO。 说明： * 会议中任一与会者存在视频告警，会议视频告警就为YES。
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
     * 屏幕共享告警 YES/NO。 说明： * 会议中任一与会者存在屏幕共享告警，会议屏幕共享告警就为YES。
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
     * CPU告警 YES/NO。 说明： * 会议中任一与会者存在CPU告警，会议CPU告警就为YES。'
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
     * 时区。详情参考时区表（云会议帮助中心->服务端API参考->附录->时区表），中国默认时区56-东八区。
     * @return timeZoneID
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    

    public QosConferenceInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 会议开始时间。UTC时间，格式 YYYY-MM-DD HH:MM。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public QosConferenceInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 议结束时间。UTC时间，格式 YYYY-MM-DD HH:MM。 说明： * 在线会议：会议召开中，endTime = 会议预计结束时间。 * 历史会议：会议已结束，endTime = 会议实际结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public QosConferenceInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 会议召开时长（分钟）。 说明： * 在线会议：会议召开中，duration = 0。 * 历史会议：会议已结束，duration = 会议实际召开时间。
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
     * 与会方数。 说明： * 同一用户多次进出会议属于不同的与会，与会方数计算多次。
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
        return Objects.equals(this.confUUID, qosConferenceInfo.confUUID) &&
            Objects.equals(this.conferenceID, qosConferenceInfo.conferenceID) &&
            Objects.equals(this.subject, qosConferenceInfo.subject) &&
            Objects.equals(this.scheduserName, qosConferenceInfo.scheduserName) &&
            Objects.equals(this.deptName, qosConferenceInfo.deptName) &&
            Objects.equals(this.alarm, qosConferenceInfo.alarm) &&
            Objects.equals(this.audioAlarm, qosConferenceInfo.audioAlarm) &&
            Objects.equals(this.videoAlarm, qosConferenceInfo.videoAlarm) &&
            Objects.equals(this.screenAlarm, qosConferenceInfo.screenAlarm) &&
            Objects.equals(this.cpuAlarm, qosConferenceInfo.cpuAlarm) &&
            Objects.equals(this.timeZoneID, qosConferenceInfo.timeZoneID) &&
            Objects.equals(this.startTime, qosConferenceInfo.startTime) &&
            Objects.equals(this.endTime, qosConferenceInfo.endTime) &&
            Objects.equals(this.duration, qosConferenceInfo.duration) &&
            Objects.equals(this.participants, qosConferenceInfo.participants) &&
            Objects.equals(this.webinar, qosConferenceInfo.webinar);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confUUID, conferenceID, subject, scheduserName, deptName, alarm, audioAlarm, videoAlarm, screenAlarm, cpuAlarm, timeZoneID, startTime, endTime, duration, participants, webinar);
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

