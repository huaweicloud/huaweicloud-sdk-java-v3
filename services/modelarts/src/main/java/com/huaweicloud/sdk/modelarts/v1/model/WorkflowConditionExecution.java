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
public class WorkflowConditionExecution {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_list")

    private List<WorkflowMetricPair> metricList = null;

    public WorkflowConditionExecution withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 执行结果。
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public WorkflowConditionExecution withMetricList(List<WorkflowMetricPair> metricList) {
        this.metricList = metricList;
        return this;
    }

    public WorkflowConditionExecution addMetricListItem(WorkflowMetricPair metricListItem) {
        if (this.metricList == null) {
            this.metricList = new ArrayList<>();
        }
        this.metricList.add(metricListItem);
        return this;
    }

    public WorkflowConditionExecution withMetricList(Consumer<List<WorkflowMetricPair>> metricListSetter) {
        if (this.metricList == null) {
            this.metricList = new ArrayList<>();
        }
        metricListSetter.accept(this.metricList);
        return this;
    }

    /**
     * 工作流度量信息列表。
     * @return metricList
     */
    public List<WorkflowMetricPair> getMetricList() {
        return metricList;
    }

    public void setMetricList(List<WorkflowMetricPair> metricList) {
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
        WorkflowConditionExecution that = (WorkflowConditionExecution) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.metricList, that.metricList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, metricList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowConditionExecution {\n");
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
