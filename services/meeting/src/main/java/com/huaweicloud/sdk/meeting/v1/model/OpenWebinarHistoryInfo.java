package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 历史召开研讨会议信息。
 */
public class OpenWebinarHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceId")

    private String conferenceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confUUID")

    private String confUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduserName")

    private String scheduserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderator")

    private String moderator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneId")

    private Integer timeZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actualStartTime")

    private String actualStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actualDuration")

    private Integer actualDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendeeCount")

    private Integer attendeeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairCount")

    private Integer chairCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestCount")

    private Integer guestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceCount")

    private Integer audienceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrId")

    private String vmrId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgAudienceParties")

    private Integer vmrPkgAudienceParties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgName")

    private String vmrPkgName;

    public OpenWebinarHistoryInfo withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * 网络研讨会ID。
     * @return conferenceId
     */
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public OpenWebinarHistoryInfo withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    /**
     * 网络研讨会UUID。
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    public OpenWebinarHistoryInfo withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * 网络研讨会主题。
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public OpenWebinarHistoryInfo withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    /**
     * 网络研讨会预定者名称。
     * @return scheduserName
     */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    public OpenWebinarHistoryInfo withModerator(String moderator) {
        this.moderator = moderator;
        return this;
    }

    /**
     * 网络研讨主持人名称。
     * @return moderator
     */
    public String getModerator() {
        return moderator;
    }

    public void setModerator(String moderator) {
        this.moderator = moderator;
    }

    public OpenWebinarHistoryInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 预订人部门名称。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public OpenWebinarHistoryInfo withTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * 会议通知中会议时间的时区信息。时区信息，参考[[时区映射关系](https://support.huaweicloud.com/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hws)[[时区映射关系](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0110.html#ZH-CN_TOPIC_0212714472__table137407441463)](tag:hk)。 > * 举例：“timeZoneID”:\"26\"，则通过华为云会议发送的会议通知中的时间将会标记为如“2021/11/11 星期四 00:00 - 02:00 (GMT) 格林威治标准时间:都柏林, 爱丁堡, 里斯本, 伦敦”。 
     * @return timeZoneId
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public OpenWebinarHistoryInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 网络研讨会开始时间（UTC时间），格式“yyyy-MM-dd HH:mm”。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public OpenWebinarHistoryInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 网络研讨会持续时长，单位分钟。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public OpenWebinarHistoryInfo withActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
        return this;
    }

    /**
     * 网络研讨会实际召开时间（UTC时间），格式“yyyy-MM-dd HH:mm”。
     * @return actualStartTime
     */
    public String getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public OpenWebinarHistoryInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 网络研讨会结束时间（UTC时间），格式“yyyy-MM-dd HH:mm”。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public OpenWebinarHistoryInfo withActualDuration(Integer actualDuration) {
        this.actualDuration = actualDuration;
        return this;
    }

    /**
     * 网络研讨会实际时长，单位分钟。
     * @return actualDuration
     */
    public Integer getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(Integer actualDuration) {
        this.actualDuration = actualDuration;
    }

    public OpenWebinarHistoryInfo withAttendeeCount(Integer attendeeCount) {
        this.attendeeCount = attendeeCount;
        return this;
    }

    /**
     * 与会人数。
     * @return attendeeCount
     */
    public Integer getAttendeeCount() {
        return attendeeCount;
    }

    public void setAttendeeCount(Integer attendeeCount) {
        this.attendeeCount = attendeeCount;
    }

    public OpenWebinarHistoryInfo withChairCount(Integer chairCount) {
        this.chairCount = chairCount;
        return this;
    }

    /**
     * 主持人数。
     * @return chairCount
     */
    public Integer getChairCount() {
        return chairCount;
    }

    public void setChairCount(Integer chairCount) {
        this.chairCount = chairCount;
    }

    public OpenWebinarHistoryInfo withGuestCount(Integer guestCount) {
        this.guestCount = guestCount;
        return this;
    }

    /**
     * 嘉宾数。
     * @return guestCount
     */
    public Integer getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(Integer guestCount) {
        this.guestCount = guestCount;
    }

    public OpenWebinarHistoryInfo withAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
        return this;
    }

    /**
     * 观众人数。
     * @return audienceCount
     */
    public Integer getAudienceCount() {
        return audienceCount;
    }

    public void setAudienceCount(Integer audienceCount) {
        this.audienceCount = audienceCount;
    }

    public OpenWebinarHistoryInfo withVmrId(String vmrId) {
        this.vmrId = vmrId;
        return this;
    }

    /**
     * VMR ID。
     * @return vmrId
     */
    public String getVmrId() {
        return vmrId;
    }

    public void setVmrId(String vmrId) {
        this.vmrId = vmrId;
    }

    public OpenWebinarHistoryInfo withVmrPkgAudienceParties(Integer vmrPkgAudienceParties) {
        this.vmrPkgAudienceParties = vmrPkgAudienceParties;
        return this;
    }

    /**
     * 网络研讨会VMR最大观众数。
     * @return vmrPkgAudienceParties
     */
    public Integer getVmrPkgAudienceParties() {
        return vmrPkgAudienceParties;
    }

    public void setVmrPkgAudienceParties(Integer vmrPkgAudienceParties) {
        this.vmrPkgAudienceParties = vmrPkgAudienceParties;
    }

    public OpenWebinarHistoryInfo withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    /**
     * 网络研讨会VMR名称。
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenWebinarHistoryInfo that = (OpenWebinarHistoryInfo) obj;
        return Objects.equals(this.conferenceId, that.conferenceId) && Objects.equals(this.confUUID, that.confUUID)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.scheduserName, that.scheduserName)
            && Objects.equals(this.moderator, that.moderator) && Objects.equals(this.deptName, that.deptName)
            && Objects.equals(this.timeZoneId, that.timeZoneId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.actualStartTime, that.actualStartTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.actualDuration, that.actualDuration)
            && Objects.equals(this.attendeeCount, that.attendeeCount)
            && Objects.equals(this.chairCount, that.chairCount) && Objects.equals(this.guestCount, that.guestCount)
            && Objects.equals(this.audienceCount, that.audienceCount) && Objects.equals(this.vmrId, that.vmrId)
            && Objects.equals(this.vmrPkgAudienceParties, that.vmrPkgAudienceParties)
            && Objects.equals(this.vmrPkgName, that.vmrPkgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceId,
            confUUID,
            subject,
            scheduserName,
            moderator,
            deptName,
            timeZoneId,
            startTime,
            duration,
            actualStartTime,
            endTime,
            actualDuration,
            attendeeCount,
            chairCount,
            guestCount,
            audienceCount,
            vmrId,
            vmrPkgAudienceParties,
            vmrPkgName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenWebinarHistoryInfo {\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    moderator: ").append(toIndentedString(moderator)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    actualDuration: ").append(toIndentedString(actualDuration)).append("\n");
        sb.append("    attendeeCount: ").append(toIndentedString(attendeeCount)).append("\n");
        sb.append("    chairCount: ").append(toIndentedString(chairCount)).append("\n");
        sb.append("    guestCount: ").append(toIndentedString(guestCount)).append("\n");
        sb.append("    audienceCount: ").append(toIndentedString(audienceCount)).append("\n");
        sb.append("    vmrId: ").append(toIndentedString(vmrId)).append("\n");
        sb.append("    vmrPkgAudienceParties: ").append(toIndentedString(vmrPkgAudienceParties)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
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
