package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改密码请求体
 */
public class ChangePasswordReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_password")

    private String originalPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket")

    private String ticket;

    public ChangePasswordReq withOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
        return this;
    }

    /**
     * 原始密码
     * @return originalPassword
     */
    public String getOriginalPassword() {
        return originalPassword;
    }

    public void setOriginalPassword(String originalPassword) {
        this.originalPassword = originalPassword;
    }

    public ChangePasswordReq withNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }

    /**
     * 新密码
     * @return newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public ChangePasswordReq withTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    /**
     * 预验证凭证
     * @return ticket
     */
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePasswordReq that = (ChangePasswordReq) obj;
        return Objects.equals(this.originalPassword, that.originalPassword)
            && Objects.equals(this.newPassword, that.newPassword) && Objects.equals(this.ticket, that.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originalPassword, newPassword, ticket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePasswordReq {\n");
        sb.append("    originalPassword: ").append(toIndentedString(originalPassword)).append("\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
        sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
