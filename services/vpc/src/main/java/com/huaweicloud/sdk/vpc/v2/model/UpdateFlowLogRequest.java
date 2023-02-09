package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFlowLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flowlog_id")

    private String flowlogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFlowLogReqBody body;

    public UpdateFlowLogRequest withFlowlogId(String flowlogId) {
        this.flowlogId = flowlogId;
        return this;
    }

    /**
     * 流日志资源唯一标识
     * @return flowlogId
     */
    public String getFlowlogId() {
        return flowlogId;
    }

    public void setFlowlogId(String flowlogId) {
        this.flowlogId = flowlogId;
    }

    public UpdateFlowLogRequest withBody(UpdateFlowLogReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateFlowLogRequest withBody(Consumer<UpdateFlowLogReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlowLogReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlowLogReqBody getBody() {
        return body;
    }

    public void setBody(UpdateFlowLogReqBody body) {
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
        UpdateFlowLogRequest updateFlowLogRequest = (UpdateFlowLogRequest) o;
        return Objects.equals(this.flowlogId, updateFlowLogRequest.flowlogId)
            && Objects.equals(this.body, updateFlowLogRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowlogId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlowLogRequest {\n");
        sb.append("    flowlogId: ").append(toIndentedString(flowlogId)).append("\n");
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
