package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 供应商配置信息（含last_verify_time）。
 */
public class ProviderInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private String providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_status")

    private String connectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_count")

    private Integer modelCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_count")

    private Integer groupCount;

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
    @JsonProperty(value = "is_builtin")

    private Boolean isBuiltin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiType apiType;

    public ProviderInfoVO withId(String id) {
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

    public ProviderInfoVO withProviderName(String providerName) {
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

    public ProviderInfoVO withProviderType(String providerType) {
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

    public ProviderInfoVO withProviderId(String providerId) {
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

    public ProviderInfoVO withBaseUrl(String baseUrl) {
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

    public ProviderInfoVO withConnectionStatus(String connectionStatus) {
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

    public ProviderInfoVO withModelCount(Integer modelCount) {
        this.modelCount = modelCount;
        return this;
    }

    /**
     * 下属模型数量。
     * @return modelCount
     */
    public Integer getModelCount() {
        return modelCount;
    }

    public void setModelCount(Integer modelCount) {
        this.modelCount = modelCount;
    }

    public ProviderInfoVO withGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
        return this;
    }

    /**
     * 关联的模型分组数量。
     * @return groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    public ProviderInfoVO withLastVerifyTime(String lastVerifyTime) {
        this.lastVerifyTime = lastVerifyTime;
        return this;
    }

    /**
     * 最后一次验证时间。
     * @return lastVerifyTime
     */
    public String getLastVerifyTime() {
        return lastVerifyTime;
    }

    public void setLastVerifyTime(String lastVerifyTime) {
        this.lastVerifyTime = lastVerifyTime;
    }

    public ProviderInfoVO withCreateTime(String createTime) {
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

    public ProviderInfoVO withUpdateTime(String updateTime) {
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

    public ProviderInfoVO withIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
        return this;
    }

    /**
     * 是否为内置供应商。
     * @return isBuiltin
     */
    public Boolean getIsBuiltin() {
        return isBuiltin;
    }

    public void setIsBuiltin(Boolean isBuiltin) {
        this.isBuiltin = isBuiltin;
    }

    public ProviderInfoVO withApiType(ApiType apiType) {
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
        ProviderInfoVO that = (ProviderInfoVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.providerType, that.providerType) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.baseUrl, that.baseUrl)
            && Objects.equals(this.connectionStatus, that.connectionStatus)
            && Objects.equals(this.modelCount, that.modelCount) && Objects.equals(this.groupCount, that.groupCount)
            && Objects.equals(this.lastVerifyTime, that.lastVerifyTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.isBuiltin, that.isBuiltin) && Objects.equals(this.apiType, that.apiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            providerName,
            providerType,
            providerId,
            baseUrl,
            connectionStatus,
            modelCount,
            groupCount,
            lastVerifyTime,
            createTime,
            updateTime,
            isBuiltin,
            apiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderInfoVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
        sb.append("    modelCount: ").append(toIndentedString(modelCount)).append("\n");
        sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
        sb.append("    lastVerifyTime: ").append(toIndentedString(lastVerifyTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isBuiltin: ").append(toIndentedString(isBuiltin)).append("\n");
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
