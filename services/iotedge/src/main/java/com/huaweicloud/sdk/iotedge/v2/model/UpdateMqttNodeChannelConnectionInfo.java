package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新外部推送通道请求结构体
 */
public class UpdateMqttNodeChannelConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

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

    public UpdateMqttNodeChannelConnectionInfo withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * mqtt协议中的ClientId
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public UpdateMqttNodeChannelConnectionInfo withUsername(String username) {
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

    public UpdateMqttNodeChannelConnectionInfo withPassword(String password) {
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

    public UpdateMqttNodeChannelConnectionInfo withTrustCerts(Object trustCerts) {
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

    public UpdateMqttNodeChannelConnectionInfo withVerifyHostname(Boolean verifyHostname) {
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
        UpdateMqttNodeChannelConnectionInfo that = (UpdateMqttNodeChannelConnectionInfo) obj;
        return Objects.equals(this.clientId, that.clientId) && Objects.equals(this.username, that.username)
            && Objects.equals(this.password, that.password) && Objects.equals(this.trustCerts, that.trustCerts)
            && Objects.equals(this.verifyHostname, that.verifyHostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, username, password, trustCerts, verifyHostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMqttNodeChannelConnectionInfo {\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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
