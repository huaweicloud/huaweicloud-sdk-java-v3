package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业状态信息。创建作业无需填写。
 */
public class Status {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_phase")

    private String secondaryPhase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count_metrics")

    private List<List<Integer>> nodeCountMetrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<String> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_statuses")

    private List<TaskStatuses> taskStatuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_records")

    private List<RunningRecord> runningRecords = null;

    public Status withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 训练作业一级状态。可选值如下： - Creating：创建中 - Pending：等待中 - Running：运行中 - Failed：运行失败 - Completed：已完成 - Terminating：停止中 - Terminated：已停止 - Abnormal：异常
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Status withSecondaryPhase(String secondaryPhase) {
        this.secondaryPhase = secondaryPhase;
        return this;
    }

    /**
     * 训练作业二级状态为内部详细状态，可能会增加、修改、删除，不建议依赖。可选值如下： - Creating：创建中 - Queuing：排队中 - Running：运行中 - Failed：运行失败 - Completed：已完成 - Terminating：停止中 - Terminated：已停止 - CreateFailed：创建失败 - TerminatedFailed：停止失败 - Unknown：未知状态 - Lost：异常
     * @return secondaryPhase
     */
    public String getSecondaryPhase() {
        return secondaryPhase;
    }

    public void setSecondaryPhase(String secondaryPhase) {
        this.secondaryPhase = secondaryPhase;
    }

    public Status withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 训练作业运行时长，单位为毫秒。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Status withNodeCountMetrics(List<List<Integer>> nodeCountMetrics) {
        this.nodeCountMetrics = nodeCountMetrics;
        return this;
    }

    public Status addNodeCountMetricsItem(List<Integer> nodeCountMetricsItem) {
        if (this.nodeCountMetrics == null) {
            this.nodeCountMetrics = new ArrayList<>();
        }
        this.nodeCountMetrics.add(nodeCountMetricsItem);
        return this;
    }

    public Status withNodeCountMetrics(Consumer<List<List<Integer>>> nodeCountMetricsSetter) {
        if (this.nodeCountMetrics == null) {
            this.nodeCountMetrics = new ArrayList<>();
        }
        nodeCountMetricsSetter.accept(this.nodeCountMetrics);
        return this;
    }

    /**
     * 训练作业运行时节点数变化指标。
     * @return nodeCountMetrics
     */
    public List<List<Integer>> getNodeCountMetrics() {
        return nodeCountMetrics;
    }

    public void setNodeCountMetrics(List<List<Integer>> nodeCountMetrics) {
        this.nodeCountMetrics = nodeCountMetrics;
    }

    public Status withTasks(List<String> tasks) {
        this.tasks = tasks;
        return this;
    }

    public Status addTasksItem(String tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public Status withTasks(Consumer<List<String>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 训练作业子任务名称。
     * @return tasks
     */
    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public Status withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 训练作业开始时间，格式为时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Status withTaskStatuses(List<TaskStatuses> taskStatuses) {
        this.taskStatuses = taskStatuses;
        return this;
    }

    public Status addTaskStatusesItem(TaskStatuses taskStatusesItem) {
        if (this.taskStatuses == null) {
            this.taskStatuses = new ArrayList<>();
        }
        this.taskStatuses.add(taskStatusesItem);
        return this;
    }

    public Status withTaskStatuses(Consumer<List<TaskStatuses>> taskStatusesSetter) {
        if (this.taskStatuses == null) {
            this.taskStatuses = new ArrayList<>();
        }
        taskStatusesSetter.accept(this.taskStatuses);
        return this;
    }

    /**
     * 训练在子任务状态信息。
     * @return taskStatuses
     */
    public List<TaskStatuses> getTaskStatuses() {
        return taskStatuses;
    }

    public void setTaskStatuses(List<TaskStatuses> taskStatuses) {
        this.taskStatuses = taskStatuses;
    }

    public Status withRunningRecords(List<RunningRecord> runningRecords) {
        this.runningRecords = runningRecords;
        return this;
    }

    public Status addRunningRecordsItem(RunningRecord runningRecordsItem) {
        if (this.runningRecords == null) {
            this.runningRecords = new ArrayList<>();
        }
        this.runningRecords.add(runningRecordsItem);
        return this;
    }

    public Status withRunningRecords(Consumer<List<RunningRecord>> runningRecordsSetter) {
        if (this.runningRecords == null) {
            this.runningRecords = new ArrayList<>();
        }
        runningRecordsSetter.accept(this.runningRecords);
        return this;
    }

    /**
     * 训练作业运行及故障恢复记录。
     * @return runningRecords
     */
    public List<RunningRecord> getRunningRecords() {
        return runningRecords;
    }

    public void setRunningRecords(List<RunningRecord> runningRecords) {
        this.runningRecords = runningRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Status that = (Status) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.secondaryPhase, that.secondaryPhase)
            && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.nodeCountMetrics, that.nodeCountMetrics) && Objects.equals(this.tasks, that.tasks)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.taskStatuses, that.taskStatuses)
            && Objects.equals(this.runningRecords, that.runningRecords);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(phase, secondaryPhase, duration, nodeCountMetrics, tasks, startTime, taskStatuses, runningRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    secondaryPhase: ").append(toIndentedString(secondaryPhase)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    nodeCountMetrics: ").append(toIndentedString(nodeCountMetrics)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskStatuses: ").append(toIndentedString(taskStatuses)).append("\n");
        sb.append("    runningRecords: ").append(toIndentedString(runningRecords)).append("\n");
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
