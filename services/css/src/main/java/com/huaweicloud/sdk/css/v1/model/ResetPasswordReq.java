package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ResetPasswordReq
 */
public class ResetPasswordReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "newpassword")

    @JacksonXmlProperty(localName = "newpassword")

    private String newpassword;

    public ResetPasswordReq withNewpassword(String newpassword) {
        this.newpassword = newpassword;
        return this;
    }

    /**
     * 安全模式下集群管理员admin的密码，只有在创建集群时authorityEnable设置为true时该接口可用。 - 参数范围：8~32个字符。 - 参数要求：密码至少包含大写字母，小写字母，数字、特殊字符四类中的三类，其中可输入的特殊字符为：~!@#$%&*()-_=|[{}];:,<.>/?
     * @return newpassword
     */
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
