package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 正在召开研讨会议信息（含基本信息，会议UUID 及实时在线人数
 */
public class OpenWebinarOngoingInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="onlineAttendeeCount")
    
    private Integer onlineAttendeeCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confUUID")
    
    private String confUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceId")
    
    private String conferenceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corpId")
    
    private String corpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subject")
    
    private String subject;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeZoneId")
    
    private Integer timeZoneId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserId")
    
    private String scheduserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserName")
    
    private String scheduserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgName")
    
    private String vmrPkgName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chairJoinUri")
    
    private String chairJoinUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chairPasswd")
    
    private String chairPasswd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guestJoinUri")
    
    private String guestJoinUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="guestPasswd")
    
    private String guestPasswd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audienceJoinUri")
    
    private String audienceJoinUri;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audiencePasswd")
    
    private String audiencePasswd;

    public OpenWebinarOngoingInfo withOnlineAttendeeCount(Integer onlineAttendeeCount) {
        this.onlineAttendeeCount = onlineAttendeeCount;
        return this;
    }

    


    /**
     * 实时在线人数
     * @return onlineAttendeeCount
     */
    public Integer getOnlineAttendeeCount() {
        return onlineAttendeeCount;
    }

    public void setOnlineAttendeeCount(Integer onlineAttendeeCount) {
        this.onlineAttendeeCount = onlineAttendeeCount;
    }

    

    public OpenWebinarOngoingInfo withConfUUID(String confUUID) {
        this.confUUID = confUUID;
        return this;
    }

    


    /**
     * 会议UUID
     * @return confUUID
     */
    public String getConfUUID() {
        return confUUID;
    }

    public void setConfUUID(String confUUID) {
        this.confUUID = confUUID;
    }

    

    public OpenWebinarOngoingInfo withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    


    /**
     * 预订人部门
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    

    public OpenWebinarOngoingInfo withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    


    /**
     * 会议ID。长度限制为32个字符。
     * @return conferenceId
     */
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    

    public OpenWebinarOngoingInfo withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    


    /**
     * 企业id
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    

    public OpenWebinarOngoingInfo withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    


    /**
     * 主题
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    

    public OpenWebinarOngoingInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public OpenWebinarOngoingInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 会议召开时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public OpenWebinarOngoingInfo withTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    


    /**
     * 时区ID
     * @return timeZoneId
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    

    public OpenWebinarOngoingInfo withScheduserId(String scheduserId) {
        this.scheduserId = scheduserId;
        return this;
    }

    


    /**
     * 会议预订者ID
     * @return scheduserId
     */
    public String getScheduserId() {
        return scheduserId;
    }

    public void setScheduserId(String scheduserId) {
        this.scheduserId = scheduserId;
    }

    

    public OpenWebinarOngoingInfo withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    


    /**
     * 会议预订者帐号名称。长度最大限制为96个字符。
     * @return scheduserName
     */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    

    public OpenWebinarOngoingInfo withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    


    /**
     * 网络研讨会资源名
     * @return vmrPkgName
     */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    

    public OpenWebinarOngoingInfo withChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
        return this;
    }

    


    /**
     * 主持人入会地址。
     * @return chairJoinUri
     */
    public String getChairJoinUri() {
        return chairJoinUri;
    }

    public void setChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
    }

    

    public OpenWebinarOngoingInfo withChairPasswd(String chairPasswd) {
        this.chairPasswd = chairPasswd;
        return this;
    }

    


    /**
     * 主持人密码。
     * @return chairPasswd
     */
    public String getChairPasswd() {
        return chairPasswd;
    }

    public void setChairPasswd(String chairPasswd) {
        this.chairPasswd = chairPasswd;
    }

    

    public OpenWebinarOngoingInfo withGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
        return this;
    }

    


    /**
     * 嘉宾入会地址。
     * @return guestJoinUri
     */
    public String getGuestJoinUri() {
        return guestJoinUri;
    }

    public void setGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
    }

    

    public OpenWebinarOngoingInfo withGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
        return this;
    }

    


    /**
     * 嘉宾密码。
     * @return guestPasswd
     */
    public String getGuestPasswd() {
        return guestPasswd;
    }

    public void setGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
    }

    

    public OpenWebinarOngoingInfo withAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
        return this;
    }

    


    /**
     * 观众入会地址。
     * @return audienceJoinUri
     */
    public String getAudienceJoinUri() {
        return audienceJoinUri;
    }

    public void setAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
    }

    

    public OpenWebinarOngoingInfo withAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
        return this;
    }

    


    /**
     * 观众密码。
     * @return audiencePasswd
     */
    public String getAudiencePasswd() {
        return audiencePasswd;
    }

    public void setAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenWebinarOngoingInfo openWebinarOngoingInfo = (OpenWebinarOngoingInfo) o;
        return Objects.equals(this.onlineAttendeeCount, openWebinarOngoingInfo.onlineAttendeeCount) &&
            Objects.equals(this.confUUID, openWebinarOngoingInfo.confUUID) &&
            Objects.equals(this.deptName, openWebinarOngoingInfo.deptName) &&
            Objects.equals(this.conferenceId, openWebinarOngoingInfo.conferenceId) &&
            Objects.equals(this.corpId, openWebinarOngoingInfo.corpId) &&
            Objects.equals(this.subject, openWebinarOngoingInfo.subject) &&
            Objects.equals(this.description, openWebinarOngoingInfo.description) &&
            Objects.equals(this.startTime, openWebinarOngoingInfo.startTime) &&
            Objects.equals(this.timeZoneId, openWebinarOngoingInfo.timeZoneId) &&
            Objects.equals(this.scheduserId, openWebinarOngoingInfo.scheduserId) &&
            Objects.equals(this.scheduserName, openWebinarOngoingInfo.scheduserName) &&
            Objects.equals(this.vmrPkgName, openWebinarOngoingInfo.vmrPkgName) &&
            Objects.equals(this.chairJoinUri, openWebinarOngoingInfo.chairJoinUri) &&
            Objects.equals(this.chairPasswd, openWebinarOngoingInfo.chairPasswd) &&
            Objects.equals(this.guestJoinUri, openWebinarOngoingInfo.guestJoinUri) &&
            Objects.equals(this.guestPasswd, openWebinarOngoingInfo.guestPasswd) &&
            Objects.equals(this.audienceJoinUri, openWebinarOngoingInfo.audienceJoinUri) &&
            Objects.equals(this.audiencePasswd, openWebinarOngoingInfo.audiencePasswd);
    }
    @Override
    public int hashCode() {
        return Objects.hash(onlineAttendeeCount, confUUID, deptName, conferenceId, corpId, subject, description, startTime, timeZoneId, scheduserId, scheduserName, vmrPkgName, chairJoinUri, chairPasswd, guestJoinUri, guestPasswd, audienceJoinUri, audiencePasswd);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenWebinarOngoingInfo {\n");
        sb.append("    onlineAttendeeCount: ").append(toIndentedString(onlineAttendeeCount)).append("\n");
        sb.append("    confUUID: ").append(toIndentedString(confUUID)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
        sb.append("    scheduserId: ").append(toIndentedString(scheduserId)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    chairJoinUri: ").append(toIndentedString(chairJoinUri)).append("\n");
        sb.append("    chairPasswd: ").append(toIndentedString(chairPasswd)).append("\n");
        sb.append("    guestJoinUri: ").append(toIndentedString(guestJoinUri)).append("\n");
        sb.append("    guestPasswd: ").append(toIndentedString(guestPasswd)).append("\n");
        sb.append("    audienceJoinUri: ").append(toIndentedString(audienceJoinUri)).append("\n");
        sb.append("    audiencePasswd: ").append(toIndentedString(audiencePasswd)).append("\n");
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

