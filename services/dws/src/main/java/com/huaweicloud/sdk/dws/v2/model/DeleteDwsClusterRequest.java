package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteDwsClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_last_manual_backup")

    private String keepLastManualBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_eip_type")

    private String releaseEipType;

    public DeleteDwsClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteDwsClusterRequest withKeepLastManualBackup(String keepLastManualBackup) {
        this.keepLastManualBackup = keepLastManualBackup;
        return this;
    }

    /**
     * 集群需要保留的快照数
     * @return keepLastManualBackup
     */
    public String getKeepLastManualBackup() {
        return keepLastManualBackup;
    }

    public void setKeepLastManualBackup(String keepLastManualBackup) {
        this.keepLastManualBackup = keepLastManualBackup;
    }

    public DeleteDwsClusterRequest withReleaseEipType(String releaseEipType) {
        this.releaseEipType = releaseEipType;
        return this;
    }

    /**
     * 集群是否释放弹性公网IP，默认是NO_RELEASE不释放绑定的弹性公网IP，RELEASE_BINDING释放绑定的弹性公网IP
     * @return releaseEipType
     */
    public String getReleaseEipType() {
        return releaseEipType;
    }

    public void setReleaseEipType(String releaseEipType) {
        this.releaseEipType = releaseEipType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteDwsClusterRequest that = (DeleteDwsClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.keepLastManualBackup, that.keepLastManualBackup)
            && Objects.equals(this.releaseEipType, that.releaseEipType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, keepLastManualBackup, releaseEipType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDwsClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    keepLastManualBackup: ").append(toIndentedString(keepLastManualBackup)).append("\n");
        sb.append("    releaseEipType: ").append(toIndentedString(releaseEipType)).append("\n");
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
