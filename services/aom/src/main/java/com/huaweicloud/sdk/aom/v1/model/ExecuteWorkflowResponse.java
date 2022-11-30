package com.huaweicloud.sdk.aom.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v1.model.NodeExecutionDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteWorkflowResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_id")
    
    
    private String workflowId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="workflow_urn")
    
    
    private String workflowUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_id")
    
    
    private String executionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="headers")
    
    
    private Map<String, String> headers = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    
    private Map<String, String> input = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    
    private Object output;


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
    @JsonProperty(value="execution_result_list")
    
    
    private List<NodeExecutionDetail> executionResultList = null;
    

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

    public ExecuteWorkflowResponse withWorkflowId(String workflowId) {
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

    

    public ExecuteWorkflowResponse withWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
        return this;
    }

    


    /**
     * 函数地址别称。
     * @return workflowUrn
     */
    public String getWorkflowUrn() {
        return workflowUrn;
    }

    public void setWorkflowUrn(String workflowUrn) {
        this.workflowUrn = workflowUrn;
    }

    

    public ExecuteWorkflowResponse withExecutionId(String executionId) {
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

    

    public ExecuteWorkflowResponse withStatus(String status) {
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

    

    public ExecuteWorkflowResponse withHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    

    public ExecuteWorkflowResponse putHeadersItem(String key, String headersItem) {
        if(this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    public ExecuteWorkflowResponse withHeaders(Consumer<Map<String, String>> headersSetter) {
        if(this.headers == null) {
            this.headers = new HashMap<>();
        }
        headersSetter.accept(this.headers);
        return this;
    }
    /**
     * 函数执行时需要的Header。
     * @return headers
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    

    public ExecuteWorkflowResponse withInput(Map<String, String> input) {
        this.input = input;
        return this;
    }

    

    public ExecuteWorkflowResponse putInputItem(String key, String inputItem) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        this.input.put(key, inputItem);
        return this;
    }

    public ExecuteWorkflowResponse withInput(Consumer<Map<String, String>> inputSetter) {
        if(this.input == null) {
            this.input = new HashMap<>();
        }
        inputSetter.accept(this.input);
        return this;
    }
    /**
     * 函数执行时的入参。
     * @return input
     */
    public Map<String, String> getInput() {
        return input;
    }

    public void setInput(Map<String, String> input) {
        this.input = input;
    }

    

    public ExecuteWorkflowResponse withOutput(Object output) {
        this.output = output;
        return this;
    }

    


    /**
     * 函数执行结果。
     * @return output
     */
    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    

    public ExecuteWorkflowResponse withBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    


    /**
     * 流程实例创建时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间。
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

    

    public ExecuteWorkflowResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 流程实例结束时间，格式：yyyy-MM-ddTHH:mm:ssZ，UTC时间。
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

    

    public ExecuteWorkflowResponse withLastUpdateTime(Long lastUpdateTime) {
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

    

    public ExecuteWorkflowResponse withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    


    /**
     * 流程实例创建者。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    

    public ExecuteWorkflowResponse withExecutionResultList(List<NodeExecutionDetail> executionResultList) {
        this.executionResultList = executionResultList;
        return this;
    }

    
    public ExecuteWorkflowResponse addExecutionResultListItem(NodeExecutionDetail executionResultListItem) {
        if(this.executionResultList == null) {
            this.executionResultList = new ArrayList<>();
        }
        this.executionResultList.add(executionResultListItem);
        return this;
    }

    public ExecuteWorkflowResponse withExecutionResultList(Consumer<List<NodeExecutionDetail>> executionResultListSetter) {
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
    public List<NodeExecutionDetail> getExecutionResultList() {
        return executionResultList;
    }

    public void setExecutionResultList(List<NodeExecutionDetail> executionResultList) {
        this.executionResultList = executionResultList;
    }

    

    public ExecuteWorkflowResponse withApproveUserNameList(List<String> approveUserNameList) {
        this.approveUserNameList = approveUserNameList;
        return this;
    }

    
    public ExecuteWorkflowResponse addApproveUserNameListItem(String approveUserNameListItem) {
        if(this.approveUserNameList == null) {
            this.approveUserNameList = new ArrayList<>();
        }
        this.approveUserNameList.add(approveUserNameListItem);
        return this;
    }

    public ExecuteWorkflowResponse withApproveUserNameList(Consumer<List<String>> approveUserNameListSetter) {
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

    

    public ExecuteWorkflowResponse withProjectId(String projectId) {
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

    

    public ExecuteWorkflowResponse withWorkflowEditTime(Long workflowEditTime) {
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

    

    public ExecuteWorkflowResponse withLastRecordIdWithSnapshot(String lastRecordIdWithSnapshot) {
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
        ExecuteWorkflowResponse executeWorkflowResponse = (ExecuteWorkflowResponse) o;
        return Objects.equals(this.workflowId, executeWorkflowResponse.workflowId) &&
            Objects.equals(this.workflowUrn, executeWorkflowResponse.workflowUrn) &&
            Objects.equals(this.executionId, executeWorkflowResponse.executionId) &&
            Objects.equals(this.status, executeWorkflowResponse.status) &&
            Objects.equals(this.headers, executeWorkflowResponse.headers) &&
            Objects.equals(this.input, executeWorkflowResponse.input) &&
            Objects.equals(this.output, executeWorkflowResponse.output) &&
            Objects.equals(this.beginTime, executeWorkflowResponse.beginTime) &&
            Objects.equals(this.endTime, executeWorkflowResponse.endTime) &&
            Objects.equals(this.lastUpdateTime, executeWorkflowResponse.lastUpdateTime) &&
            Objects.equals(this.createdBy, executeWorkflowResponse.createdBy) &&
            Objects.equals(this.executionResultList, executeWorkflowResponse.executionResultList) &&
            Objects.equals(this.approveUserNameList, executeWorkflowResponse.approveUserNameList) &&
            Objects.equals(this.projectId, executeWorkflowResponse.projectId) &&
            Objects.equals(this.workflowEditTime, executeWorkflowResponse.workflowEditTime) &&
            Objects.equals(this.lastRecordIdWithSnapshot, executeWorkflowResponse.lastRecordIdWithSnapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workflowId, workflowUrn, executionId, status, headers, input, output, beginTime, endTime, lastUpdateTime, createdBy, executionResultList, approveUserNameList, projectId, workflowEditTime, lastRecordIdWithSnapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteWorkflowResponse {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowUrn: ").append(toIndentedString(workflowUrn)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

