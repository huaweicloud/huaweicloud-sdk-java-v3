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

    public PluginBasicVO withPluginName(String pluginName) {
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

    public PluginBasicVO withDisplayName(String displayName) {
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

    public PluginBasicVO withVersion(String version) {
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

    public PluginBasicVO withVersionDescription(String versionDescription) {
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

    public PluginBasicVO withDescription(String description) {
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

    public PluginBasicVO withVersionAttribution(String versionAttribution) {
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

    public PluginBasicVO withUniqueId(String uniqueId) {
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

    public PluginBasicVO withOpUser(String opUser) {
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

    public PluginBasicVO withOpTime(String opTime) {
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

    public PluginBasicVO withPluginCompositionType(String pluginCompositionType) {
        this.pluginCompositionType = pluginCompositionType;
        return this;
    }

    /**
     * 组合类型
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
     * 属性
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
     * 租户ID
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
     * 业务类型
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
     * 业务类型展示名
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
     * 维护者
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
     * 图标URL
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
     * 引用次数
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
     * 使用次数
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
     * 运行属性
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
     * 是否激活
     * @return active
     */
    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
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
            && Objects.equals(this.version, that.version)
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
            && Objects.equals(this.active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pluginName,
            displayName,
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
            active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginBasicVO {\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
