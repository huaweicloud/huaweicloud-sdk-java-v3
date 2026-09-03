package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 未保存密码的登录信息
 */
public class RetryLoginInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_save_password")

    private Boolean isSavePassword;

    public RetryLoginInfo withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 登录数据库的用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RetryLoginInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 登录数据库的密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RetryLoginInfo withIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
        return this;
    }

    /**
     * 是否保存密码
     * @return isSavePassword
     */
    public Boolean getIsSavePassword() {
        return isSavePassword;
    }

    public void setIsSavePassword(Boolean isSavePassword) {
        this.isSavePassword = isSavePassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryLoginInfo that = (RetryLoginInfo) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.isSavePassword, that.isSavePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, isSavePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryLoginInfo {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isSavePassword: ").append(toIndentedString(isSavePassword)).append("\n");
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
