package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 与会嘉宾列表。该列表可以用于发送会议通知、会议提醒、会议开始时候进行自动邀请。
 */
public class OpenAttendeeEntity  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="appId")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userAccount")
    
    private String userAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userName")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deptName")
    
    private String deptName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sms")
    
    private String sms;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isHardTerminal")
    
    private Boolean isHardTerminal;

    public OpenAttendeeEntity withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * App ID，应用标识，一个应用只需创建一次。必填字段
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
     * 与会者的账号ID。如果是账号/密码鉴权场景，表示华为云会议帐号ID。如果是APP ID鉴权场景，表示第三方的User ID。必填字段
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
     * 与会者名称或昵称。长度限制为96个字符
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
     * 部门名称
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
     * 号码（可支持SIP、TEL号码格式）。最大不超过127个字符。phone、email和sms三者需至少填写一个。
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
     * 邮件地址。最大不超过255个字符。phone、email和sms三者需至少填写一个（用于预定、修改、取消会议的信息通知）。
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
     * 短信通知的手机号码。最大不超过32个字符。phone、email和sms三者需至少填写一个。（用于预定、修改、取消会议的信息通知）。
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
        return Objects.equals(this.appId, openAttendeeEntity.appId) &&
            Objects.equals(this.userAccount, openAttendeeEntity.userAccount) &&
            Objects.equals(this.userName, openAttendeeEntity.userName) &&
            Objects.equals(this.deptName, openAttendeeEntity.deptName) &&
            Objects.equals(this.phone, openAttendeeEntity.phone) &&
            Objects.equals(this.email, openAttendeeEntity.email) &&
            Objects.equals(this.sms, openAttendeeEntity.sms) &&
            Objects.equals(this.isHardTerminal, openAttendeeEntity.isHardTerminal);
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

