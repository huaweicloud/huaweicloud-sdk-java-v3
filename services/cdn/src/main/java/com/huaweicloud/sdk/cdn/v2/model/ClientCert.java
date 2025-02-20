package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 客户端证书配置
 */
public class ClientCert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trusted_cert")

    private String trustedCert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private String hosts;

    public ClientCert withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 客户端证书配置开关，on：打开；off：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ClientCert withTrustedCert(String trustedCert) {
        this.trustedCert = trustedCert;
        return this;
    }

    /**
     * 客户端CA证书的内容，仅支持PEM格式。
     * @return trustedCert
     */
    public String getTrustedCert() {
        return trustedCert;
    }

    public void setTrustedCert(String trustedCert) {
        this.trustedCert = trustedCert;
    }

    public ClientCert withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * 客户端CA证书指定的域名。   > 1. 如果不配置域名，则CDN会放行所有持有该CA证书的客户端请求。   > 2. 最多可配置100个域名，多个域名用“,”或“|”分隔。
     * @return hosts
     */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientCert that = (ClientCert) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.trustedCert, that.trustedCert)
            && Objects.equals(this.hosts, that.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, trustedCert, hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientCert {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trustedCert: ").append(toIndentedString(trustedCert)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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
