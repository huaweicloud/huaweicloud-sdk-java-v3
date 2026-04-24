package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateWorkloadIdentityReqBody
 */
public class CreateWorkloadIdentityReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_resource_oauth2_return_urls")

    private List<String> allowedResourceOauth2ReturnUrls = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_type")

    private AuthorizerType authorizerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorizer_configuration")

    private AuthorizerConfiguration authorizerConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateWorkloadIdentityReqBody withName(String name) {
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

    public CreateWorkloadIdentityReqBody withAllowedResourceOauth2ReturnUrls(
        List<String> allowedResourceOauth2ReturnUrls) {
        this.allowedResourceOauth2ReturnUrls = allowedResourceOauth2ReturnUrls;
        return this;
    }

    public CreateWorkloadIdentityReqBody addAllowedResourceOauth2ReturnUrlsItem(
        String allowedResourceOauth2ReturnUrlsItem) {
        if (this.allowedResourceOauth2ReturnUrls == null) {
            this.allowedResourceOauth2ReturnUrls = new ArrayList<>();
        }
        this.allowedResourceOauth2ReturnUrls.add(allowedResourceOauth2ReturnUrlsItem);
        return this;
    }

    public CreateWorkloadIdentityReqBody withAllowedResourceOauth2ReturnUrls(
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

    public CreateWorkloadIdentityReqBody withAuthorizerType(AuthorizerType authorizerType) {
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

    public CreateWorkloadIdentityReqBody withAuthorizerConfiguration(AuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
        return this;
    }

    public CreateWorkloadIdentityReqBody withAuthorizerConfiguration(
        Consumer<AuthorizerConfiguration> authorizerConfigurationSetter) {
        if (this.authorizerConfiguration == null) {
            this.authorizerConfiguration = new AuthorizerConfiguration();
            authorizerConfigurationSetter.accept(this.authorizerConfiguration);
        }

        return this;
    }

    /**
     * Get authorizerConfiguration
     * @return authorizerConfiguration
     */
    public AuthorizerConfiguration getAuthorizerConfiguration() {
        return authorizerConfiguration;
    }

    public void setAuthorizerConfiguration(AuthorizerConfiguration authorizerConfiguration) {
        this.authorizerConfiguration = authorizerConfiguration;
    }

    public CreateWorkloadIdentityReqBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateWorkloadIdentityReqBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateWorkloadIdentityReqBody withTags(Consumer<List<Tag>> tagsSetter) {
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
        CreateWorkloadIdentityReqBody that = (CreateWorkloadIdentityReqBody) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.allowedResourceOauth2ReturnUrls, that.allowedResourceOauth2ReturnUrls)
            && Objects.equals(this.authorizerType, that.authorizerType)
            && Objects.equals(this.authorizerConfiguration, that.authorizerConfiguration)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, allowedResourceOauth2ReturnUrls, authorizerType, authorizerConfiguration, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWorkloadIdentityReqBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    allowedResourceOauth2ReturnUrls: ")
            .append(toIndentedString(allowedResourceOauth2ReturnUrls))
            .append("\n");
        sb.append("    authorizerType: ").append(toIndentedString(authorizerType)).append("\n");
        sb.append("    authorizerConfiguration: ").append(toIndentedString(authorizerConfiguration)).append("\n");
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
