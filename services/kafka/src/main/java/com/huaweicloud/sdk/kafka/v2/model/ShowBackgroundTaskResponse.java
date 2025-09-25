package com.huaweicloud.sdk.kafka.v2.model;

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
public class ShowBackgroundTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_count")

    private String taskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<ListBackgroundTasksRespTasks> tasks = null;

    public ShowBackgroundTaskResponse withTaskCount(String taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * **参数解释**： 任务数量。 **取值范围**： 不涉及。
     * @return taskCount
     */
    public String getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(String taskCount) {
        this.taskCount = taskCount;
    }

    public ShowBackgroundTaskResponse withTasks(List<ListBackgroundTasksRespTasks> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowBackgroundTaskResponse addTasksItem(ListBackgroundTasksRespTasks tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowBackgroundTaskResponse withTasks(Consumer<List<ListBackgroundTasksRespTasks>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * **参数解释**： 任务列表。
     * @return tasks
     */
    public List<ListBackgroundTasksRespTasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<ListBackgroundTasksRespTasks> tasks) {
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
        ShowBackgroundTaskResponse that = (ShowBackgroundTaskResponse) obj;
        return Objects.equals(this.taskCount, that.taskCount) && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskCount, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackgroundTaskResponse {\n");
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
