package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份迁移任务恢复目标RDS for SQL Server实例信息。
 */
public class BackupJobEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instance_id")

    private String targetInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ms_file_stream_status")

    private String msFileStreamStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    public BackupJobEndpointInfo withTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }

    /**
     * 备份迁移任务恢复目标RDS for SQL Server实例ID。
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return targetInstanceId;
    }

    public void setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
    }

    public BackupJobEndpointInfo withMsFileStreamStatus(String msFileStreamStatus) {
        this.msFileStreamStatus = msFileStreamStatus;
        return this;
    }

    /**
     * 目标实例是否开启FileStream模式。可通过RDS for SQL Server详情接口获取。
     * @return msFileStreamStatus
     */
    public String getMsFileStreamStatus() {
        return msFileStreamStatus;
    }

    public void setMsFileStreamStatus(String msFileStreamStatus) {
        this.msFileStreamStatus = msFileStreamStatus;
    }

    public BackupJobEndpointInfo withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * RDS for SQL Server备份文件的文件ID，通过RDS全量恢复时必填。可通过云数据库RDS备份管理页面获取。
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupJobEndpointInfo that = (BackupJobEndpointInfo) obj;
        return Objects.equals(this.targetInstanceId, that.targetInstanceId)
            && Objects.equals(this.msFileStreamStatus, that.msFileStreamStatus)
            && Objects.equals(this.fileId, that.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetInstanceId, msFileStreamStatus, fileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupJobEndpointInfo {\n");
        sb.append("    targetInstanceId: ").append(toIndentedString(targetInstanceId)).append("\n");
        sb.append("    msFileStreamStatus: ").append(toIndentedString(msFileStreamStatus)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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
