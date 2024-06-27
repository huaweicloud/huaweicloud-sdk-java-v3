package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TaskListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskVo> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    public TaskListVo withTasks(List<TaskVo> tasks) {
        this.tasks = tasks;
        return this;
    }

    public TaskListVo addTasksItem(TaskVo tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public TaskListVo withTasks(Consumer<List<TaskVo>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 测试任务集合
     * @return tasks
     */
    public List<TaskVo> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskVo> tasks) {
        this.tasks = tasks;
    }

    public TaskListVo withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * 正在执行任务数
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskListVo that = (TaskListVo) obj;
        return Objects.equals(this.tasks, that.tasks) && Objects.equals(this.runningCount, that.runningCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks, runningCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskListVo {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
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
