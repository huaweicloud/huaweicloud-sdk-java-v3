package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTranscodingTaskRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private Integer taskId;

    public DeleteTranscodingTaskRequest withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * Get taskId
     * minimum: 0
     * maximum: 2147483647
     * @return taskId
     */
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteTranscodingTaskRequest deleteTranscodingTaskRequest = (DeleteTranscodingTaskRequest) o;
        return Objects.equals(this.taskId, deleteTranscodingTaskRequest.taskId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTranscodingTaskRequest {\n");
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

