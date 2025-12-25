package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作连接信息参数对象
 */
public class AssetInfoResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_version_id")

    private String componentVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private String config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_type")

    private String defenseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_id")

    private String targetProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_project_name")

    private String targetProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_enterprise_id")

    private String targetEnterpriseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_enterprise_name")

    private String targetEnterpriseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_be_deleted")

    private Boolean canBeDeleted;

    public AssetInfoResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 操作连接ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AssetInfoResponseBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AssetInfoResponseBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public AssetInfoResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 操作连接名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AssetInfoResponseBody withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 操作连接所属的插件id
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public AssetInfoResponseBody withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 操作连接所属的插件id名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public AssetInfoResponseBody withComponentVersionId(String componentVersionId) {
        this.componentVersionId = componentVersionId;
        return this;
    }

    /**
     * 插件版本ID
     * @return componentVersionId
     */
    public String getComponentVersionId() {
        return componentVersionId;
    }

    public void setComponentVersionId(String componentVersionId) {
        this.componentVersionId = componentVersionId;
    }

    public AssetInfoResponseBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 操作连接类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AssetInfoResponseBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 操作连接状态（SUCCESS/FAILED）
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AssetInfoResponseBody withConfig(String config) {
        this.config = config;
        return this;
    }

    /**
     * 具体的操作连接配置字符串，根据插件的操作连接schema配置对应字段值
     * @return config
     */
    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public AssetInfoResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 操作连接描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AssetInfoResponseBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AssetInfoResponseBody withCreateTime(String createTime) {
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

    public AssetInfoResponseBody withCreatorId(String creatorId) {
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

    public AssetInfoResponseBody withCreatorName(String creatorName) {
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

    public AssetInfoResponseBody withUpdateTime(String updateTime) {
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

    public AssetInfoResponseBody withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 更新者ID
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public AssetInfoResponseBody withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 更新者名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public AssetInfoResponseBody withDefenseType(String defenseType) {
        this.defenseType = defenseType;
        return this;
    }

    /**
     * 下发应急策略时的所属的防线分类
     * @return defenseType
     */
    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public AssetInfoResponseBody withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    /**
     * 下发应急策略时的IAM项目ID
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public AssetInfoResponseBody withTargetProjectName(String targetProjectName) {
        this.targetProjectName = targetProjectName;
        return this;
    }

    /**
     * 下发应急策略时的IAM项目名称
     * @return targetProjectName
     */
    public String getTargetProjectName() {
        return targetProjectName;
    }

    public void setTargetProjectName(String targetProjectName) {
        this.targetProjectName = targetProjectName;
    }

    public AssetInfoResponseBody withTargetEnterpriseId(String targetEnterpriseId) {
        this.targetEnterpriseId = targetEnterpriseId;
        return this;
    }

    /**
     * 下发应急策略时的企业项目ID
     * @return targetEnterpriseId
     */
    public String getTargetEnterpriseId() {
        return targetEnterpriseId;
    }

    public void setTargetEnterpriseId(String targetEnterpriseId) {
        this.targetEnterpriseId = targetEnterpriseId;
    }

    public AssetInfoResponseBody withTargetEnterpriseName(String targetEnterpriseName) {
        this.targetEnterpriseName = targetEnterpriseName;
        return this;
    }

    /**
     * 下发应急策略时的企业项目名称
     * @return targetEnterpriseName
     */
    public String getTargetEnterpriseName() {
        return targetEnterpriseName;
    }

    public void setTargetEnterpriseName(String targetEnterpriseName) {
        this.targetEnterpriseName = targetEnterpriseName;
    }

    public AssetInfoResponseBody withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 下发应急策略时的区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public AssetInfoResponseBody withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 下发应急策略时的区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public AssetInfoResponseBody withCanBeDeleted(Boolean canBeDeleted) {
        this.canBeDeleted = canBeDeleted;
        return this;
    }

    /**
     * 是否可删除，操作连接有流程在使用时，返回false
     * @return canBeDeleted
     */
    public Boolean getCanBeDeleted() {
        return canBeDeleted;
    }

    public void setCanBeDeleted(Boolean canBeDeleted) {
        this.canBeDeleted = canBeDeleted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetInfoResponseBody that = (AssetInfoResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.componentVersionId, that.componentVersionId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.config, that.config)
            && Objects.equals(this.description, that.description) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.defenseType, that.defenseType)
            && Objects.equals(this.targetProjectId, that.targetProjectId)
            && Objects.equals(this.targetProjectName, that.targetProjectName)
            && Objects.equals(this.targetEnterpriseId, that.targetEnterpriseId)
            && Objects.equals(this.targetEnterpriseName, that.targetEnterpriseName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.canBeDeleted, that.canBeDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            workspaceId,
            name,
            componentId,
            componentName,
            componentVersionId,
            type,
            status,
            config,
            description,
            enabled,
            createTime,
            creatorId,
            creatorName,
            updateTime,
            modifierId,
            modifierName,
            defenseType,
            targetProjectId,
            targetProjectName,
            targetEnterpriseId,
            targetEnterpriseName,
            regionId,
            regionName,
            canBeDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetInfoResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    componentVersionId: ").append(toIndentedString(componentVersionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    defenseType: ").append(toIndentedString(defenseType)).append("\n");
        sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
        sb.append("    targetProjectName: ").append(toIndentedString(targetProjectName)).append("\n");
        sb.append("    targetEnterpriseId: ").append(toIndentedString(targetEnterpriseId)).append("\n");
        sb.append("    targetEnterpriseName: ").append(toIndentedString(targetEnterpriseName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    canBeDeleted: ").append(toIndentedString(canBeDeleted)).append("\n");
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
