package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteWorkloadQueueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_queue_name")

    private String workloadQueueName;

    public DeleteWorkloadQueueRequest withClusterId(String clusterId) {
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

    public DeleteWorkloadQueueRequest withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * 逻辑集群名称。逻辑集群模式下该字段必填。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public DeleteWorkloadQueueRequest withWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
        return this;
    }

    /**
     * 工作负载队列名称。
     * @return workloadQueueName
     */
    public String getWorkloadQueueName() {
        return workloadQueueName;
    }

    public void setWorkloadQueueName(String workloadQueueName) {
        this.workloadQueueName = workloadQueueName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteWorkloadQueueRequest that = (DeleteWorkloadQueueRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.workloadQueueName, that.workloadQueueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, logicalClusterName, workloadQueueName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteWorkloadQueueRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    workloadQueueName: ").append(toIndentedString(workloadQueueName)).append("\n");
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
