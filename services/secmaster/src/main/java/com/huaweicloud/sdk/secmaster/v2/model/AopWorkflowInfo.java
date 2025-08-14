package com.huaweicloud.sdk.secmaster.v2.model;

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

    public AopWorkflowInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流程ID
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
     * 流程名称
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
     * 描述
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
     * 租户ID
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
     * 所有者ID
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
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public AopWorkflowInfo withEditRole(String editRole) {
        this.editRole = editRole;
        return this;
    }

    /**
     * 编辑角色
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
     * 是用角色
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
     * 审核人
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
     * 是否已启用
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
     * 工作空间ID
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
     * 流程版本ID
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
     * 当前待审核版本号
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
     * 当前拒绝的版本号
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
     * aop的类型有以下的值     NORMAL, 通用     SURVEY, 调查     HEMOSTASIS,止血     EASE;缓解
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
     * 引擎的类型分为共享版和专项版
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
     * 数据类的ID
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
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
            && Objects.equals(this.editRole, that.editRole) && Objects.equals(this.useRole, that.useRole)
            && Objects.equals(this.approveRole, that.approveRole) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.currentApprovalVersionId, that.currentApprovalVersionId)
            && Objects.equals(this.currentRejectedVersionId, that.currentRejectedVersionId)
            && Objects.equals(this.aopType, that.aopType) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.dataclassId, that.dataclassId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            projectId,
            ownerId,
            creatorId,
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
            dataclassId);
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
