package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 外部推送通道返回详情
 */
public class MqttConnectionInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_certs")

    private Object trustCerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_hostname")

    private Boolean verifyHostname;

    public MqttConnectionInfoResp withUsername(String username) {
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

    public MqttConnectionInfoResp withTrustCerts(Object trustCerts) {
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

    public MqttConnectionInfoResp withVerifyHostname(Boolean verifyHostname) {
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
        MqttConnectionInfoResp that = (MqttConnectionInfoResp) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.trustCerts, that.trustCerts)
            && Objects.equals(this.verifyHostname, that.verifyHostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, trustCerts, verifyHostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MqttConnectionInfoResp {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
