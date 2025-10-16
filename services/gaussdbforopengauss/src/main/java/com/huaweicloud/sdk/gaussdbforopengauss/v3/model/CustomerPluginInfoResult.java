package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerPluginInfoResult
 */
public class CustomerPluginInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed")

    private Boolean installed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    public CustomerPluginInfoResult withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**: 插件名称。 **取值范围**: 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public CustomerPluginInfoResult withInstalled(Boolean installed) {
        this.installed = installed;
        return this;
    }

    /**
     * **参数解释**: 是否安装此插件。 **取值范围**: 不涉及。 
     * @return installed
     */
    public Boolean getInstalled() {
        return installed;
    }

    public void setInstalled(Boolean installed) {
        this.installed = installed;
    }

    public CustomerPluginInfoResult withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 插件端口。 **取值范围**: 不涉及。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public CustomerPluginInfoResult withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**: 插件版本。 **取值范围**: 不涉及。 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerPluginInfoResult that = (CustomerPluginInfoResult) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.installed, that.installed)
            && Objects.equals(this.port, that.port) && Objects.equals(this.pluginVersion, that.pluginVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName, installed, port, pluginVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerPluginInfoResult {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
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
