package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 与会者信息
 */
public class RestAttendeeDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userUUID")
    
    private String userUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accountId")
    
    private String accountId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private Integer role = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone2")
    
    private String phone2;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone3")
    
    private String phone3;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sms")
    
    private String sms;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isMute")
    
    private Integer isMute = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isAutoInvite")
    
    private Integer isAutoInvite = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptUUID")
    
    private String deptUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;

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
     * 与会者帐号，兼容终端老版本。如果没有携带userUUID，就通过accountId查询用户信息。
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
     * 与会者名称或昵称，长度限制为96个字符。
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
     * 会议中的角色。默认为普通与会者。 - 0: 普通与会者。 - 1: 会议主席。 - 2: 预留字段，暂不对外开放。
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
     * 电话号码(可支持SIP、TEL号码格式)。最大不超过127个字符。phone、email和sms三者需至少填写一个。当type为telepresence时，且设备为三屏智真，则该字段填写中屏号码。
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
     * 预留字段，取值类型同phone。当type为telepresence时，且设备为三屏智真，则该字段填写左屏号码
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
     * 预留字段，取值类型同phone。当type为telepresence时，且设备为三屏智真，则该字段填写右屏号码
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
     * 邮件地址。最大不超过255个字符。phone、email和sms三者需至少填写一个。
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
     * 短信通知的手机号码。最大不超过32个字符。phone、email和sms三者需至少填写一个。
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
     * 用户入会时是否需要自动静音。默认不静音。 - 0: 不需要静音。 - 1: 需要静音。
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
     * 会议开始时是否自动邀请该与会者。默认自动邀请。 - 0: 不自动邀请 - 1: 自动邀请
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
     * 默认值由会议AS定义，号码类型枚举如下： - normal: 软终端。 - telepresence: 智真。单屏、三屏智真均属此类。（预留字段） - terminal: 会议室或硬终端。 - outside: 外部与会人。 - mobile: 用户手机号码。 - telephone: 软终端用户固定电话，暂不使用。
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
     * 终端所在会议室信息。（预留字段）
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
     * 部门ID。最大不超过64个字符。
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestAttendeeDTO restAttendeeDTO = (RestAttendeeDTO) o;
        return Objects.equals(this.userUUID, restAttendeeDTO.userUUID) &&
            Objects.equals(this.accountId, restAttendeeDTO.accountId) &&
            Objects.equals(this.name, restAttendeeDTO.name) &&
            Objects.equals(this.role, restAttendeeDTO.role) &&
            Objects.equals(this.phone, restAttendeeDTO.phone) &&
            Objects.equals(this.phone2, restAttendeeDTO.phone2) &&
            Objects.equals(this.phone3, restAttendeeDTO.phone3) &&
            Objects.equals(this.email, restAttendeeDTO.email) &&
            Objects.equals(this.sms, restAttendeeDTO.sms) &&
            Objects.equals(this.isMute, restAttendeeDTO.isMute) &&
            Objects.equals(this.isAutoInvite, restAttendeeDTO.isAutoInvite) &&
            Objects.equals(this.type, restAttendeeDTO.type) &&
            Objects.equals(this.address, restAttendeeDTO.address) &&
            Objects.equals(this.deptUUID, restAttendeeDTO.deptUUID) &&
            Objects.equals(this.deptName, restAttendeeDTO.deptName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userUUID, accountId, name, role, phone, phone2, phone3, email, sms, isMute, isAutoInvite, type, address, deptUUID, deptName);
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

