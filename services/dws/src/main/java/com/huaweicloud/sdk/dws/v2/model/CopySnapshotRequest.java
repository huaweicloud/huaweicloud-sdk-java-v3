package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CopySnapshotRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_id")

    private String snapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private LinkCopyReq body;

    public CopySnapshotRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * 快照ID
     * @return snapshotId
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public CopySnapshotRequest withBody(LinkCopyReq body) {
        this.body = body;
        return this;
    }

    public CopySnapshotRequest withBody(Consumer<LinkCopyReq> bodySetter) {
        if (this.body == null) {
            this.body = new LinkCopyReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public LinkCopyReq getBody() {
        return body;
    }

    public void setBody(LinkCopyReq body) {
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
        CopySnapshotRequest copySnapshotRequest = (CopySnapshotRequest) o;
        return Objects.equals(this.snapshotId, copySnapshotRequest.snapshotId)
            && Objects.equals(this.body, copySnapshotRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snapshotId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopySnapshotRequest {\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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
