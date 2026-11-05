package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSupabaseApplicationAuthConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private Long updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_account_sign_up")

    private Boolean enableAccountSignUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_anonymous_users")

    private Boolean enableAnonymousUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_external_url")

    private String apiExternalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_url")

    private String siteUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_redirect_urls")

    private String allowRedirectUrls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "github_oauth_provider")

    private SupabaseApiGitHubOAuthProvider githubOauthProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_oauth_provider")

    private SupabaseApiEmailOAuthProvider emailOauthProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email_template_config")

    private SupabaseApiEmailTemplate emailTemplateConfig;

    public ShowSupabaseApplicationAuthConfigResponse withUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Get updatedTime
     * @return updatedTime
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEnableAccountSignUp(Boolean enableAccountSignUp) {
        this.enableAccountSignUp = enableAccountSignUp;
        return this;
    }

    /**
     * Get enableAccountSignUp
     * @return enableAccountSignUp
     */
    public Boolean getEnableAccountSignUp() {
        return enableAccountSignUp;
    }

    public void setEnableAccountSignUp(Boolean enableAccountSignUp) {
        this.enableAccountSignUp = enableAccountSignUp;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEnableAnonymousUsers(Boolean enableAnonymousUsers) {
        this.enableAnonymousUsers = enableAnonymousUsers;
        return this;
    }

    /**
     * Get enableAnonymousUsers
     * @return enableAnonymousUsers
     */
    public Boolean getEnableAnonymousUsers() {
        return enableAnonymousUsers;
    }

    public void setEnableAnonymousUsers(Boolean enableAnonymousUsers) {
        this.enableAnonymousUsers = enableAnonymousUsers;
    }

    public ShowSupabaseApplicationAuthConfigResponse withApiExternalUrl(String apiExternalUrl) {
        this.apiExternalUrl = apiExternalUrl;
        return this;
    }

    /**
     * Get apiExternalUrl
     * @return apiExternalUrl
     */
    public String getApiExternalUrl() {
        return apiExternalUrl;
    }

    public void setApiExternalUrl(String apiExternalUrl) {
        this.apiExternalUrl = apiExternalUrl;
    }

    public ShowSupabaseApplicationAuthConfigResponse withSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    /**
     * Get siteUrl
     * @return siteUrl
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public ShowSupabaseApplicationAuthConfigResponse withAllowRedirectUrls(String allowRedirectUrls) {
        this.allowRedirectUrls = allowRedirectUrls;
        return this;
    }

    /**
     * Get allowRedirectUrls
     * @return allowRedirectUrls
     */
    public String getAllowRedirectUrls() {
        return allowRedirectUrls;
    }

    public void setAllowRedirectUrls(String allowRedirectUrls) {
        this.allowRedirectUrls = allowRedirectUrls;
    }

    public ShowSupabaseApplicationAuthConfigResponse withGithubOauthProvider(
        SupabaseApiGitHubOAuthProvider githubOauthProvider) {
        this.githubOauthProvider = githubOauthProvider;
        return this;
    }

    public ShowSupabaseApplicationAuthConfigResponse withGithubOauthProvider(
        Consumer<SupabaseApiGitHubOAuthProvider> githubOauthProviderSetter) {
        if (this.githubOauthProvider == null) {
            this.githubOauthProvider = new SupabaseApiGitHubOAuthProvider();
            githubOauthProviderSetter.accept(this.githubOauthProvider);
        }

        return this;
    }

    /**
     * Get githubOauthProvider
     * @return githubOauthProvider
     */
    public SupabaseApiGitHubOAuthProvider getGithubOauthProvider() {
        return githubOauthProvider;
    }

    public void setGithubOauthProvider(SupabaseApiGitHubOAuthProvider githubOauthProvider) {
        this.githubOauthProvider = githubOauthProvider;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEmailOauthProvider(
        SupabaseApiEmailOAuthProvider emailOauthProvider) {
        this.emailOauthProvider = emailOauthProvider;
        return this;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEmailOauthProvider(
        Consumer<SupabaseApiEmailOAuthProvider> emailOauthProviderSetter) {
        if (this.emailOauthProvider == null) {
            this.emailOauthProvider = new SupabaseApiEmailOAuthProvider();
            emailOauthProviderSetter.accept(this.emailOauthProvider);
        }

        return this;
    }

    /**
     * Get emailOauthProvider
     * @return emailOauthProvider
     */
    public SupabaseApiEmailOAuthProvider getEmailOauthProvider() {
        return emailOauthProvider;
    }

    public void setEmailOauthProvider(SupabaseApiEmailOAuthProvider emailOauthProvider) {
        this.emailOauthProvider = emailOauthProvider;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEmailTemplateConfig(
        SupabaseApiEmailTemplate emailTemplateConfig) {
        this.emailTemplateConfig = emailTemplateConfig;
        return this;
    }

    public ShowSupabaseApplicationAuthConfigResponse withEmailTemplateConfig(
        Consumer<SupabaseApiEmailTemplate> emailTemplateConfigSetter) {
        if (this.emailTemplateConfig == null) {
            this.emailTemplateConfig = new SupabaseApiEmailTemplate();
            emailTemplateConfigSetter.accept(this.emailTemplateConfig);
        }

        return this;
    }

    /**
     * Get emailTemplateConfig
     * @return emailTemplateConfig
     */
    public SupabaseApiEmailTemplate getEmailTemplateConfig() {
        return emailTemplateConfig;
    }

    public void setEmailTemplateConfig(SupabaseApiEmailTemplate emailTemplateConfig) {
        this.emailTemplateConfig = emailTemplateConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSupabaseApplicationAuthConfigResponse that = (ShowSupabaseApplicationAuthConfigResponse) obj;
        return Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.enableAccountSignUp, that.enableAccountSignUp)
            && Objects.equals(this.enableAnonymousUsers, that.enableAnonymousUsers)
            && Objects.equals(this.apiExternalUrl, that.apiExternalUrl) && Objects.equals(this.siteUrl, that.siteUrl)
            && Objects.equals(this.allowRedirectUrls, that.allowRedirectUrls)
            && Objects.equals(this.githubOauthProvider, that.githubOauthProvider)
            && Objects.equals(this.emailOauthProvider, that.emailOauthProvider)
            && Objects.equals(this.emailTemplateConfig, that.emailTemplateConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedTime,
            enableAccountSignUp,
            enableAnonymousUsers,
            apiExternalUrl,
            siteUrl,
            allowRedirectUrls,
            githubOauthProvider,
            emailOauthProvider,
            emailTemplateConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSupabaseApplicationAuthConfigResponse {\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    enableAccountSignUp: ").append(toIndentedString(enableAccountSignUp)).append("\n");
        sb.append("    enableAnonymousUsers: ").append(toIndentedString(enableAnonymousUsers)).append("\n");
        sb.append("    apiExternalUrl: ").append(toIndentedString(apiExternalUrl)).append("\n");
        sb.append("    siteUrl: ").append(toIndentedString(siteUrl)).append("\n");
        sb.append("    allowRedirectUrls: ").append(toIndentedString(allowRedirectUrls)).append("\n");
        sb.append("    githubOauthProvider: ").append(toIndentedString(githubOauthProvider)).append("\n");
        sb.append("    emailOauthProvider: ").append(toIndentedString(emailOauthProvider)).append("\n");
        sb.append("    emailTemplateConfig: ").append(toIndentedString(emailTemplateConfig)).append("\n");
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
