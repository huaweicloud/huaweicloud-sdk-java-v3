package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class BatchUpdateConfigsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    
    private String taskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_name")
    
    
    private String taskName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_type")
    
    
    private String taskType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_desc")
    
    
    private String statusDesc;

    public BatchUpdateConfigsResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * 批量任务ID，创建批量任务时由物联网平台分配获得。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    

    public BatchUpdateConfigsResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    


    /**
     * 批量任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    

    public BatchUpdateConfigsResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    


    /**
     * 任务类型。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    

    public BatchUpdateConfigsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 批量任务的状态，可选参数，取值范围：Success|Fail|Processing|PartialSuccess|Stopped|Waitting|Initializing。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public BatchUpdateConfigsResponse withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    


    /**
     * 批量任务状态描述(包含主任务失败错误信息)
     * @return statusDesc
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateConfigsResponse batchUpdateConfigsResponse = (BatchUpdateConfigsResponse) o;
        return Objects.equals(this.taskId, batchUpdateConfigsResponse.taskId) &&
            Objects.equals(this.taskName, batchUpdateConfigsResponse.taskName) &&
            Objects.equals(this.taskType, batchUpdateConfigsResponse.taskType) &&
            Objects.equals(this.status, batchUpdateConfigsResponse.status) &&
            Objects.equals(this.statusDesc, batchUpdateConfigsResponse.statusDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId, taskName, taskType, status, statusDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateConfigsResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
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

