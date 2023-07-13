package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiOperPluginInfo
 */
public class ApiOperPluginInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_ids")

    private List<String> pluginIds = null;

    public ApiOperPluginInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 绑定API的环境编码。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ApiOperPluginInfo withPluginIds(List<String> pluginIds) {
        this.pluginIds = pluginIds;
        return this;
    }

    public ApiOperPluginInfo addPluginIdsItem(String pluginIdsItem) {
        if (this.pluginIds == null) {
            this.pluginIds = new ArrayList<>();
        }
        this.pluginIds.add(pluginIdsItem);
        return this;
    }

    public ApiOperPluginInfo withPluginIds(Consumer<List<String>> pluginIdsSetter) {
        if (this.pluginIds == null) {
            this.pluginIds = new ArrayList<>();
        }
        pluginIdsSetter.accept(this.pluginIds);
        return this;
    }

    /**
     * 绑定的插件编码列表。
     * @return pluginIds
     */
    public List<String> getPluginIds() {
        return pluginIds;
    }

    public void setPluginIds(List<String> pluginIds) {
        this.pluginIds = pluginIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiOperPluginInfo that = (ApiOperPluginInfo) obj;
        return Objects.equals(this.envId, that.envId) && Objects.equals(this.pluginIds, that.pluginIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, pluginIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiOperPluginInfo {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    pluginIds: ").append(toIndentedString(pluginIds)).append("\n");
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
