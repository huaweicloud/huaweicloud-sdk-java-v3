package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新作业参数请求体
 */
public class UpdateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<JobTaskDto> tasks = null;

    public UpdateJobReq withTasks(List<JobTaskDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public UpdateJobReq addTasksItem(JobTaskDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public UpdateJobReq withTasks(Consumer<List<JobTaskDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 步骤的参数修改信息
     * @return tasks
     */
    public List<JobTaskDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<JobTaskDto> tasks) {
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
        UpdateJobReq updateJobReq = (UpdateJobReq) o;
        return Objects.equals(this.tasks, updateJobReq.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobReq {\n");
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
