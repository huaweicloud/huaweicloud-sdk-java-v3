package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteLogicalClusterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_id")

    private String logicalClusterId;

    public DeleteLogicalClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 指定待删除集群的ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteLogicalClusterRequest withLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
        return this;
    }

    /**
     * 指定待删除逻辑集群的ID
     * @return logicalClusterId
     */
    public String getLogicalClusterId() {
        return logicalClusterId;
    }

    public void setLogicalClusterId(String logicalClusterId) {
        this.logicalClusterId = logicalClusterId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteLogicalClusterRequest that = (DeleteLogicalClusterRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.logicalClusterId, that.logicalClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, logicalClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteLogicalClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    logicalClusterId: ").append(toIndentedString(logicalClusterId)).append("\n");
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
