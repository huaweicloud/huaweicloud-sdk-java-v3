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
    @JsonProperty(value="execution_plan_id")
    

    private String executionPlanId;

    public CreateExecutionPlanResponse withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    


    /**
     * 执行计划ID
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
        return Objects.equals(this.executionPlanId, createExecutionPlanResponse.executionPlanId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(executionPlanId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExecutionPlanResponse {\n");
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

