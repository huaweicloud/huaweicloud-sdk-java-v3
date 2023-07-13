package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 与会者信息。
 */
public class Attendee {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accountId")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptUUID")

    private String deptUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    public Attendee withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 与会者的用户UUID。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public Attendee withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 与会者的华为云会议帐号。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Attendee withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 与会者名称，长度限制为96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attendee withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * 会议中的角色。默认为普通与会者。 - 0: 普通与会者 - 1: 会议主持人
     * minimum: 0
     * maximum: 2
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Attendee withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 号码。支持SIP号码或者手机号码。 > * 号码可以通过[[查询企业通讯](https://support.huaweicloud.com/api-meeting/meeting_21_0512.html)](tag:hws)[[查询企业通讯](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0512.html)](tag:hk)接口录获取。返回的number是SIP号码，phone是手机号码 > * 填SIP号码系统会呼叫对应的软终端或者硬终端；填手机号码系统会呼叫手机 > * 呼叫手机需要开通PSTN权限，否则无法呼叫 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Attendee withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    /**
     * 预留字段，取值类型同参数“phone”。
     * @return phone2
     */
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Attendee withPhone3(String phone3) {
        this.phone3 = phone3;
        return this;
    }

    /**
     * 预留字段，取值类型同参数“phone”。
     * @return phone3
     */
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public Attendee withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮件地址。 > 会中邀请不发会议通知，不用填写。 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Attendee withSms(String sms) {
        this.sms = sms;
        return this;
    }

    /**
     * 短信通知的手机号码。 > 会中邀请不发会议通知，不用填写。 
     * @return sms
     */
    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public Attendee withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 终端类型，类型枚举如下： * normal：软终端 * terminal：硬终端 * outside：外部与会人 * mobile：用户手机号码 * ideahub：ideahub * board: 电子白板（SmartRooms）。含Maxhub、海信大屏、IdeaHub B2hwvision：华为智慧屏TV
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Attendee withDeptUUID(String deptUUID) {
        this.deptUUID = deptUUID;
        return this;
    }

    /**
     * 部门编码。
     * @return deptUUID
     */
    public String getDeptUUID() {
        return deptUUID;
    }

    public void setDeptUUID(String deptUUID) {
        this.deptUUID = deptUUID;
    }

    public Attendee withDeptName(String deptName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attendee that = (Attendee) obj;
        return Objects.equals(this.userUUID, that.userUUID) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.role, that.role)
            && Objects.equals(this.phone, that.phone) && Objects.equals(this.phone2, that.phone2)
            && Objects.equals(this.phone3, that.phone3) && Objects.equals(this.email, that.email)
            && Objects.equals(this.sms, that.sms) && Objects.equals(this.type, that.type)
            && Objects.equals(this.deptUUID, that.deptUUID) && Objects.equals(this.deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(userUUID, accountId, name, role, phone, phone2, phone3, email, sms, type, deptUUID, deptName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Attendee {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
        sb.append("    phone3: ").append(toIndentedString(phone3)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deptUUID: ").append(toIndentedString(deptUUID)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
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
