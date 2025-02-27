package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangeUsersPassword
 */
public class ChangeUsersPassword {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_password")

    private String oldPassword;

    public ChangeUsersPassword withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 新密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ChangeUsersPassword withOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }

    /**
     * 旧密码。
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
        ChangeUsersPassword that = (ChangeUsersPassword) obj;
        return Objects.equals(this.password, that.password) && Objects.equals(this.oldPassword, that.oldPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, oldPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeUsersPassword {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
