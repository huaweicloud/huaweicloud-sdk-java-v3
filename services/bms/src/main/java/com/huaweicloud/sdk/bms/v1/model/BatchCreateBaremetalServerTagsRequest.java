package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchCreateBaremetalServerTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchCreateBaremetalServerTagsRequestBody body;

    public BatchCreateBaremetalServerTagsRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 裸金属服务器ID。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public BatchCreateBaremetalServerTagsRequest withBody(BatchCreateBaremetalServerTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchCreateBaremetalServerTagsRequest withBody(
        Consumer<BatchCreateBaremetalServerTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new BatchCreateBaremetalServerTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchCreateBaremetalServerTagsRequestBody getBody() {
        return body;
    }

    public void setBody(BatchCreateBaremetalServerTagsRequestBody body) {
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
        BatchCreateBaremetalServerTagsRequest batchCreateBaremetalServerTagsRequest =
            (BatchCreateBaremetalServerTagsRequest) o;
        return Objects.equals(this.serverId, batchCreateBaremetalServerTagsRequest.serverId)
            && Objects.equals(this.body, batchCreateBaremetalServerTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateBaremetalServerTagsRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
