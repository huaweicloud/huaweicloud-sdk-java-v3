package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdditionalBackupRequest
 */
public class AdditionalBackupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_additional_backup")

    private Boolean isAdditionalBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public AdditionalBackupRequest withIsAdditionalBackup(Boolean isAdditionalBackup) {
        this.isAdditionalBackup = isAdditionalBackup;
        return this;
    }

    /**
     * 是否高级备份
     * @return isAdditionalBackup
     */
    public Boolean getIsAdditionalBackup() {
        return isAdditionalBackup;
    }

    public void setIsAdditionalBackup(Boolean isAdditionalBackup) {
        this.isAdditionalBackup = isAdditionalBackup;
    }

    public AdditionalBackupRequest withNodeId(String nodeId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdditionalBackupRequest that = (AdditionalBackupRequest) obj;
        return Objects.equals(this.isAdditionalBackup, that.isAdditionalBackup)
            && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAdditionalBackup, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdditionalBackupRequest {\n");
        sb.append("    isAdditionalBackup: ").append(toIndentedString(isAdditionalBackup)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
