package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class RestoreSnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RestoreSnapshotReq body;

    public RestoreSnapshotRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 快照所属的集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RestoreSnapshotRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /** 快照ID。
     * 
     * @return snapshotId */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public RestoreSnapshotRequest withBody(RestoreSnapshotReq body) {
        this.body = body;
        return this;
    }

    public RestoreSnapshotRequest withBody(Consumer<RestoreSnapshotReq> bodySetter) {
        if (this.body == null) {
            this.body = new RestoreSnapshotReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public RestoreSnapshotReq getBody() {
        return body;
    }

    public void setBody(RestoreSnapshotReq body) {
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
        RestoreSnapshotRequest restoreSnapshotRequest = (RestoreSnapshotRequest) o;
        return Objects.equals(this.clusterId, restoreSnapshotRequest.clusterId)
            && Objects.equals(this.snapshotId, restoreSnapshotRequest.snapshotId)
            && Objects.equals(this.body, restoreSnapshotRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, snapshotId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreSnapshotRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
