package com.huaweicloud.sdk.vas.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VCN服务器信息，仅输入类型为vcn时需填且必填。
 */
public class TaskInputVcn {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public TaskInputVcn withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * VCN服务器的IP地址，仅输入类型为vcn时需填且必填。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TaskInputVcn withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * VCN服务器的端口号，仅输入类型为vcn时需填且必填。
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public TaskInputVcn withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * VCN服务器的账号名，仅输入类型为vcn时需填且必填。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public TaskInputVcn withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * VCN服务器的与账号对应的密码，仅输入类型为vcn时需填且必填。
     * @return password
     */
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
        TaskInputVcn taskInputVcn = (TaskInputVcn) o;
        return Objects.equals(this.ip, taskInputVcn.ip) && Objects.equals(this.port, taskInputVcn.port)
            && Objects.equals(this.username, taskInputVcn.username)
            && Objects.equals(this.password, taskInputVcn.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port, username, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInputVcn {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
