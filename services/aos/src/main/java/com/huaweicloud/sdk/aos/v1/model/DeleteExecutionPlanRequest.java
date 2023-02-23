package com.huaweicloud.sdk.aos.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteExecutionPlanRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Client-Request-Id")
    

    private String clientRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_name")
    

    private String executionPlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    

    private String stackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_id")
    

    private String executionPlanId;

    public DeleteExecutionPlanRequest withClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    


    /**
     * 用户指定的，对于此请求的唯一ID，用于定位某个请求，推荐使用UUID
     * @return clientRequestId
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    

    public DeleteExecutionPlanRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 用户希望操作的资源栈名称
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public DeleteExecutionPlanRequest withExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
        return this;
    }

    


    /**
     * 执行计划的名字。
     * @return executionPlanName
     */
    public String getExecutionPlanName() {
        return executionPlanName;
    }

    public void setExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
    }

    

    public DeleteExecutionPlanRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 用户希望描述的资源栈的Id。若stack_name和stack_id同时存在，则资源编排服务会检查是否两个匹配，否则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public DeleteExecutionPlanRequest withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    


    /**
     * 执行计划ID(uuid)
     * @return executionPlanId
     */
    public String getExecutionPlanId() {
        return executionPlanId;
    }

    public void setExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteExecutionPlanRequest deleteExecutionPlanRequest = (DeleteExecutionPlanRequest) o;
        return Objects.equals(this.clientRequestId, deleteExecutionPlanRequest.clientRequestId) &&
            Objects.equals(this.stackName, deleteExecutionPlanRequest.stackName) &&
            Objects.equals(this.executionPlanName, deleteExecutionPlanRequest.executionPlanName) &&
            Objects.equals(this.stackId, deleteExecutionPlanRequest.stackId) &&
            Objects.equals(this.executionPlanId, deleteExecutionPlanRequest.executionPlanId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientRequestId, stackName, executionPlanName, stackId, executionPlanId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteExecutionPlanRequest {\n");
        sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    executionPlanName: ").append(toIndentedString(executionPlanName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    executionPlanId: ").append(toIndentedString(executionPlanId)).append("\n");
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

