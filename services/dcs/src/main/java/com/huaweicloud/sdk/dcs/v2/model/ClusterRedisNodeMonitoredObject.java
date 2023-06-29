package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 监控对象结构
 */
public class ClusterRedisNodeMonitoredObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_instance_id")

    private String dcsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_cluster_redis_node")

    private String dcsClusterRedisNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ClusterRedisNodeMonitoredObject withDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
        return this;
    }

    /**
     * 测量对象ID，即节点的ID。
     * @return dcsInstanceId
     */
    public String getDcsInstanceId() {
        return dcsInstanceId;
    }

    public void setDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
    }

    public ClusterRedisNodeMonitoredObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测量对象名称，即节点IP。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClusterRedisNodeMonitoredObject withDcsClusterRedisNode(String dcsClusterRedisNode) {
        this.dcsClusterRedisNode = dcsClusterRedisNode;
        return this;
    }

    /**
     * 维度dcs_cluster_redis_node的测量对象的ID。
     * @return dcsClusterRedisNode
     */
    public String getDcsClusterRedisNode() {
        return dcsClusterRedisNode;
    }

    public void setDcsClusterRedisNode(String dcsClusterRedisNode) {
        this.dcsClusterRedisNode = dcsClusterRedisNode;
    }

    public ClusterRedisNodeMonitoredObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 测量对象状态，即节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterRedisNodeMonitoredObject that = (ClusterRedisNodeMonitoredObject) obj;
        return Objects.equals(this.dcsInstanceId, that.dcsInstanceId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.dcsClusterRedisNode, that.dcsClusterRedisNode)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcsInstanceId, name, dcsClusterRedisNode, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterRedisNodeMonitoredObject {\n");
        sb.append("    dcsInstanceId: ").append(toIndentedString(dcsInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dcsClusterRedisNode: ").append(toIndentedString(dcsClusterRedisNode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
