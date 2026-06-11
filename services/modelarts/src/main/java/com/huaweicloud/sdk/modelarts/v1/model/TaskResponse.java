package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业的任务列表。
 */
public class TaskResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private TaskResponseAlgorithm algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_resource")

    private FlavorResponse taskResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_export_path")

    private TaskResponseLogExportPath logExportPath;

    public TaskResponse withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 任务角色，该功能暂未支持。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public TaskResponse withAlgorithm(TaskResponseAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public TaskResponse withAlgorithm(Consumer<TaskResponseAlgorithm> algorithmSetter) {
        if (this.algorithm == null) {
            this.algorithm = new TaskResponseAlgorithm();
            algorithmSetter.accept(this.algorithm);
        }

        return this;
    }

    /**
     * Get algorithm
     * @return algorithm
     */
    public TaskResponseAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(TaskResponseAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public TaskResponse withTaskResource(FlavorResponse taskResource) {
        this.taskResource = taskResource;
        return this;
    }

    public TaskResponse withTaskResource(Consumer<FlavorResponse> taskResourceSetter) {
        if (this.taskResource == null) {
            this.taskResource = new FlavorResponse();
            taskResourceSetter.accept(this.taskResource);
        }

        return this;
    }

    /**
     * Get taskResource
     * @return taskResource
     */
    public FlavorResponse getTaskResource() {
        return taskResource;
    }

    public void setTaskResource(FlavorResponse taskResource) {
        this.taskResource = taskResource;
    }

    public TaskResponse withLogExportPath(TaskResponseLogExportPath logExportPath) {
        this.logExportPath = logExportPath;
        return this;
    }

    public TaskResponse withLogExportPath(Consumer<TaskResponseLogExportPath> logExportPathSetter) {
        if (this.logExportPath == null) {
            this.logExportPath = new TaskResponseLogExportPath();
            logExportPathSetter.accept(this.logExportPath);
        }

        return this;
    }

    /**
     * Get logExportPath
     * @return logExportPath
     */
    public TaskResponseLogExportPath getLogExportPath() {
        return logExportPath;
    }

    public void setLogExportPath(TaskResponseLogExportPath logExportPath) {
        this.logExportPath = logExportPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskResponse that = (TaskResponse) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.algorithm, that.algorithm)
            && Objects.equals(this.taskResource, that.taskResource)
            && Objects.equals(this.logExportPath, that.logExportPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, algorithm, taskResource, logExportPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResponse {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
        sb.append("    taskResource: ").append(toIndentedString(taskResource)).append("\n");
        sb.append("    logExportPath: ").append(toIndentedString(logExportPath)).append("\n");
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
