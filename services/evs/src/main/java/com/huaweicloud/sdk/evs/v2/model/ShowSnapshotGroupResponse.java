package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSnapshotGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_group")

    private SnapshotGroupDetail snapshotGroup;

    public ShowSnapshotGroupResponse withSnapshotGroup(SnapshotGroupDetail snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
        return this;
    }

    public ShowSnapshotGroupResponse withSnapshotGroup(Consumer<SnapshotGroupDetail> snapshotGroupSetter) {
        if (this.snapshotGroup == null) {
            this.snapshotGroup = new SnapshotGroupDetail();
            snapshotGroupSetter.accept(this.snapshotGroup);
        }

        return this;
    }

    /**
     * Get snapshotGroup
     * @return snapshotGroup
     */
    public SnapshotGroupDetail getSnapshotGroup() {
        return snapshotGroup;
    }

    public void setSnapshotGroup(SnapshotGroupDetail snapshotGroup) {
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
        ShowSnapshotGroupResponse that = (ShowSnapshotGroupResponse) obj;
        return Objects.equals(this.snapshotGroup, that.snapshotGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSnapshotGroupResponse {\n");
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
