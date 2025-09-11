package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * BackupInfo
 */
public class BackupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_task_fail_reason")

    private String backupTaskFailReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_time")

    private OffsetDateTime backupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size_unit")

    private String fileSizeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private Integer percentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_task_fail_reason")

    private String restoreTaskFailReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    public BackupInfo withBackupTaskFailReason(String backupTaskFailReason) {
        this.backupTaskFailReason = backupTaskFailReason;
        return this;
    }

    /**
     * 备份失败原因
     * @return backupTaskFailReason
     */
    public String getBackupTaskFailReason() {
        return backupTaskFailReason;
    }

    public void setBackupTaskFailReason(String backupTaskFailReason) {
        this.backupTaskFailReason = backupTaskFailReason;
    }

    public BackupInfo withBackupTime(OffsetDateTime backupTime) {
        this.backupTime = backupTime;
        return this;
    }

    /**
     * 备份时间,yyyy-MM-dd HH:mm:ss
     * @return backupTime
     */
    public OffsetDateTime getBackupTime() {
        return backupTime;
    }

    public void setBackupTime(OffsetDateTime backupTime) {
        this.backupTime = backupTime;
    }

    public BackupInfo withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 标记删除
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BackupInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 备份结束时间,yyyy-MM-dd HH:mm:ss
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public BackupInfo withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * @return fileSize
     */
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public BackupInfo withFileSizeUnit(String fileSizeUnit) {
        this.fileSizeUnit = fileSizeUnit;
        return this;
    }

    /**
     * 文件大小单位 - Byte - KB - MB - GB
     * @return fileSizeUnit
     */
    public String getFileSizeUnit() {
        return fileSizeUnit;
    }

    public void setFileSizeUnit(String fileSizeUnit) {
        this.fileSizeUnit = fileSizeUnit;
    }

    public BackupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 备份ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BackupInfo withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 备份方式 - AUTO：自动备份
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BackupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 备份名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BackupInfo withPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 备份进度
     * @return percentage
     */
    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    public BackupInfo withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 进度 - CLEAN_AFTER_FAILED: 清理失败 - DELETING：删除中 - DELETED：已删除 - DELETE_FAIL：删除失败 - RESTORING_WAITING：恢复等待中 - RESTORING：恢复中 - RESTORED：已恢复 - RESTORE_FAIL：恢复失败 - BACKUP_WAITING：等待备份 - FILE_UPLOAD_WAITING：等待上传备份文件 - FILE_UPLOADING：上传中 - AUTO_BACKUPING：自动备份中 - AUTO_BACKUPED：自动备份结束 - AUTO_BACKUP_FAIL：自动备份失败 - MANUAL_BACKUPING：手动备份中 - MANUAL_BACKUPED：手动备份结束 - MANUAL_BACKUP_FAIL：手动备份失败 - ISAP_WAITING：ISAP等待备份 - ISAP_BACKUPING：ISAP备份中 - ISAP_BACKUPED：ISAP备份成功 - ISAP_BACKUP_FAIL：ISAP备份失败 - ISAP_FILE_UPLOAD_WAITING：ISAP等待上传备份文件 - ISAP_FILE_UPLOADING：ISAP上传中
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public BackupInfo withRestoreTaskFailReason(String restoreTaskFailReason) {
        this.restoreTaskFailReason = restoreTaskFailReason;
        return this;
    }

    /**
     * 还原失败原因
     * @return restoreTaskFailReason
     */
    public String getRestoreTaskFailReason() {
        return restoreTaskFailReason;
    }

    public void setRestoreTaskFailReason(String restoreTaskFailReason) {
        this.restoreTaskFailReason = restoreTaskFailReason;
    }

    public BackupInfo withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * 文件SHA256
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public BackupInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 备份开始时间,yyyy-MM-dd HH:mm:ss
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupInfo that = (BackupInfo) obj;
        return Objects.equals(this.backupTaskFailReason, that.backupTaskFailReason)
            && Objects.equals(this.backupTime, that.backupTime) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileSizeUnit, that.fileSizeUnit) && Objects.equals(this.id, that.id)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.name, that.name)
            && Objects.equals(this.percentage, that.percentage) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.restoreTaskFailReason, that.restoreTaskFailReason)
            && Objects.equals(this.sha256, that.sha256) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupTaskFailReason,
            backupTime,
            deleted,
            endTime,
            fileSize,
            fileSizeUnit,
            id,
            mode,
            name,
            percentage,
            progress,
            restoreTaskFailReason,
            sha256,
            startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupInfo {\n");
        sb.append("    backupTaskFailReason: ").append(toIndentedString(backupTaskFailReason)).append("\n");
        sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileSizeUnit: ").append(toIndentedString(fileSizeUnit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    restoreTaskFailReason: ").append(toIndentedString(restoreTaskFailReason)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
