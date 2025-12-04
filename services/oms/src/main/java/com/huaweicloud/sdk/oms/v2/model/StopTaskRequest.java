package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class StopTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    public StopTaskRequest withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 迁移任务ID。
     * minimum: 0
     * maximum: 999999999999999
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopTaskRequest that = (StopTaskRequest) obj;
        return Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopTaskRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
