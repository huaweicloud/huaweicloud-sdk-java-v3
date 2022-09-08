package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupSyncRespBody
 */
public class BackupSyncRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log_id")

    private String operationLogId;

    public BackupSyncRespBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份副本ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public BackupSyncRespBody withOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
        return this;
    }

    /**
     * 同步任务ID
     * @return operationLogId
     */
    public String getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupSyncRespBody backupSyncRespBody = (BackupSyncRespBody) o;
        return Objects.equals(this.backupId, backupSyncRespBody.backupId)
            && Objects.equals(this.operationLogId, backupSyncRespBody.operationLogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupId, operationLogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupSyncRespBody {\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    operationLogId: ").append(toIndentedString(operationLogId)).append("\n");
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
