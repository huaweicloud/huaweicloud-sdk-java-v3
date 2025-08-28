package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * IAM用户登录信息。
 */
public class LoginProfile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_reset_required")

    private Boolean passwordResetRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_expires_at")

    private OffsetDateTime passwordExpiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    public LoginProfile withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * IAM用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LoginProfile withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    /**
     * IAM用户下次登录时是否需要修改密码。
     * @return passwordResetRequired
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    public LoginProfile withPasswordExpiresAt(OffsetDateTime passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
        return this;
    }

    /**
     * IAM用户密码过期时间。
     * @return passwordExpiresAt
     */
    public OffsetDateTime getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(OffsetDateTime passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    public LoginProfile withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * IAM用户登录信息创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginProfile that = (LoginProfile) obj;
        return Objects.equals(this.userId, that.userId)
            && Objects.equals(this.passwordResetRequired, that.passwordResetRequired)
            && Objects.equals(this.passwordExpiresAt, that.passwordExpiresAt)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, passwordResetRequired, passwordExpiresAt, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginProfile {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    passwordResetRequired: ").append(toIndentedString(passwordResetRequired)).append("\n");
        sb.append("    passwordExpiresAt: ").append(toIndentedString(passwordExpiresAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
