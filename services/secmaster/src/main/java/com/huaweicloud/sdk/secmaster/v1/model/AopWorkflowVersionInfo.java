package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流程版本详情信息
 */
public class AopWorkflowVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aopworkflow_id")

    private String aopworkflowId;

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
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskconfig")

    private String taskconfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow")

    private String taskflow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskflow_type")

    private String taskflowType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aop_type")

    private String aopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public AopWorkflowVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 流程版本ID **约束限制**: 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AopWorkflowVersionInfo withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * **参数解释**: 流程版本ID **约束限制**: 不涉及
     * @return versionId
     */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public AopWorkflowVersionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 流程版本名字 **约束限制**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AopWorkflowVersionInfo withAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
        return this;
    }

    /**
     * **参数解释**: 流程ID **约束限制**: 不涉及
     * @return aopworkflowId
     */
    public String getAopworkflowId() {
        return aopworkflowId;
    }

    public void setAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
    }

    public AopWorkflowVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 流程版本的描述 **取值范围**: 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AopWorkflowVersionInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 租户的项目ID **约束限制**: 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AopWorkflowVersionInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * **参数解释**: 所有者ID **约束限制**: 不涉及
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public AopWorkflowVersionInfo withCreatorId(String creatorId) {
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

    public AopWorkflowVersionInfo withCreatorName(String creatorName) {
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

    public AopWorkflowVersionInfo withCreateTime(String createTime) {
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

    public AopWorkflowVersionInfo withModifierId(String modifierId) {
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

    public AopWorkflowVersionInfo withModifierName(String modifierName) {
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

    public AopWorkflowVersionInfo withUpdateTime(String updateTime) {
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

    public AopWorkflowVersionInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否已启用 **约束限制**: 不涉及         **取值范围**: - true  已启用 - false 未启用  **默认值**:  false
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public AopWorkflowVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 流程的状态 - pending_submit 草稿 - pending_approval 待审核 - publishing 发布中 - publish_failed 发布失败 - not_activated 未激活 - activated 已激活 - rejected 审核拒绝  **取值范围**: - pending_submit - pending_approval - publishing - publish_failed - not_activated - activated - rejected
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AopWorkflowVersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**: 当前流程的版本 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AopWorkflowVersionInfo withTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
        return this;
    }

    /**
     * **参数解释**: 流程拓扑图的参数配置 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskconfig
     */
    public String getTaskconfig() {
        return taskconfig;
    }

    public void setTaskconfig(String taskconfig) {
        this.taskconfig = taskconfig;
    }

    public AopWorkflowVersionInfo withTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }

    /**
     * **参数解释**: 流程的拓扑图的BASE64编码 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return taskflow
     */
    public String getTaskflow() {
        return taskflow;
    }

    public void setTaskflow(String taskflow) {
        this.taskflow = taskflow;
    }

    public AopWorkflowVersionInfo withTaskflowType(String taskflowType) {
        this.taskflowType = taskflowType;
        return this;
    }

    /**
     * **参数解释**: 流程的类型 **约束限制**: 不涉及         **取值范围**: - JSON  **默认值**:  不涉及
     * @return taskflowType
     */
    public String getTaskflowType() {
        return taskflowType;
    }

    public void setTaskflowType(String taskflowType) {
        this.taskflowType = taskflowType;
    }

    public AopWorkflowVersionInfo withAopType(String aopType) {
        this.aopType = aopType;
        return this;
    }

    /**
     * **参数解释**: 流程的类型 - NORMAL 通用 - SURVEY 调查 - HEMOSTASIS 止血 - EASE 缓解  **约束限制**: 不涉及         **取值范围**: - NORMAL - SURVEY - HEMOSTASIS - EASE  **默认值**:  不涉及
     * @return aopType
     */
    public String getAopType() {
        return aopType;
    }

    public void setAopType(String aopType) {
        this.aopType = aopType;
    }

    public AopWorkflowVersionInfo withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * **参数解释**: 流程的输入 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public AopWorkflowVersionInfo withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * **参数解释**: 流程的输出 **约束限制**: 不涉及         **取值范围**: 不涉及 **默认值**:  不涉及
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public AopWorkflowVersionInfo withDataclassId(String dataclassId) {
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

    public AopWorkflowVersionInfo withDataclassName(String dataclassName) {
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

    public AopWorkflowVersionInfo withWorkspaceId(String workspaceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AopWorkflowVersionInfo that = (AopWorkflowVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.versionId, that.versionId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.aopworkflowId, that.aopworkflowId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.status, that.status) && Objects.equals(this.version, that.version)
            && Objects.equals(this.taskconfig, that.taskconfig) && Objects.equals(this.taskflow, that.taskflow)
            && Objects.equals(this.taskflowType, that.taskflowType) && Objects.equals(this.aopType, that.aopType)
            && Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.dataclassName, that.dataclassName)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            versionId,
            name,
            aopworkflowId,
            description,
            projectId,
            ownerId,
            creatorId,
            creatorName,
            createTime,
            modifierId,
            modifierName,
            updateTime,
            enabled,
            status,
            version,
            taskconfig,
            taskflow,
            taskflowType,
            aopType,
            input,
            output,
            dataclassId,
            dataclassName,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AopWorkflowVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    aopworkflowId: ").append(toIndentedString(aopworkflowId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    taskconfig: ").append(toIndentedString(taskconfig)).append("\n");
        sb.append("    taskflow: ").append(toIndentedString(taskflow)).append("\n");
        sb.append("    taskflowType: ").append(toIndentedString(taskflowType)).append("\n");
        sb.append("    aopType: ").append(toIndentedString(aopType)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
