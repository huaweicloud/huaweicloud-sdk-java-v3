package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库SSL证书信息体。如果数据库启用了SSL安全连接，请确保相关配置正确，并输入SSL证书相关参数，否则无需填写此参数。
 */
public class EndpointSslConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_link")

    private Boolean sslLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_name")

    private String sslCertName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_key")

    private String sslCertKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_check_sum")

    private String sslCertCheckSum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_cert_password")

    private String sslCertPassword;

    public EndpointSslConfig withSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
        return this;
    }

    /**
     * 是否SSL安全连接。如果数据库启用了SSL安全连接，参数值为true。
     * @return sslLink
     */
    public Boolean getSslLink() {
        return sslLink;
    }

    public void setSslLink(Boolean sslLink) {
        this.sslLink = sslLink;
    }

    public EndpointSslConfig withSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
        return this;
    }

    /**
     * SSL证书名字。
     * @return sslCertName
     */
    public String getSslCertName() {
        return sslCertName;
    }

    public void setSslCertName(String sslCertName) {
        this.sslCertName = sslCertName;
    }

    public EndpointSslConfig withSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
        return this;
    }

    /**
     * SSL证书内容，用base64加密。
     * @return sslCertKey
     */
    public String getSslCertKey() {
        return sslCertKey;
    }

    public void setSslCertKey(String sslCertKey) {
        this.sslCertKey = sslCertKey;
    }

    public EndpointSslConfig withSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
        return this;
    }

    /**
     * SSL证书内容checksum值，后端校验，源库安全连接必选。
     * @return sslCertCheckSum
     */
    public String getSslCertCheckSum() {
        return sslCertCheckSum;
    }

    public void setSslCertCheckSum(String sslCertCheckSum) {
        this.sslCertCheckSum = sslCertCheckSum;
    }

    public EndpointSslConfig withSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
        return this;
    }

    /**
     * SSL证书密码，证书文件后缀为.p12时必填。
     * @return sslCertPassword
     */
    public String getSslCertPassword() {
        return sslCertPassword;
    }

    public void setSslCertPassword(String sslCertPassword) {
        this.sslCertPassword = sslCertPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointSslConfig endpointSslConfig = (EndpointSslConfig) o;
        return Objects.equals(this.sslLink, endpointSslConfig.sslLink)
            && Objects.equals(this.sslCertName, endpointSslConfig.sslCertName)
            && Objects.equals(this.sslCertKey, endpointSslConfig.sslCertKey)
            && Objects.equals(this.sslCertCheckSum, endpointSslConfig.sslCertCheckSum)
            && Objects.equals(this.sslCertPassword, endpointSslConfig.sslCertPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslLink, sslCertName, sslCertKey, sslCertCheckSum, sslCertPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointSslConfig {\n");
        sb.append("    sslLink: ").append(toIndentedString(sslLink)).append("\n");
        sb.append("    sslCertName: ").append(toIndentedString(sslCertName)).append("\n");
        sb.append("    sslCertKey: ").append(toIndentedString(sslCertKey)).append("\n");
        sb.append("    sslCertCheckSum: ").append(toIndentedString(sslCertCheckSum)).append("\n");
        sb.append("    sslCertPassword: ").append(toIndentedString(sslCertPassword)).append("\n");
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
