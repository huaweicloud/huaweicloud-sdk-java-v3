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
public class ListOpsAgentTuningTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_count")

    private OpsAgentTuningTaskStatusCount statusCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<OpsAgentTuningTaskListInfo> tasks = null;

    public ListOpsAgentTuningTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足过滤条件的记录总数，用于计算分页总页数。  **取值范围：** 0-100的整数。
     * minimum: 0
     * maximum: 100
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsAgentTuningTasksResponse withStatusCount(OpsAgentTuningTaskStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }

    public ListOpsAgentTuningTasksResponse withStatusCount(Consumer<OpsAgentTuningTaskStatusCount> statusCountSetter) {
        if (this.statusCount == null) {
            this.statusCount = new OpsAgentTuningTaskStatusCount();
            statusCountSetter.accept(this.statusCount);
        }

        return this;
    }

    /**
     * Get statusCount
     * @return statusCount
     */
    public OpsAgentTuningTaskStatusCount getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(OpsAgentTuningTaskStatusCount statusCount) {
        this.statusCount = statusCount;
    }

    public ListOpsAgentTuningTasksResponse withTasks(List<OpsAgentTuningTaskListInfo> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListOpsAgentTuningTasksResponse addTasksItem(OpsAgentTuningTaskListInfo tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListOpsAgentTuningTasksResponse withTasks(Consumer<List<OpsAgentTuningTaskListInfo>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * **参数解释：** 任务列表，表示当前分页下的任务详情列表。  **取值范围：** 符合OpsAgentTuningTask 定义的对象数组。
     * @return tasks
     */
    public List<OpsAgentTuningTaskListInfo> getTasks() {
        return tasks;
    }

    public void setTasks(List<OpsAgentTuningTaskListInfo> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentTuningTasksResponse that = (ListOpsAgentTuningTasksResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.statusCount, that.statusCount)
            && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, statusCount, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentTuningTasksResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
