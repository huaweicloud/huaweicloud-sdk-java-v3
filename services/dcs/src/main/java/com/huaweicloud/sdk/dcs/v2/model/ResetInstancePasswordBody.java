package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResetInstancePasswordBody
 */
public class ResetInstancePasswordBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_password_access")

    private Boolean noPasswordAccess;

    public ResetInstancePasswordBody withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * 重置的新密码
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ResetInstancePasswordBody withNoPasswordAccess(Boolean noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
        return this;
    }

    /**
     * 是否重置为免密码访问缓存实例
     * @return noPasswordAccess
     */
    public Boolean getNoPasswordAccess() {
        return noPasswordAccess;
    }

    public void setNoPasswordAccess(Boolean noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetInstancePasswordBody resetInstancePasswordBody = (ResetInstancePasswordBody) o;
        return Objects.equals(this.newPassword, resetInstancePasswordBody.newPassword)
            && Objects.equals(this.noPasswordAccess, resetInstancePasswordBody.noPasswordAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, noPasswordAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetInstancePasswordBody {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    noPasswordAccess: ").append(toIndentedString(noPasswordAccess)).append("\n");
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
