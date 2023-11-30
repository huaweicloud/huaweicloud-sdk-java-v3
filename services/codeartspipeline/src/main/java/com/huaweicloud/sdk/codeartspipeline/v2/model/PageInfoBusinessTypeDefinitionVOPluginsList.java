package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PageInfoBusinessTypeDefinitionVOPluginsList
 */
public class PageInfoBusinessTypeDefinitionVOPluginsList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_attribution")

    private String pluginAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_composition_type")

    private String pluginCompositionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_attribution")

    private String runtimeAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_steps")

    private List<FullStagePluginsRelationVOAllSteps> allSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_attribution")

    private String versionAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_step_editable")

    private Integer multiStepEditable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_unique_id")

    private String publisherUniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    public PageInfoBusinessTypeDefinitionVOPluginsList withUniqueId(String uniqueId) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withDisplayName(String displayName) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withPluginName(String pluginName) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 禁用
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 组类型
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
        return this;
    }

    /**
     * 属性
     * @return pluginAttribution
     */
    public String getPluginAttribution() {
        return pluginAttribution;
    }

    public void setPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * 组合插件
     * @return pluginCompositionType
     */
    public String getPluginCompositionType() {
        return pluginCompositionType;
    }

    public void setPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withRuntimeAttribution(String runtimeAttribution) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withAllSteps(List<FullStagePluginsRelationVOAllSteps> allSteps) {
        this.allSteps = allSteps;
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList addAllStepsItem(
        FullStagePluginsRelationVOAllSteps allStepsItem) {
        if (this.allSteps == null) {
            this.allSteps = new ArrayList<>();
        }
        this.allSteps.add(allStepsItem);
        return this;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withAllSteps(
        Consumer<List<FullStagePluginsRelationVOAllSteps>> allStepsSetter) {
        if (this.allSteps == null) {
            this.allSteps = new ArrayList<>();
        }
        allStepsSetter.accept(this.allSteps);
        return this;
    }

    /**
     * 基础插件列表
     * @return allSteps
     */
    public List<FullStagePluginsRelationVOAllSteps> getAllSteps() {
        return allSteps;
    }

    public void setAllSteps(List<FullStagePluginsRelationVOAllSteps> allSteps) {
        this.allSteps = allSteps;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withDescription(String description) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withVersionAttribution(String versionAttribution) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withIconUrl(String iconUrl) {
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

    public PageInfoBusinessTypeDefinitionVOPluginsList withMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
        return this;
    }

    /**
     * 可编辑
     * @return multiStepEditable
     */
    public Integer getMultiStepEditable() {
        return multiStepEditable;
    }

    public void setMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 地址
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
        return this;
    }

    /**
     * 发布商ID
     * @return publisherUniqueId
     */
    public String getPublisherUniqueId() {
        return publisherUniqueId;
    }

    public void setPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
    }

    public PageInfoBusinessTypeDefinitionVOPluginsList withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * 版本
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageInfoBusinessTypeDefinitionVOPluginsList that = (PageInfoBusinessTypeDefinitionVOPluginsList) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.pluginAttribution, that.pluginAttribution)
            && Objects.equals(this.pluginCompositionType, that.pluginCompositionType)
            && Objects.equals(this.runtimeAttribution, that.runtimeAttribution)
            && Objects.equals(this.allSteps, that.allSteps) && Objects.equals(this.description, that.description)
            && Objects.equals(this.versionAttribution, that.versionAttribution)
            && Objects.equals(this.iconUrl, that.iconUrl)
            && Objects.equals(this.multiStepEditable, that.multiStepEditable)
            && Objects.equals(this.location, that.location)
            && Objects.equals(this.publisherUniqueId, that.publisherUniqueId)
            && Objects.equals(this.manifestVersion, that.manifestVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId,
            displayName,
            pluginName,
            disabled,
            groupName,
            groupType,
            pluginAttribution,
            pluginCompositionType,
            runtimeAttribution,
            allSteps,
            description,
            versionAttribution,
            iconUrl,
            multiStepEditable,
            location,
            publisherUniqueId,
            manifestVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageInfoBusinessTypeDefinitionVOPluginsList {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    pluginAttribution: ").append(toIndentedString(pluginAttribution)).append("\n");
        sb.append("    pluginCompositionType: ").append(toIndentedString(pluginCompositionType)).append("\n");
        sb.append("    runtimeAttribution: ").append(toIndentedString(runtimeAttribution)).append("\n");
        sb.append("    allSteps: ").append(toIndentedString(allSteps)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versionAttribution: ").append(toIndentedString(versionAttribution)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    multiStepEditable: ").append(toIndentedString(multiStepEditable)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    publisherUniqueId: ").append(toIndentedString(publisherUniqueId)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
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
