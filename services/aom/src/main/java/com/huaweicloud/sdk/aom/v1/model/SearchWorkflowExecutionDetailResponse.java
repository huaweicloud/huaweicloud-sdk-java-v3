package com.huaweicloud.sdk.aom.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


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
 * Response Object
 */
public class SearchWorkflowExecutionDetailResponse extends SdkResponse {


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
    @JsonProperty(value="execution_result_list")
    
    private List<ExecutionResultList> executionResultList = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="approve_user_name_list")
    
    private List<String> approveUserNameList = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_edit_time")
    

    private Long workflowEditTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_record_id_with_snapshot")
    

    private String lastRecordIdWithSnapshot;

    public SearchWorkflowExecutionDetailResponse withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    


    /**
     * 流程定义ID。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    

    public SearchWorkflowExecutionDetailResponse withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    


    /**
     * 流程执行实例ID。
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    

    public SearchWorkflowExecutionDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 流程实例执行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public SearchWorkflowExecutionDetailResponse withBeginTime(Long beginTime) {
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

    

    public SearchWorkflowExecutionDetailResponse withEndTime(Long endTime) {
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

    

    public SearchWorkflowExecutionDetailResponse withLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    


    /**
     * 流程实例上次更新时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间。
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

    

    public SearchWorkflowExecutionDetailResponse withExecutionResultList(List<ExecutionResultList> executionResultList) {
        this.executionResultList = executionResultList;
        return this;
    }

    
    public SearchWorkflowExecutionDetailResponse addExecutionResultListItem(ExecutionResultList executionResultListItem) {
        if(this.executionResultList == null) {
            this.executionResultList = new ArrayList<>();
        }
        this.executionResultList.add(executionResultListItem);
        return this;
    }

    public SearchWorkflowExecutionDetailResponse withExecutionResultList(Consumer<List<ExecutionResultList>> executionResultListSetter) {
        if(this.executionResultList == null) {
            this.executionResultList = new ArrayList<>();
        }
        executionResultListSetter.accept(this.executionResultList);
        return this;
    }

    /**
     * 节点执行信息。
     * @return executionResultList
     */
    public List<ExecutionResultList> getExecutionResultList() {
        return executionResultList;
    }

    public void setExecutionResultList(List<ExecutionResultList> executionResultList) {
        this.executionResultList = executionResultList;
    }

    

    public SearchWorkflowExecutionDetailResponse withApproveUserNameList(List<String> approveUserNameList) {
        this.approveUserNameList = approveUserNameList;
        return this;
    }

    
    public SearchWorkflowExecutionDetailResponse addApproveUserNameListItem(String approveUserNameListItem) {
        if(this.approveUserNameList == null) {
            this.approveUserNameList = new ArrayList<>();
        }
        this.approveUserNameList.add(approveUserNameListItem);
        return this;
    }

    public SearchWorkflowExecutionDetailResponse withApproveUserNameList(Consumer<List<String>> approveUserNameListSetter) {
        if(this.approveUserNameList == null) {
            this.approveUserNameList = new ArrayList<>();
        }
        approveUserNameListSetter.accept(this.approveUserNameList);
        return this;
    }

    /**
     * 审批用户列表
     * @return approveUserNameList
     */
    public List<String> getApproveUserNameList() {
        return approveUserNameList;
    }

    public void setApproveUserNameList(List<String> approveUserNameList) {
        this.approveUserNameList = approveUserNameList;
    }

    

    public SearchWorkflowExecutionDetailResponse withProjectId(String projectId) {
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

    

    public SearchWorkflowExecutionDetailResponse withWorkflowEditTime(Long workflowEditTime) {
        this.workflowEditTime = workflowEditTime;
        return this;
    }

    


    /**
     * 执行workflow的更新时间
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

    

    public SearchWorkflowExecutionDetailResponse withLastRecordIdWithSnapshot(String lastRecordIdWithSnapshot) {
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
        SearchWorkflowExecutionDetailResponse searchWorkflowExecutionDetailResponse = (SearchWorkflowExecutionDetailResponse) o;
        return Objects.equals(this.workflowId, searchWorkflowExecutionDetailResponse.workflowId) &&
            Objects.equals(this.executionId, searchWorkflowExecutionDetailResponse.executionId) &&
            Objects.equals(this.status, searchWorkflowExecutionDetailResponse.status) &&
            Objects.equals(this.beginTime, searchWorkflowExecutionDetailResponse.beginTime) &&
            Objects.equals(this.endTime, searchWorkflowExecutionDetailResponse.endTime) &&
            Objects.equals(this.lastUpdateTime, searchWorkflowExecutionDetailResponse.lastUpdateTime) &&
            Objects.equals(this.executionResultList, searchWorkflowExecutionDetailResponse.executionResultList) &&
            Objects.equals(this.approveUserNameList, searchWorkflowExecutionDetailResponse.approveUserNameList) &&
            Objects.equals(this.projectId, searchWorkflowExecutionDetailResponse.projectId) &&
            Objects.equals(this.workflowEditTime, searchWorkflowExecutionDetailResponse.workflowEditTime) &&
            Objects.equals(this.lastRecordIdWithSnapshot, searchWorkflowExecutionDetailResponse.lastRecordIdWithSnapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workflowId, executionId, status, beginTime, endTime, lastUpdateTime, executionResultList, approveUserNameList, projectId, workflowEditTime, lastRecordIdWithSnapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchWorkflowExecutionDetailResponse {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    executionResultList: ").append(toIndentedString(executionResultList)).append("\n");
        sb.append("    approveUserNameList: ").append(toIndentedString(approveUserNameList)).append("\n");
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

