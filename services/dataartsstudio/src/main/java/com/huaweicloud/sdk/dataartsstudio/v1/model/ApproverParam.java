package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApproverParam
 */
public class ApproverParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver_name")

    private String approverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_number")

    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_notify")

    private Boolean emailNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_notify")

    private Boolean smsNotify;

    public ApproverParam withApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }

    /**
     * 审批人姓名。
     * @return approverName
     */
    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public ApproverParam withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 审批人ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ApproverParam withEmail(String email) {
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

    public ApproverParam withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * 电话号码。
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ApproverParam withEmailNotify(Boolean emailNotify) {
        this.emailNotify = emailNotify;
        return this;
    }

    /**
     * 邮件通知。
     * @return emailNotify
     */
    public Boolean getEmailNotify() {
        return emailNotify;
    }

    public void setEmailNotify(Boolean emailNotify) {
        this.emailNotify = emailNotify;
    }

    public ApproverParam withSmsNotify(Boolean smsNotify) {
        this.smsNotify = smsNotify;
        return this;
    }

    /**
     * 短信通知。
     * @return smsNotify
     */
    public Boolean getSmsNotify() {
        return smsNotify;
    }

    public void setSmsNotify(Boolean smsNotify) {
        this.smsNotify = smsNotify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApproverParam that = (ApproverParam) obj;
        return Objects.equals(this.approverName, that.approverName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.email, that.email) && Objects.equals(this.phoneNumber, that.phoneNumber)
            && Objects.equals(this.emailNotify, that.emailNotify) && Objects.equals(this.smsNotify, that.smsNotify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(approverName, userId, email, phoneNumber, emailNotify, smsNotify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApproverParam {\n");
        sb.append("    approverName: ").append(toIndentedString(approverName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
        sb.append("    emailNotify: ").append(toIndentedString(emailNotify)).append("\n");
        sb.append("    smsNotify: ").append(toIndentedString(smsNotify)).append("\n");
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
