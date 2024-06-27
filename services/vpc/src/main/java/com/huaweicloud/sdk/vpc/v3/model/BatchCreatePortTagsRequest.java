package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreatePortTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreatePortTagsRequestBody body;

    public BatchCreatePortTagsRequest withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * 功能说明：端口唯一标识 取值范围：合法UUID 约束：ID对应的端口必须存在
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public BatchCreatePortTagsRequest withBody(BatchCreatePortTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreatePortTagsRequest withBody(Consumer<BatchCreatePortTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreatePortTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreatePortTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreatePortTagsRequestBody body) {
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
        BatchCreatePortTagsRequest that = (BatchCreatePortTagsRequest) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreatePortTagsRequest {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
