package com.huaweicloud.sdk.dcs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 副本列表
 */
public class InstanceReplicationListInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_role")
    
    private String replicationRole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_ip")
    
    private String replicationIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_replication")
    
    private Boolean isReplication;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication_id")
    
    private String replicationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;

    public InstanceReplicationListInfo withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    


    /**
     * 副本角色，取值有： - master：表示主节点。 - slave：表示从节点。 
     * @return replicationRole
     */
    public String getReplicationRole() {
        return replicationRole;
    }

    public void setReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
    }

    public InstanceReplicationListInfo withReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
        return this;
    }

    


    /**
     * 副本IP。
     * @return replicationIp
     */
    public String getReplicationIp() {
        return replicationIp;
    }

    public void setReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
    }

    public InstanceReplicationListInfo withIsReplication(Boolean isReplication) {
        this.isReplication = isReplication;
        return this;
    }

    


    /**
     * 是否是新加副本。
     * @return isReplication
     */
    public Boolean getIsReplication() {
        return isReplication;
    }

    public void setIsReplication(Boolean isReplication) {
        this.isReplication = isReplication;
    }

    public InstanceReplicationListInfo withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    


    /**
     * 副本id。
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public InstanceReplicationListInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * 节点id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public InstanceReplicationListInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 副本状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceReplicationListInfo instanceReplicationListInfo = (InstanceReplicationListInfo) o;
        return Objects.equals(this.replicationRole, instanceReplicationListInfo.replicationRole) &&
            Objects.equals(this.replicationIp, instanceReplicationListInfo.replicationIp) &&
            Objects.equals(this.isReplication, instanceReplicationListInfo.isReplication) &&
            Objects.equals(this.replicationId, instanceReplicationListInfo.replicationId) &&
            Objects.equals(this.nodeId, instanceReplicationListInfo.nodeId) &&
            Objects.equals(this.status, instanceReplicationListInfo.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(replicationRole, replicationIp, isReplication, replicationId, nodeId, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceReplicationListInfo {\n");
        sb.append("    replicationRole: ").append(toIndentedString(replicationRole)).append("\n");
        sb.append("    replicationIp: ").append(toIndentedString(replicationIp)).append("\n");
        sb.append("    isReplication: ").append(toIndentedString(isReplication)).append("\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

