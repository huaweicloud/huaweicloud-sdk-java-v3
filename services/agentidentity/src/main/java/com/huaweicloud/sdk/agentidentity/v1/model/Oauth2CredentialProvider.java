package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Oauth2CredentialProvider
 */
public class Oauth2CredentialProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_provider_vendor")

    private CredentialProviderVendor credentialProviderVendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_secret")

    private Secret clientSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2_provider_config_output")

    private Oauth2ProviderConfigOutput oauth2ProviderConfigOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public Oauth2CredentialProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the credential provider.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Oauth2CredentialProvider withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 凭证提供者的唯一资源名称（URN）。
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public Oauth2CredentialProvider withCredentialProviderVendor(CredentialProviderVendor credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
        return this;
    }

    /**
     * Get credentialProviderVendor
     * @return credentialProviderVendor
     */
    public CredentialProviderVendor getCredentialProviderVendor() {
        return credentialProviderVendor;
    }

    public void setCredentialProviderVendor(CredentialProviderVendor credentialProviderVendor) {
        this.credentialProviderVendor = credentialProviderVendor;
    }

    public Oauth2CredentialProvider withClientSecret(Secret clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public Oauth2CredentialProvider withClientSecret(Consumer<Secret> clientSecretSetter) {
        if (this.clientSecret == null) {
            this.clientSecret = new Secret();
            clientSecretSetter.accept(this.clientSecret);
        }

        return this;
    }

    /**
     * Get clientSecret
     * @return clientSecret
     */
    public Secret getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(Secret clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Oauth2CredentialProvider withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * OAuth2 提供方认证完成后跳转回调的 URL。
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Oauth2CredentialProvider withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Oauth2CredentialProvider withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Timestamp in RFC 3339 format (UTC)
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Oauth2CredentialProvider withOauth2ProviderConfigOutput(
        Oauth2ProviderConfigOutput oauth2ProviderConfigOutput) {
        this.oauth2ProviderConfigOutput = oauth2ProviderConfigOutput;
        return this;
    }

    public Oauth2CredentialProvider withOauth2ProviderConfigOutput(
        Consumer<Oauth2ProviderConfigOutput> oauth2ProviderConfigOutputSetter) {
        if (this.oauth2ProviderConfigOutput == null) {
            this.oauth2ProviderConfigOutput = new Oauth2ProviderConfigOutput();
            oauth2ProviderConfigOutputSetter.accept(this.oauth2ProviderConfigOutput);
        }

        return this;
    }

    /**
     * Get oauth2ProviderConfigOutput
     * @return oauth2ProviderConfigOutput
     */
    public Oauth2ProviderConfigOutput getOauth2ProviderConfigOutput() {
        return oauth2ProviderConfigOutput;
    }

    public void setOauth2ProviderConfigOutput(Oauth2ProviderConfigOutput oauth2ProviderConfigOutput) {
        this.oauth2ProviderConfigOutput = oauth2ProviderConfigOutput;
    }

    public Oauth2CredentialProvider withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Oauth2CredentialProvider addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Oauth2CredentialProvider withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 自定义标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Oauth2CredentialProvider that = (Oauth2CredentialProvider) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.credentialProviderVendor, that.credentialProviderVendor)
            && Objects.equals(this.clientSecret, that.clientSecret)
            && Objects.equals(this.callbackUrl, that.callbackUrl) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.oauth2ProviderConfigOutput, that.oauth2ProviderConfigOutput)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            urn,
            credentialProviderVendor,
            clientSecret,
            callbackUrl,
            createdAt,
            updatedAt,
            oauth2ProviderConfigOutput,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Oauth2CredentialProvider {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    credentialProviderVendor: ").append(toIndentedString(credentialProviderVendor)).append("\n");
        sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    oauth2ProviderConfigOutput: ").append(toIndentedString(oauth2ProviderConfigOutput)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
