package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 与会嘉宾列表。
 */
public class OpenAttendeeEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appId")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userAccount")

    private String userAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userName")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms")

    private String sms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isHardTerminal")

    private Boolean isHardTerminal;

    public OpenAttendeeEntity withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * App ID。如果是APP ID鉴权场景，此项必填。参考[[App ID的申请](https://support.huaweicloud.com/devg-meeting/meeting_20_0011.html#section1)](tag:hws)[[App ID的申请](https://support.huaweicloud.com/intl/zh-cn/devg-meeting/meeting_20_0011.html#section1)](tag:hk)。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public OpenAttendeeEntity withUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }

    /**
     * 嘉宾的帐号。 * 如果是帐号/密码鉴权场景: 选填，表示华为云会议帐号ID * 如果是APP ID鉴权场景：必填，表示第三方的User ID，同时需要携带参数appId 
     * @return userAccount
     */
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public OpenAttendeeEntity withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 嘉宾的名称。长度限制为96个字符。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OpenAttendeeEntity withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称，最大128字符。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public OpenAttendeeEntity withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 号码。支持SIP号码或者手机号码。 * 如果是帐号/密码鉴权场景：必填 * 如果是APP ID鉴权场景：选填 > * 号码可以通过[[查询企业通讯](https://support.huaweicloud.com/api-meeting/meeting_21_0512.html)](tag:hws)[[查询企业通讯](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0512.html)](tag:hk)接口录获取。返回的number是SIP号码，phone是手机号码 > * 填SIP号码系统会呼叫对应的软终端或者硬终端；填手机号码系统会呼叫手机 > * 呼叫手机需要开通PSTN权限，否则无法呼叫 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public OpenAttendeeEntity withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮件地址。需要发邮件通知时填写。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public OpenAttendeeEntity withSms(String sms) {
        this.sms = sms;
        return this;
    }

    /**
     * 短信通知的手机号码。需要发短信通知时填写。
     * @return sms
     */
    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public OpenAttendeeEntity withIsHardTerminal(Boolean isHardTerminal) {
        this.isHardTerminal = isHardTerminal;
        return this;
    }

    /**
     * 是否硬终端（会议室或硬终端）。
     * @return isHardTerminal
     */
    public Boolean getIsHardTerminal() {
        return isHardTerminal;
    }

    public void setIsHardTerminal(Boolean isHardTerminal) {
        this.isHardTerminal = isHardTerminal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenAttendeeEntity openAttendeeEntity = (OpenAttendeeEntity) o;
        return Objects.equals(this.appId, openAttendeeEntity.appId)
            && Objects.equals(this.userAccount, openAttendeeEntity.userAccount)
            && Objects.equals(this.userName, openAttendeeEntity.userName)
            && Objects.equals(this.deptName, openAttendeeEntity.deptName)
            && Objects.equals(this.phone, openAttendeeEntity.phone)
            && Objects.equals(this.email, openAttendeeEntity.email) && Objects.equals(this.sms, openAttendeeEntity.sms)
            && Objects.equals(this.isHardTerminal, openAttendeeEntity.isHardTerminal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, userAccount, userName, deptName, phone, email, sms, isHardTerminal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenAttendeeEntity {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    userAccount: ").append(toIndentedString(userAccount)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
        sb.append("    isHardTerminal: ").append(toIndentedString(isHardTerminal)).append("\n");
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
