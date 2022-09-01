package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSinkTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_id")

    @JacksonXmlProperty(localName = "connector_id")

    private String connectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    public DeleteSinkTaskRequest withConnectorId(String connectorId) {
        this.connectorId = connectorId;
        return this;
    }

    /**
     * 实例转储ID。 请参考[实例生命周期][查询实例]接口返回的数据。
     * @return connectorId
     */
    public String getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    public DeleteSinkTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 转储任务ID。
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
        DeleteSinkTaskRequest deleteSinkTaskRequest = (DeleteSinkTaskRequest) o;
        return Objects.equals(this.connectorId, deleteSinkTaskRequest.connectorId)
            && Objects.equals(this.taskId, deleteSinkTaskRequest.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorId, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSinkTaskRequest {\n");
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
