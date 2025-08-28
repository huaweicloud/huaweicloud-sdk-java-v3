package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 默认插件支持信息。
 */
public class DefaultPluginInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_type")

    private PluginTypeEnum pluginType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_default")

    private Boolean supportDefault;

    public DefaultPluginInfo withPluginType(PluginTypeEnum pluginType) {
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

    public DefaultPluginInfo withSupportDefault(Boolean supportDefault) {
        this.supportDefault = supportDefault;
        return this;
    }

    /**
     * 支持默认插件。
     * @return supportDefault
     */
    public Boolean getSupportDefault() {
        return supportDefault;
    }

    public void setSupportDefault(Boolean supportDefault) {
        this.supportDefault = supportDefault;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultPluginInfo that = (DefaultPluginInfo) obj;
        return Objects.equals(this.pluginType, that.pluginType)
            && Objects.equals(this.supportDefault, that.supportDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginType, supportDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultPluginInfo {\n");
        sb.append("    pluginType: ").append(toIndentedString(pluginType)).append("\n");
        sb.append("    supportDefault: ").append(toIndentedString(supportDefault)).append("\n");
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
