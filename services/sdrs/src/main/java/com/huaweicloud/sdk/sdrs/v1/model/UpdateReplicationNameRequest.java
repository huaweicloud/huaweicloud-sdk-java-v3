package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateReplicationNameRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateReplicationNameRequestBody body;

    public UpdateReplicationNameRequest withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * replication_id
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public UpdateReplicationNameRequest withBody(UpdateReplicationNameRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateReplicationNameRequest withBody(Consumer<UpdateReplicationNameRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateReplicationNameRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateReplicationNameRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateReplicationNameRequestBody body) {
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
        UpdateReplicationNameRequest updateReplicationNameRequest = (UpdateReplicationNameRequest) o;
        return Objects.equals(this.replicationId, updateReplicationNameRequest.replicationId)
            && Objects.equals(this.body, updateReplicationNameRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReplicationNameRequest {\n");
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
