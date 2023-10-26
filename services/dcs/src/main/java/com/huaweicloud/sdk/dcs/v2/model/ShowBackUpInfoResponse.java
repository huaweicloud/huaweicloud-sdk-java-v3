package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBackUpInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_additional_backup")

    private Boolean isAdditionalBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_period")

    private String backupPeriod;

    public ShowBackUpInfoResponse withIsAdditionalBackup(Boolean isAdditionalBackup) {
        this.isAdditionalBackup = isAdditionalBackup;
        return this;
    }

    /**
     * 是否备份
     * @return isAdditionalBackup
     */
    public Boolean getIsAdditionalBackup() {
        return isAdditionalBackup;
    }

    public void setIsAdditionalBackup(Boolean isAdditionalBackup) {
        this.isAdditionalBackup = isAdditionalBackup;
    }

    public ShowBackUpInfoResponse withNodeId(String nodeId) {
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

    public ShowBackUpInfoResponse withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * 节点IP
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public ShowBackUpInfoResponse withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 节点角色
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public ShowBackUpInfoResponse withBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
        return this;
    }

    /**
     * 备份周期
     * @return backupPeriod
     */
    public String getBackupPeriod() {
        return backupPeriod;
    }

    public void setBackupPeriod(String backupPeriod) {
        this.backupPeriod = backupPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBackUpInfoResponse that = (ShowBackUpInfoResponse) obj;
        return Objects.equals(this.isAdditionalBackup, that.isAdditionalBackup)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeIp, that.nodeIp)
            && Objects.equals(this.nodeRole, that.nodeRole) && Objects.equals(this.backupPeriod, that.backupPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdditionalBackup, nodeId, nodeIp, nodeRole, backupPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBackUpInfoResponse {\n");
        sb.append("    isAdditionalBackup: ").append(toIndentedString(isAdditionalBackup)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    backupPeriod: ").append(toIndentedString(backupPeriod)).append("\n");
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
