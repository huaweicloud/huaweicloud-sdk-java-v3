package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateClusterMasterSnapshotResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private SnapshotCluserResponseMetadata metadata;

    public CreateClusterMasterSnapshotResponse withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 任务ID
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public CreateClusterMasterSnapshotResponse withMetadata(SnapshotCluserResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateClusterMasterSnapshotResponse withMetadata(Consumer<SnapshotCluserResponseMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new SnapshotCluserResponseMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public SnapshotCluserResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(SnapshotCluserResponseMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterMasterSnapshotResponse that = (CreateClusterMasterSnapshotResponse) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterMasterSnapshotResponse {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
