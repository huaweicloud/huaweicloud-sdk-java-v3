package com.huaweicloud.sdk.servicestage.v2.model;

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
public class ListInstanceSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private List<InstanceSnapshotView> snapshots = null;

    public ListInstanceSnapshotsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 快照总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListInstanceSnapshotsResponse withSnapshots(List<InstanceSnapshotView> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public ListInstanceSnapshotsResponse addSnapshotsItem(InstanceSnapshotView snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListInstanceSnapshotsResponse withSnapshots(Consumer<List<InstanceSnapshotView>> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * 快照列表。
     * @return snapshots
     */
    public List<InstanceSnapshotView> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<InstanceSnapshotView> snapshots) {
        this.snapshots = snapshots;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstanceSnapshotsResponse listInstanceSnapshotsResponse = (ListInstanceSnapshotsResponse) o;
        return Objects.equals(this.count, listInstanceSnapshotsResponse.count)
            && Objects.equals(this.snapshots, listInstanceSnapshotsResponse.snapshots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, snapshots);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceSnapshotsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
