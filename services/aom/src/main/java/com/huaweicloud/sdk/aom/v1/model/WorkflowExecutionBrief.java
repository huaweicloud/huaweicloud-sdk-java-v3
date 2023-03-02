package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.ExecutionResultList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 函数流执行概要信息
 */
public class WorkflowExecutionBrief  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_id")
    

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_id")
    

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="begin_time")
    

    private Long beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_update_time")
    

    private Long lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_by")
    

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="approve_user_name_list")
    
    private List<String> approveUserNameList = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_result_list")
    
    private List<ExecutionResultList> executionResultList = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_edit_time")
    

    private Long workflowEditTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_record_id_with_snapshot")
    

    private String lastRecordIdWithSnapshot;

    public WorkflowExecutionBrief withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    


    /**
     * 流程定义ID
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    

    public WorkflowExecutionBrief withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    


    /**
     * 流程执行实例ID
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    

    public WorkflowExecutionBrief withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 流程实例执行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public WorkflowExecutionBrief withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 流程实例创建时间，格式：UTC时间戳
     * minimum: 0
     * maximum: 9999999999999
     * @return beginTime
     */
    public Long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
    }

    

    public WorkflowExecutionBrief withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 流程实例结束时间，格式：UTC时间戳
     * minimum: 0
     * maximum: 9999999999999
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public WorkflowExecutionBrief withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    


    /**
     * 流程实例上次更新时间，格式：UTC时间戳
     * minimum: 0
     * maximum: 9999999999999
     * @return lastUpdateTime
     */
    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    

    public WorkflowExecutionBrief withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    


    /**
     * 流程实例创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    

    public WorkflowExecutionBrief withApproveUserNameList(List<String> approveUserNameList) {
        this.approveUserNameList = approveUserNameList;
        return this;
    }

    
    public WorkflowExecutionBrief addApproveUserNameListItem(String approveUserNameListItem) {
        if(this.approveUserNameList == null) {
            this.approveUserNameList = new ArrayList<>();
        }
        this.approveUserNameList.add(approveUserNameListItem);
        return this;
    }

    public WorkflowExecutionBrief withApproveUserNameList(Consumer<List<String>> approveUserNameListSetter) {
        if(this.approveUserNameList == null) {
            this.approveUserNameList = new ArrayList<>();
        }
        approveUserNameListSetter.accept(this.approveUserNameList);
        return this;
    }

    /**
     * 审批人列表
     * @return approveUserNameList
     */
    public List<String> getApproveUserNameList() {
        return approveUserNameList;
    }

    public void setApproveUserNameList(List<String> approveUserNameList) {
        this.approveUserNameList = approveUserNameList;
    }

    

    public WorkflowExecutionBrief withExecutionResultList(List<ExecutionResultList> executionResultList) {
        this.executionResultList = executionResultList;
        return this;
    }

    
    public WorkflowExecutionBrief addExecutionResultListItem(ExecutionResultList executionResultListItem) {
        if(this.executionResultList == null) {
            this.executionResultList = new ArrayList<>();
        }
        this.executionResultList.add(executionResultListItem);
        return this;
    }

    public WorkflowExecutionBrief withExecutionResultList(Consumer<List<ExecutionResultList>> executionResultListSetter) {
        if(this.executionResultList == null) {
            this.executionResultList = new ArrayList<>();
        }
        executionResultListSetter.accept(this.executionResultList);
        return this;
    }

    /**
     * 执行记录
     * @return executionResultList
     */
    public List<ExecutionResultList> getExecutionResultList() {
        return executionResultList;
    }

    public void setExecutionResultList(List<ExecutionResultList> executionResultList) {
        this.executionResultList = executionResultList;
    }

    

    public WorkflowExecutionBrief withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户从IAM申请到的projectid，一般为32位字符串。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public WorkflowExecutionBrief withWorkflowEditTime(Long workflowEditTime) {
        this.workflowEditTime = workflowEditTime;
        return this;
    }

    


    /**
     * 执行工作流的修改时间，格式：UTC时间戳
     * minimum: 0
     * maximum: 9999999999999
     * @return workflowEditTime
     */
    public Long getWorkflowEditTime() {
        return workflowEditTime;
    }

    public void setWorkflowEditTime(Long workflowEditTime) {
        this.workflowEditTime = workflowEditTime;
    }

    

    public WorkflowExecutionBrief withLastRecordIdWithSnapshot(String lastRecordIdWithSnapshot) {
        this.lastRecordIdWithSnapshot = lastRecordIdWithSnapshot;
        return this;
    }

    


    /**
     * 执行快照
     * @return lastRecordIdWithSnapshot
     */
    public String getLastRecordIdWithSnapshot() {
        return lastRecordIdWithSnapshot;
    }

    public void setLastRecordIdWithSnapshot(String lastRecordIdWithSnapshot) {
        this.lastRecordIdWithSnapshot = lastRecordIdWithSnapshot;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowExecutionBrief workflowExecutionBrief = (WorkflowExecutionBrief) o;
        return Objects.equals(this.workflowId, workflowExecutionBrief.workflowId) &&
            Objects.equals(this.executionId, workflowExecutionBrief.executionId) &&
            Objects.equals(this.status, workflowExecutionBrief.status) &&
            Objects.equals(this.beginTime, workflowExecutionBrief.beginTime) &&
            Objects.equals(this.endTime, workflowExecutionBrief.endTime) &&
            Objects.equals(this.lastUpdateTime, workflowExecutionBrief.lastUpdateTime) &&
            Objects.equals(this.createdBy, workflowExecutionBrief.createdBy) &&
            Objects.equals(this.approveUserNameList, workflowExecutionBrief.approveUserNameList) &&
            Objects.equals(this.executionResultList, workflowExecutionBrief.executionResultList) &&
            Objects.equals(this.projectId, workflowExecutionBrief.projectId) &&
            Objects.equals(this.workflowEditTime, workflowExecutionBrief.workflowEditTime) &&
            Objects.equals(this.lastRecordIdWithSnapshot, workflowExecutionBrief.lastRecordIdWithSnapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId, status, beginTime, endTime, lastUpdateTime, createdBy, approveUserNameList, executionResultList, projectId, workflowEditTime, lastRecordIdWithSnapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowExecutionBrief {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    approveUserNameList: ").append(toIndentedString(approveUserNameList)).append("\n");
        sb.append("    executionResultList: ").append(toIndentedString(executionResultList)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workflowEditTime: ").append(toIndentedString(workflowEditTime)).append("\n");
        sb.append("    lastRecordIdWithSnapshot: ").append(toIndentedString(lastRecordIdWithSnapshot)).append("\n");
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

