package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：  APIKEY入站认证配置。 **约束限制**: 不涉及。 **取值范围**： 不涉及。 **默认取值**: 不涉及。
 */
public class CoreRunKeyAuthAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_keys")

    private List<CoreRunApiKey> apiKeys = null;

    public CoreRunKeyAuthAuthorizerConfiguration withApiKeys(List<CoreRunApiKey> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public CoreRunKeyAuthAuthorizerConfiguration addApiKeysItem(CoreRunApiKey apiKeysItem) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        this.apiKeys.add(apiKeysItem);
        return this;
    }

    public CoreRunKeyAuthAuthorizerConfiguration withApiKeys(Consumer<List<CoreRunApiKey>> apiKeysSetter) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        apiKeysSetter.accept(this.apiKeys);
        return this;
    }

    /**
     * **参数解释**：  入站认证允许的所有的API KEY密钥列表。 **约束限制**: 不涉及。 **取值范围**： 最小数量 0，最大数量 10。 **默认取值**: 不涉及。
     * @return apiKeys
     */
    public List<CoreRunApiKey> getApiKeys() {
        return apiKeys;
    }

    public void setApiKeys(List<CoreRunApiKey> apiKeys) {
        this.apiKeys = apiKeys;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunKeyAuthAuthorizerConfiguration that = (CoreRunKeyAuthAuthorizerConfiguration) obj;
        return Objects.equals(this.apiKeys, that.apiKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunKeyAuthAuthorizerConfiguration {\n");
        sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
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
