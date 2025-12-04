package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateBandwidthPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateBandwidthPolicyReq body;

    public UpdateBandwidthPolicyRequest withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * minimum: 0
     * maximum: 999999999999999
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public UpdateBandwidthPolicyRequest withBody(UpdateBandwidthPolicyReq body) {
        this.body = body;
        return this;
    }

    public UpdateBandwidthPolicyRequest withBody(Consumer<UpdateBandwidthPolicyReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateBandwidthPolicyReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateBandwidthPolicyReq getBody() {
        return body;
    }

    public void setBody(UpdateBandwidthPolicyReq body) {
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
        UpdateBandwidthPolicyRequest that = (UpdateBandwidthPolicyRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthPolicyRequest {\n");
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
