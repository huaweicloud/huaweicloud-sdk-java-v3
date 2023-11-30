package com.huaweicloud.sdk.dis.v2.model;

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
public class ListTransferTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TransferTask> tasks = null;

    public ListTransferTasksResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 转储任务总数。
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListTransferTasksResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    /**
     * 可创建的转储任务配额。
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public ListTransferTasksResponse withTasks(List<TransferTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListTransferTasksResponse addTasksItem(TransferTask tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListTransferTasksResponse withTasks(Consumer<List<TransferTask>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 转储任务列表。
     * @return tasks
     */
    public List<TransferTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<TransferTask> tasks) {
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
        ListTransferTasksResponse that = (ListTransferTasksResponse) obj;
        return Objects.equals(this.totalNumber, that.totalNumber) && Objects.equals(this.quota, that.quota)
            && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, quota, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransferTasksResponse {\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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
