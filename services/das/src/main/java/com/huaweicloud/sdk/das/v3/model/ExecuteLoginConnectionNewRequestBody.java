package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 登录操作请求体
 */
public class ExecuteLoginConnectionNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private LoginInfo login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logout")

    private LogoutInfo logout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_login")

    private RetryLoginInfo retryLogin;

    public ExecuteLoginConnectionNewRequestBody withLogin(LoginInfo login) {
        this.login = login;
        return this;
    }

    public ExecuteLoginConnectionNewRequestBody withLogin(Consumer<LoginInfo> loginSetter) {
        if (this.login == null) {
            this.login = new LoginInfo();
            loginSetter.accept(this.login);
        }

        return this;
    }

    /**
     * Get login
     * @return login
     */
    public LoginInfo getLogin() {
        return login;
    }

    public void setLogin(LoginInfo login) {
        this.login = login;
    }

    public ExecuteLoginConnectionNewRequestBody withLogout(LogoutInfo logout) {
        this.logout = logout;
        return this;
    }

    public ExecuteLoginConnectionNewRequestBody withLogout(Consumer<LogoutInfo> logoutSetter) {
        if (this.logout == null) {
            this.logout = new LogoutInfo();
            logoutSetter.accept(this.logout);
        }

        return this;
    }

    /**
     * Get logout
     * @return logout
     */
    public LogoutInfo getLogout() {
        return logout;
    }

    public void setLogout(LogoutInfo logout) {
        this.logout = logout;
    }

    public ExecuteLoginConnectionNewRequestBody withRetryLogin(RetryLoginInfo retryLogin) {
        this.retryLogin = retryLogin;
        return this;
    }

    public ExecuteLoginConnectionNewRequestBody withRetryLogin(Consumer<RetryLoginInfo> retryLoginSetter) {
        if (this.retryLogin == null) {
            this.retryLogin = new RetryLoginInfo();
            retryLoginSetter.accept(this.retryLogin);
        }

        return this;
    }

    /**
     * Get retryLogin
     * @return retryLogin
     */
    public RetryLoginInfo getRetryLogin() {
        return retryLogin;
    }

    public void setRetryLogin(RetryLoginInfo retryLogin) {
        this.retryLogin = retryLogin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteLoginConnectionNewRequestBody that = (ExecuteLoginConnectionNewRequestBody) obj;
        return Objects.equals(this.login, that.login) && Objects.equals(this.logout, that.logout)
            && Objects.equals(this.retryLogin, that.retryLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, logout, retryLogin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteLoginConnectionNewRequestBody {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    logout: ").append(toIndentedString(logout)).append("\n");
        sb.append("    retryLogin: ").append(toIndentedString(retryLogin)).append("\n");
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
