package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckpointReplicateRespbackups
 */
public class CheckpointReplicateRespbackups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_record_id")

    private String replicationRecordId;

    public CheckpointReplicateRespbackups withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 待复制的备份ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public CheckpointReplicateRespbackups withReplicationRecordId(String replicationRecordId) {
        this.replicationRecordId = replicationRecordId;
        return this;
    }

    /**
     * 复制记录ID
     * @return replicationRecordId
     */
    public String getReplicationRecordId() {
        return replicationRecordId;
    }

    public void setReplicationRecordId(String replicationRecordId) {
        this.replicationRecordId = replicationRecordId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckpointReplicateRespbackups that = (CheckpointReplicateRespbackups) obj;
        return Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.replicationRecordId, that.replicationRecordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, replicationRecordId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointReplicateRespbackups {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    replicationRecordId: ").append(toIndentedString(replicationRecordId)).append("\n");
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
