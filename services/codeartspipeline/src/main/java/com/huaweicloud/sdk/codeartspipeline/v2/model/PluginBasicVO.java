package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginBasicVO
 */
public class PluginBasicVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_name")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_record_name")

    private String dbRecordName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_description")

    private String versionDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_attribution")

    private String versionAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unique_id")

    private String uniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_user")

    private String opUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "op_time")

    private String opTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_composition_type")

    private String pluginCompositionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_attribution")

    private String pluginAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type_display_name")

    private String businessTypeDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainers")

    private String maintainers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refer_count")

    private Integer referCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_count")

    private Integer usageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_attribution")

    private String runtimeAttribution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Integer active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_state")

    private String versionState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher_unique_id")

    private String publisherUniqueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    public PluginBasicVO withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件名称。 **取值范围**： 1到50位字符。 
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public PluginBasicVO withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件名称。 **取值范围**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PluginBasicVO withDbRecordName(String dbRecordName) {
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

    public PluginBasicVO withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 扩展插件版本号。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginBasicVO withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * **参数解释**： 扩展插件版本号说明。 **取值范围**： 不涉及。 
     * @return versionDescription
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    public PluginBasicVO withDescription(String description) {
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

    public PluginBasicVO withVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
        return this;
    }

    /**
     * **参数解释**： 扩展插件版本属性。 **取值范围**： - draft：草稿版本。 - formal：正式版本。 
     * @return versionAttribution
     */
    public String getVersionAttribution() {
        return versionAttribution;
    }

    public void setVersionAttribution(String versionAttribution) {
        this.versionAttribution = versionAttribution;
    }

    public PluginBasicVO withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * **参数解释**： 扩展插件唯一ID。 **取值范围**： 不涉及。 
     * @return uniqueId
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public PluginBasicVO withOpUser(String opUser) {
        this.opUser = opUser;
        return this;
    }

    /**
     * **参数解释**： 扩展插件最后更新人。 **取值范围**： 不涉及。 
     * @return opUser
     */
    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    public PluginBasicVO withOpTime(String opTime) {
        this.opTime = opTime;
        return this;
    }

    /**
     * **参数解释**： 扩展插件最后更新时间。 **取值范围**： 不涉及。 
     * @return opTime
     */
    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public PluginBasicVO withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * **参数解释**： 用于标识插件是否为多个step组成的组合插件。 **取值范围**： - multi：组合插件。 - single：非组合插件。 
     * @return pluginCompositionType
     */
    public String getPluginCompositionType() {
        return pluginCompositionType;
    }

    public void setPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
    }

    public PluginBasicVO withPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
        return this;
    }

    /**
     * **参数解释**： 扩展插件属性。 **取值范围**： - custom：自定义插件。 - official：官方插件。 - published：已发布的发布商插件。 
     * @return pluginAttribution
     */
    public String getPluginAttribution() {
        return pluginAttribution;
    }

    public void setPluginAttribution(String pluginAttribution) {
        this.pluginAttribution = pluginAttribution;
    }

    public PluginBasicVO withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**： 租户ID，用户的domainId。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public PluginBasicVO withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**： 扩展插件业务类型。 **取值范围**： 不涉及。 
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public PluginBasicVO withBusinessTypeDisplayName(String businessTypeDisplayName) {
        this.businessTypeDisplayName = businessTypeDisplayName;
        return this;
    }

    /**
     * **参数解释**： 扩展插件业务类型展示名称。 **取值范围**： 不涉及。 
     * @return businessTypeDisplayName
     */
    public String getBusinessTypeDisplayName() {
        return businessTypeDisplayName;
    }

    public void setBusinessTypeDisplayName(String businessTypeDisplayName) {
        this.businessTypeDisplayName = businessTypeDisplayName;
    }

    public PluginBasicVO withMaintainers(String maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    /**
     * **参数解释**： 扩展插件维护人。 **取值范围**： 不涉及。 
     * @return maintainers
     */
    public String getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(String maintainers) {
        this.maintainers = maintainers;
    }

    public PluginBasicVO withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * **参数解释**： 扩展插件图标地址。 **取值范围**： 不涉及。 
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public PluginBasicVO withReferCount(Integer referCount) {
        this.referCount = referCount;
        return this;
    }

    /**
     * **参数解释**： 扩展插件被流水线引用次数。 **取值范围**： 不涉及。 
     * @return referCount
     */
    public Integer getReferCount() {
        return referCount;
    }

    public void setReferCount(Integer referCount) {
        this.referCount = referCount;
    }

    public PluginBasicVO withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * **参数解释**： 扩展插件被流水线使用次数。 **取值范围**： 不涉及。 
     * @return usageCount
     */
    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public PluginBasicVO withRuntimeAttribution(String runtimeAttribution) {
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

    public PluginBasicVO withActive(Integer active) {
        this.active = active;
        return this;
    }

    /**
     * **参数解释**： 扩展插件是否激活。 **取值范围**： - true：激活。 - false：未激活。 
     * @return active
     */
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public PluginBasicVO withVersionState(String versionState) {
        this.versionState = versionState;
        return this;
    }

    /**
     * **参数解释**： 当前插件版本状态。 **取值范围**： 不涉及。 
     * @return versionState
     */
    public String getVersionState() {
        return versionState;
    }

    public void setVersionState(String versionState) {
        this.versionState = versionState;
    }

    public PluginBasicVO withPublisherUniqueId(String publisherUniqueId) {
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

    public PluginBasicVO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**： 创建者名称。 **取值范围**： 不涉及。 
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public PluginBasicVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PluginBasicVO withManifestVersion(String manifestVersion) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginBasicVO that = (PluginBasicVO) obj;
        return Objects.equals(this.pluginName, that.pluginName) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.dbRecordName, that.dbRecordName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionDescription, that.versionDescription)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.versionAttribution, that.versionAttribution)
            && Objects.equals(this.uniqueId, that.uniqueId) && Objects.equals(this.opUser, that.opUser)
            && Objects.equals(this.opTime, that.opTime)
            && Objects.equals(this.pluginCompositionType, that.pluginCompositionType)
            && Objects.equals(this.pluginAttribution, that.pluginAttribution)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.businessTypeDisplayName, that.businessTypeDisplayName)
            && Objects.equals(this.maintainers, that.maintainers) && Objects.equals(this.iconUrl, that.iconUrl)
            && Objects.equals(this.referCount, that.referCount) && Objects.equals(this.usageCount, that.usageCount)
            && Objects.equals(this.runtimeAttribution, that.runtimeAttribution)
            && Objects.equals(this.active, that.active) && Objects.equals(this.versionState, that.versionState)
            && Objects.equals(this.publisherUniqueId, that.publisherUniqueId)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.manifestVersion, that.manifestVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName,
            displayName,
            dbRecordName,
            version,
            versionDescription,
            description,
            versionAttribution,
            uniqueId,
            opUser,
            opTime,
            pluginCompositionType,
            pluginAttribution,
            workspaceId,
            businessType,
            businessTypeDisplayName,
            maintainers,
            iconUrl,
            referCount,
            usageCount,
            runtimeAttribution,
            active,
            versionState,
            publisherUniqueId,
            creator,
            createTime,
            manifestVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginBasicVO {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    dbRecordName: ").append(toIndentedString(dbRecordName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionDescription: ").append(toIndentedString(versionDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    versionAttribution: ").append(toIndentedString(versionAttribution)).append("\n");
        sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
        sb.append("    opUser: ").append(toIndentedString(opUser)).append("\n");
        sb.append("    opTime: ").append(toIndentedString(opTime)).append("\n");
        sb.append("    pluginCompositionType: ").append(toIndentedString(pluginCompositionType)).append("\n");
        sb.append("    pluginAttribution: ").append(toIndentedString(pluginAttribution)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    businessTypeDisplayName: ").append(toIndentedString(businessTypeDisplayName)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    referCount: ").append(toIndentedString(referCount)).append("\n");
        sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
        sb.append("    runtimeAttribution: ").append(toIndentedString(runtimeAttribution)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    versionState: ").append(toIndentedString(versionState)).append("\n");
        sb.append("    publisherUniqueId: ").append(toIndentedString(publisherUniqueId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
