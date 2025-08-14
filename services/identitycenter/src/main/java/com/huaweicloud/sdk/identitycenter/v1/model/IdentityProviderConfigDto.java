package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 身份提供商
 */
public class IdentityProviderConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_url")

    private String issuerUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_url")

    private String metadataUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_login_url")

    private String remoteLoginUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_logout_url")

    private String remoteLogoutUrl;

    public IdentityProviderConfigDto withIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
        return this;
    }

    /**
     * 身份提供商issuer
     * @return issuerUrl
     */
    public String getIssuerUrl() {
        return issuerUrl;
    }

    public void setIssuerUrl(String issuerUrl) {
        this.issuerUrl = issuerUrl;
    }

    public IdentityProviderConfigDto withMetadataUrl(String metadataUrl) {
        this.metadataUrl = metadataUrl;
        return this;
    }

    /**
     * 身份提供商元数据
     * @return metadataUrl
     */
    public String getMetadataUrl() {
        return metadataUrl;
    }

    public void setMetadataUrl(String metadataUrl) {
        this.metadataUrl = metadataUrl;
    }

    public IdentityProviderConfigDto withRemoteLoginUrl(String remoteLoginUrl) {
        this.remoteLoginUrl = remoteLoginUrl;
        return this;
    }

    /**
     * 身份提供商远程登录链接
     * @return remoteLoginUrl
     */
    public String getRemoteLoginUrl() {
        return remoteLoginUrl;
    }

    public void setRemoteLoginUrl(String remoteLoginUrl) {
        this.remoteLoginUrl = remoteLoginUrl;
    }

    public IdentityProviderConfigDto withRemoteLogoutUrl(String remoteLogoutUrl) {
        this.remoteLogoutUrl = remoteLogoutUrl;
        return this;
    }

    /**
     * 身份提供商远程登出链接
     * @return remoteLogoutUrl
     */
    public String getRemoteLogoutUrl() {
        return remoteLogoutUrl;
    }

    public void setRemoteLogoutUrl(String remoteLogoutUrl) {
        this.remoteLogoutUrl = remoteLogoutUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IdentityProviderConfigDto that = (IdentityProviderConfigDto) obj;
        return Objects.equals(this.issuerUrl, that.issuerUrl) && Objects.equals(this.metadataUrl, that.metadataUrl)
            && Objects.equals(this.remoteLoginUrl, that.remoteLoginUrl)
            && Objects.equals(this.remoteLogoutUrl, that.remoteLogoutUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuerUrl, metadataUrl, remoteLoginUrl, remoteLogoutUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdentityProviderConfigDto {\n");
        sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
        sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
        sb.append("    remoteLoginUrl: ").append(toIndentedString(remoteLoginUrl)).append("\n");
        sb.append("    remoteLogoutUrl: ").append(toIndentedString(remoteLogoutUrl)).append("\n");
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
