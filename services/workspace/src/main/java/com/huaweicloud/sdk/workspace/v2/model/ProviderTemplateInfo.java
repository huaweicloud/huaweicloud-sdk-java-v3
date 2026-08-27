package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 供应商模板信息。
 */
public class ProviderTemplateInfo {

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
    @JsonProperty(value = "custom_config")

    private ProviderCustomConfig customConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_type")

    private ApiType apiType;

    public ProviderTemplateInfo withProviderType(String providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 模板唯一标识（供应商类型）。
     * @return providerType
     */
    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    public ProviderTemplateInfo withProviderId(String providerId) {
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

    public ProviderTemplateInfo withBaseUrl(String baseUrl) {
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

    public ProviderTemplateInfo withCustomConfig(ProviderCustomConfig customConfig) {
        this.customConfig = customConfig;
        return this;
    }

    public ProviderTemplateInfo withCustomConfig(Consumer<ProviderCustomConfig> customConfigSetter) {
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

    public ProviderTemplateInfo withApiType(ApiType apiType) {
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
        ProviderTemplateInfo that = (ProviderTemplateInfo) obj;
        return Objects.equals(this.providerType, that.providerType) && Objects.equals(this.providerId, that.providerId)
            && Objects.equals(this.baseUrl, that.baseUrl) && Objects.equals(this.customConfig, that.customConfig)
            && Objects.equals(this.apiType, that.apiType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerType, providerId, baseUrl, customConfig, apiType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProviderTemplateInfo {\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
        sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
        sb.append("    customConfig: ").append(toIndentedString(customConfig)).append("\n");
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
