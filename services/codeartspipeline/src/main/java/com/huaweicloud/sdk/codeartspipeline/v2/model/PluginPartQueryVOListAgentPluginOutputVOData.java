package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginPartQueryVOListAgentPluginOutputVOData
 */
public class PluginPartQueryVOListAgentPluginOutputVOData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_key")

    private String outputKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_value")

    private String outputValue;

    public PluginPartQueryVOListAgentPluginOutputVOData withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * 唯一ID
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public PluginPartQueryVOListAgentPluginOutputVOData withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginPartQueryVOListAgentPluginOutputVOData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginPartQueryVOListAgentPluginOutputVOData withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 租户ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public PluginPartQueryVOListAgentPluginOutputVOData withOutputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
    }

    /**
     * 名称
     * @return outputKey
     */
    public String getOutputKey() {
        return outputKey;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    public PluginPartQueryVOListAgentPluginOutputVOData withOutputValue(String outputValue) {
        this.outputValue = outputValue;
        return this;
    }

    /**
     * 值
     * @return outputValue
     */
    public String getOutputValue() {
        return outputValue;
    }

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginPartQueryVOListAgentPluginOutputVOData that = (PluginPartQueryVOListAgentPluginOutputVOData) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.version, that.version) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.outputKey, that.outputKey) && Objects.equals(this.outputValue, that.outputValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId, pluginName, version, workspaceId, outputKey, outputValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginPartQueryVOListAgentPluginOutputVOData {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    outputKey: ").append(toIndentedString(outputKey)).append("\n");
        sb.append("    outputValue: ").append(toIndentedString(outputValue)).append("\n");
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
