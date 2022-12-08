package com.huaweicloud.sdk.aos.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * apply_execution_plan request body
 */
public class ApplyExecutionPlanRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    
    private String stackId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="execution_plan_id")
    
    
    private String executionPlanId;

    public ApplyExecutionPlanRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * 资源栈id
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    public ApplyExecutionPlanRequestBody withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    


    /**
     * 执行计划Id，在domain_id+region+project_id+stack_id下应唯一
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
        ApplyExecutionPlanRequestBody applyExecutionPlanRequestBody = (ApplyExecutionPlanRequestBody) o;
        return Objects.equals(this.stackId, applyExecutionPlanRequestBody.stackId) &&
            Objects.equals(this.executionPlanId, applyExecutionPlanRequestBody.executionPlanId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(stackId, executionPlanId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyExecutionPlanRequestBody {\n");
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

