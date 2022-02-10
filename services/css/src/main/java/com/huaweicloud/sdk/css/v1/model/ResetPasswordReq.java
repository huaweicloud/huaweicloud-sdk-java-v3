package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ResetPasswordReq */
public class ResetPasswordReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newpassword")

    private String newpassword;

    public ResetPasswordReq withNewpassword(String newpassword) {
        this.newpassword = newpassword;
        return this;
    }

    /** 新密码。
     * 
     * @return newpassword */
    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
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
        return Objects.equals(this.newpassword, resetPasswordReq.newpassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newpassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPasswordReq {\n");
        sb.append("    newpassword: ").append(toIndentedString(newpassword)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
