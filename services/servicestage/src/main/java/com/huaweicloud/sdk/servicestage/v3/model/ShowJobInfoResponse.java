package com.huaweicloud.sdk.servicestage.v3.model;

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
public class ShowJobInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_count")

    private Integer taskCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job")

    private JobInfo job;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskInfo> tasks = null;

    public ShowJobInfoResponse withTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * Get taskCount
     * @return taskCount
     */
    public Integer getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    public ShowJobInfoResponse withJob(JobInfo job) {
        this.job = job;
        return this;
    }

    public ShowJobInfoResponse withJob(Consumer<JobInfo> jobSetter) {
        if (this.job == null) {
            this.job = new JobInfo();
            jobSetter.accept(this.job);
        }

        return this;
    }

    /**
     * Get job
     * @return job
     */
    public JobInfo getJob() {
        return job;
    }

    public void setJob(JobInfo job) {
        this.job = job;
    }

    public ShowJobInfoResponse withTasks(List<TaskInfo> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowJobInfoResponse addTasksItem(TaskInfo tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowJobInfoResponse withTasks(Consumer<List<TaskInfo>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * Get tasks
     * @return tasks
     */
    public List<TaskInfo> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskInfo> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobInfoResponse showJobInfoResponse = (ShowJobInfoResponse) o;
        return Objects.equals(this.taskCount, showJobInfoResponse.taskCount)
            && Objects.equals(this.job, showJobInfoResponse.job)
            && Objects.equals(this.tasks, showJobInfoResponse.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskCount, job, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobInfoResponse {\n");
        sb.append("    taskCount: ").append(toIndentedString(taskCount)).append("\n");
        sb.append("    job: ").append(toIndentedString(job)).append("\n");
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
