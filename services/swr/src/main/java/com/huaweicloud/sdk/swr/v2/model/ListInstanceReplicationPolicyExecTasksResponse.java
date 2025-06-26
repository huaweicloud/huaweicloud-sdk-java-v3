package com.huaweicloud.sdk.swr.v2.model;

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
public class ListInstanceReplicationPolicyExecTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDetail> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListInstanceReplicationPolicyExecTasksResponse withTasks(List<TaskDetail> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListInstanceReplicationPolicyExecTasksResponse addTasksItem(TaskDetail tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListInstanceReplicationPolicyExecTasksResponse withTasks(Consumer<List<TaskDetail>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 同步策略执行记录任务列表
     * @return tasks
     */
    public List<TaskDetail> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDetail> tasks) {
        this.tasks = tasks;
    }

    public ListInstanceReplicationPolicyExecTasksResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 同步策略执行记录任务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceReplicationPolicyExecTasksResponse that = (ListInstanceReplicationPolicyExecTasksResponse) obj;
        return Objects.equals(this.tasks, that.tasks) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceReplicationPolicyExecTasksResponse {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
