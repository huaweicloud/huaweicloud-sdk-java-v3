package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 供应商配置（不含 API Key）
 */
public class InstanceModelProviderConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_base_url")

    private String apiBaseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private ProviderCustomConfig customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "models")

    private List<ModelInfo> models = null;

    public InstanceModelProviderConfig withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 供应商配置主键 ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceModelProviderConfig withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 供应商标识
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public InstanceModelProviderConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 供应商名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstanceModelProviderConfig withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 供应商类型
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public InstanceModelProviderConfig withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 供应商更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public InstanceModelProviderConfig withApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    /**
     * 供应商 API 地址
     * @return apiBaseUrl
     */
    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public InstanceModelProviderConfig withCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public InstanceModelProviderConfig withCustomConfig(Consumer<ProviderCustomConfig> customConfigSetter) {
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

    public InstanceModelProviderConfig withModels(List<ModelInfo> models) {
        this.models = models;
        return this;
    }

    public InstanceModelProviderConfig addModelsItem(ModelInfo modelsItem) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        this.models.add(modelsItem);
        return this;
    }

    public InstanceModelProviderConfig withModels(Consumer<List<ModelInfo>> modelsSetter) {
        if (this.models == null) {
            this.models = new ArrayList<>();
        }
        modelsSetter.accept(this.models);
        return this;
    }

    /**
     * 模型列表
     * @return models
     */
    public List<ModelInfo> getModels() {
        return models;
    }

    public void setModels(List<ModelInfo> models) {
        this.models = models;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceModelProviderConfig that = (InstanceModelProviderConfig) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.apiBaseUrl, that.apiBaseUrl)
            && Objects.equals(this.customConfig, that.customConfig) && Objects.equals(this.models, that.models);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, providerId, name, providerType, updateTime, apiBaseUrl, customConfig, models);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceModelProviderConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    apiBaseUrl: ").append(toIndentedString(apiBaseUrl)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
        sb.append("    models: ").append(toIndentedString(models)).append("\n");
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
