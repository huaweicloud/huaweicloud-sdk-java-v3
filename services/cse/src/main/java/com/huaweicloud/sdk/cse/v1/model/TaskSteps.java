package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 处理阶段
 */
public class TaskSteps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_names")

    private List<String> taskNames = null;

    /**
     * 处理阶段状态
     */
    public static final class StatusEnum {

        /**
         * Enum INIT for value: "Init"
         */
        public static final StatusEnum INIT = new StatusEnum("Init");

        /**
         * Enum EXECUTING for value: "Executing"
         */
        public static final StatusEnum EXECUTING = new StatusEnum("Executing");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final StatusEnum ERROR = new StatusEnum("Error");

        /**
         * Enum TIMEOUT for value: "Timeout"
         */
        public static final StatusEnum TIMEOUT = new StatusEnum("Timeout");

        /**
         * Enum FINISHED for value: "Finished"
         */
        public static final StatusEnum FINISHED = new StatusEnum("Finished");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Init", INIT);
            map.put("Executing", EXECUTING);
            map.put("Error", ERROR);
            map.put("Timeout", TIMEOUT);
            map.put("Finished", FINISHED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_executor_brief")

    private TaskExecutorBrief taskExecutorBrief;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<Task> tasks = null;

    public TaskSteps withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 处理阶段名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskSteps withTaskNames(List<String> taskNames) {
        this.taskNames = taskNames;
        return this;
    }

    public TaskSteps addTaskNamesItem(String taskNamesItem) {
        if (this.taskNames == null) {
            this.taskNames = new ArrayList<>();
        }
        this.taskNames.add(taskNamesItem);
        return this;
    }

    public TaskSteps withTaskNames(Consumer<List<String>> taskNamesSetter) {
        if (this.taskNames == null) {
            this.taskNames = new ArrayList<>();
        }
        taskNamesSetter.accept(this.taskNames);
        return this;
    }

    /**
     * 当前处理阶段包含的处理步骤名称列表
     * @return taskNames
     */
    public List<String> getTaskNames() {
        return taskNames;
    }

    public void setTaskNames(List<String> taskNames) {
        this.taskNames = taskNames;
    }

    public TaskSteps withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 处理阶段状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public TaskSteps withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 处理阶段开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TaskSteps withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 处理阶段结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public TaskSteps withTaskExecutorBrief(TaskExecutorBrief taskExecutorBrief) {
        this.taskExecutorBrief = taskExecutorBrief;
        return this;
    }

    public TaskSteps withTaskExecutorBrief(Consumer<TaskExecutorBrief> taskExecutorBriefSetter) {
        if (this.taskExecutorBrief == null) {
            this.taskExecutorBrief = new TaskExecutorBrief();
            taskExecutorBriefSetter.accept(this.taskExecutorBrief);
        }

        return this;
    }

    /**
     * Get taskExecutorBrief
     * @return taskExecutorBrief
     */
    public TaskExecutorBrief getTaskExecutorBrief() {
        return taskExecutorBrief;
    }

    public void setTaskExecutorBrief(TaskExecutorBrief taskExecutorBrief) {
        this.taskExecutorBrief = taskExecutorBrief;
    }

    public TaskSteps withTasks(List<Task> tasks) {
        this.tasks = tasks;
        return this;
    }

    public TaskSteps addTasksItem(Task tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public TaskSteps withTasks(Consumer<List<Task>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 处理步骤
     * @return tasks
     */
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
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
        TaskSteps that = (TaskSteps) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskNames, that.taskNames)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.taskExecutorBrief, that.taskExecutorBrief) && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskNames, status, startTime, endTime, taskExecutorBrief, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSteps {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskNames: ").append(toIndentedString(taskNames)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    taskExecutorBrief: ").append(toIndentedString(taskExecutorBrief)).append("\n");
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
