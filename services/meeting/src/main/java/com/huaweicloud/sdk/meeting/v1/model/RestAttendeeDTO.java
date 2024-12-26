package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 与会者信息。
 */
public class RestAttendeeDTO {

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
    @JsonProperty(value = "isMute")

    private Integer isMute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoInvite")

    private Integer isAutoInvite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptUUID")

    private String deptUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appId")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uniqueType")

    private Integer uniqueType;

    public RestAttendeeDTO withUserUUID(String userUUID) {
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

    public RestAttendeeDTO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 与会者的帐号。 * 如果是帐号/密码鉴权场景：选填，表示华为云会议帐号 * 如果是APPID鉴权场景：必填，表示第三方的User ID，同时需要携带参数appId
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public RestAttendeeDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 与会者名称。长度限制为96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestAttendeeDTO withRole(Integer role) {
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

    public RestAttendeeDTO withPhone(String phone) {
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

    public RestAttendeeDTO withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    /**
     * 预留字段，取值类型同phone。
     * @return phone2
     */
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public RestAttendeeDTO withPhone3(String phone3) {
        this.phone3 = phone3;
        return this;
    }

    /**
     * 预留字段，取值类型同phone。
     * @return phone3
     */
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public RestAttendeeDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱地址。需要发邮件通知时填写。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RestAttendeeDTO withSms(String sms) {
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

    public RestAttendeeDTO withIsMute(Integer isMute) {
        this.isMute = isMute;
        return this;
    }

    /**
     * 用户入会时是否需要自动静音。默认不静音。 - 0: 不需要静音 - 1: 需要静音 > 仅会中邀请与会者时生效。
     * minimum: 0
     * maximum: 1
     * @return isMute
     */
    public Integer getIsMute() {
        return isMute;
    }

    public void setIsMute(Integer isMute) {
        this.isMute = isMute;
    }

    public RestAttendeeDTO withIsAutoInvite(Integer isAutoInvite) {
        this.isAutoInvite = isAutoInvite;
        return this;
    }

    /**
     * 会议开始时是否自动邀请该与会者。默认值由企业级配置决定。 - 0: 不自动邀请 - 1: 自动邀请 > 仅并发会议资源的随机会议ID会议才生效。
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

    public RestAttendeeDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 终端类型，类型枚举如下： * normal: 软终端 * terminal: 会议室或硬终端 * outside: 外部与会人 * mobile: 用户手机号码 * ideahub：ideahub * board: 电子白板（SmartRooms），含Maxhub、海信大屏、IdeaHub B2 * hwvision：华为智慧屏TV
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RestAttendeeDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 预留字段，终端所在会议室信息。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RestAttendeeDTO withDeptUUID(String deptUUID) {
        this.deptUUID = deptUUID;
        return this;
    }

    /**
     * 部门ID。
     * @return deptUUID
     */
    public String getDeptUUID() {
        return deptUUID;
    }

    public void setDeptUUID(String deptUUID) {
        this.deptUUID = deptUUID;
    }

    public RestAttendeeDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门名称。最大不超过128个字符。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public RestAttendeeDTO withAppId(String appId) {
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

    public RestAttendeeDTO withUniqueType(Integer uniqueType) {
        this.uniqueType = uniqueType;
        return this;
    }

    /**
     * 企业内唯一会场标识, 0标识为普通与会者，1标识为企业内唯一会场; uniqueType 为1， 同时type要指定为customnumber
     * minimum: 0
     * maximum: 1
     * @return uniqueType
     */
    public Integer getUniqueType() {
        return uniqueType;
    }

    public void setUniqueType(Integer uniqueType) {
        this.uniqueType = uniqueType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestAttendeeDTO that = (RestAttendeeDTO) obj;
        return Objects.equals(this.userUUID, that.userUUID) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.role, that.role)
            && Objects.equals(this.phone, that.phone) && Objects.equals(this.phone2, that.phone2)
            && Objects.equals(this.phone3, that.phone3) && Objects.equals(this.email, that.email)
            && Objects.equals(this.sms, that.sms) && Objects.equals(this.isMute, that.isMute)
            && Objects.equals(this.isAutoInvite, that.isAutoInvite) && Objects.equals(this.type, that.type)
            && Objects.equals(this.address, that.address) && Objects.equals(this.deptUUID, that.deptUUID)
            && Objects.equals(this.deptName, that.deptName) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.uniqueType, that.uniqueType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUUID,
            accountId,
            name,
            role,
            phone,
            phone2,
            phone3,
            email,
            sms,
            isMute,
            isAutoInvite,
            type,
            address,
            deptUUID,
            deptName,
            appId,
            uniqueType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestAttendeeDTO {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
        sb.append("    phone3: ").append(toIndentedString(phone3)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
        sb.append("    isMute: ").append(toIndentedString(isMute)).append("\n");
        sb.append("    isAutoInvite: ").append(toIndentedString(isAutoInvite)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    deptUUID: ").append(toIndentedString(deptUUID)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    uniqueType: ").append(toIndentedString(uniqueType)).append("\n");
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
