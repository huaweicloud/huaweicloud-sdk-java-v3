package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowSinkTaskDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connector_id")
    
    private String connectorId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_id")
    
    private String taskId;

    public ShowSinkTaskDetailRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    


    /**
     * Get connectorId
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public ShowSinkTaskDetailRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    


    /**
     * Get taskId
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
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
        ShowSinkTaskDetailRequest showSinkTaskDetailRequest = (ShowSinkTaskDetailRequest) o;
        return Objects.equals(this.connectorId, showSinkTaskDetailRequest.connectorId) &&
            Objects.equals(this.taskId, showSinkTaskDetailRequest.taskId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(connectorId, taskId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinkTaskDetailRequest {\n");
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
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

