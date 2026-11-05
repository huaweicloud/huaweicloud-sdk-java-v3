package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * enable_github&#x3D;false时清空oauth_client_id/secret/redirect_uri。
 */
public class SupabaseGitHubOAuthProviderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_github")

    private Boolean enableGithub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth_client_id")

    private String oauthClientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth_client_secret")

    private String oauthClientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_uri")

    private String redirectUri;

    public SupabaseGitHubOAuthProviderReq withEnableGithub(Boolean enableGithub) {
        this.enableGithub = enableGithub;
        return this;
    }

    /**
     * Get enableGithub
     * @return enableGithub
     */
    public Boolean getEnableGithub() {
        return enableGithub;
    }

    public void setEnableGithub(Boolean enableGithub) {
        this.enableGithub = enableGithub;
    }

    public SupabaseGitHubOAuthProviderReq withOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
        return this;
    }

    /**
     * Get oauthClientId
     * @return oauthClientId
     */
    public String getOauthClientId() {
        return oauthClientId;
    }

    public void setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    public SupabaseGitHubOAuthProviderReq withOauthClientSecret(String oauthClientSecret) {
        this.oauthClientSecret = oauthClientSecret;
        return this;
    }

    /**
     * 秘密，受控输入，show不返回。
     * @return oauthClientSecret
     */
    public String getOauthClientSecret() {
        return oauthClientSecret;
    }

    public void setOauthClientSecret(String oauthClientSecret) {
        this.oauthClientSecret = oauthClientSecret;
    }

    public SupabaseGitHubOAuthProviderReq withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * Get redirectUri
     * @return redirectUri
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseGitHubOAuthProviderReq that = (SupabaseGitHubOAuthProviderReq) obj;
        return Objects.equals(this.enableGithub, that.enableGithub)
            && Objects.equals(this.oauthClientId, that.oauthClientId)
            && Objects.equals(this.oauthClientSecret, that.oauthClientSecret)
            && Objects.equals(this.redirectUri, that.redirectUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableGithub, oauthClientId, oauthClientSecret, redirectUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseGitHubOAuthProviderReq {\n");
        sb.append("    enableGithub: ").append(toIndentedString(enableGithub)).append("\n");
        sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
        sb.append("    oauthClientSecret: ").append(toIndentedString(oauthClientSecret)).append("\n");
        sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
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
