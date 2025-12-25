package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流程详情
 */
public class AopWorkflowInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edit_role")

    private String editRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_role")

    private String useRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_role")

    private String approveRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_approval_version_id")

    private String currentApprovalVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_rejected_version_id")

    private String currentRejectedVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aop_type")

    private String aopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public AopWorkflowInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 流程ID **取值范围**: 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AopWorkflowInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 流程名称 **取值范围**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AopWorkflowInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 流程的描述 **取值范围**: 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AopWorkflowInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 租户ID **取值范围**: 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AopWorkflowInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * **参数解释**: 所有者ID **取值范围**: 不涉及
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public AopWorkflowInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**: 创建者ID **取值范围**: 不涉及
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public AopWorkflowInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**: 创建者的名称 **取值范围**: 不涉及
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public AopWorkflowInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间 **取值范围**: 不涉及
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AopWorkflowInfo withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * **参数解释**: 更新者的ID **取值范围**: 不涉及
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public AopWorkflowInfo withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * **参数解释**: 更新者的名称 **取值范围**: 不涉及
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public AopWorkflowInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 更新的时间 **取值范围**: 不涉及
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AopWorkflowInfo withEditRole(String editRole) {
        this.editRole = editRole;
        return this;
    }

    /**
     * **参数解释**: 编辑角色 **取值范围**: 不涉及
     * @return editRole
     */
    public String getEditRole() {
        return editRole;
    }

    public void setEditRole(String editRole) {
        this.editRole = editRole;
    }

    public AopWorkflowInfo withUseRole(String useRole) {
        this.useRole = useRole;
        return this;
    }

    /**
     * **参数解释**: 使用角色 **取值范围**: 不涉及
     * @return useRole
     */
    public String getUseRole() {
        return useRole;
    }

    public void setUseRole(String useRole) {
        this.useRole = useRole;
    }

    public AopWorkflowInfo withApproveRole(String approveRole) {
        this.approveRole = approveRole;
        return this;
    }

    /**
     * **参数解释**: 审核角色 **取值范围**: 不涉及
     * @return approveRole
     */
    public String getApproveRole() {
        return approveRole;
    }

    public void setApproveRole(String approveRole) {
        this.approveRole = approveRole;
    }

    public AopWorkflowInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否已启用 **取值范围**: - true  已启用 - false 未启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AopWorkflowInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**: 工作空间ID **取值范围**: 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public AopWorkflowInfo withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释**: 流程激活版本ID **取值范围**: 不涉及
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public AopWorkflowInfo withCurrentApprovalVersionId(String currentApprovalVersionId) {
        this.currentApprovalVersionId = currentApprovalVersionId;
        return this;
    }

    /**
     * **参数解释**: 当前待审核版本ID **取值范围**: 不涉及
     * @return currentApprovalVersionId
     */
    public String getCurrentApprovalVersionId() {
        return currentApprovalVersionId;
    }

    public void setCurrentApprovalVersionId(String currentApprovalVersionId) {
        this.currentApprovalVersionId = currentApprovalVersionId;
    }

    public AopWorkflowInfo withCurrentRejectedVersionId(String currentRejectedVersionId) {
        this.currentRejectedVersionId = currentRejectedVersionId;
        return this;
    }

    /**
     * **参数解释**: 当前拒绝的版本ID **取值范围**: 不涉及
     * @return currentRejectedVersionId
     */
    public String getCurrentRejectedVersionId() {
        return currentRejectedVersionId;
    }

    public void setCurrentRejectedVersionId(String currentRejectedVersionId) {
        this.currentRejectedVersionId = currentRejectedVersionId;
    }

    public AopWorkflowInfo withAopType(String aopType) {
        this.aopType = aopType;
        return this;
    }

    /**
     * **参数解释**: 流程的类型 - NORMAL 通用 - SURVEY 调查 - HEMOSTASIS 止血 - EASE 缓解  **取值范围**: - NORMAL - SURVEY - HEMOSTASIS - EASE
     * @return aopType
     */
    public String getAopType() {
        return aopType;
    }

    public void setAopType(String aopType) {
        this.aopType = aopType;
    }

    public AopWorkflowInfo withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * **参数解释**: 引擎的类型 - public_engine 共享版  **取值范围**: - public_engine
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public AopWorkflowInfo withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * **参数解释**: 数据类的ID **取值范围**: 不涉及
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public AopWorkflowInfo withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * **参数解释**: 数据类的名称 **取值范围**: 不涉及
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public AopWorkflowInfo withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * **参数解释**: 流程实体类型 - IP IP - ACCOUNT 账号 - DOMAIN 域名  **取值范围**: - IP - ACCOUNT - DOMAIN
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public AopWorkflowInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 当前激活的流程的版本 **取值范围**: 不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopWorkflowInfo that = (AopWorkflowInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.editRole, that.editRole)
            && Objects.equals(this.useRole, that.useRole) && Objects.equals(this.approveRole, that.approveRole)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.currentApprovalVersionId, that.currentApprovalVersionId)
            && Objects.equals(this.currentRejectedVersionId, that.currentRejectedVersionId)
            && Objects.equals(this.aopType, that.aopType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.dataclassName, that.dataclassName) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            projectId,
            ownerId,
            creatorId,
            creatorName,
            createTime,
            modifierId,
            modifierName,
            updateTime,
            editRole,
            useRole,
            approveRole,
            enabled,
            workspaceId,
            versionId,
            currentApprovalVersionId,
            currentRejectedVersionId,
            aopType,
            engineType,
            dataclassId,
            dataclassName,
            labels,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopWorkflowInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    editRole: ").append(toIndentedString(editRole)).append("\n");
        sb.append("    useRole: ").append(toIndentedString(useRole)).append("\n");
        sb.append("    approveRole: ").append(toIndentedString(approveRole)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    currentApprovalVersionId: ").append(toIndentedString(currentApprovalVersionId)).append("\n");
        sb.append("    currentRejectedVersionId: ").append(toIndentedString(currentRejectedVersionId)).append("\n");
        sb.append("    aopType: ").append(toIndentedString(aopType)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
