package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowSqlExecutionPlanResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_plans")

    private List<ExecutionPlan> executionPlans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public ShowSqlExecutionPlanResponse withExecutionPlans(List<ExecutionPlan> executionPlans) {
        this.executionPlans = executionPlans;
        return this;
    }

    public ShowSqlExecutionPlanResponse addExecutionPlansItem(ExecutionPlan executionPlansItem) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        this.executionPlans.add(executionPlansItem);
        return this;
    }

    public ShowSqlExecutionPlanResponse withExecutionPlans(Consumer<List<ExecutionPlan>> executionPlansSetter) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        executionPlansSetter.accept(this.executionPlans);
        return this;
    }

    /** SQL执行计划列表
     * 
     * @return executionPlans */
    public List<ExecutionPlan> getExecutionPlans() {
        return executionPlans;
    }

    public void setExecutionPlans(List<ExecutionPlan> executionPlans) {
        this.executionPlans = executionPlans;
    }

    public ShowSqlExecutionPlanResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /** SQL执行失败时，显示执行错误信息
     * 
     * @return errorMessage */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSqlExecutionPlanResponse showSqlExecutionPlanResponse = (ShowSqlExecutionPlanResponse) o;
        return Objects.equals(this.executionPlans, showSqlExecutionPlanResponse.executionPlans)
            && Objects.equals(this.errorMessage, showSqlExecutionPlanResponse.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionPlans, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSqlExecutionPlanResponse {\n");
        sb.append("    executionPlans: ").append(toIndentedString(executionPlans)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
