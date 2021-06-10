package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.MeetingStatus;
import com.huaweicloud.sdk.meeting.v1.model.OpenWebinarBaseInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowWebinarResponse extends SdkResponse {



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
    @JsonProperty(value="duration")
    
    private Integer duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timeZoneId")
    
    private Integer timeZoneId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private MeetingStatus state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserId")
    
    private String scheduserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scheduserName")
    
    private String scheduserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vmrPkgName")
    
    private String vmrPkgName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="callRestriction")
    
    private Boolean callRestriction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scope")
    
    private Integer scope;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audienceScope")
    
    private Integer audienceScope;


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

    public ShowWebinarResponse withConferenceId(String conferenceId) {
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

    

    public ShowWebinarResponse withCorpId(String corpId) {
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

    

    public ShowWebinarResponse withSubject(String subject) {
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

    

    public ShowWebinarResponse withDescription(String description) {
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

    

    public ShowWebinarResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ShowWebinarResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 时长，单位分钟
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    

    public ShowWebinarResponse withTimeZoneId(Integer timeZoneId) {
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

    

    public ShowWebinarResponse withState(MeetingStatus state) {
        this.state = state;
        return this;
    }

    


    /**
     * Get state
     * @return state
     */
    public MeetingStatus getState() {
        return state;
    }

    public void setState(MeetingStatus state) {
        this.state = state;
    }

    

    public ShowWebinarResponse withScheduserId(String scheduserId) {
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

    

    public ShowWebinarResponse withDeptName(String deptName) {
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

    

    public ShowWebinarResponse withScheduserName(String scheduserName) {
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

    

    public ShowWebinarResponse withVmrPkgName(String vmrPkgName) {
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

    

    public ShowWebinarResponse withCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
        return this;
    }

    


    /**
     * 入会范围开关
     * @return callRestriction
     */
    public Boolean getCallRestriction() {
        return callRestriction;
    }

    public void setCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
    }

    

    public ShowWebinarResponse withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    


    /**
     * 主持人、嘉宾入会范围  0: 所有用户 1: 非匿名用户（手机pstn入会视为匿名入会） 2: 企业内用户 3: 被邀请用户。
     * @return scope
     */
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    

    public ShowWebinarResponse withAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
        return this;
    }

    


    /**
     * 观众入会范围 0: 所有用户 2: 企业内用户和被邀请用户。
     * @return audienceScope
     */
    public Integer getAudienceScope() {
        return audienceScope;
    }

    public void setAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
    }

    

    public ShowWebinarResponse withChairJoinUri(String chairJoinUri) {
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

    

    public ShowWebinarResponse withChairPasswd(String chairPasswd) {
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

    

    public ShowWebinarResponse withGuestJoinUri(String guestJoinUri) {
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

    

    public ShowWebinarResponse withGuestPasswd(String guestPasswd) {
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

    

    public ShowWebinarResponse withAudienceJoinUri(String audienceJoinUri) {
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

    

    public ShowWebinarResponse withAudiencePasswd(String audiencePasswd) {
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
        ShowWebinarResponse showWebinarResponse = (ShowWebinarResponse) o;
        return Objects.equals(this.conferenceId, showWebinarResponse.conferenceId) &&
            Objects.equals(this.corpId, showWebinarResponse.corpId) &&
            Objects.equals(this.subject, showWebinarResponse.subject) &&
            Objects.equals(this.description, showWebinarResponse.description) &&
            Objects.equals(this.startTime, showWebinarResponse.startTime) &&
            Objects.equals(this.duration, showWebinarResponse.duration) &&
            Objects.equals(this.timeZoneId, showWebinarResponse.timeZoneId) &&
            Objects.equals(this.state, showWebinarResponse.state) &&
            Objects.equals(this.scheduserId, showWebinarResponse.scheduserId) &&
            Objects.equals(this.deptName, showWebinarResponse.deptName) &&
            Objects.equals(this.scheduserName, showWebinarResponse.scheduserName) &&
            Objects.equals(this.vmrPkgName, showWebinarResponse.vmrPkgName) &&
            Objects.equals(this.callRestriction, showWebinarResponse.callRestriction) &&
            Objects.equals(this.scope, showWebinarResponse.scope) &&
            Objects.equals(this.audienceScope, showWebinarResponse.audienceScope) &&
            Objects.equals(this.chairJoinUri, showWebinarResponse.chairJoinUri) &&
            Objects.equals(this.chairPasswd, showWebinarResponse.chairPasswd) &&
            Objects.equals(this.guestJoinUri, showWebinarResponse.guestJoinUri) &&
            Objects.equals(this.guestPasswd, showWebinarResponse.guestPasswd) &&
            Objects.equals(this.audienceJoinUri, showWebinarResponse.audienceJoinUri) &&
            Objects.equals(this.audiencePasswd, showWebinarResponse.audiencePasswd);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceId, corpId, subject, description, startTime, duration, timeZoneId, state, scheduserId, deptName, scheduserName, vmrPkgName, callRestriction, scope, audienceScope, chairJoinUri, chairPasswd, guestJoinUri, guestPasswd, audienceJoinUri, audiencePasswd);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWebinarResponse {\n");
        sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    scheduserId: ").append(toIndentedString(scheduserId)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    scheduserName: ").append(toIndentedString(scheduserName)).append("\n");
        sb.append("    vmrPkgName: ").append(toIndentedString(vmrPkgName)).append("\n");
        sb.append("    callRestriction: ").append(toIndentedString(callRestriction)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    audienceScope: ").append(toIndentedString(audienceScope)).append("\n");
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

