package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateOauth2CredentialProviderReqBody
 */
public class UpdateOauth2CredentialProviderReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth2_provider_config_input")

    private Oauth2ProviderConfigInput oauth2ProviderConfigInput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public UpdateOauth2CredentialProviderReqBody withOauth2ProviderConfigInput(
        Oauth2ProviderConfigInput oauth2ProviderConfigInput) {
        this.oauth2ProviderConfigInput = oauth2ProviderConfigInput;
        return this;
    }

    public UpdateOauth2CredentialProviderReqBody withOauth2ProviderConfigInput(
        Consumer<Oauth2ProviderConfigInput> oauth2ProviderConfigInputSetter) {
        if (this.oauth2ProviderConfigInput == null) {
            this.oauth2ProviderConfigInput = new Oauth2ProviderConfigInput();
            oauth2ProviderConfigInputSetter.accept(this.oauth2ProviderConfigInput);
        }

        return this;
    }

    /**
     * Get oauth2ProviderConfigInput
     * @return oauth2ProviderConfigInput
     */
    public Oauth2ProviderConfigInput getOauth2ProviderConfigInput() {
        return oauth2ProviderConfigInput;
    }

    public void setOauth2ProviderConfigInput(Oauth2ProviderConfigInput oauth2ProviderConfigInput) {
        this.oauth2ProviderConfigInput = oauth2ProviderConfigInput;
    }

    public UpdateOauth2CredentialProviderReqBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateOauth2CredentialProviderReqBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateOauth2CredentialProviderReqBody withTags(Consumer<List<Tag>> tagsSetter) {
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
        UpdateOauth2CredentialProviderReqBody that = (UpdateOauth2CredentialProviderReqBody) obj;
        return Objects.equals(this.oauth2ProviderConfigInput, that.oauth2ProviderConfigInput)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oauth2ProviderConfigInput, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOauth2CredentialProviderReqBody {\n");
        sb.append("    oauth2ProviderConfigInput: ").append(toIndentedString(oauth2ProviderConfigInput)).append("\n");
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
