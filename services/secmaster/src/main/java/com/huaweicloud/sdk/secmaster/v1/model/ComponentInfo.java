package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件详细信息
 */
public class ComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_language")

    private String devLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dev_language_version")

    private String devLanguageVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alliance_id")

    private String allianceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alliance_name")

    private String allianceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo")

    private String logo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_history")

    private List<ComponentInfoOperationHistory> operationHistory = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<ComponentVersionInfo> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_type")

    private String componentType;

    public ComponentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 插件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 插件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentInfo withDevLanguage(String devLanguage) {
        this.devLanguage = devLanguage;
        return this;
    }

    /**
     * 插件的实现语言
     * @return devLanguage
     */
    public String getDevLanguage() {
        return devLanguage;
    }

    public void setDevLanguage(String devLanguage) {
        this.devLanguage = devLanguage;
    }

    public ComponentInfo withDevLanguageVersion(String devLanguageVersion) {
        this.devLanguageVersion = devLanguageVersion;
        return this;
    }

    /**
     * 插件的实现语言版本
     * @return devLanguageVersion
     */
    public String getDevLanguageVersion() {
        return devLanguageVersion;
    }

    public void setDevLanguageVersion(String devLanguageVersion) {
        this.devLanguageVersion = devLanguageVersion;
    }

    public ComponentInfo withAllianceId(String allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * 插件集ID
     * @return allianceId
     */
    public String getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(String allianceId) {
        this.allianceId = allianceId;
    }

    public ComponentInfo withAllianceName(String allianceName) {
        this.allianceName = allianceName;
        return this;
    }

    /**
     * 插件集名称
     * @return allianceName
     */
    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    public ComponentInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 插件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentInfo withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * 插件图标
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ComponentInfo withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 插件的标签信息
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ComponentInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ComponentInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ComponentInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ComponentInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ComponentInfo withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改者ID
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public ComponentInfo withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改者名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public ComponentInfo withOperationHistory(List<ComponentInfoOperationHistory> operationHistory) {
        this.operationHistory = operationHistory;
        return this;
    }

    public ComponentInfo addOperationHistoryItem(ComponentInfoOperationHistory operationHistoryItem) {
        if (this.operationHistory == null) {
            this.operationHistory = new ArrayList<>();
        }
        this.operationHistory.add(operationHistoryItem);
        return this;
    }

    public ComponentInfo withOperationHistory(Consumer<List<ComponentInfoOperationHistory>> operationHistorySetter) {
        if (this.operationHistory == null) {
            this.operationHistory = new ArrayList<>();
        }
        operationHistorySetter.accept(this.operationHistory);
        return this;
    }

    /**
     * 插件操作历史
     * @return operationHistory
     */
    public List<ComponentInfoOperationHistory> getOperationHistory() {
        return operationHistory;
    }

    public void setOperationHistory(List<ComponentInfoOperationHistory> operationHistory) {
        this.operationHistory = operationHistory;
    }

    public ComponentInfo withVersions(List<ComponentVersionInfo> versions) {
        this.versions = versions;
        return this;
    }

    public ComponentInfo addVersionsItem(ComponentVersionInfo versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ComponentInfo withVersions(Consumer<List<ComponentVersionInfo>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 插件版本信息，兼容之前java的以插件为粒度的版本
     * @return versions
     */
    public List<ComponentVersionInfo> getVersions() {
        return versions;
    }

    public void setVersions(List<ComponentVersionInfo> versions) {
        this.versions = versions;
    }

    public ComponentInfo withComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 插件类型，subscribe/custom/system，对应订阅/自定义开发/系统内置
     * @return componentType
     */
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInfo that = (ComponentInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.devLanguage, that.devLanguage)
            && Objects.equals(this.devLanguageVersion, that.devLanguageVersion)
            && Objects.equals(this.allianceId, that.allianceId) && Objects.equals(this.allianceName, that.allianceName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.logo, that.logo)
            && Objects.equals(this.label, that.label) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.modifierId, that.modifierId)
            && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.operationHistory, that.operationHistory)
            && Objects.equals(this.versions, that.versions) && Objects.equals(this.componentType, that.componentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            devLanguage,
            devLanguageVersion,
            allianceId,
            allianceName,
            description,
            logo,
            label,
            createTime,
            updateTime,
            creatorId,
            creatorName,
            modifierId,
            modifierName,
            operationHistory,
            versions,
            componentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    devLanguage: ").append(toIndentedString(devLanguage)).append("\n");
        sb.append("    devLanguageVersion: ").append(toIndentedString(devLanguageVersion)).append("\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    operationHistory: ").append(toIndentedString(operationHistory)).append("\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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
