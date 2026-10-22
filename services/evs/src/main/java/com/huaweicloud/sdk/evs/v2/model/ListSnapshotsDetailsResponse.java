package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSnapshotsDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private List<SnapshotDetailV5> snapshots = null;

    public ListSnapshotsDetailsResponse withSnapshots(List<SnapshotDetailV5> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public ListSnapshotsDetailsResponse addSnapshotsItem(SnapshotDetailV5 snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListSnapshotsDetailsResponse withSnapshots(Consumer<List<SnapshotDetailV5>> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * **参数解释** 快照信息。 **取值范围** 不涉及。
     * @return snapshots
     */
    public List<SnapshotDetailV5> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<SnapshotDetailV5> snapshots) {
        this.snapshots = snapshots;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSnapshotsDetailsResponse that = (ListSnapshotsDetailsResponse) obj;
        return Objects.equals(this.snapshots, that.snapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsDetailsResponse {\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
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
