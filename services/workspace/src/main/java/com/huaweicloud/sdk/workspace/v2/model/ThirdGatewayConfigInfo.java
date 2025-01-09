package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 第三方网关配置信息。
 */
public class ThirdGatewayConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_url")

    private String loginUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logout_url")

    private String logoutUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token_url")

    private String tokenUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_cipher_url")

    private String verificationCipherUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_content")

    private String certContent;

    public ThirdGatewayConfigInfo withLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    /**
     * 第三方登录url
     * @return loginUrl
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public ThirdGatewayConfigInfo withLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
        return this;
    }

    /**
     * 第三方登出url
     * @return logoutUrl
     */
    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public ThirdGatewayConfigInfo withTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
        return this;
    }

    /**
     * 第三方网关token校验地址
     * @return tokenUrl
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public ThirdGatewayConfigInfo withVerificationCipherUrl(String verificationCipherUrl) {
        this.verificationCipherUrl = verificationCipherUrl;
        return this;
    }

    /**
     * 校验证书url
     * @return verificationCipherUrl
     */
    public String getVerificationCipherUrl() {
        return verificationCipherUrl;
    }

    public void setVerificationCipherUrl(String verificationCipherUrl) {
        this.verificationCipherUrl = verificationCipherUrl;
    }

    public ThirdGatewayConfigInfo withCertContent(String certContent) {
        this.certContent = certContent;
        return this;
    }

    /**
     * 第三方证书
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
        ThirdGatewayConfigInfo that = (ThirdGatewayConfigInfo) obj;
        return Objects.equals(this.loginUrl, that.loginUrl) && Objects.equals(this.logoutUrl, that.logoutUrl)
            && Objects.equals(this.tokenUrl, that.tokenUrl)
            && Objects.equals(this.verificationCipherUrl, that.verificationCipherUrl)
            && Objects.equals(this.certContent, that.certContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginUrl, logoutUrl, tokenUrl, verificationCipherUrl, certContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdGatewayConfigInfo {\n");
        sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
        sb.append("    logoutUrl: ").append(toIndentedString(logoutUrl)).append("\n");
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
