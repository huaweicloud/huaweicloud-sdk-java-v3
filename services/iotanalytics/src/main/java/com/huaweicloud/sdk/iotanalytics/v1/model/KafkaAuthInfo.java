package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Kafka 认证信息
 */
public class KafkaAuthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protocol")

    private String securityProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_plain_auth_info")

    private SaslPlainAuthInfo saslPlainAuthInfo;

    public KafkaAuthInfo withSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * 安全协议
     * @return securityProtocol
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public KafkaAuthInfo withSaslPlainAuthInfo(SaslPlainAuthInfo saslPlainAuthInfo) {
        this.saslPlainAuthInfo = saslPlainAuthInfo;
        return this;
    }

    public KafkaAuthInfo withSaslPlainAuthInfo(Consumer<SaslPlainAuthInfo> saslPlainAuthInfoSetter) {
        if (this.saslPlainAuthInfo == null) {
            this.saslPlainAuthInfo = new SaslPlainAuthInfo();
            saslPlainAuthInfoSetter.accept(this.saslPlainAuthInfo);
        }

        return this;
    }

    /**
     * Get saslPlainAuthInfo
     * @return saslPlainAuthInfo
     */
    public SaslPlainAuthInfo getSaslPlainAuthInfo() {
        return saslPlainAuthInfo;
    }

    public void setSaslPlainAuthInfo(SaslPlainAuthInfo saslPlainAuthInfo) {
        this.saslPlainAuthInfo = saslPlainAuthInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaAuthInfo that = (KafkaAuthInfo) obj;
        return Objects.equals(this.securityProtocol, that.securityProtocol)
            && Objects.equals(this.saslPlainAuthInfo, that.saslPlainAuthInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityProtocol, saslPlainAuthInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaAuthInfo {\n");
        sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
        sb.append("    saslPlainAuthInfo: ").append(toIndentedString(saslPlainAuthInfo)).append("\n");
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
