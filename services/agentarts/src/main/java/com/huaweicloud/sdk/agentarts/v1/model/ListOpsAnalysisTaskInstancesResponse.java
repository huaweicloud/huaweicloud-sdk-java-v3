package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsAnalysisTaskInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_instances")

    private List<OpsAnalysisTaskInstanceListInfo> taskInstances = null;

    public ListOpsAnalysisTaskInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足过滤条件的记录总数，用于计算分页总页数。 **取值范围：** 0-100的整数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsAnalysisTaskInstancesResponse withTaskInstances(List<OpsAnalysisTaskInstanceListInfo> taskInstances) {
        this.taskInstances = taskInstances;
        return this;
    }

    public ListOpsAnalysisTaskInstancesResponse addTaskInstancesItem(
        OpsAnalysisTaskInstanceListInfo taskInstancesItem) {
        if (this.taskInstances == null) {
            this.taskInstances = new ArrayList<>();
        }
        this.taskInstances.add(taskInstancesItem);
        return this;
    }

    public ListOpsAnalysisTaskInstancesResponse withTaskInstances(
        Consumer<List<OpsAnalysisTaskInstanceListInfo>> taskInstancesSetter) {
        if (this.taskInstances == null) {
            this.taskInstances = new ArrayList<>();
        }
        taskInstancesSetter.accept(this.taskInstances);
        return this;
    }

    /**
     * **参数解释：** 具体分析任务执行的记录信息 **取值范围：** 不涉及
     * @return taskInstances
     */
    public List<OpsAnalysisTaskInstanceListInfo> getTaskInstances() {
        return taskInstances;
    }

    public void setTaskInstances(List<OpsAnalysisTaskInstanceListInfo> taskInstances) {
        this.taskInstances = taskInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAnalysisTaskInstancesResponse that = (ListOpsAnalysisTaskInstancesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.taskInstances, that.taskInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, taskInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAnalysisTaskInstancesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    taskInstances: ").append(toIndentedString(taskInstances)).append("\n");
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
