package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
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
    @JsonProperty(value = "enableRecording")

    private YesNoEnum enableRecording;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveAddress")

    private String liveAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auxAddress")

    private String auxAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveUrl")

    private String liveUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendees")

    private List<String> attendees = null;

    public CreateWebinarResponse withConferenceId(String conferenceId) {
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

    public CreateWebinarResponse withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    /**
     * 企业ID。
     * @return corpId
     */
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

    public CreateWebinarResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 网络研讨会描述。
     * @return description
     */
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

    public CreateWebinarResponse withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 网络研讨会持续时长，单位分钟，取值范围[15,1440]。
     * @return duration
     */
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

    public CreateWebinarResponse withState(MeetingStatus state) {
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

    public CreateWebinarResponse withScheduserId(String scheduserId) {
        this.scheduserId = scheduserId;
        return this;
    }

    /**
     * 网络研讨会预订者的用户UUID。
     * @return scheduserId
     */
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

    /**
     * 预订者部门命名。
     * @return deptName
     */
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

    /**
     * 预订者名称。
     * @return scheduserName
     */
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

    public CreateWebinarResponse withCallRestriction(Boolean callRestriction) {
        this.callRestriction = callRestriction;
        return this;
    }

    /**
     * 入会范围开关。
     * @return callRestriction
     */
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

    /**
     * 主持人、嘉宾入会范围。 * 0: 所有用户 * 2: 企业内用户 * 3: 被邀请用户 
     * @return scope
     */
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

    /**
     * 观众入会范围。 * 0: 所有用户 * 2: 企业内用户 
     * @return audienceScope
     */
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

    public CreateWebinarResponse withChairPasswd(String chairPasswd) {
        this.chairPasswd = chairPasswd;
        return this;
    }

    /**
     * 主持人入会密码。
     * @return chairPasswd
     */
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

    public CreateWebinarResponse withGuestPasswd(String guestPasswd) {
        this.guestPasswd = guestPasswd;
        return this;
    }

    /**
     * 嘉宾入会密码。
     * @return guestPasswd
     */
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

    public CreateWebinarResponse withAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
        return this;
    }

    /**
     * 观众入会密码。
     * @return audiencePasswd
     */
    public String getAudiencePasswd() {
        return audiencePasswd;
    }

    public void setAudiencePasswd(String audiencePasswd) {
        this.audiencePasswd = audiencePasswd;
    }

    public CreateWebinarResponse withEnableRecording(YesNoEnum enableRecording) {
        this.enableRecording = enableRecording;
        return this;
    }

    /**
     * Get enableRecording
     * @return enableRecording
     */
    public YesNoEnum getEnableRecording() {
        return enableRecording;
    }

    public void setEnableRecording(YesNoEnum enableRecording) {
        this.enableRecording = enableRecording;
    }

    public CreateWebinarResponse withLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
        return this;
    }

    /**
     * 主流直播推流地址，在录播类型为 :直播、直播+录播时有效。最大不超过255个字符。
     * @return liveAddress
     */
    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public CreateWebinarResponse withAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
        return this;
    }

    /**
     * 辅流直播推流地址，在录播类型为 :直播、直播+录播时有效。最大不超过255个字符。
     * @return auxAddress
     */
    public String getAuxAddress() {
        return auxAddress;
    }

    public void setAuxAddress(String auxAddress) {
        this.auxAddress = auxAddress;
    }

    public CreateWebinarResponse withLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
        return this;
    }

    /**
     * 直播房间地址，在录播类型为录播+直播推流时有效。最大不超过255个字符。
     * @return liveUrl
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
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

    /**
     * 与会嘉宾名称列表。
     * @return attendees
     */
    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateWebinarResponse that = (CreateWebinarResponse) obj;
        return Objects.equals(this.conferenceId, that.conferenceId) && Objects.equals(this.corpId, that.corpId)
            && Objects.equals(this.subject, that.subject) && Objects.equals(this.description, that.description)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.timeZoneId, that.timeZoneId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.scheduserId, that.scheduserId) && Objects.equals(this.deptName, that.deptName)
            && Objects.equals(this.scheduserName, that.scheduserName)
            && Objects.equals(this.vmrPkgName, that.vmrPkgName)
            && Objects.equals(this.callRestriction, that.callRestriction) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.audienceScope, that.audienceScope)
            && Objects.equals(this.chairJoinUri, that.chairJoinUri)
            && Objects.equals(this.chairPasswd, that.chairPasswd)
            && Objects.equals(this.guestJoinUri, that.guestJoinUri)
            && Objects.equals(this.guestPasswd, that.guestPasswd)
            && Objects.equals(this.audienceJoinUri, that.audienceJoinUri)
            && Objects.equals(this.audiencePasswd, that.audiencePasswd)
            && Objects.equals(this.enableRecording, that.enableRecording)
            && Objects.equals(this.liveAddress, that.liveAddress) && Objects.equals(this.auxAddress, that.auxAddress)
            && Objects.equals(this.liveUrl, that.liveUrl) && Objects.equals(this.attendees, that.attendees);
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
            enableRecording,
            liveAddress,
            auxAddress,
            liveUrl,
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
        sb.append("    enableRecording: ").append(toIndentedString(enableRecording)).append("\n");
        sb.append("    liveAddress: ").append(toIndentedString(liveAddress)).append("\n");
        sb.append("    auxAddress: ").append(toIndentedString(auxAddress)).append("\n");
        sb.append("    liveUrl: ").append(toIndentedString(liveUrl)).append("\n");
        sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
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
