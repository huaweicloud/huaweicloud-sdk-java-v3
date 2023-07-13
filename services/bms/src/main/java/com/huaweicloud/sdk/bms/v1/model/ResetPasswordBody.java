package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 一键重置裸金属服务器密码接口请求结构体
 */
public class ResetPasswordBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset-password")

    private ResetPassword resetPassword;

    public ResetPasswordBody withResetPassword(ResetPassword resetPassword) {
        this.resetPassword = resetPassword;
        return this;
    }

    public ResetPasswordBody withResetPassword(Consumer<ResetPassword> resetPasswordSetter) {
        if (this.resetPassword == null) {
            this.resetPassword = new ResetPassword();
            resetPasswordSetter.accept(this.resetPassword);
        }

        return this;
    }

    /**
     * Get resetPassword
     * @return resetPassword
     */
    public ResetPassword getResetPassword() {
        return resetPassword;
    }

    public void setResetPassword(ResetPassword resetPassword) {
        this.resetPassword = resetPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetPasswordBody that = (ResetPasswordBody) obj;
        return Objects.equals(this.resetPassword, that.resetPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resetPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordBody {\n");
        sb.append("    resetPassword: ").append(toIndentedString(resetPassword)).append("\n");
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
