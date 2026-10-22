package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSnapshotPolicyRequestBody
 */
public class UpdateSnapshotPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_policy")

    private UpdateSnapshotPolicy snapshotPolicy;

    public UpdateSnapshotPolicyRequestBody withSnapshotPolicy(UpdateSnapshotPolicy snapshotPolicy) {
        this.snapshotPolicy = snapshotPolicy;
        return this;
    }

    public UpdateSnapshotPolicyRequestBody withSnapshotPolicy(Consumer<UpdateSnapshotPolicy> snapshotPolicySetter) {
        if (this.snapshotPolicy == null) {
            this.snapshotPolicy = new UpdateSnapshotPolicy();
            snapshotPolicySetter.accept(this.snapshotPolicy);
        }

        return this;
    }

    /**
     * Get snapshotPolicy
     * @return snapshotPolicy
     */
    public UpdateSnapshotPolicy getSnapshotPolicy() {
        return snapshotPolicy;
    }

    public void setSnapshotPolicy(UpdateSnapshotPolicy snapshotPolicy) {
        this.snapshotPolicy = snapshotPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSnapshotPolicyRequestBody that = (UpdateSnapshotPolicyRequestBody) obj;
        return Objects.equals(this.snapshotPolicy, that.snapshotPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotPolicyRequestBody {\n");
        sb.append("    snapshotPolicy: ").append(toIndentedString(snapshotPolicy)).append("\n");
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
