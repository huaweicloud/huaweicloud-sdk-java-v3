package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The request body of change password request.
 */
public class ChangePasswordReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_password")

    private String oldPassword;

    public ChangePasswordReqBody withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * IAM用户的新密码。
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ChangePasswordReqBody withOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }

    /**
     * IAM用户的旧密码。
     * @return oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePasswordReqBody that = (ChangePasswordReqBody) obj;
        return Objects.equals(this.newPassword, that.newPassword) && Objects.equals(this.oldPassword, that.oldPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, oldPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePasswordReqBody {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
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
