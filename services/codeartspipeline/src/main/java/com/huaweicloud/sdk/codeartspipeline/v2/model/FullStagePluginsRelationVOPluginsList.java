package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FullStagePluginsRelationVOPluginsList
 */
public class FullStagePluginsRelationVOPluginsList {

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
    @JsonProperty(value = "db_record_name")

    private String dbRecordName;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private Boolean standard;

    public FullStagePluginsRelationVOPluginsList withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * **参数解释**： 唯一ID。 **取值范围**： 不涉及。 
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public FullStagePluginsRelationVOPluginsList withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 展示名。 **取值范围**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public FullStagePluginsRelationVOPluginsList withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 插件名。 **取值范围**： 不涉及。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public FullStagePluginsRelationVOPluginsList withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * **参数解释**： 当前插件对后续选择使用的流水线是否为禁用状态，默认为false。 **取值范围**： - true：被禁用。 - false：未被禁用。 
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public FullStagePluginsRelationVOPluginsList withDbRecordName(String dbRecordName) {
        this.dbRecordName = dbRecordName;
        return this;
    }

    /**
     * **参数解释**： 插件记录展示名称。 **取值范围**： 不涉及。 
     * @return dbRecordName
     */
    public String getDbRecordName() {
        return dbRecordName;
    }

    public void setDbRecordName(String dbRecordName) {
        this.dbRecordName = dbRecordName;
    }

    public FullStagePluginsRelationVOPluginsList withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 流水线stage下的分组名称。 **取值范围**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public FullStagePluginsRelationVOPluginsList withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * **参数解释**： 流水线stage下的分组类型。 **取值范围**： 不涉及。 
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public FullStagePluginsRelationVOPluginsList withPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
        return this;
    }

    /**
     * **参数解释**： 标识是否为官方插件。 **取值范围**： 不涉及。 
     * @return pluginAttribution
     */
    public String getPluginAttribution() {
        return pluginAttribution;
    }

    public void setPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
    }

    public FullStagePluginsRelationVOPluginsList withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * **参数解释**： 标识是否为多个step组成的组。 **取值范围**： - single：单step插件。 - multi：组合插件。 
     * @return pluginCompositionType
     */
    public String getPluginCompositionType() {
        return pluginCompositionType;
    }

    public void setPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
    }

    public FullStagePluginsRelationVOPluginsList withRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
        return this;
    }

    /**
     * **参数解释**： 运行属性。 **取值范围**： - agent：运行基于流水线agent。 - agentLess：运行无需流水线agent。 
     * @return runtimeAttribution
     */
    public String getRuntimeAttribution() {
        return runtimeAttribution;
    }

    public void setRuntimeAttribution(String runtimeAttribution) {
        this.runtimeAttribution = runtimeAttribution;
    }

    public FullStagePluginsRelationVOPluginsList withAllSteps(List<FullStagePluginsRelationVOAllSteps> allSteps) {
        this.allSteps = allSteps;
        return this;
    }

    public FullStagePluginsRelationVOPluginsList addAllStepsItem(FullStagePluginsRelationVOAllSteps allStepsItem) {
        if (this.allSteps == null) {
            this.allSteps = new ArrayList<>();
        }
        this.allSteps.add(allStepsItem);
        return this;
    }

    public FullStagePluginsRelationVOPluginsList withAllSteps(
        Consumer<List<FullStagePluginsRelationVOAllSteps>> allStepsSetter) {
        if (this.allSteps == null) {
            this.allSteps = new ArrayList<>();
        }
        allStepsSetter.accept(this.allSteps);
        return this;
    }

    /**
     * **参数解释**： 基础插件列表。 **取值范围**： 不涉及。 
     * @return allSteps
     */
    public List<FullStagePluginsRelationVOAllSteps> getAllSteps() {
        return allSteps;
    }

    public void setAllSteps(List<FullStagePluginsRelationVOAllSteps> allSteps) {
        this.allSteps = allSteps;
    }

    public FullStagePluginsRelationVOPluginsList withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 扩展插件描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FullStagePluginsRelationVOPluginsList withVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
        return this;
    }

    /**
     * **参数解释**： 标识是否为一个草稿。 **取值范围**： 不涉及。 
     * @return versionAttribution
     */
    public String getVersionAttribution() {
        return versionAttribution;
    }

    public void setVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
    }

    public FullStagePluginsRelationVOPluginsList withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * **参数解释**： 扩展插件图标URL。 **取值范围**： 不涉及。 
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public FullStagePluginsRelationVOPluginsList withMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
        return this;
    }

    /**
     * **参数解释**： 标识是否可继续进行添加步骤，默认是1，可进行添加。 **取值范围**： - 0：不可继续进行添加步骤。 - 1：可继续进行添加步骤。 
     * @return multiStepEditable
     */
    public Integer getMultiStepEditable() {
        return multiStepEditable;
    }

    public void setMultiStepEditable(Integer multiStepEditable) {
        this.multiStepEditable = multiStepEditable;
    }

    public FullStagePluginsRelationVOPluginsList withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * **参数解释**： 使用位置。 **取值范围**： 不涉及。 
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FullStagePluginsRelationVOPluginsList withPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
        return this;
    }

    /**
     * **参数解释**： 发布商ID。 **取值范围**： 不涉及。 
     * @return publisherUniqueId
     */
    public String getPublisherUniqueId() {
        return publisherUniqueId;
    }

    public void setPublisherUniqueId(String publisherUniqueId) {
        this.publisherUniqueId = publisherUniqueId;
    }

    public FullStagePluginsRelationVOPluginsList withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * **参数解释**： 插件版本标识符。 **取值范围**： 不涉及。 
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public FullStagePluginsRelationVOPluginsList withStandard(Boolean standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**： 标识是否为标准化的插件。 **取值范围**： - true：是标准化的插件。 - false：不是标准化的插件。 
     * @return standard
     */
    public Boolean getStandard() {
        return standard;
    }

    public void setStandard(Boolean standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullStagePluginsRelationVOPluginsList that = (FullStagePluginsRelationVOPluginsList) obj;
        return Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.dbRecordName, that.dbRecordName) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.pluginAttribution, that.pluginAttribution)
            && Objects.equals(this.pluginCompositionType, that.pluginCompositionType)
            && Objects.equals(this.runtimeAttribution, that.runtimeAttribution)
            && Objects.equals(this.allSteps, that.allSteps) && Objects.equals(this.description, that.description)
            && Objects.equals(this.versionAttribution, that.versionAttribution)
            && Objects.equals(this.iconUrl, that.iconUrl)
            && Objects.equals(this.multiStepEditable, that.multiStepEditable)
            && Objects.equals(this.location, that.location)
            && Objects.equals(this.publisherUniqueId, that.publisherUniqueId)
            && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.standard, that.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueId,
            displayName,
            pluginName,
            disabled,
            dbRecordName,
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
            manifestVersion,
            standard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullStagePluginsRelationVOPluginsList {\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    dbRecordName: ").append(toIndentedString(dbRecordName)).append("\n");
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
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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
