package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCustomModelProviderRequestBody
 */
public class CreateCustomModelProviderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credential_configuration")

    private CoreModelProviderCredentialConfiguration credentialConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_configuration")

    private CoreModelProviderOutboundNetworkConfiguration networkConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreModelProviderTag> tags = null;

    public CreateCustomModelProviderRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 模型提供商名称。 **约束限制：** 账户下模型提供商名称唯一（不区分大小写）。 **取值范围：** 长度为 2-40 个字符，匹配以小写字母开头、以小写字母或数字结尾、中间可包含0到38个小写字母、数字或连字符的字符串，符合正则条件^[a-z][a-z0-9-]{0,38}[a-z0-9]$。 **默认取值：** 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCustomModelProviderRequestBody withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * **参数解释：** 模型提供商的默认API基础地址。 **约束限制：** 不涉及。 **取值范围：** 长度为1-2048个字符。以https://开头的完整URL。 **默认取值：** 不涉及。 
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public CreateCustomModelProviderRequestBody withCredentialConfiguration(
        CoreModelProviderCredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
        return this;
    }

    public CreateCustomModelProviderRequestBody withCredentialConfiguration(
        Consumer<CoreModelProviderCredentialConfiguration> credentialConfigurationSetter) {
        if (this.credentialConfiguration == null) {
            this.credentialConfiguration = new CoreModelProviderCredentialConfiguration();
            credentialConfigurationSetter.accept(this.credentialConfiguration);
        }

        return this;
    }

    /**
     * Get credentialConfiguration
     * @return credentialConfiguration
     */
    public CoreModelProviderCredentialConfiguration getCredentialConfiguration() {
        return credentialConfiguration;
    }

    public void setCredentialConfiguration(CoreModelProviderCredentialConfiguration credentialConfiguration) {
        this.credentialConfiguration = credentialConfiguration;
    }

    public CreateCustomModelProviderRequestBody withNetworkConfiguration(
        CoreModelProviderOutboundNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    public CreateCustomModelProviderRequestBody withNetworkConfiguration(
        Consumer<CoreModelProviderOutboundNetworkConfiguration> networkConfigurationSetter) {
        if (this.networkConfiguration == null) {
            this.networkConfiguration = new CoreModelProviderOutboundNetworkConfiguration();
            networkConfigurationSetter.accept(this.networkConfiguration);
        }

        return this;
    }

    /**
     * Get networkConfiguration
     * @return networkConfiguration
     */
    public CoreModelProviderOutboundNetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    public void setNetworkConfiguration(CoreModelProviderOutboundNetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public CreateCustomModelProviderRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 模型的详细描述。 **取值范围：** 长度为 0-1000 个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCustomModelProviderRequestBody withTags(List<CoreModelProviderTag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCustomModelProviderRequestBody addTagsItem(CoreModelProviderTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCustomModelProviderRequestBody withTags(Consumer<List<CoreModelProviderTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签列表。 **约束限制：** 不涉及。 **取值范围：** 数组长度为 0-20。 **默认取值：** 不涉及。 
     * @return tags
     */
    public List<CoreModelProviderTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreModelProviderTag> tags) {
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
        CreateCustomModelProviderRequestBody that = (CreateCustomModelProviderRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.baseUrl, that.baseUrl)
            && Objects.equals(this.credentialConfiguration, that.credentialConfiguration)
            && Objects.equals(this.networkConfiguration, that.networkConfiguration)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baseUrl, credentialConfiguration, networkConfiguration, description, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomModelProviderRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    credentialConfiguration: ").append(toIndentedString(credentialConfiguration)).append("\n");
        sb.append("    networkConfiguration: ").append(toIndentedString(networkConfiguration)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
