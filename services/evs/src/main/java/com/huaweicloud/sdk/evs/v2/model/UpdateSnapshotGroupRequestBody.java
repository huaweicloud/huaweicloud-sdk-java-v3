package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSnapshotGroupRequestBody
 */
public class UpdateSnapshotGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group")

    private UpdateSnapshotGroupResponseBody snapshotGroup;

    public UpdateSnapshotGroupRequestBody withSnapshotGroup(UpdateSnapshotGroupResponseBody snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
        return this;
    }

    public UpdateSnapshotGroupRequestBody withSnapshotGroup(
        Consumer<UpdateSnapshotGroupResponseBody> snapshotGroupSetter) {
        if (this.snapshotGroup == null) {
            this.snapshotGroup = new UpdateSnapshotGroupResponseBody();
            snapshotGroupSetter.accept(this.snapshotGroup);
        }

        return this;
    }

    /**
     * Get snapshotGroup
     * @return snapshotGroup
     */
    public UpdateSnapshotGroupResponseBody getSnapshotGroup() {
        return snapshotGroup;
    }

    public void setSnapshotGroup(UpdateSnapshotGroupResponseBody snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSnapshotGroupRequestBody that = (UpdateSnapshotGroupRequestBody) obj;
        return Objects.equals(this.snapshotGroup, that.snapshotGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotGroupRequestBody {\n");
        sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
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
