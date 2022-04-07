package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UserPassword */
public class UserPassword {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public UserPassword withUsername(String username) {
        this.username = username;
        return this;
    }

    /** 登录帐号，默认为“root”
     * 
     * @return username */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserPassword withPassword(String password) {
        this.password = password;
        return this;
    }

    /** 登录密码，若创建节点通过用户名密码方式，即使用该字段，则响应体中该字段作屏蔽展示。 密码复杂度要求： - 长度为8-26位。 -
     * 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?~#*）中的三种。 - 密码不能包含用户名或用户名的逆序。
     * 创建节点时password字段需要加盐加密，具体方法请参见[创建节点时password字段加盐加密](add-salt.xml)。
     * 
     * @return password */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserPassword userPassword = (UserPassword) o;
        return Objects.equals(this.username, userPassword.username)
            && Objects.equals(this.password, userPassword.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserPassword {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
