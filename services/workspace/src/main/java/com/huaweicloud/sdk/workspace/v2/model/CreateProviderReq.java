package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 新增供应商配置请求。
 */
public class CreateProviderReq {

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
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private ProviderCustomConfig customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<CreateModelReq> models = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiType apiType;

    public CreateProviderReq withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 供应商类型（模板创建时与模板保持一致，自定义时为custom）。
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public CreateProviderReq withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 供应商标识（模板创建时与模板保持一致，自定义时可指定）。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public CreateProviderReq withApiKey(String apiKey) {
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

    public CreateProviderReq withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 供应商名称（租户自定义）。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public CreateProviderReq withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    /**
     * 自定义Base URL。
     * @return baseUrl
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public CreateProviderReq withCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public CreateProviderReq withCustomConfig(Consumer<ProviderCustomConfig> customConfigSetter) {
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

    public CreateProviderReq withModels(List<CreateModelReq> models) {
        this.models = models;
        return this;
    }

    public CreateProviderReq addModelsItem(CreateModelReq modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public CreateProviderReq withModels(Consumer<List<CreateModelReq>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 批量创建关联的模型列表。
     * @return models
     */
    public List<CreateModelReq> getModels() {
        return models;
    }

    public void setModels(List<CreateModelReq> models) {
        this.models = models;
    }

    public CreateProviderReq withApiType(ApiType apiType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProviderReq that = (CreateProviderReq) obj;
        return Objects.equals(this.providerType, that.providerType) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.apiKey, that.apiKey) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.baseUrl, that.baseUrl) && Objects.equals(this.customConfig, that.customConfig)
            && Objects.equals(this.models, that.models) && Objects.equals(this.apiType, that.apiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerType, providerId, apiKey, providerName, baseUrl, customConfig, models, apiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProviderReq {\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
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
