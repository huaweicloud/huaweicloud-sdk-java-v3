package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PluginDTO
 */
public class PluginDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_attribution")

    private String runtimeAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type_display_name")

    private String businessTypeDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_private")

    private Integer isPrivate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainers")

    private String maintainers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_composition_type")

    private String pluginCompositionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_info")

    private PluginDTOExecutionInfo executionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_info")

    private List<PluginDTOOutputInfo> outputInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_info")

    private List<PluginDTOInputInfo> inputInfo = null;

    public PluginDTO withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * **参数解释**： 扩展插件唯一ID。可以通过[查询插件版本详情](ShowPluginVersion.xml)接口，获取响应参数中unique_id。 **约束限制**： 不涉及。 **取值范围**： 32位字符，由数字和字母组成。 **默认取值**： 不涉及。 
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public PluginDTO withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * **参数解释**： 插件展示图标URL。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public PluginDTO withRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
        return this;
    }

    /**
     * **参数解释**： 运行属性。 **约束限制**： 不涉及。 **取值范围**： - agent：基于agent运行。 - agentless：无需agent运行。 **默认取值**： 不涉及。 
     * @return runtimeAttribution
     */
    public String getRuntimeAttribution() {
        return runtimeAttribution;
    }

    public void setRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
    }

    public PluginDTO withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 插件名。 **约束限制**： 仅支持输入大小写英文字母、数字、'-'、'_'。 **取值范围**： 1到50位字符。 **默认取值**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginDTO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 展示名。 **约束限制**： 仅支持输入大小写英文字母、中文、空格、数字、'-'、'_'、'.'。 **取值范围**： 1到50位字符。 **默认取值**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PluginDTO withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**： 业务类型。 **约束限制**： 仅支持输入大小写英文字母、数字、'-'、'_'。 **取值范围**： 1到50位字符。 **默认取值**： 不涉及。 
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public PluginDTO withBusinessTypeDisplayName(String businessTypeDisplayName) {
        this.businessTypeDisplayName = businessTypeDisplayName;
        return this;
    }

    /**
     * **参数解释**： 插件业务类型展示名。 **约束限制**： 不涉及。 **取值范围**： - 构建。 - 代码检查。 - 部署。 - 测试。 - 通用。 **默认取值**： 不涉及。 
     * @return businessTypeDisplayName
     */
    public String getBusinessTypeDisplayName() {
        return businessTypeDisplayName;
    }

    public void setBusinessTypeDisplayName(String businessTypeDisplayName) {
        this.businessTypeDisplayName = businessTypeDisplayName;
    }

    public PluginDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 插件描述。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginDTO withIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * **参数解释**： 是否私有插件。 **约束限制**： 不涉及。 **取值范围**： - 1：私有插件。 - 0：公开插件。 **默认取值**： 0。 
     * @return isPrivate
     */
    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    public PluginDTO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 局点。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PluginDTO withMaintainers(String maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    /**
     * **参数解释**： 插件维护者。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return maintainers
     */
    public String getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(String maintainers) {
        this.maintainers = maintainers;
    }

    public PluginDTO withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * **参数解释**： 插件的组合类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return pluginCompositionType
     */
    public String getPluginCompositionType() {
        return pluginCompositionType;
    }

    public void setPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
    }

    public PluginDTO withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * **参数解释**： 用于区分新旧版数据版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public PluginDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件版本号。 **约束限制**： 必须是类似 x.xx.xx（例如：1.0.2） 的格式，其中：x 是 1 到 2 位的数字（范围 0 到 99）。xx 是点后跟随的数字部分，且每部分可以是 1 位或 2 位数字。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginDTO withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * **参数解释**： 插件小版本版本号说明。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public PluginDTO withExecutionInfo(PluginDTOExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
        return this;
    }

    public PluginDTO withExecutionInfo(Consumer<PluginDTOExecutionInfo> executionInfoSetter) {
        if (this.executionInfo == null) {
            this.executionInfo = new PluginDTOExecutionInfo();
            executionInfoSetter.accept(this.executionInfo);
        }

        return this;
    }

    /**
     * Get executionInfo
     * @return executionInfo
     */
    public PluginDTOExecutionInfo getExecutionInfo() {
        return executionInfo;
    }

    public void setExecutionInfo(PluginDTOExecutionInfo executionInfo) {
        this.executionInfo = executionInfo;
    }

    public PluginDTO withOutputInfo(List<PluginDTOOutputInfo> outputInfo) {
        this.outputInfo = outputInfo;
        return this;
    }

    public PluginDTO addOutputInfoItem(PluginDTOOutputInfo outputInfoItem) {
        if (this.outputInfo == null) {
            this.outputInfo = new ArrayList<>();
        }
        this.outputInfo.add(outputInfoItem);
        return this;
    }

    public PluginDTO withOutputInfo(Consumer<List<PluginDTOOutputInfo>> outputInfoSetter) {
        if (this.outputInfo == null) {
            this.outputInfo = new ArrayList<>();
        }
        outputInfoSetter.accept(this.outputInfo);
        return this;
    }

    /**
     * **参数解释**： 插件输出相关内容。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return outputInfo
     */
    public List<PluginDTOOutputInfo> getOutputInfo() {
        return outputInfo;
    }

    public void setOutputInfo(List<PluginDTOOutputInfo> outputInfo) {
        this.outputInfo = outputInfo;
    }

    public PluginDTO withInputInfo(List<PluginDTOInputInfo> inputInfo) {
        this.inputInfo = inputInfo;
        return this;
    }

    public PluginDTO addInputInfoItem(PluginDTOInputInfo inputInfoItem) {
        if (this.inputInfo == null) {
            this.inputInfo = new ArrayList<>();
        }
        this.inputInfo.add(inputInfoItem);
        return this;
    }

    public PluginDTO withInputInfo(Consumer<List<PluginDTOInputInfo>> inputInfoSetter) {
        if (this.inputInfo == null) {
            this.inputInfo = new ArrayList<>();
        }
        inputInfoSetter.accept(this.inputInfo);
        return this;
    }

    /**
     * **参数解释**： 输入信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return inputInfo
     */
    public List<PluginDTOInputInfo> getInputInfo() {
        return inputInfo;
    }

    public void setInputInfo(List<PluginDTOInputInfo> inputInfo) {
        this.inputInfo = inputInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginDTO that = (PluginDTO) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.iconUrl, that.iconUrl)
            && Objects.equals(this.runtimeAttribution, that.runtimeAttribution)
            && Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.businessTypeDisplayName, that.businessTypeDisplayName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isPrivate, that.isPrivate)
            && Objects.equals(this.region, that.region) && Objects.equals(this.maintainers, that.maintainers)
            && Objects.equals(this.pluginCompositionType, that.pluginCompositionType)
            && Objects.equals(this.manifestVersion, that.manifestVersion) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.executionInfo, that.executionInfo)
            && Objects.equals(this.outputInfo, that.outputInfo) && Objects.equals(this.inputInfo, that.inputInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId,
            iconUrl,
            runtimeAttribution,
            pluginName,
            displayName,
            businessType,
            businessTypeDisplayName,
            description,
            isPrivate,
            region,
            maintainers,
            pluginCompositionType,
            manifestVersion,
            version,
            versionDescription,
            executionInfo,
            outputInfo,
            inputInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginDTO {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    runtimeAttribution: ").append(toIndentedString(runtimeAttribution)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    businessTypeDisplayName: ").append(toIndentedString(businessTypeDisplayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    pluginCompositionType: ").append(toIndentedString(pluginCompositionType)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    executionInfo: ").append(toIndentedString(executionInfo)).append("\n");
        sb.append("    outputInfo: ").append(toIndentedString(outputInfo)).append("\n");
        sb.append("    inputInfo: ").append(toIndentedString(inputInfo)).append("\n");
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
