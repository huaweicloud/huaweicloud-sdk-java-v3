package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 发布订阅用户登录信息。
 */
public class ReplicationUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_port")

    private Integer serverPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_name")

    private String loginUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_user_password")

    private String loginUserPassword;

    public ReplicationUserInfo withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * 服务器ip。
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public ReplicationUserInfo withServerPort(Integer serverPort) {
        this.serverPort = serverPort;
        return this;
    }

    /**
     * 端口号。
     * @return serverPort
     */
    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public ReplicationUserInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 服务器名称。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ReplicationUserInfo withLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
        return this;
    }

    /**
     * 登录名。
     * @return loginUserName
     */
    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public ReplicationUserInfo withLoginUserPassword(String loginUserPassword) {
        this.loginUserPassword = loginUserPassword;
        return this;
    }

    /**
     * 登录密码。要求密码长度在5~64位之间。
     * @return loginUserPassword
     */
    public String getLoginUserPassword() {
        return loginUserPassword;
    }

    public void setLoginUserPassword(String loginUserPassword) {
        this.loginUserPassword = loginUserPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationUserInfo that = (ReplicationUserInfo) obj;
        return Objects.equals(this.serverIp, that.serverIp) && Objects.equals(this.serverPort, that.serverPort)
            && Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.loginUserName, that.loginUserName)
            && Objects.equals(this.loginUserPassword, that.loginUserPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverIp, serverPort, serverName, loginUserName, loginUserPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationUserInfo {\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    loginUserName: ").append(toIndentedString(loginUserName)).append("\n");
        sb.append("    loginUserPassword: ").append(toIndentedString(loginUserPassword)).append("\n");
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
