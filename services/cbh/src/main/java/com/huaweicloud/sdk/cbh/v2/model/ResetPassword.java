package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机实例修改admin用户密码
 */
public class ResetPassword {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    public ResetPassword withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * admin用户修改后的新密码，8-32位，大写字母、小写字母、数字和特殊字符。
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ResetPassword withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机实例ID，使用UUID格式表示。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetPassword that = (ResetPassword) obj;
        return Objects.equals(this.newPassword, that.newPassword) && Objects.equals(this.serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newPassword, serverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPassword {\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
