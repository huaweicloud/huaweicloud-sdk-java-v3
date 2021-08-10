package com.huaweicloud.sdk.clouddeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class StartDeployTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EnvExecutionBody body;

    public StartDeployTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 部署任务id
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public StartDeployTaskRequest withBody(EnvExecutionBody body) {
        this.body = body;
        return this;
    }

    public StartDeployTaskRequest withBody(Consumer<EnvExecutionBody> bodySetter) {
        if (this.body == null) {
            this.body = new EnvExecutionBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public EnvExecutionBody getBody() {
        return body;
    }

    public void setBody(EnvExecutionBody body) {
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
        StartDeployTaskRequest startDeployTaskRequest = (StartDeployTaskRequest) o;
        return Objects.equals(this.taskId, startDeployTaskRequest.taskId)
            && Objects.equals(this.body, startDeployTaskRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartDeployTaskRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
