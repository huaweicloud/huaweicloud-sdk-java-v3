package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EditUserReq
 */
public class EditUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private String accountExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_password")

    private Boolean enableChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_never_expired")

    private Boolean passwordNeverExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    public EditUserReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EditUserReq withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 用户邮箱。
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public EditUserReq withAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账户过期时间，0表示永远不过期。
     * @return accountExpires
     */
    public String getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    public EditUserReq withEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
        return this;
    }

    /**
     * 是否允许修改密码，true表示允许，false表示不允许。
     * @return enableChangePassword
     */
    public Boolean getEnableChangePassword() {
        return enableChangePassword;
    }

    public void setEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
    }

    public EditUserReq withNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
        return this;
    }

    /**
     * 下次登录是否需要重置密码，true表示需要重置密码，false表示不需要。
     * @return nextLoginChangePassword
     */
    public Boolean getNextLoginChangePassword() {
        return nextLoginChangePassword;
    }

    public void setNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
    }

    public EditUserReq withPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
        return this;
    }

    /**
     * 密码是否永不过期，true表示密码永不过期，false表示密码会过期。
     * @return passwordNeverExpired
     */
    public Boolean getPasswordNeverExpired() {
        return passwordNeverExpired;
    }

    public void setPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
    }

    public EditUserReq withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 账户是否禁用，true表示被禁用，false表示未禁用。
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EditUserReq editUserReq = (EditUserReq) o;
        return Objects.equals(this.description, editUserReq.description)
            && Objects.equals(this.userEmail, editUserReq.userEmail)
            && Objects.equals(this.accountExpires, editUserReq.accountExpires)
            && Objects.equals(this.enableChangePassword, editUserReq.enableChangePassword)
            && Objects.equals(this.nextLoginChangePassword, editUserReq.nextLoginChangePassword)
            && Objects.equals(this.passwordNeverExpired, editUserReq.passwordNeverExpired)
            && Objects.equals(this.disabled, editUserReq.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            userEmail,
            accountExpires,
            enableChangePassword,
            nextLoginChangePassword,
            passwordNeverExpired,
            disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditUserReq {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    enableChangePassword: ").append(toIndentedString(enableChangePassword)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    passwordNeverExpired: ").append(toIndentedString(passwordNeverExpired)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
