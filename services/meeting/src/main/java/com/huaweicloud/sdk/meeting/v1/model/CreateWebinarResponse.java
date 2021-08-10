package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateWebinarResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceId")

    private String conferenceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpId")

    private String corpId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject")

    private String subject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeZoneId")

    private Integer timeZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private MeetingStatus state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduserId")

    private String scheduserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scheduserName")

    private String scheduserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrPkgName")

    private String vmrPkgName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callRestriction")

    private Boolean callRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private Integer scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceScope")

    private Integer audienceScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairJoinUri")

    private String chairJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chairPasswd")

    private String chairPasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestJoinUri")

    private String guestJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guestPasswd")

    private String guestPasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceJoinUri")

    private String audienceJoinUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audiencePasswd")

    private String audiencePasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendees")

    private List<String> attendees = null;

    public CreateWebinarResponse withConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /** 会议ID。长度限制为32个字符。
     * 
     * @return conferenceId */
    public String getConferenceId() {
        return conferenceId;
    }

    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    public CreateWebinarResponse withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /** 企业id
     * 
     * @return corpId */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public CreateWebinarResponse withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /** 主题
     * 
     * @return subject */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CreateWebinarResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateWebinarResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 开始时间
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CreateWebinarResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /** 时长，单位分钟
     * 
     * @return duration */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CreateWebinarResponse withTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /** 时区ID
     * 
     * @return timeZoneId */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public CreateWebinarResponse withState(MeetingStatus state) {
        this.state = state;
        return this;
    }

    /** Get state
     * 
     * @return state */
    public MeetingStatus getState() {
        return state;
    }

    public void setState(MeetingStatus state) {
        this.state = state;
    }

    public CreateWebinarResponse withScheduserId(String scheduserId) {
        this.scheduserId = scheduserId;
        return this;
    }

    /** 会议预订者ID
     * 
     * @return scheduserId */
    public String getScheduserId() {
        return scheduserId;
    }

    public void setScheduserId(String scheduserId) {
        this.scheduserId = scheduserId;
    }

    public CreateWebinarResponse withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /** 预订人部门
     * 
     * @return deptName */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public CreateWebinarResponse withScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
        return this;
    }

    /** 会议预订者帐号名称。长度最大限制为96个字符。
     * 
     * @return scheduserName */
    public String getScheduserName() {
        return scheduserName;
    }

    public void setScheduserName(String scheduserName) {
        this.scheduserName = scheduserName;
    }

    public CreateWebinarResponse withVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
        return this;
    }

    /** 网络研讨会资源名
     * 
     * @return vmrPkgName */
    public String getVmrPkgName() {
        return vmrPkgName;
    }

    public void setVmrPkgName(String vmrPkgName) {
        this.vmrPkgName = vmrPkgName;
    }

    public CreateWebinarResponse withCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
        return this;
    }

    /** 入会范围开关
     * 
     * @return callRestriction */
    public Boolean getCallRestriction() {
        return callRestriction;
    }

    public void setCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
    }

    public CreateWebinarResponse withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    /** 主持人、嘉宾入会范围 0: 所有用户 1: 非匿名用户（手机pstn入会视为匿名入会） 2: 企业内用户 3: 被邀请用户。
     * 
     * @return scope */
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public CreateWebinarResponse withAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
        return this;
    }

    /** 观众入会范围 0: 所有用户 2: 企业内用户和被邀请用户。
     * 
     * @return audienceScope */
    public Integer getAudienceScope() {
        return audienceScope;
    }

    public void setAudienceScope(Integer audienceScope) {
        this.audienceScope = audienceScope;
    }

    public CreateWebinarResponse withChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
        return this;
    }

    /** 主持人入会地址。
     * 
     * @return chairJoinUri */
    public String getChairJoinUri() {
        return chairJoinUri;
    }

    public void setChairJoinUri(String chairJoinUri) {
        this.chairJoinUri = chairJoinUri;
    }

    public CreateWebinarResponse withChairPasswd(String chairPasswd) {
        this.chairPasswd = chairPasswd;
        return this;
    }

    /** 主持人密码。
     * 
     * @return chairPasswd */
    public String getChairPasswd() {
        return chairPasswd;
    }

    public void setChairPasswd(String chairPasswd) {
        this.chairPasswd = chairPasswd;
    }

    public CreateWebinarResponse withGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
        return this;
    }

    /** 嘉宾入会地址。
     * 
     * @return guestJoinUri */
    public String getGuestJoinUri() {
        return guestJoinUri;
    }

    public void setGuestJoinUri(String guestJoinUri) {
        this.guestJoinUri = guestJoinUri;
    }

    public CreateWebinarResponse withGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
        return this;
    }

    /** 嘉宾密码。
     * 
     * @return guestPasswd */
    public String getGuestPasswd() {
        return guestPasswd;
    }

    public void setGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
    }

    public CreateWebinarResponse withAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
        return this;
    }

    /** 观众入会地址。
     * 
     * @return audienceJoinUri */
    public String getAudienceJoinUri() {
        return audienceJoinUri;
    }

    public void setAudienceJoinUri(String audienceJoinUri) {
        this.audienceJoinUri = audienceJoinUri;
    }

    public CreateWebinarResponse withAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
        return this;
    }

    /** 观众密码。
     * 
     * @return audiencePasswd */
    public String getAudiencePasswd() {
        return audiencePasswd;
    }

    public void setAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
    }

    public CreateWebinarResponse withAttendees(List<String> attendees) {
        this.attendees = attendees;
        return this;
    }

    public CreateWebinarResponse addAttendeesItem(String attendeesItem) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        this.attendees.add(attendeesItem);
        return this;
    }

    public CreateWebinarResponse withAttendees(Consumer<List<String>> attendeesSetter) {
        if (this.attendees == null) {
            this.attendees = new ArrayList<>();
        }
        attendeesSetter.accept(this.attendees);
        return this;
    }

    /** Get attendees
     * 
     * @return attendees */
    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWebinarResponse createWebinarResponse = (CreateWebinarResponse) o;
        return Objects.equals(this.conferenceId, createWebinarResponse.conferenceId)
            && Objects.equals(this.corpId, createWebinarResponse.corpId)
            && Objects.equals(this.subject, createWebinarResponse.subject)
            && Objects.equals(this.description, createWebinarResponse.description)
            && Objects.equals(this.startTime, createWebinarResponse.startTime)
            && Objects.equals(this.duration, createWebinarResponse.duration)
            && Objects.equals(this.timeZoneId, createWebinarResponse.timeZoneId)
            && Objects.equals(this.state, createWebinarResponse.state)
            && Objects.equals(this.scheduserId, createWebinarResponse.scheduserId)
            && Objects.equals(this.deptName, createWebinarResponse.deptName)
            && Objects.equals(this.scheduserName, createWebinarResponse.scheduserName)
            && Objects.equals(this.vmrPkgName, createWebinarResponse.vmrPkgName)
            && Objects.equals(this.callRestriction, createWebinarResponse.callRestriction)
            && Objects.equals(this.scope, createWebinarResponse.scope)
            && Objects.equals(this.audienceScope, createWebinarResponse.audienceScope)
            && Objects.equals(this.chairJoinUri, createWebinarResponse.chairJoinUri)
            && Objects.equals(this.chairPasswd, createWebinarResponse.chairPasswd)
            && Objects.equals(this.guestJoinUri, createWebinarResponse.guestJoinUri)
            && Objects.equals(this.guestPasswd, createWebinarResponse.guestPasswd)
            && Objects.equals(this.audienceJoinUri, createWebinarResponse.audienceJoinUri)
            && Objects.equals(this.audiencePasswd, createWebinarResponse.audiencePasswd)
            && Objects.equals(this.attendees, createWebinarResponse.attendees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceId,
            corpId,
            subject,
            description,
            startTime,
            duration,
            timeZoneId,
            state,
            scheduserId,
            deptName,
            scheduserName,
            vmrPkgName,
            callRestriction,
            scope,
            audienceScope,
            chairJoinUri,
            chairPasswd,
            guestJoinUri,
            guestPasswd,
            audienceJoinUri,
            audiencePasswd,
            attendees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWebinarResponse {\n");
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
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
