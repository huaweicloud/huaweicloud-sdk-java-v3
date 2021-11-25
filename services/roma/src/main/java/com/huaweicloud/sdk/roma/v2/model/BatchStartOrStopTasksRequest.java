package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchStartOrStopTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OperateTasksBean body;

    public BatchStartOrStopTasksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchStartOrStopTasksRequest withBody(OperateTasksBean body) {
        this.body = body;
        return this;
    }

    public BatchStartOrStopTasksRequest withBody(Consumer<OperateTasksBean> bodySetter) {
        if (this.body == null) {
            this.body = new OperateTasksBean();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public OperateTasksBean getBody() {
        return body;
    }

    public void setBody(OperateTasksBean body) {
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
        BatchStartOrStopTasksRequest batchStartOrStopTasksRequest = (BatchStartOrStopTasksRequest) o;
        return Objects.equals(this.instanceId, batchStartOrStopTasksRequest.instanceId)
            && Objects.equals(this.body, batchStartOrStopTasksRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartOrStopTasksRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
