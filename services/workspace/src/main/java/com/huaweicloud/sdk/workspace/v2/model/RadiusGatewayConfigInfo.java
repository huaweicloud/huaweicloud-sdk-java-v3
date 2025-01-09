package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 短信辅助认证配置
 */
public class RadiusGatewayConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_domain_name")

    private String certDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_url")

    private String tokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_cipher_url")

    private String verificationCipherUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assist_auth_type")

    private String assistAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    private String expiration;

    public RadiusGatewayConfigInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public RadiusGatewayConfigInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 用户名
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public RadiusGatewayConfigInfo withCertDomainName(String certDomainName) {
        this.certDomainName = certDomainName;
        return this;
    }

    /**
     * 证书域名
     * @return certDomainName
     */
    public String getCertDomainName() {
        return certDomainName;
    }

    public void setCertDomainName(String certDomainName) {
        this.certDomainName = certDomainName;
    }

    public RadiusGatewayConfigInfo withTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
        return this;
    }

    /**
     * 获取token地址
     * @return tokenUrl
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public RadiusGatewayConfigInfo withVerificationCipherUrl(String verificationCipherUrl) {
        this.verificationCipherUrl = verificationCipherUrl;
        return this;
    }

    /**
     * 获取验证码地址
     * @return verificationCipherUrl
     */
    public String getVerificationCipherUrl() {
        return verificationCipherUrl;
    }

    public void setVerificationCipherUrl(String verificationCipherUrl) {
        this.verificationCipherUrl = verificationCipherUrl;
    }

    public RadiusGatewayConfigInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public RadiusGatewayConfigInfo withAssistAuthType(String assistAuthType) {
        this.assistAuthType = assistAuthType;
        return this;
    }

    /**
     * 辅助认证类型
     * @return assistAuthType
     */
    public String getAssistAuthType() {
        return assistAuthType;
    }

    public void setAssistAuthType(String assistAuthType) {
        this.assistAuthType = assistAuthType;
    }

    public RadiusGatewayConfigInfo withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * 过期时间
     * @return expiration
     */
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RadiusGatewayConfigInfo that = (RadiusGatewayConfigInfo) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.certDomainName, that.certDomainName) && Objects.equals(this.tokenUrl, that.tokenUrl)
            && Objects.equals(this.verificationCipherUrl, that.verificationCipherUrl)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.assistAuthType, that.assistAuthType)
            && Objects.equals(this.expiration, that.expiration);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enable, appId, certDomainName, tokenUrl, verificationCipherUrl, authType, assistAuthType, expiration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadiusGatewayConfigInfo {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    certDomainName: ").append(toIndentedString(certDomainName)).append("\n");
        sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
        sb.append("    verificationCipherUrl: ").append(toIndentedString(verificationCipherUrl)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    assistAuthType: ").append(toIndentedString(assistAuthType)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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
