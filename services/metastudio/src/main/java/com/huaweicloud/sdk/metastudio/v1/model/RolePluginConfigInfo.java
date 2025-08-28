package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 角色插件配置信息。
 */
public class RolePluginConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_type")

    private PluginTypeEnum pluginType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_source")

    private PluginSourceEnum pluginSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_config_id")

    private String pluginConfigId;

    public RolePluginConfigInfo withPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
        return this;
    }

    /**
     * Get pluginType
     * @return pluginType
     */
    public PluginTypeEnum getPluginType() {
        return pluginType;
    }

    public void setPluginType(PluginTypeEnum pluginType) {
        this.pluginType = pluginType;
    }

    public RolePluginConfigInfo withPluginSource(PluginSourceEnum pluginSource) {
        this.pluginSource = pluginSource;
        return this;
    }

    /**
     * Get pluginSource
     * @return pluginSource
     */
    public PluginSourceEnum getPluginSource() {
        return pluginSource;
    }

    public void setPluginSource(PluginSourceEnum pluginSource) {
        this.pluginSource = pluginSource;
    }

    public RolePluginConfigInfo withPluginConfigId(String pluginConfigId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RolePluginConfigInfo that = (RolePluginConfigInfo) obj;
        return Objects.equals(this.pluginType, that.pluginType) && Objects.equals(this.pluginSource, that.pluginSource)
            && Objects.equals(this.pluginConfigId, that.pluginConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginType, pluginSource, pluginConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolePluginConfigInfo {\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
        sb.append("    pluginSource: ").append(toIndentedString(pluginSource)).append("\n");
        sb.append("    pluginConfigId: ").append(toIndentedString(pluginConfigId)).append("\n");
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
