package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询供应商远程模型列表请求。
 */
public class ListRemoteModelsReq {

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
    @JsonProperty(value = "base_url")

    private String baseUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_config")

    private ProviderCustomConfig customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListRemoteModelsReq withId(String id) {
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

    public ListRemoteModelsReq withProviderType(String providerType) {
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

    public ListRemoteModelsReq withProviderId(String providerId) {
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

    public ListRemoteModelsReq withApiKey(String apiKey) {
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

    public ListRemoteModelsReq withBaseUrl(String baseUrl) {
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

    public ListRemoteModelsReq withCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public ListRemoteModelsReq withCustomConfig(Consumer<ProviderCustomConfig> customConfigSetter) {
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

    public ListRemoteModelsReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，默认20，最大100。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListRemoteModelsReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRemoteModelsReq that = (ListRemoteModelsReq) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.providerType, that.providerType)
            && Objects.equals(this.providerId, that.providerId) && Objects.equals(this.apiKey, that.apiKey)
            && Objects.equals(this.baseUrl, that.baseUrl) && Objects.equals(this.customConfig, that.customConfig)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, providerType, providerId, apiKey, baseUrl, customConfig, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRemoteModelsReq {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
