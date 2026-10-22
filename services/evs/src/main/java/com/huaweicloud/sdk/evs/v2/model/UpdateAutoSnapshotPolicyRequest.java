package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAutoSnapshotPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_policy_id")

    private String snapshotPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateSnapshotPolicyRequestBody body;

    public UpdateAutoSnapshotPolicyRequest withSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
        return this;
    }

    /**
     * 自动快照策略ID。
     * @return snapshotPolicyId
     */
    public String getSnapshotPolicyId() {
        return snapshotPolicyId;
    }

    public void setSnapshotPolicyId(String snapshotPolicyId) {
        this.snapshotPolicyId = snapshotPolicyId;
    }

    public UpdateAutoSnapshotPolicyRequest withBody(UpdateSnapshotPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAutoSnapshotPolicyRequest withBody(Consumer<UpdateSnapshotPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateSnapshotPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateSnapshotPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateSnapshotPolicyRequestBody body) {
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
        UpdateAutoSnapshotPolicyRequest that = (UpdateAutoSnapshotPolicyRequest) obj;
        return Objects.equals(this.snapshotPolicyId, that.snapshotPolicyId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoSnapshotPolicyRequest {\n");
        sb.append("    snapshotPolicyId: ").append(toIndentedString(snapshotPolicyId)).append("\n");
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
