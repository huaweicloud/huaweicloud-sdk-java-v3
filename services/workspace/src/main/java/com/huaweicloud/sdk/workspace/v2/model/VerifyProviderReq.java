package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 验证供应商配置请求。
 */
public class VerifyProviderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiType apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private ProviderCustomConfig customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    public VerifyProviderReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 供应商主键ID。传入时，其他空字段从数据库已保存的供应商记录中补充。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VerifyProviderReq withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 供应商类型。
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public VerifyProviderReq withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 供应商id（从模板实例化后的ID）。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public VerifyProviderReq withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * 供应商API Key（SCC加密存储）。
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public VerifyProviderReq withApiType(ApiType apiType) {
        this.apiType = apiType;
        return this;
    }

    /**
     * Get apiType
     * @return apiType
     */
    public ApiType getApiType() {
        return apiType;
    }

    public void setApiType(ApiType apiType) {
        this.apiType = apiType;
    }

    public VerifyProviderReq withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * 供应商base_url。
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public VerifyProviderReq withCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public VerifyProviderReq withCustomConfig(Consumer<ProviderCustomConfig> customConfigSetter) {
        if (this.customConfig == null) {
            this.customConfig = new ProviderCustomConfig();
            customConfigSetter.accept(this.customConfig);
        }

        return this;
    }

    /**
     * Get customConfig
     * @return customConfig
     */
    public ProviderCustomConfig getCustomConfig() {
        return customConfig;
    }

    public void setCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
    }

    public VerifyProviderReq withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 用于验证连接的模型ID。调用Chat Completion接口时作为model参数传入。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VerifyProviderReq that = (VerifyProviderReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.providerId, that.providerId) && Objects.equals(this.apiKey, that.apiKey)
            && Objects.equals(this.apiType, that.apiType) && Objects.equals(this.baseUrl, that.baseUrl)
            && Objects.equals(this.customConfig, that.customConfig) && Objects.equals(this.modelId, that.modelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, providerType, providerId, apiKey, apiType, baseUrl, customConfig, modelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyProviderReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
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
