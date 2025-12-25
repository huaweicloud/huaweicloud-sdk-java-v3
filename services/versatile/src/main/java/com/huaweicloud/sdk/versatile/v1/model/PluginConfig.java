package com.huaweicloud.sdk.versatile.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件参数
 */
public class PluginConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_id")

    private String pluginId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private Map<String, Object> config = null;

    public PluginConfig withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }

    /**
     * 插件id
     * @return pluginId
     */
    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public PluginConfig withConfig(Map<String, Object> config) {
        this.config = config;
        return this;
    }

    public PluginConfig putConfigItem(String key, Object configItem) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        this.config.put(key, configItem);
        return this;
    }

    public PluginConfig withConfig(Consumer<Map<String, Object>> configSetter) {
        if (this.config == null) {
            this.config = new HashMap<>();
        }
        configSetter.accept(this.config);
        return this;
    }

    /**
     * 单个插件参数
     * @return config
     */
    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginConfig that = (PluginConfig) obj;
        return Objects.equals(this.pluginId, that.pluginId) && Objects.equals(this.config, that.config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginId, config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginConfig {\n");
        sb.append("    pluginId: ").append(toIndentedString(pluginId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
