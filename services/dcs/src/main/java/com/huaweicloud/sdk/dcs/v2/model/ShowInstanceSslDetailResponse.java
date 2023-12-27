package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceSslDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_expired_at")

    private String sslExpiredAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_validated")

    private Boolean sslValidated;

    public ShowInstanceSslDetailResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 开启或关闭SSL。true：开启/false：关闭
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowInstanceSslDetailResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * SSL连接IP。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowInstanceSslDetailResponse withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * SSL连接端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ShowInstanceSslDetailResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * SSL连接域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowInstanceSslDetailResponse withSslExpiredAt(String sslExpiredAt) {
        this.sslExpiredAt = sslExpiredAt;
        return this;
    }

    /**
     * SSL证书有效期（UTC时间）。
     * @return sslExpiredAt
     */
    public String getSslExpiredAt() {
        return sslExpiredAt;
    }

    public void setSslExpiredAt(String sslExpiredAt) {
        this.sslExpiredAt = sslExpiredAt;
    }

    public ShowInstanceSslDetailResponse withSslValidated(Boolean sslValidated) {
        this.sslValidated = sslValidated;
        return this;
    }

    /**
     * SSL证书是否有效。
     * @return sslValidated
     */
    public Boolean getSslValidated() {
        return sslValidated;
    }

    public void setSslValidated(Boolean sslValidated) {
        this.sslValidated = sslValidated;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceSslDetailResponse that = (ShowInstanceSslDetailResponse) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.sslExpiredAt, that.sslExpiredAt)
            && Objects.equals(this.sslValidated, that.sslValidated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, ip, port, domainName, sslExpiredAt, sslValidated);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceSslDetailResponse {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    sslExpiredAt: ").append(toIndentedString(sslExpiredAt)).append("\n");
        sb.append("    sslValidated: ").append(toIndentedString(sslValidated)).append("\n");
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
