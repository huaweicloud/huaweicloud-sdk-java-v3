package com.huaweicloud.sdk.ces.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RemoteInstallHostInfo
 */
public class RemoteInstallHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_ip")

    private String remoteIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_use_pem")

    private Boolean remoteUsePem;

    public RemoteInstallHostInfo withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机名称 **取值范围**: 数组长度范围为[1,128] 
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RemoteInstallHostInfo withRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机IP **取值范围**: 仅由数字(0-9)和小数点(.)组成的字符串，字符串长度为[1,15] 
     * @return remoteIp
     */
    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public RemoteInstallHostInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机的登录用户名 **取值范围**: 数组长度范围为[1,16] 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RemoteInstallHostInfo withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机的登录端口 **取值范围**: 数组长度范围为[1,5] 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RemoteInstallHostInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机的登录密码 **取值范围**: 数组长度范围为[1,3000] 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RemoteInstallHostInfo withRemoteUsePem(Boolean remoteUsePem) {
        this.remoteUsePem = remoteUsePem;
        return this;
    }

    /**
     * **参数解释**: 被远程安装的主机远程连接是否采用密钥方式（false时为密码方式） **取值范围**: - false: 密码方式 - true: 密钥方式 
     * @return remoteUsePem
     */
    public Boolean getRemoteUsePem() {
        return remoteUsePem;
    }

    public void setRemoteUsePem(Boolean remoteUsePem) {
        this.remoteUsePem = remoteUsePem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemoteInstallHostInfo that = (RemoteInstallHostInfo) obj;
        return Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.remoteIp, that.remoteIp)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.port, that.port)
            && Objects.equals(this.password, that.password) && Objects.equals(this.remoteUsePem, that.remoteUsePem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceName, remoteIp, userName, port, password, remoteUsePem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoteInstallHostInfo {\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    remoteIp: ").append(toIndentedString(remoteIp)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    remoteUsePem: ").append(toIndentedString(remoteUsePem)).append("\n");
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
