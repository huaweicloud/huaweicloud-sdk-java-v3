package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被邀请的与会者信息。包含预约会议时邀请的与会者和会中主持人邀请的与会者。
 */
public class ParticipantInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscriberID")

    private String subscriberID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attendeeType")

    private String attendeeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accountId")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone2")

    private String phone2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone3")

    private String phone3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms")

    private String sms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appId")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoInvite")

    private Integer isAutoInvite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isNotOverlayPidName")

    private Boolean isNotOverlayPidName;

    public ParticipantInfo withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 与会者的号码。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public ParticipantInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 与会者的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParticipantInfo withSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
        return this;
    }

    /**
     * 与会者的号码（预留字段）。
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }

    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }

    public ParticipantInfo withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * 与会者的角色。 - 1: 会议主持人 - 0: 普通与会者
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public ParticipantInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 用户状态。目前固定返回MEETTING。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ParticipantInfo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 终端所在会议室信息（预留字段）。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ParticipantInfo withAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
        return this;
    }

    /**
     * 与会者终端类型。 - normal: 软终端。 - terminal: 会议室或硬终端。 - outside: 外部与会人。 - mobile: 用户手机号码。
     * @return attendeeType
     */
    public String getAttendeeType() {
        return attendeeType;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public ParticipantInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 预订者的帐号。 * 如果是帐号/密码鉴权场景，表示华为云会议帐号 * 如果是APP ID鉴权场景，表示第三方的User ID 
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public ParticipantInfo withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    /**
     * 预留字段。
     * @return phone2
     */
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public ParticipantInfo withPhone3(String phone3) {
        this.phone3 = phone3;
        return this;
    }

    /**
     * 预留字段。
     * @return phone3
     */
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public ParticipantInfo withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ParticipantInfo withSms(String sms) {
        this.sms = sms;
        return this;
    }

    /**
     * 短信通知的手机号码。
     * @return sms
     */
    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public ParticipantInfo withDeptName(String deptName) {
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

    public ParticipantInfo withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 预订者的用户UUID。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public ParticipantInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * App ID。参考[[App ID的申请](https://support.huaweicloud.com/devg-meeting/meeting_20_0011.html#section1)](tag:hws)[[App ID的申请](https://support.huaweicloud.com/intl/zh-cn/devg-meeting/meeting_20_0011.html#section1)](tag:hk)。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ParticipantInfo withIsAutoInvite(Integer isAutoInvite) {
        this.isAutoInvite = isAutoInvite;
        return this;
    }

    /**
     * 会议开始时是否自动邀请该与会者。默认值由企业级配置决定。 * 0： 不自动邀请 * 1： 自动邀请 
     * minimum: 0
     * maximum: 1
     * @return isAutoInvite
     */
    public Integer getIsAutoInvite() {
        return isAutoInvite;
    }

    public void setIsAutoInvite(Integer isAutoInvite) {
        this.isAutoInvite = isAutoInvite;
    }

    public ParticipantInfo withIsNotOverlayPidName(Boolean isNotOverlayPidName) {
        this.isNotOverlayPidName = isNotOverlayPidName;
        return this;
    }

    /**
     * 是否不叠加会场名（VDC场景下适用）。
     * @return isNotOverlayPidName
     */
    public Boolean getIsNotOverlayPidName() {
        return isNotOverlayPidName;
    }

    public void setIsNotOverlayPidName(Boolean isNotOverlayPidName) {
        this.isNotOverlayPidName = isNotOverlayPidName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantInfo participantInfo = (ParticipantInfo) o;
        return Objects.equals(this.participantID, participantInfo.participantID)
            && Objects.equals(this.name, participantInfo.name)
            && Objects.equals(this.subscriberID, participantInfo.subscriberID)
            && Objects.equals(this.role, participantInfo.role) && Objects.equals(this.state, participantInfo.state)
            && Objects.equals(this.address, participantInfo.address)
            && Objects.equals(this.attendeeType, participantInfo.attendeeType)
            && Objects.equals(this.accountId, participantInfo.accountId)
            && Objects.equals(this.phone2, participantInfo.phone2)
            && Objects.equals(this.phone3, participantInfo.phone3) && Objects.equals(this.email, participantInfo.email)
            && Objects.equals(this.sms, participantInfo.sms) && Objects.equals(this.deptName, participantInfo.deptName)
            && Objects.equals(this.userUUID, participantInfo.userUUID)
            && Objects.equals(this.appId, participantInfo.appId)
            && Objects.equals(this.isAutoInvite, participantInfo.isAutoInvite)
            && Objects.equals(this.isNotOverlayPidName, participantInfo.isNotOverlayPidName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantID,
            name,
            subscriberID,
            role,
            state,
            address,
            attendeeType,
            accountId,
            phone2,
            phone3,
            email,
            sms,
            deptName,
            userUUID,
            appId,
            isAutoInvite,
            isNotOverlayPidName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipantInfo {\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subscriberID: ").append(toIndentedString(subscriberID)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    attendeeType: ").append(toIndentedString(attendeeType)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
        sb.append("    phone3: ").append(toIndentedString(phone3)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    isAutoInvite: ").append(toIndentedString(isAutoInvite)).append("\n");
        sb.append("    isNotOverlayPidName: ").append(toIndentedString(isNotOverlayPidName)).append("\n");
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
