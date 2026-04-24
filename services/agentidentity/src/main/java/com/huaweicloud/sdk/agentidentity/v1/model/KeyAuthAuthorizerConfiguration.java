package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KeyAuthAuthorizerConfiguration
 */
public class KeyAuthAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_keys")

    private List<ApiKeyInfo> apiKeys = null;

    public KeyAuthAuthorizerConfiguration withApiKeys(List<ApiKeyInfo> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public KeyAuthAuthorizerConfiguration addApiKeysItem(ApiKeyInfo apiKeysItem) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        this.apiKeys.add(apiKeysItem);
        return this;
    }

    public KeyAuthAuthorizerConfiguration withApiKeys(Consumer<List<ApiKeyInfo>> apiKeysSetter) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        apiKeysSetter.accept(this.apiKeys);
        return this;
    }

    /**
     * Get apiKeys
     * @return apiKeys
     */
    public List<ApiKeyInfo> getApiKeys() {
        return apiKeys;
    }

    public void setApiKeys(List<ApiKeyInfo> apiKeys) {
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
        KeyAuthAuthorizerConfiguration that = (KeyAuthAuthorizerConfiguration) obj;
        return Objects.equals(this.apiKeys, that.apiKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyAuthAuthorizerConfiguration {\n");
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
