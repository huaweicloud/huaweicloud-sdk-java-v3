package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAutoSnapshotPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_policy_id")

    private String snapshotPolicyId;

    public DeleteAutoSnapshotPolicyRequest withSnapshotPolicyId(String snapshotPolicyId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAutoSnapshotPolicyRequest that = (DeleteAutoSnapshotPolicyRequest) obj;
        return Objects.equals(this.snapshotPolicyId, that.snapshotPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAutoSnapshotPolicyRequest {\n");
        sb.append("    snapshotPolicyId: ").append(toIndentedString(snapshotPolicyId)).append("\n");
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
