package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListPluginInfoListResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed")

    private String installed;

    public ListPluginInfoListResponse withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名称
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ListPluginInfoListResponse withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ListPluginInfoListResponse withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * 插件版本
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public ListPluginInfoListResponse withInstalled(String installed) {
        this.installed = installed;
        return this;
    }

    /**
     * 是否已安装
     * @return installed
     */
    public String getInstalled() {
        return installed;
    }

    public void setInstalled(String installed) {
        this.installed = installed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginInfoListResponse that = (ListPluginInfoListResponse) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.port, that.port)
            && Objects.equals(this.pluginVersion, that.pluginVersion) && Objects.equals(this.installed, that.installed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName, port, pluginVersion, installed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginInfoListResponse {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    installed: ").append(toIndentedString(installed)).append("\n");
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
