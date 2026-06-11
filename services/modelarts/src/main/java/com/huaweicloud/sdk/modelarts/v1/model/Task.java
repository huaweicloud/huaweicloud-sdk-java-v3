package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业的任务列表。
 */
public class Task {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm")

    private TaskAlgorithm algorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_resource")

    private TaskTaskResource taskResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_export_path")

    private TaskLogExportPath logExportPath;

    public Task withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**：任务角色，该功能暂未支持。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Task withAlgorithm(TaskAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    public Task withAlgorithm(Consumer<TaskAlgorithm> algorithmSetter) {
        if (this.algorithm == null) {
            this.algorithm = new TaskAlgorithm();
            algorithmSetter.accept(this.algorithm);
        }

        return this;
    }

    /**
     * Get algorithm
     * @return algorithm
     */
    public TaskAlgorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(TaskAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Task withTaskResource(TaskTaskResource taskResource) {
        this.taskResource = taskResource;
        return this;
    }

    public Task withTaskResource(Consumer<TaskTaskResource> taskResourceSetter) {
        if (this.taskResource == null) {
            this.taskResource = new TaskTaskResource();
            taskResourceSetter.accept(this.taskResource);
        }

        return this;
    }

    /**
     * Get taskResource
     * @return taskResource
     */
    public TaskTaskResource getTaskResource() {
        return taskResource;
    }

    public void setTaskResource(TaskTaskResource taskResource) {
        this.taskResource = taskResource;
    }

    public Task withLogExportPath(TaskLogExportPath logExportPath) {
        this.logExportPath = logExportPath;
        return this;
    }

    public Task withLogExportPath(Consumer<TaskLogExportPath> logExportPathSetter) {
        if (this.logExportPath == null) {
            this.logExportPath = new TaskLogExportPath();
            logExportPathSetter.accept(this.logExportPath);
        }

        return this;
    }

    /**
     * Get logExportPath
     * @return logExportPath
     */
    public TaskLogExportPath getLogExportPath() {
        return logExportPath;
    }

    public void setLogExportPath(TaskLogExportPath logExportPath) {
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
        Task that = (Task) obj;
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
        sb.append("class Task {\n");
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
