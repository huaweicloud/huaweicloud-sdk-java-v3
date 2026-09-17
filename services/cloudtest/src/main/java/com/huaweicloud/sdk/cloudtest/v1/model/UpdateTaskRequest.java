package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TaskInfo body;

    public UpdateTaskRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public UpdateTaskRequest withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 测试套件uri
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public UpdateTaskRequest withBody(TaskInfo body) {
        this.body = body;
        return this;
    }

    public UpdateTaskRequest withBody(Consumer<TaskInfo> bodySetter) {
        if (this.body == null) {
            this.body = new TaskInfo();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TaskInfo getBody() {
        return body;
    }

    public void setBody(TaskInfo body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskRequest that = (UpdateTaskRequest) obj;
        return Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, taskUri, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskRequest {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
