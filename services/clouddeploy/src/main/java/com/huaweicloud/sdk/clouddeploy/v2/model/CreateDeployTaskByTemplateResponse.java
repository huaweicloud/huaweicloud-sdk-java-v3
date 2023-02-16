package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateDeployTaskByTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public CreateDeployTaskByTemplateResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 应用名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateDeployTaskByTemplateResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 部署任务id
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
        CreateDeployTaskByTemplateResponse createDeployTaskByTemplateResponse = (CreateDeployTaskByTemplateResponse) o;
        return Objects.equals(this.taskName, createDeployTaskByTemplateResponse.taskName)
            && Objects.equals(this.taskId, createDeployTaskByTemplateResponse.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeployTaskByTemplateResponse {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
