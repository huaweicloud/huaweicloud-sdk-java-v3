package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OperationalTaskRequest
 */
public class OperationalTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private TaskInfo taskInfo;

    public OperationalTaskRequest withTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public OperationalTaskRequest withTaskInfo(Consumer<TaskInfo> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new TaskInfo();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperationalTaskRequest that = (OperationalTaskRequest) obj;
        return Objects.equals(this.taskInfo, that.taskInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperationalTaskRequest {\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
