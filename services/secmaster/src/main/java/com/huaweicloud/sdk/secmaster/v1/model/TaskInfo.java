package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Information of task
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aopengine_task_id")

    private String aopengineTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "approveuser_id")

    private String approveuserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approveuser_name")

    private String approveuserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approver")

    private String approver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_key")

    private String definitionKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "note")

    private String note;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_version_id")

    private String actionVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_instance_id")

    private String actionInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_comments")

    private String reviewComments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_parameters")

    private String viewParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_parameters")

    private String handleParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_object")

    private String relatedObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id_list")

    private List<String> attachmentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private List<TaskCommentInfo> comments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_handle")

    private String dueHandle;

    public TaskInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 待办任务的ID **取值范围**: 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskInfo withAopengineTaskId(String aopengineTaskId) {
        this.aopengineTaskId = aopengineTaskId;
        return this;
    }

    /**
     * **参数解释**: 待办任务的引擎任务Id **取值范围**: 不涉及.
     * @return aopengineTaskId
     */
    public String getAopengineTaskId() {
        return aopengineTaskId;
    }

    public void setAopengineTaskId(String aopengineTaskId) {
        this.aopengineTaskId = aopengineTaskId;
    }

    public TaskInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 待办任务的名称 **取值范围**: 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 待办任务的项目Id **取值范围**: 不涉及
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 待办任务的描述 **取值范围**: 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**: 待办的创建时间 **取值范围**: 不涉及
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TaskInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**: 待办的创建者ID **取值范围**: system
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public TaskInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**: 待办的创建者名字 **取值范围**: 不涉及
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TaskInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**: 待办的更新时间 **取值范围**: 不涉及
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public TaskInfo withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * **参数解释**: 待办的修改者ID **取值范围**: system
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public TaskInfo withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * **参数解释**: 待办的修改者名字 **取值范围**: 不涉及
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public TaskInfo withApproveuserId(String approveuserId) {
        this.approveuserId = approveuserId;
        return this;
    }

    /**
     * **参数解释**: 待办支持的审核人用户ID **取值范围**: 不涉及
     * @return approveuserId
     */
    public String getApproveuserId() {
        return approveuserId;
    }

    public void setApproveuserId(String approveuserId) {
        this.approveuserId = approveuserId;
    }

    public TaskInfo withApproveuserName(String approveuserName) {
        this.approveuserName = approveuserName;
        return this;
    }

    /**
     * **参数解释**: 待办支持的审核人用户名字 **取值范围**: 不涉及
     * @return approveuserName
     */
    public String getApproveuserName() {
        return approveuserName;
    }

    public void setApproveuserName(String approveuserName) {
        this.approveuserName = approveuserName;
    }

    public TaskInfo withApprover(String approver) {
        this.approver = approver;
        return this;
    }

    /**
     * **参数解释**: 待办审核人用户名称 **取值范围**: 不涉及
     * @return approver
     */
    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public TaskInfo withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释**: 待办的备注 **取值范围**: 不涉及
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public TaskInfo withDefinitionKey(String definitionKey) {
        this.definitionKey = definitionKey;
        return this;
    }

    /**
     * **参数解释**: 待办的节点流程拓扑图的KEY **取值范围**: 不涉及
     * @return definitionKey
     */
    public String getDefinitionKey() {
        return definitionKey;
    }

    public void setDefinitionKey(String definitionKey) {
        this.definitionKey = definitionKey;
    }

    public TaskInfo withNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * **参数解释**: 待办的备注 **取值范围**: 不涉及
     * @return note
     */
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TaskInfo withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * **参数解释**: 待办的超期时间 **取值范围**: 默认为创建时间+15天
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public TaskInfo withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * **参数解释**: 待办的节点的流程或剧本ID 当 business_type是WORKFLOWPUBLISH或者WORKFLOWNODEAPPROVE，此时为流程ID 当 business_type是PLAYBOOKPUBLISH或者PLAYBOOKNODEAPPROVE，此时为剧本ID **取值范围**: 不涉及
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public TaskInfo withActionVersionId(String actionVersionId) {
        this.actionVersionId = actionVersionId;
        return this;
    }

    /**
     * **参数解释**: 待办的节点的流程或剧本版本ID 当 business_type是WORKFLOWPUBLISH或者WORKFLOWNODEAPPROVE，此时为流程版本ID 当 business_type是PLAYBOOKPUBLISH或者PLAYBOOKNODEAPPROVE，此时为剧本版本ID  **取值范围**: 不涉及
     * @return actionVersionId
     */
    public String getActionVersionId() {
        return actionVersionId;
    }

    public void setActionVersionId(String actionVersionId) {
        this.actionVersionId = actionVersionId;
    }

    public TaskInfo withActionInstanceId(String actionInstanceId) {
        this.actionInstanceId = actionInstanceId;
        return this;
    }

    /**
     * **参数解释**: 待办的节点的流程或剧本的实例ID 当 business_type是WORKFLOWNODEAPPROVE，此时为流程实例ID 当 business_type是PLAYBOOKNODEAPPROVE，此时为剧本实例ID  **取值范围**: 不涉及
     * @return actionInstanceId
     */
    public String getActionInstanceId() {
        return actionInstanceId;
    }

    public void setActionInstanceId(String actionInstanceId) {
        this.actionInstanceId = actionInstanceId;
    }

    public TaskInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**: 待办任务的空间ID **取值范围**: 不涉及
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public TaskInfo withReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
        return this;
    }

    /**
     * **参数解释**: 待办任务审核意见 **取值范围**: 不涉及
     * @return reviewComments
     */
    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
    }

    public TaskInfo withViewParameters(String viewParameters) {
        this.viewParameters = viewParameters;
        return this;
    }

    /**
     * **参数解释**: 待办任务查看参数 **取值范围**: 不涉及
     * @return viewParameters
     */
    public String getViewParameters() {
        return viewParameters;
    }

    public void setViewParameters(String viewParameters) {
        this.viewParameters = viewParameters;
    }

    public TaskInfo withHandleParameters(String handleParameters) {
        this.handleParameters = handleParameters;
        return this;
    }

    /**
     * **参数解释**: 待办任务的人工处理参数 **取值范围**: 不涉及
     * @return handleParameters
     */
    public String getHandleParameters() {
        return handleParameters;
    }

    public void setHandleParameters(String handleParameters) {
        this.handleParameters = handleParameters;
    }

    public TaskInfo withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * **参数解释**: 待办的业务类型 - WORKFLOWPUBLISH 流程发布 - WORKFLOWNODEAPPROVE 流程节点审核 - PLAYBOOKPUBLISH 剧本发布 - PLAYBOOKNODEAPPROVE 剧本节点审核  **取值范围**: - WORKFLOWPUBLISH - WORKFLOWNODEAPPROVE - PLAYBOOKPUBLISH - PLAYBOOKNODEAPPROVE
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public TaskInfo withRelatedObject(String relatedObject) {
        this.relatedObject = relatedObject;
        return this;
    }

    /**
     * **参数解释**: 待办任务的关联的流程 or 剧本名称 **取值范围**: 不涉及
     * @return relatedObject
     */
    public String getRelatedObject() {
        return relatedObject;
    }

    public void setRelatedObject(String relatedObject) {
        this.relatedObject = relatedObject;
    }

    public TaskInfo withAttachmentIdList(List<String> attachmentIdList) {
        this.attachmentIdList = attachmentIdList;
        return this;
    }

    public TaskInfo addAttachmentIdListItem(String attachmentIdListItem) {
        if (this.attachmentIdList == null) {
            this.attachmentIdList = new ArrayList<>();
        }
        this.attachmentIdList.add(attachmentIdListItem);
        return this;
    }

    public TaskInfo withAttachmentIdList(Consumer<List<String>> attachmentIdListSetter) {
        if (this.attachmentIdList == null) {
            this.attachmentIdList = new ArrayList<>();
        }
        attachmentIdListSetter.accept(this.attachmentIdList);
        return this;
    }

    /**
     * **参数解释**: 待办节点的附件ID列表 **取值范围**: 不涉及
     * @return attachmentIdList
     */
    public List<String> getAttachmentIdList() {
        return attachmentIdList;
    }

    public void setAttachmentIdList(List<String> attachmentIdList) {
        this.attachmentIdList = attachmentIdList;
    }

    public TaskInfo withComments(List<TaskCommentInfo> comments) {
        this.comments = comments;
        return this;
    }

    public TaskInfo addCommentsItem(TaskCommentInfo commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    public TaskInfo withComments(Consumer<List<TaskCommentInfo>> commentsSetter) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        commentsSetter.accept(this.comments);
        return this;
    }

    /**
     * **参数解释**: 待办节点的待办评论 **取值范围**: 不涉及
     * @return comments
     */
    public List<TaskCommentInfo> getComments() {
        return comments;
    }

    public void setComments(List<TaskCommentInfo> comments) {
        this.comments = comments;
    }

    public TaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 待办的业务类型 - waiting  待处理 - canceled 已取消 - finished 已完成  **取值范围**: - waiting - canceled - finished
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TaskInfo withDueHandle(String dueHandle) {
        this.dueHandle = dueHandle;
        return this;
    }

    /**
     * **参数解释**: 待办的到期处理方式 - CONTINUE 继续执行 - INTERRUPT 终止  **取值范围**: - CONTINUE - INTERRUPT
     * @return dueHandle
     */
    public String getDueHandle() {
        return dueHandle;
    }

    public void setDueHandle(String dueHandle) {
        this.dueHandle = dueHandle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInfo that = (TaskInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.aopengineTaskId, that.aopengineTaskId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.modifierId, that.modifierId)
            && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.approveuserId, that.approveuserId)
            && Objects.equals(this.approveuserName, that.approveuserName)
            && Objects.equals(this.approver, that.approver) && Objects.equals(this.notes, that.notes)
            && Objects.equals(this.definitionKey, that.definitionKey) && Objects.equals(this.note, that.note)
            && Objects.equals(this.dueDate, that.dueDate) && Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.actionVersionId, that.actionVersionId)
            && Objects.equals(this.actionInstanceId, that.actionInstanceId)
            && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.reviewComments, that.reviewComments)
            && Objects.equals(this.viewParameters, that.viewParameters)
            && Objects.equals(this.handleParameters, that.handleParameters)
            && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.relatedObject, that.relatedObject)
            && Objects.equals(this.attachmentIdList, that.attachmentIdList)
            && Objects.equals(this.comments, that.comments) && Objects.equals(this.status, that.status)
            && Objects.equals(this.dueHandle, that.dueHandle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            aopengineTaskId,
            name,
            projectId,
            description,
            createTime,
            creatorId,
            creatorName,
            updateTime,
            modifierId,
            modifierName,
            approveuserId,
            approveuserName,
            approver,
            notes,
            definitionKey,
            note,
            dueDate,
            actionId,
            actionVersionId,
            actionInstanceId,
            workspaceId,
            reviewComments,
            viewParameters,
            handleParameters,
            businessType,
            relatedObject,
            attachmentIdList,
            comments,
            status,
            dueHandle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    aopengineTaskId: ").append(toIndentedString(aopengineTaskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    approveuserId: ").append(toIndentedString(approveuserId)).append("\n");
        sb.append("    approveuserName: ").append(toIndentedString(approveuserName)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    definitionKey: ").append(toIndentedString(definitionKey)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    actionVersionId: ").append(toIndentedString(actionVersionId)).append("\n");
        sb.append("    actionInstanceId: ").append(toIndentedString(actionInstanceId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    reviewComments: ").append(toIndentedString(reviewComments)).append("\n");
        sb.append("    viewParameters: ").append(toIndentedString(viewParameters)).append("\n");
        sb.append("    handleParameters: ").append(toIndentedString(handleParameters)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
        sb.append("    attachmentIdList: ").append(toIndentedString(attachmentIdList)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dueHandle: ").append(toIndentedString(dueHandle)).append("\n");
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
