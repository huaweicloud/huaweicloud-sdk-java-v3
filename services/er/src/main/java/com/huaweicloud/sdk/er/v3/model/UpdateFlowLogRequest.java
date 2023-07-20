package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFlowLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "er_id")

    private String erId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log_id")

    private String flowLogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFlowLogRequestBody body;

    public UpdateFlowLogRequest withErId(String erId) {
        this.erId = erId;
        return this;
    }

    /**
     * 企业路由器实例ID
     * @return erId
     */
    public String getErId() {
        return erId;
    }

    public void setErId(String erId) {
        this.erId = erId;
    }

    public UpdateFlowLogRequest withFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }

    /**
     * 流日志ID
     * @return flowLogId
     */
    public String getFlowLogId() {
        return flowLogId;
    }

    public void setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
    }

    public UpdateFlowLogRequest withBody(UpdateFlowLogRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFlowLogRequest withBody(Consumer<UpdateFlowLogRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlowLogRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlowLogRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFlowLogRequestBody body) {
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
        UpdateFlowLogRequest that = (UpdateFlowLogRequest) obj;
        return Objects.equals(this.erId, that.erId) && Objects.equals(this.flowLogId, that.flowLogId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erId, flowLogId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlowLogRequest {\n");
        sb.append("    erId: ").append(toIndentedString(erId)).append("\n");
        sb.append("    flowLogId: ").append(toIndentedString(flowLogId)).append("\n");
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
