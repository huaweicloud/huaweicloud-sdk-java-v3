package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 邮件记录详细信息。
 */
public class AuthorizationMail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_auth_type")

    private AccountTypeEnum accountAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_auth_name")

    private String accountAuthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_name")

    private String appGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail_send_type")

    private String mailSendType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail_send_result")

    private String mailSendResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_at")

    private OffsetDateTime sendAt;

    public AuthorizationMail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 邮件记录id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuthorizationMail withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户(组)。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AuthorizationMail withAccountAuthType(AccountTypeEnum accountAuthType) {
        this.accountAuthType = accountAuthType;
        return this;
    }

    /**
     * Get accountAuthType
     * @return accountAuthType
     */
    public AccountTypeEnum getAccountAuthType() {
        return accountAuthType;
    }

    public void setAccountAuthType(AccountTypeEnum accountAuthType) {
        this.accountAuthType = accountAuthType;
    }

    public AuthorizationMail withAccountAuthName(String accountAuthName) {
        this.accountAuthName = accountAuthName;
        return this;
    }

    /**
     * 授权对象名称。
     * @return accountAuthName
     */
    public String getAccountAuthName() {
        return accountAuthName;
    }

    public void setAccountAuthName(String accountAuthName) {
        this.accountAuthName = accountAuthName;
    }

    public AuthorizationMail withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public AuthorizationMail withAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }

    /**
     * 应用组名称。
     * @return appGroupName
     */
    public String getAppGroupName() {
        return appGroupName;
    }

    public void setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
    }

    public AuthorizationMail withMailSendType(String mailSendType) {
        this.mailSendType = mailSendType;
        return this;
    }

    /**
     * 授权类型： - ADD_GROUP_AUTHORIZATION 添加组授权邮件 - DEL_GROUP_AUTHORIZATION 删除组授权邮件 - ADD_GROUP_AUTHORIZATION_SMS 添加组授权短信 - DEL_GROUP_AUTHORIZATION_SMS 删除组授权短信。
     * @return mailSendType
     */
    public String getMailSendType() {
        return mailSendType;
    }

    public void setMailSendType(String mailSendType) {
        this.mailSendType = mailSendType;
    }

    public AuthorizationMail withMailSendResult(String mailSendResult) {
        this.mailSendResult = mailSendResult;
        return this;
    }

    /**
     * 发送结果。 - SUEECESS -发送成功 - FAIL -发送失败。
     * @return mailSendResult
     */
    public String getMailSendResult() {
        return mailSendResult;
    }

    public void setMailSendResult(String mailSendResult) {
        this.mailSendResult = mailSendResult;
    }

    public AuthorizationMail withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 报错信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public AuthorizationMail withSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    /**
     * 发布时间。
     * @return sendAt
     */
    public OffsetDateTime getSendAt() {
        return sendAt;
    }

    public void setSendAt(OffsetDateTime sendAt) {
        this.sendAt = sendAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizationMail that = (AuthorizationMail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.account, that.account)
            && Objects.equals(this.accountAuthType, that.accountAuthType)
            && Objects.equals(this.accountAuthName, that.accountAuthName)
            && Objects.equals(this.appGroupId, that.appGroupId) && Objects.equals(this.appGroupName, that.appGroupName)
            && Objects.equals(this.mailSendType, that.mailSendType)
            && Objects.equals(this.mailSendResult, that.mailSendResult) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.sendAt, that.sendAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            account,
            accountAuthType,
            accountAuthName,
            appGroupId,
            appGroupName,
            mailSendType,
            mailSendResult,
            errorMsg,
            sendAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizationMail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    accountAuthType: ").append(toIndentedString(accountAuthType)).append("\n");
        sb.append("    accountAuthName: ").append(toIndentedString(accountAuthName)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appGroupName: ").append(toIndentedString(appGroupName)).append("\n");
        sb.append("    mailSendType: ").append(toIndentedString(mailSendType)).append("\n");
        sb.append("    mailSendResult: ").append(toIndentedString(mailSendResult)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    sendAt: ").append(toIndentedString(sendAt)).append("\n");
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
