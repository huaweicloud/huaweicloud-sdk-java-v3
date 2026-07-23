package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * API 密钥认证配置。
 */
public class CoreGatewayKeyAuthAuthorizerConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_keys")

    private List<CoreGatewayApiKeyConfiguration> apiKeys = null;

    public CoreGatewayKeyAuthAuthorizerConfiguration withApiKeys(List<CoreGatewayApiKeyConfiguration> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }

    public CoreGatewayKeyAuthAuthorizerConfiguration addApiKeysItem(CoreGatewayApiKeyConfiguration apiKeysItem) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        this.apiKeys.add(apiKeysItem);
        return this;
    }

    public CoreGatewayKeyAuthAuthorizerConfiguration withApiKeys(
        Consumer<List<CoreGatewayApiKeyConfiguration>> apiKeysSetter) {
        if (this.apiKeys == null) {
            this.apiKeys = new ArrayList<>();
        }
        apiKeysSetter.accept(this.apiKeys);
        return this;
    }

    /**
     * API 密钥列表。
     * @return apiKeys
     */
    public List<CoreGatewayApiKeyConfiguration> getApiKeys() {
        return apiKeys;
    }

    public void setApiKeys(List<CoreGatewayApiKeyConfiguration> apiKeys) {
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
        CoreGatewayKeyAuthAuthorizerConfiguration that = (CoreGatewayKeyAuthAuthorizerConfiguration) obj;
        return Objects.equals(this.apiKeys, that.apiKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKeys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayKeyAuthAuthorizerConfiguration {\n");
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
