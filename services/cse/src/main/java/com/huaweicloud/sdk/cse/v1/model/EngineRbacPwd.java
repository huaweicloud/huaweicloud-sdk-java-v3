package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作微服务引擎专享版安全认证信息
 */
public class EngineRbacPwd {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd")

    private String pwd;

    public EngineRbacPwd withPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    /**
     * 开启安全认证的微服务引擎专享版默认root帐号的密码
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
        EngineRbacPwd that = (EngineRbacPwd) obj;
        return Objects.equals(this.pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineRbacPwd {\n");
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
