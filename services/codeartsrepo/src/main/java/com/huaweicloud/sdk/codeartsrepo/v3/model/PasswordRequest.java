package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PasswordRequest
 */
public class PasswordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    public PasswordRequest withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * https密码
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PasswordRequest that = (PasswordRequest) obj;
        return Objects.equals(this.pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasswordRequest {\n");
        sb.append("    pwd: ").append(toIndentedString(pwd)).append("\n");
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
