package com.huaweicloud.sdk.dws.v2.model;

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
public class ListClusterSnapshotsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshots")

    private List<ClusterSnapshots> snapshots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListClusterSnapshotsResponse withSnapshots(List<ClusterSnapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    public ListClusterSnapshotsResponse addSnapshotsItem(ClusterSnapshots snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListClusterSnapshotsResponse withSnapshots(Consumer<List<ClusterSnapshots>> snapshotsSetter) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * 快照对象列表。
     * @return snapshots
     */
    public List<ClusterSnapshots> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<ClusterSnapshots> snapshots) {
        this.snapshots = snapshots;
    }

    public ListClusterSnapshotsResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListClusterSnapshotsResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ListClusterSnapshotsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 快照对象列表总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClusterSnapshotsResponse listClusterSnapshotsResponse = (ListClusterSnapshotsResponse) o;
        return Objects.equals(this.snapshots, listClusterSnapshotsResponse.snapshots)
            && Objects.equals(this.projectId, listClusterSnapshotsResponse.projectId)
            && Objects.equals(this.clusterId, listClusterSnapshotsResponse.clusterId)
            && Objects.equals(this.count, listClusterSnapshotsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshots, projectId, clusterId, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterSnapshotsResponse {\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
