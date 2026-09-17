package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建外部推送通道请求结构体
 */
public class ItMqttConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_certs")

    private Object trustCerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_hostname")

    private Boolean verifyHostname;

    public ItMqttConnectionInfo withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 鉴权用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ItMqttConnectionInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 鉴权密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ItMqttConnectionInfo withTrustCerts(Object trustCerts) {
        this.trustCerts = trustCerts;
        return this;
    }

    /**
     * 客户端信任证书列表
     * @return trustCerts
     */
    public Object getTrustCerts() {
        return trustCerts;
    }

    public void setTrustCerts(Object trustCerts) {
        this.trustCerts = trustCerts;
    }

    public ItMqttConnectionInfo withVerifyHostname(Boolean verifyHostname) {
        this.verifyHostname = verifyHostname;
        return this;
    }

    /**
     * 客户端是否开启校验域名
     * @return verifyHostname
     */
    public Boolean getVerifyHostname() {
        return verifyHostname;
    }

    public void setVerifyHostname(Boolean verifyHostname) {
        this.verifyHostname = verifyHostname;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ItMqttConnectionInfo that = (ItMqttConnectionInfo) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.password, that.password)
            && Objects.equals(this.trustCerts, that.trustCerts)
            && Objects.equals(this.verifyHostname, that.verifyHostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, trustCerts, verifyHostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItMqttConnectionInfo {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    trustCerts: ").append(toIndentedString(trustCerts)).append("\n");
        sb.append("    verifyHostname: ").append(toIndentedString(verifyHostname)).append("\n");
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
