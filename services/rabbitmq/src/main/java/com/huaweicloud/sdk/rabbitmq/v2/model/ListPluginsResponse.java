package com.huaweicloud.sdk.rabbitmq.v2.model;

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
public class ListPluginsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins_modifying")

    private Boolean pluginsModifying;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins")

    private List<PluginEntity> plugins = null;

    public ListPluginsResponse withPluginsModifying(Boolean pluginsModifying) {
        this.pluginsModifying = pluginsModifying;
        return this;
    }

    /**
     * 插件是否在变更中。
     * @return pluginsModifying
     */
    public Boolean getPluginsModifying() {
        return pluginsModifying;
    }

    public void setPluginsModifying(Boolean pluginsModifying) {
        this.pluginsModifying = pluginsModifying;
    }

    public ListPluginsResponse withPlugins(List<PluginEntity> plugins) {
        this.plugins = plugins;
        return this;
    }

    public ListPluginsResponse addPluginsItem(PluginEntity pluginsItem) {
        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }
        this.plugins.add(pluginsItem);
        return this;
    }

    public ListPluginsResponse withPlugins(Consumer<List<PluginEntity>> pluginsSetter) {
        if (this.plugins == null) {
            this.plugins = new ArrayList<>();
        }
        pluginsSetter.accept(this.plugins);
        return this;
    }

    /**
     * 插件信息列表。
     * @return plugins
     */
    public List<PluginEntity> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<PluginEntity> plugins) {
        this.plugins = plugins;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginsResponse that = (ListPluginsResponse) obj;
        return Objects.equals(this.pluginsModifying, that.pluginsModifying)
            && Objects.equals(this.plugins, that.plugins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginsModifying, plugins);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginsResponse {\n");
        sb.append("    pluginsModifying: ").append(toIndentedString(pluginsModifying)).append("\n");
        sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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
