package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
public class ShowPluginVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_user")

    private String opUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_time")

    private String opTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_attribution")

    private String versionAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_composition_type")

    private String pluginCompositionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_attribution")

    private String pluginAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_info")

    private List<PluginPartQueryVOListAgentPluginInputVOData> inputInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_execution")

    private Object pluginExecution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_attribution")

    private String runtimeAttribution;

    public ShowPluginVersionResponse withPluginName(String pluginName) {
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

    public ShowPluginVersionResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 展示名
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowPluginVersionResponse withOpUser(String opUser) {
        this.opUser = opUser;
        return this;
    }

    /**
     * 操作人
     * @return opUser
     */
    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    public ShowPluginVersionResponse withOpTime(String opTime) {
        this.opTime = opTime;
        return this;
    }

    /**
     * 操作时间
     * @return opTime
     */
    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public ShowPluginVersionResponse withVersion(String version) {
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

    public ShowPluginVersionResponse withUniqueId(String uniqueId) {
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

    public ShowPluginVersionResponse withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * 版本说明
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public ShowPluginVersionResponse withVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
        return this;
    }

    /**
     * 版本属性
     * @return versionAttribution
     */
    public String getVersionAttribution() {
        return versionAttribution;
    }

    public void setVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
    }

    public ShowPluginVersionResponse withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * 组合插件类型
     * @return pluginCompositionType
     */
    public String getPluginCompositionType() {
        return pluginCompositionType;
    }

    public void setPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
    }

    public ShowPluginVersionResponse withPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
        return this;
    }

    /**
     * 插件属性
     * @return pluginAttribution
     */
    public String getPluginAttribution() {
        return pluginAttribution;
    }

    public void setPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
    }

    public ShowPluginVersionResponse withInputInfo(List<PluginPartQueryVOListAgentPluginInputVOData> inputInfo) {
        this.inputInfo = inputInfo;
        return this;
    }

    public ShowPluginVersionResponse addInputInfoItem(PluginPartQueryVOListAgentPluginInputVOData inputInfoItem) {
        if (this.inputInfo == null) {
            this.inputInfo = new ArrayList<>();
        }
        this.inputInfo.add(inputInfoItem);
        return this;
    }

    public ShowPluginVersionResponse withInputInfo(
        Consumer<List<PluginPartQueryVOListAgentPluginInputVOData>> inputInfoSetter) {
        if (this.inputInfo == null) {
            this.inputInfo = new ArrayList<>();
        }
        inputInfoSetter.accept(this.inputInfo);
        return this;
    }

    /**
     * 输入信息
     * @return inputInfo
     */
    public List<PluginPartQueryVOListAgentPluginInputVOData> getInputInfo() {
        return inputInfo;
    }

    public void setInputInfo(List<PluginPartQueryVOListAgentPluginInputVOData> inputInfo) {
        this.inputInfo = inputInfo;
    }

    public ShowPluginVersionResponse withPluginExecution(Object pluginExecution) {
        this.pluginExecution = pluginExecution;
        return this;
    }

    /**
     * 执行信息
     * @return pluginExecution
     */
    public Object getPluginExecution() {
        return pluginExecution;
    }

    public void setPluginExecution(Object pluginExecution) {
        this.pluginExecution = pluginExecution;
    }

    public ShowPluginVersionResponse withRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
        return this;
    }

    /**
     * 运行属性
     * @return runtimeAttribution
     */
    public String getRuntimeAttribution() {
        return runtimeAttribution;
    }

    public void setRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPluginVersionResponse that = (ShowPluginVersionResponse) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.opUser, that.opUser) && Objects.equals(this.opTime, that.opTime)
            && Objects.equals(this.version, that.version) && Objects.equals(this.uniqueId, that.uniqueId)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.versionAttribution, that.versionAttribution)
            && Objects.equals(this.pluginCompositionType, that.pluginCompositionType)
            && Objects.equals(this.pluginAttribution, that.pluginAttribution)
            && Objects.equals(this.inputInfo, that.inputInfo)
            && Objects.equals(this.pluginExecution, that.pluginExecution)
            && Objects.equals(this.runtimeAttribution, that.runtimeAttribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName,
            displayName,
            opUser,
            opTime,
            version,
            uniqueId,
            versionDescription,
            versionAttribution,
            pluginCompositionType,
            pluginAttribution,
            inputInfo,
            pluginExecution,
            runtimeAttribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPluginVersionResponse {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    opUser: ").append(toIndentedString(opUser)).append("\n");
        sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    versionAttribution: ").append(toIndentedString(versionAttribution)).append("\n");
        sb.append("    pluginCompositionType: ").append(toIndentedString(pluginCompositionType)).append("\n");
        sb.append("    pluginAttribution: ").append(toIndentedString(pluginAttribution)).append("\n");
        sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
        sb.append("    pluginExecution: ").append(toIndentedString(pluginExecution)).append("\n");
        sb.append("    runtimeAttribution: ").append(toIndentedString(runtimeAttribution)).append("\n");
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
