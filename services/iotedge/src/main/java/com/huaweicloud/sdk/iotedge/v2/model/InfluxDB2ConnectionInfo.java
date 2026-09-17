package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建外部推送通道请求结构体
 */
public class InfluxDB2ConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_certs")

    private Object trustCerts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_hostname")

    private Boolean verifyHostname;

    public InfluxDB2ConnectionInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 鉴权token
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InfluxDB2ConnectionInfo withTrustCerts(Object trustCerts) {
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

    public InfluxDB2ConnectionInfo withVerifyHostname(Boolean verifyHostname) {
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
        InfluxDB2ConnectionInfo that = (InfluxDB2ConnectionInfo) obj;
        return Objects.equals(this.token, that.token) && Objects.equals(this.trustCerts, that.trustCerts)
            && Objects.equals(this.verifyHostname, that.verifyHostname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, trustCerts, verifyHostname);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InfluxDB2ConnectionInfo {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
