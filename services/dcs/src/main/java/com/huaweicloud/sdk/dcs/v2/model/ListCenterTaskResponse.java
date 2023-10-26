package com.huaweicloud.sdk.dcs.v2.model;

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
public class ListCenterTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_count")

    private String taskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<ListCenterTasksResp> tasks = null;

    public ListCenterTaskResponse withTaskCount(String taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * 任务个数
     * @return taskCount
     */
    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }

    public ListCenterTaskResponse withTasks(List<ListCenterTasksResp> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ListCenterTaskResponse addTasksItem(ListCenterTasksResp tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ListCenterTaskResponse withTasks(Consumer<List<ListCenterTasksResp>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 中心任务详情数组
     * @return tasks
     */
    public List<ListCenterTasksResp> getTasks() {
        return tasks;
    }

    public void setTasks(List<ListCenterTasksResp> tasks) {
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
        ListCenterTaskResponse that = (ListCenterTaskResponse) obj;
        return Objects.equals(this.taskCount, that.taskCount) && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskCount, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCenterTaskResponse {\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
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
