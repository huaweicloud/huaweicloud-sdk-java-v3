package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 短信辅助认证配置
 */
public class RadiusGatewayConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_url")

    private String tokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_cipher_url")

    private String verificationCipherUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content")

    private String certContent;

    public RadiusGatewayConfig withEnable(Boolean enable) {
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

    public RadiusGatewayConfig withAppId(String appId) {
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

    public RadiusGatewayConfig withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RadiusGatewayConfig withTokenUrl(String tokenUrl) {
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

    public RadiusGatewayConfig withVerificationCipherUrl(String verificationCipherUrl) {
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

    public RadiusGatewayConfig withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    /**
     * 证书内容（PEM）
     * @return certContent
     */
    public String getCertContent() {
        return certContent;
    }

    public void setCertContent(String certContent) {
        this.certContent = certContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RadiusGatewayConfig that = (RadiusGatewayConfig) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.password, that.password) && Objects.equals(this.tokenUrl, that.tokenUrl)
            && Objects.equals(this.verificationCipherUrl, that.verificationCipherUrl)
            && Objects.equals(this.certContent, that.certContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, appId, password, tokenUrl, verificationCipherUrl, certContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadiusGatewayConfig {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
        sb.append("    verificationCipherUrl: ").append(toIndentedString(verificationCipherUrl)).append("\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
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
