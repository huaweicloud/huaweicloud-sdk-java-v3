package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExpandReplicationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExtendReplicationRequestBody body;

    public ExpandReplicationRequest withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 复制对的ID。
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public ExpandReplicationRequest withBody(ExtendReplicationRequestBody body) {
        this.body = body;
        return this;
    }

    public ExpandReplicationRequest withBody(Consumer<ExtendReplicationRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExtendReplicationRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExtendReplicationRequestBody getBody() {
        return body;
    }

    public void setBody(ExtendReplicationRequestBody body) {
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
        ExpandReplicationRequest expandReplicationRequest = (ExpandReplicationRequest) o;
        return Objects.equals(this.replicationId, expandReplicationRequest.replicationId)
            && Objects.equals(this.body, expandReplicationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandReplicationRequest {\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
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
