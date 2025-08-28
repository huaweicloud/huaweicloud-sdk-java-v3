package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 插件配置基本信息。
 */
public class PluginConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_config_id")

    private String pluginConfigId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_provider")

    private PluginProviderEnum pluginProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public PluginConfigInfo withPluginConfigId(String pluginConfigId) {
        this.pluginConfigId = pluginConfigId;
        return this;
    }

    /**
     * 插件配置ID。
     * @return pluginConfigId
     */
    public String getPluginConfigId() {
        return pluginConfigId;
    }

    public void setPluginConfigId(String pluginConfigId) {
        this.pluginConfigId = pluginConfigId;
    }

    public PluginConfigInfo withPluginProvider(PluginProviderEnum pluginProvider) {
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

    public PluginConfigInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PluginConfigInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginConfigInfo that = (PluginConfigInfo) obj;
        return Objects.equals(this.pluginConfigId, that.pluginConfigId)
            && Objects.equals(this.pluginProvider, that.pluginProvider)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginConfigId, pluginProvider, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginConfigInfo {\n");
        sb.append("    pluginConfigId: ").append(toIndentedString(pluginConfigId)).append("\n");
        sb.append("    pluginProvider: ").append(toIndentedString(pluginProvider)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
