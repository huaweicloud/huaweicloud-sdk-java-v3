package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateVideoTaggingMediaTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public CreateVideoTaggingMediaTaskResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务唯一标识
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public CreateVideoTaggingMediaTaskResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVideoTaggingMediaTaskResponse createVideoTaggingMediaTaskResponse =
            (CreateVideoTaggingMediaTaskResponse) o;
        return Objects.equals(this.taskId, createVideoTaggingMediaTaskResponse.taskId)
            && Objects.equals(this.xRequestId, createVideoTaggingMediaTaskResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoTaggingMediaTaskResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
