package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplyExecutionPlanRequestBody
 */
public class ApplyExecutionPlanRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_plan_id")

    private String executionPlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_id")

    private String stackId;

    public ApplyExecutionPlanRequestBody withExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
        return this;
    }

    /**
     * 执行计划（execution_plan）的唯一Id。  此Id由资源编排服务在生成执行计划的时候生成，为UUID。  由于执行计划名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的执行计划，删除，再重新创建一个同名执行计划。  对于团队并行开发，用户可能希望确保，当前我操作的执行计划就是我认为的那个，而不是其他队友删除后创建的同名执行计划。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的执行计划所对应的ID都不相同，更新不会影响ID。如果给与的execution_plan_id和当前执行计划的ID不一致，则返回400
     * @return executionPlanId
     */
    public String getExecutionPlanId() {
        return executionPlanId;
    }

    public void setExecutionPlanId(String executionPlanId) {
        this.executionPlanId = executionPlanId;
    }

    public ApplyExecutionPlanRequestBody withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * 资源栈（stack）的唯一ID。  此ID由资源编排服务在生成资源栈的时候生成，为UUID。  由于资源栈名仅仅在同一时间下唯一，即用户允许先生成一个叫HelloWorld的资源栈，删除，再重新创建一个同名资源栈。  对于团队并行开发，用户可能希望确保，当前我操作的资源栈就是我认为的那个，而不是其他队友删除后创建的同名资源栈。因此，使用ID就可以做到强匹配。  资源编排服务保证每次创建的资源栈所对应的ID都不相同，更新不会影响ID。如果给与的stack_id和当前资源栈的ID不一致，则返回400
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyExecutionPlanRequestBody that = (ApplyExecutionPlanRequestBody) obj;
        return Objects.equals(this.executionPlanId, that.executionPlanId) && Objects.equals(this.stackId, that.stackId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionPlanId, stackId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyExecutionPlanRequestBody {\n");
        sb.append("    executionPlanId: ").append(toIndentedString(executionPlanId)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
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
