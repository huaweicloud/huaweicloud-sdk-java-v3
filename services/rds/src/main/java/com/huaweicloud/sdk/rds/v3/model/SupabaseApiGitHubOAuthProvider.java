package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询响应不含oauth_client_secret。
 */
public class SupabaseApiGitHubOAuthProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_github")

    private Boolean enableGithub;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth_client_id")

    private String oauthClientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_uri")

    private String redirectUri;

    public SupabaseApiGitHubOAuthProvider withEnableGithub(Boolean enableGithub) {
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

    public SupabaseApiGitHubOAuthProvider withOauthClientId(String oauthClientId) {
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

    public SupabaseApiGitHubOAuthProvider withRedirectUri(String redirectUri) {
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
        SupabaseApiGitHubOAuthProvider that = (SupabaseApiGitHubOAuthProvider) obj;
        return Objects.equals(this.enableGithub, that.enableGithub)
            && Objects.equals(this.oauthClientId, that.oauthClientId)
            && Objects.equals(this.redirectUri, that.redirectUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableGithub, oauthClientId, redirectUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseApiGitHubOAuthProvider {\n");
        sb.append("    enableGithub: ").append(toIndentedString(enableGithub)).append("\n");
        sb.append("    oauthClientId: ").append(toIndentedString(oauthClientId)).append("\n");
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
