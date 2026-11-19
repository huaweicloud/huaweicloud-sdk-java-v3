package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListColdTableWaitingTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_tasks")

    private List<ColdTableWaitingTask> waitingTasks = null;

    public ListColdTableWaitingTasksResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  任务总数。  **取值范围**：  非负整数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListColdTableWaitingTasksResponse withWaitingTasks(List<ColdTableWaitingTask> waitingTasks) {
        this.waitingTasks = waitingTasks;
        return this;
    }

    public ListColdTableWaitingTasksResponse addWaitingTasksItem(ColdTableWaitingTask waitingTasksItem) {
        if (this.waitingTasks == null) {
            this.waitingTasks = new ArrayList<>();
        }
        this.waitingTasks.add(waitingTasksItem);
        return this;
    }

    public ListColdTableWaitingTasksResponse withWaitingTasks(Consumer<List<ColdTableWaitingTask>> waitingTasksSetter) {
        if (this.waitingTasks == null) {
            this.waitingTasks = new ArrayList<>();
        }
        waitingTasksSetter.accept(this.waitingTasks);
        return this;
    }

    /**
     * **参数解释**：  冷热分离待下发任务列表，没有任务时默认为空数组。
     * @return waitingTasks
     */
    public List<ColdTableWaitingTask> getWaitingTasks() {
        return waitingTasks;
    }

    public void setWaitingTasks(List<ColdTableWaitingTask> waitingTasks) {
        this.waitingTasks = waitingTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListColdTableWaitingTasksResponse that = (ListColdTableWaitingTasksResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.waitingTasks, that.waitingTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, waitingTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListColdTableWaitingTasksResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    waitingTasks: ").append(toIndentedString(waitingTasks)).append("\n");
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
