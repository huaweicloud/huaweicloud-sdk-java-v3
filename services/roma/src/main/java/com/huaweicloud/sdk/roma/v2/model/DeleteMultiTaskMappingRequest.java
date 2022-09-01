package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteMultiTaskMappingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    @JacksonXmlProperty(localName = "mapping_id")

    private String mappingId;

    public DeleteMultiTaskMappingRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteMultiTaskMappingRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public DeleteMultiTaskMappingRequest withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 组合任务映射唯一标识
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMultiTaskMappingRequest deleteMultiTaskMappingRequest = (DeleteMultiTaskMappingRequest) o;
        return Objects.equals(this.instanceId, deleteMultiTaskMappingRequest.instanceId)
            && Objects.equals(this.taskId, deleteMultiTaskMappingRequest.taskId)
            && Objects.equals(this.mappingId, deleteMultiTaskMappingRequest.mappingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, taskId, mappingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMultiTaskMappingRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
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
