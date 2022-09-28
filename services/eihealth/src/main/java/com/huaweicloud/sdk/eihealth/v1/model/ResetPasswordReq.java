package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 重置密码请求体
 */
public class ResetPasswordReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "method")

    private String method;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_password")

    private String originalPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_password")

    private String newPassword;

    public ResetPasswordReq withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 验证码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResetPasswordReq withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * 认证方式
     * @return method
     */
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ResetPasswordReq withOriginalPassword(String originalPassword) {
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

    public ResetPasswordReq withNewPassword(String newPassword) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResetPasswordReq resetPasswordReq = (ResetPasswordReq) o;
        return Objects.equals(this.code, resetPasswordReq.code) && Objects.equals(this.method, resetPasswordReq.method)
            && Objects.equals(this.originalPassword, resetPasswordReq.originalPassword)
            && Objects.equals(this.newPassword, resetPasswordReq.newPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, method, originalPassword, newPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordReq {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    originalPassword: ").append(toIndentedString(originalPassword)).append("\n");
        sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
