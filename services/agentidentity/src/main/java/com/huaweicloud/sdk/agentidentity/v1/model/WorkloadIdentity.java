package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WorkloadIdentity
 */
public class WorkloadIdentity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_resource_oauth2_return_urls")

    private List<String> allowedResourceOauth2ReturnUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerType authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key_secret")

    private Secret apiKeySecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private CreatedBy createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public WorkloadIdentity withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the workload identity.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkloadIdentity withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * The URN of the workload identity.
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public WorkloadIdentity withAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

    public WorkloadIdentity addAllowedResourceOauth2ReturnUrlsItem(String allowedResourceOauth2ReturnUrlsItem) {
        if (this.allowedResourceOauth2ReturnUrls == null) {
            this.allowedResourceOauth2ReturnUrls = new ArrayList<>();
        }
        this.allowedResourceOauth2ReturnUrls.add(allowedResourceOauth2ReturnUrlsItem);
        return this;
    }

    public WorkloadIdentity withAllowedResourceOauth2ReturnUrls(
        Consumer<List<String>> allowedResourceOauth2ReturnUrlsSetter) {
        if (this.allowedResourceOauth2ReturnUrls == null) {
            this.allowedResourceOauth2ReturnUrls = new ArrayList<>();
        }
        allowedResourceOauth2ReturnUrlsSetter.accept(this.allowedResourceOauth2ReturnUrls);
        return this;
    }

    /**
     * Get allowedResourceOauth2ReturnUrls
     * @return allowedResourceOauth2ReturnUrls
     */
    public List<String> getAllowedResourceOauth2ReturnUrls() {
        return allowedResourceOauth2ReturnUrls;
    }

    public void setAllowedResourceOauth2ReturnUrls(List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
    }

    public WorkloadIdentity withAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
        return this;
    }

    /**
     * Get authorizerType
     * @return authorizerType
     */
    public AuthorizerType getAuthorizerType() {
        return authorizerType;
    }

    public void setAuthorizerType(AuthorizerType authorizerType) {
        this.authorizerType = authorizerType;
    }

    public WorkloadIdentity withApiKeySecret(Secret apiKeySecret) {
        this.apiKeySecret = apiKeySecret;
        return this;
    }

    public WorkloadIdentity withApiKeySecret(Consumer<Secret> apiKeySecretSetter) {
        if (this.apiKeySecret == null) {
            this.apiKeySecret = new Secret();
            apiKeySecretSetter.accept(this.apiKeySecret);
        }

        return this;
    }

    /**
     * Get apiKeySecret
     * @return apiKeySecret
     */
    public Secret getApiKeySecret() {
        return apiKeySecret;
    }

    public void setApiKeySecret(Secret apiKeySecret) {
        this.apiKeySecret = apiKeySecret;
    }

    public WorkloadIdentity withCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public WorkloadIdentity withCreatedBy(Consumer<CreatedBy> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new CreatedBy();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public WorkloadIdentity withCreatedAt(OffsetDateTime createdAt) {
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

    public WorkloadIdentity withUpdatedAt(OffsetDateTime updatedAt) {
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

    public WorkloadIdentity withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public WorkloadIdentity addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public WorkloadIdentity withTags(Consumer<List<Tag>> tagsSetter) {
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
        WorkloadIdentity that = (WorkloadIdentity) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.allowedResourceOauth2ReturnUrls, that.allowedResourceOauth2ReturnUrls)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.apiKeySecret, that.apiKeySecret) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            urn,
            allowedResourceOauth2ReturnUrls,
            authorizerType,
            apiKeySecret,
            createdBy,
            createdAt,
            updatedAt,
            tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadIdentity {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    allowedResourceOauth2ReturnUrls: ")
            .append(toIndentedString(allowedResourceOauth2ReturnUrls))
            .append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    apiKeySecret: ").append(toIndentedString(apiKeySecret)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
