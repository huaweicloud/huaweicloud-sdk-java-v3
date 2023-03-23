package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class PublishExtensionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-publisher-token")

    private String xPublisherToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TaskModelMarketPlace body;

    public PublishExtensionRequest withXPublisherToken(String xPublisherToken) {
        this.xPublisherToken = xPublisherToken;
        return this;
    }

    /**
     * 发布商凭证,x-publisher-token和X-Auth-Token必传一个
     * @return xPublisherToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-publisher-token")
    public String getXPublisherToken() {
        return xPublisherToken;
    }

    public void setXPublisherToken(String xPublisherToken) {
        this.xPublisherToken = xPublisherToken;
    }

    public PublishExtensionRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public PublishExtensionRequest withBody(TaskModelMarketPlace body) {
        this.body = body;
        return this;
    }

    public PublishExtensionRequest withBody(Consumer<TaskModelMarketPlace> bodySetter) {
        if (this.body == null) {
            this.body = new TaskModelMarketPlace();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TaskModelMarketPlace getBody() {
        return body;
    }

    public void setBody(TaskModelMarketPlace body) {
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
        PublishExtensionRequest publishExtensionRequest = (PublishExtensionRequest) o;
        return Objects.equals(this.xPublisherToken, publishExtensionRequest.xPublisherToken)
            && Objects.equals(this.taskId, publishExtensionRequest.taskId)
            && Objects.equals(this.body, publishExtensionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xPublisherToken, taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishExtensionRequest {\n");
        sb.append("    xPublisherToken: ").append(toIndentedString(xPublisherToken)).append("\n");
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
