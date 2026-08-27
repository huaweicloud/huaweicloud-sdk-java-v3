package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateProviderResponse extends SdkResponse {

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
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status")

    private String connectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_builtin")

    private Boolean isBuiltin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiType apiType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private Object customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_verify_time")

    private String lastVerifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_models")

    private List<ModelItemResp> createdModels = null;

    public CreateProviderResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 供应商id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateProviderResponse withProviderType(String providerType) {
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

    public CreateProviderResponse withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 供应商id。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public CreateProviderResponse withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 供应商名称。
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public CreateProviderResponse withBaseUrl(String baseUrl) {
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

    public CreateProviderResponse withConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    /**
     * 连接状态（connected/disconnected/unverified）。
     * @return connectionStatus
     */
    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public CreateProviderResponse withIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
        return this;
    }

    /**
     * 是否内置供应商。
     * @return isBuiltin
     */
    public Boolean getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
    }

    public CreateProviderResponse withApiType(ApiType apiType) {
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

    public CreateProviderResponse withCustomConfig(Object customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    /**
     * 自定义配置。
     * @return customConfig
     */
    public Object getCustomConfig() {
        return customConfig;
    }

    public void setCustomConfig(Object customConfig) {
        this.customConfig = customConfig;
    }

    public CreateProviderResponse withLastVerifyTime(String lastVerifyTime) {
        this.lastVerifyTime = lastVerifyTime;
        return this;
    }

    /**
     * 最后验证时间（ISO8601格式，UTC时区）。
     * @return lastVerifyTime
     */
    public String getLastVerifyTime() {
        return lastVerifyTime;
    }

    public void setLastVerifyTime(String lastVerifyTime) {
        this.lastVerifyTime = lastVerifyTime;
    }

    public CreateProviderResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（ISO8601格式，UTC时区）。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CreateProviderResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（ISO8601格式，UTC时区）。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CreateProviderResponse withCreatedModels(List<ModelItemResp> createdModels) {
        this.createdModels = createdModels;
        return this;
    }

    public CreateProviderResponse addCreatedModelsItem(ModelItemResp createdModelsItem) {
        if (this.createdModels == null) {
            this.createdModels = new ArrayList<>();
        }
        this.createdModels.add(createdModelsItem);
        return this;
    }

    public CreateProviderResponse withCreatedModels(Consumer<List<ModelItemResp>> createdModelsSetter) {
        if (this.createdModels == null) {
            this.createdModels = new ArrayList<>();
        }
        createdModelsSetter.accept(this.createdModels);
        return this;
    }

    /**
     * 创建的模型列表。
     * @return createdModels
     */
    public List<ModelItemResp> getCreatedModels() {
        return createdModels;
    }

    public void setCreatedModels(List<ModelItemResp> createdModels) {
        this.createdModels = createdModels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProviderResponse that = (CreateProviderResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.providerId, that.providerId) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.baseUrl, that.baseUrl)
            && Objects.equals(this.connectionStatus, that.connectionStatus)
            && Objects.equals(this.isBuiltin, that.isBuiltin) && Objects.equals(this.apiType, that.apiType)
            && Objects.equals(this.customConfig, that.customConfig)
            && Objects.equals(this.lastVerifyTime, that.lastVerifyTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createdModels, that.createdModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            providerType,
            providerId,
            providerName,
            baseUrl,
            connectionStatus,
            isBuiltin,
            apiType,
            customConfig,
            lastVerifyTime,
            createTime,
            updateTime,
            createdModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProviderResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
        sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
        sb.append("    apiType: ").append(toIndentedString(apiType)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
        sb.append("    lastVerifyTime: ").append(toIndentedString(lastVerifyTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createdModels: ").append(toIndentedString(createdModels)).append("\n");
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
