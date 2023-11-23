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
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_info")

    private PluginDTOExecutionInfo executionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_info")

    private List<PluginDTOInputInfo> inputInfo = null;

    public PluginDTO withUniqueId(String uniqueId) {
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

    public PluginDTO withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 图标URL
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
     * 运行属性
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
     * 插件名
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
     * 展示名
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
     * 业务类型
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
     * 业务类型展示名
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
     * 描述
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
     * 是否私有
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
     * 局点
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
     * 维护者
     * @return maintainers
     */
    public String getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(String maintainers) {
        this.maintainers = maintainers;
    }

    public PluginDTO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
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
     * 版本号说明
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
     * 输入信息
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
            && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.executionInfo, that.executionInfo) && Objects.equals(this.inputInfo, that.inputInfo);
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
            version,
            versionDescription,
            executionInfo,
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
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    executionInfo: ").append(toIndentedString(executionInfo)).append("\n");
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
