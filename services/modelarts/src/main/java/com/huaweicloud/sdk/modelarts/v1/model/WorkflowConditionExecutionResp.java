package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * workflow condition execution
 */
public class WorkflowConditionExecutionResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_list")

    private List<WorkflowMetricPairResp> metricList = null;

    public WorkflowConditionExecutionResp withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * **参数解释**：执行结果。 **取值范围**：不涉及。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public WorkflowConditionExecutionResp withMetricList(List<WorkflowMetricPairResp> metricList) {
        this.metricList = metricList;
        return this;
    }

    public WorkflowConditionExecutionResp addMetricListItem(WorkflowMetricPairResp metricListItem) {
        if (this.metricList == null) {
            this.metricList = new ArrayList<>();
        }
        this.metricList.add(metricListItem);
        return this;
    }

    public WorkflowConditionExecutionResp withMetricList(Consumer<List<WorkflowMetricPairResp>> metricListSetter) {
        if (this.metricList == null) {
            this.metricList = new ArrayList<>();
        }
        metricListSetter.accept(this.metricList);
        return this;
    }

    /**
     * **参数解释**：工作流度量信息列表。
     * @return metricList
     */
    public List<WorkflowMetricPairResp> getMetricList() {
        return metricList;
    }

    public void setMetricList(List<WorkflowMetricPairResp> metricList) {
        this.metricList = metricList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkflowConditionExecutionResp that = (WorkflowConditionExecutionResp) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.metricList, that.metricList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, metricList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowConditionExecutionResp {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    metricList: ").append(toIndentedString(metricList)).append("\n");
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
