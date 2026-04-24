package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OAuth2 provider config output (UNION). Only one of the following members can be specified.
 */
public class Oauth2ProviderConfigOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "microsoft_oauth2_provider_config")

    private MicrosoftOauth2ProviderConfigOutput microsoftOauth2ProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "google_oauth2_provider_config")

    private GoogleOauth2ProviderConfigOutput googleOauth2ProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "github_oauth2_provider_config")

    private GithubOauth2ProviderConfigOutput githubOauth2ProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_oauth2_provider_config")

    private CustomOauth2ProviderConfigOutput customOauth2ProviderConfig;

    public Oauth2ProviderConfigOutput withMicrosoftOauth2ProviderConfig(
        MicrosoftOauth2ProviderConfigOutput microsoftOauth2ProviderConfig) {
        this.microsoftOauth2ProviderConfig = microsoftOauth2ProviderConfig;
        return this;
    }

    public Oauth2ProviderConfigOutput withMicrosoftOauth2ProviderConfig(
        Consumer<MicrosoftOauth2ProviderConfigOutput> microsoftOauth2ProviderConfigSetter) {
        if (this.microsoftOauth2ProviderConfig == null) {
            this.microsoftOauth2ProviderConfig = new MicrosoftOauth2ProviderConfigOutput();
            microsoftOauth2ProviderConfigSetter.accept(this.microsoftOauth2ProviderConfig);
        }

        return this;
    }

    /**
     * Get microsoftOauth2ProviderConfig
     * @return microsoftOauth2ProviderConfig
     */
    public MicrosoftOauth2ProviderConfigOutput getMicrosoftOauth2ProviderConfig() {
        return microsoftOauth2ProviderConfig;
    }

    public void setMicrosoftOauth2ProviderConfig(MicrosoftOauth2ProviderConfigOutput microsoftOauth2ProviderConfig) {
        this.microsoftOauth2ProviderConfig = microsoftOauth2ProviderConfig;
    }

    public Oauth2ProviderConfigOutput withGoogleOauth2ProviderConfig(
        GoogleOauth2ProviderConfigOutput googleOauth2ProviderConfig) {
        this.googleOauth2ProviderConfig = googleOauth2ProviderConfig;
        return this;
    }

    public Oauth2ProviderConfigOutput withGoogleOauth2ProviderConfig(
        Consumer<GoogleOauth2ProviderConfigOutput> googleOauth2ProviderConfigSetter) {
        if (this.googleOauth2ProviderConfig == null) {
            this.googleOauth2ProviderConfig = new GoogleOauth2ProviderConfigOutput();
            googleOauth2ProviderConfigSetter.accept(this.googleOauth2ProviderConfig);
        }

        return this;
    }

    /**
     * Get googleOauth2ProviderConfig
     * @return googleOauth2ProviderConfig
     */
    public GoogleOauth2ProviderConfigOutput getGoogleOauth2ProviderConfig() {
        return googleOauth2ProviderConfig;
    }

    public void setGoogleOauth2ProviderConfig(GoogleOauth2ProviderConfigOutput googleOauth2ProviderConfig) {
        this.googleOauth2ProviderConfig = googleOauth2ProviderConfig;
    }

    public Oauth2ProviderConfigOutput withGithubOauth2ProviderConfig(
        GithubOauth2ProviderConfigOutput githubOauth2ProviderConfig) {
        this.githubOauth2ProviderConfig = githubOauth2ProviderConfig;
        return this;
    }

    public Oauth2ProviderConfigOutput withGithubOauth2ProviderConfig(
        Consumer<GithubOauth2ProviderConfigOutput> githubOauth2ProviderConfigSetter) {
        if (this.githubOauth2ProviderConfig == null) {
            this.githubOauth2ProviderConfig = new GithubOauth2ProviderConfigOutput();
            githubOauth2ProviderConfigSetter.accept(this.githubOauth2ProviderConfig);
        }

        return this;
    }

    /**
     * Get githubOauth2ProviderConfig
     * @return githubOauth2ProviderConfig
     */
    public GithubOauth2ProviderConfigOutput getGithubOauth2ProviderConfig() {
        return githubOauth2ProviderConfig;
    }

    public void setGithubOauth2ProviderConfig(GithubOauth2ProviderConfigOutput githubOauth2ProviderConfig) {
        this.githubOauth2ProviderConfig = githubOauth2ProviderConfig;
    }

    public Oauth2ProviderConfigOutput withCustomOauth2ProviderConfig(
        CustomOauth2ProviderConfigOutput customOauth2ProviderConfig) {
        this.customOauth2ProviderConfig = customOauth2ProviderConfig;
        return this;
    }

    public Oauth2ProviderConfigOutput withCustomOauth2ProviderConfig(
        Consumer<CustomOauth2ProviderConfigOutput> customOauth2ProviderConfigSetter) {
        if (this.customOauth2ProviderConfig == null) {
            this.customOauth2ProviderConfig = new CustomOauth2ProviderConfigOutput();
            customOauth2ProviderConfigSetter.accept(this.customOauth2ProviderConfig);
        }

        return this;
    }

    /**
     * Get customOauth2ProviderConfig
     * @return customOauth2ProviderConfig
     */
    public CustomOauth2ProviderConfigOutput getCustomOauth2ProviderConfig() {
        return customOauth2ProviderConfig;
    }

    public void setCustomOauth2ProviderConfig(CustomOauth2ProviderConfigOutput customOauth2ProviderConfig) {
        this.customOauth2ProviderConfig = customOauth2ProviderConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2ProviderConfigOutput that = (Oauth2ProviderConfigOutput) obj;
        return Objects.equals(this.microsoftOauth2ProviderConfig, that.microsoftOauth2ProviderConfig)
            && Objects.equals(this.googleOauth2ProviderConfig, that.googleOauth2ProviderConfig)
            && Objects.equals(this.githubOauth2ProviderConfig, that.githubOauth2ProviderConfig)
            && Objects.equals(this.customOauth2ProviderConfig, that.customOauth2ProviderConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(microsoftOauth2ProviderConfig,
            googleOauth2ProviderConfig,
            githubOauth2ProviderConfig,
            customOauth2ProviderConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2ProviderConfigOutput {\n");
        sb.append("    microsoftOauth2ProviderConfig: ")
            .append(toIndentedString(microsoftOauth2ProviderConfig))
            .append("\n");
        sb.append("    googleOauth2ProviderConfig: ").append(toIndentedString(googleOauth2ProviderConfig)).append("\n");
        sb.append("    githubOauth2ProviderConfig: ").append(toIndentedString(githubOauth2ProviderConfig)).append("\n");
        sb.append("    customOauth2ProviderConfig: ").append(toIndentedString(customOauth2ProviderConfig)).append("\n");
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
