package com.huaweicloud.sdk.aos.v1.model;




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
public class CreateExecutionPlanResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_name")
    
    
    private String stackName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_name")
    
    
    private String executionPlanName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_id")
    
    
    private String executionPlanId;

    public CreateExecutionPlanResponse withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    


    /**
     * 栈的名字
     * @return stackName
     */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    

    public CreateExecutionPlanResponse withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 栈的唯一Id
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public CreateExecutionPlanResponse withExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
        return this;
    }

    


    /**
     * 执行计划的名字。如果未指定，则使用execution_plan_id作为execution_plan_name。
     * @return executionPlanName
     */
    public String getExecutionPlanName() {
        return executionPlanName;
    }

    public void setExecutionPlanName(String executionPlanName) {
        this.executionPlanName = executionPlanName;
    }

    

    public CreateExecutionPlanResponse withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    


    /**
     * 执行计划的唯一Id，由IaC随机生成
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
        CreateExecutionPlanResponse createExecutionPlanResponse = (CreateExecutionPlanResponse) o;
        return Objects.equals(this.stackName, createExecutionPlanResponse.stackName) &&
            Objects.equals(this.stackId, createExecutionPlanResponse.stackId) &&
            Objects.equals(this.executionPlanName, createExecutionPlanResponse.executionPlanName) &&
            Objects.equals(this.executionPlanId, createExecutionPlanResponse.executionPlanId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackName, stackId, executionPlanName, executionPlanId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExecutionPlanResponse {\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
        sb.append("    executionPlanName: ").append(toIndentedString(executionPlanName)).append("\n");
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

