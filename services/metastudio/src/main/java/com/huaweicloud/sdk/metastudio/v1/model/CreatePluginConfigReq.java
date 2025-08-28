package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建插件配置请求。
 */
public class CreatePluginConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_provider")

    private PluginProviderEnum pluginProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_key")

    private String apiKey;

    public CreatePluginConfigReq withPluginProvider(PluginProviderEnum pluginProvider) {
        this.pluginProvider = pluginProvider;
        return this;
    }

    /**
     * Get pluginProvider
     * @return pluginProvider
     */
    public PluginProviderEnum getPluginProvider() {
        return pluginProvider;
    }

    public void setPluginProvider(PluginProviderEnum pluginProvider) {
        this.pluginProvider = pluginProvider;
    }

    public CreatePluginConfigReq withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * 密钥。
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePluginConfigReq that = (CreatePluginConfigReq) obj;
        return Objects.equals(this.pluginProvider, that.pluginProvider) && Objects.equals(this.apiKey, that.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginProvider, apiKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePluginConfigReq {\n");
        sb.append("    pluginProvider: ").append(toIndentedString(pluginProvider)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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
