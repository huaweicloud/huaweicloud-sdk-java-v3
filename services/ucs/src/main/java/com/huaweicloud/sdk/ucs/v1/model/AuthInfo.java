package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户认证信息
 */
public class AuthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-certificate-data")

    private String clientCertificateData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client-key-data")

    private String clientKeyData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public AuthInfo withClientCertificateData(String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
        return this;
    }

    /**
     * 客户端证书
     * @return clientCertificateData
     */
    public String getClientCertificateData() {
        return clientCertificateData;
    }

    public void setClientCertificateData(String clientCertificateData) {
        this.clientCertificateData = clientCertificateData;
    }

    public AuthInfo withClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
        return this;
    }

    /**
     * 包含来自TLS客户端密钥文件的PEM编码数据
     * @return clientKeyData
     */
    public String getClientKeyData() {
        return clientKeyData;
    }

    public void setClientKeyData(String clientKeyData) {
        this.clientKeyData = clientKeyData;
    }

    public AuthInfo withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 身份验证令牌
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthInfo that = (AuthInfo) obj;
        return Objects.equals(this.clientCertificateData, that.clientCertificateData)
            && Objects.equals(this.clientKeyData, that.clientKeyData) && Objects.equals(this.token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientCertificateData, clientKeyData, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthInfo {\n");
        sb.append("    clientCertificateData: ").append(toIndentedString(clientCertificateData)).append("\n");
        sb.append("    clientKeyData: ").append(toIndentedString(clientKeyData)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
