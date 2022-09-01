package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CheckpointReplicateRespbackups
 */
public class CheckpointReplicateRespbackups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    @JacksonXmlProperty(localName = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_record_id")

    @JacksonXmlProperty(localName = "replication_record_id")

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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointReplicateRespbackups checkpointReplicateRespbackups = (CheckpointReplicateRespbackups) o;
        return Objects.equals(this.backupId, checkpointReplicateRespbackups.backupId)
            && Objects.equals(this.replicationRecordId, checkpointReplicateRespbackups.replicationRecordId);
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
