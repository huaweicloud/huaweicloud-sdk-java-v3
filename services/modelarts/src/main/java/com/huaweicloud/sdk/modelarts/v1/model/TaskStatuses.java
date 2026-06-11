package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练在子任务状态信息。
 */
public class TaskStatuses {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private String task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exit_code")

    private Integer exitCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public TaskStatuses withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * 训练作业子任务名称。
     * @return task
     */
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public TaskStatuses withExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    /**
     * 训练作业子任务退出码。
     * @return exitCode
     */
    public Integer getExitCode() {
        return exitCode;
    }

    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    public TaskStatuses withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 训练作业子任务错误消息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskStatuses that = (TaskStatuses) obj;
        return Objects.equals(this.task, that.task) && Objects.equals(this.exitCode, that.exitCode)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, exitCode, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStatuses {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
