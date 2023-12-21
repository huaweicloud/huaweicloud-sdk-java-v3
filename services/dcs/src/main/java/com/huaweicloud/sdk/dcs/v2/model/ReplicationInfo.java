package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ReplicationInfo
 */
public class ReplicationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_ip")

    private String replicationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_zone")

    private String availableZone;

    public ReplicationInfo withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 副本ID
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public ReplicationInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReplicationInfo withReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
        return this;
    }

    /**
     * 副本IP
     * @return replicationIp
     */
    public String getReplicationIp() {
        return replicationIp;
    }

    public void setReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
    }

    public ReplicationInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ReplicationInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ReplicationInfo withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    /**
     * 可用区
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationInfo that = (ReplicationInfo) obj;
        return Objects.equals(this.replicationId, that.replicationId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.replicationIp, that.replicationIp) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.availableZone, that.availableZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationId, nodeId, replicationIp, groupId, groupName, availableZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationInfo {\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    replicationIp: ").append(toIndentedString(replicationIp)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
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
