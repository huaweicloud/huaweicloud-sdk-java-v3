package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetOnlineMigrationTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private SetOnlineMigrationTaskBody body;

    public SetOnlineMigrationTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 在线迁移任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SetOnlineMigrationTaskRequest withBody(SetOnlineMigrationTaskBody body) {
        this.body = body;
        return this;
    }

    public SetOnlineMigrationTaskRequest withBody(Consumer<SetOnlineMigrationTaskBody> bodySetter) {
        if (this.body == null) {
            this.body = new SetOnlineMigrationTaskBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SetOnlineMigrationTaskBody getBody() {
        return body;
    }

    public void setBody(SetOnlineMigrationTaskBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetOnlineMigrationTaskRequest setOnlineMigrationTaskRequest = (SetOnlineMigrationTaskRequest) o;
        return Objects.equals(this.taskId, setOnlineMigrationTaskRequest.taskId)
            && Objects.equals(this.body, setOnlineMigrationTaskRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOnlineMigrationTaskRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
