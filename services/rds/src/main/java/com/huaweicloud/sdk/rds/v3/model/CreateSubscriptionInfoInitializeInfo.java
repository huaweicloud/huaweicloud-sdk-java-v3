package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 初始化信息。
 */
public class CreateSubscriptionInfoInitializeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_source")

    private String fileSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite_restore")

    private Boolean overwriteRestore;

    public CreateSubscriptionInfoInitializeInfo withFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }

    /**
     * 初始化使用的文件源，仅支持OBS或BACKUP。
     * @return fileSource
     */
    public String getFileSource() {
        return fileSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    public CreateSubscriptionInfoInitializeInfo withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 使用备份文件初始化的备份文件ID。
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public CreateSubscriptionInfoInitializeInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 使用OBS内备份文件恢复的bucket名称。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public CreateSubscriptionInfoInitializeInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * OBS桶内备份文件的路径。
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public CreateSubscriptionInfoInitializeInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * OBS桶内备份文件的名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateSubscriptionInfoInitializeInfo withOverwriteRestore(Boolean overwriteRestore) {
        this.overwriteRestore = overwriteRestore;
        return this;
    }

    /**
     * 是否使用备份文件对订阅库进行覆盖还原。
     * @return overwriteRestore
     */
    public Boolean getOverwriteRestore() {
        return overwriteRestore;
    }

    public void setOverwriteRestore(Boolean overwriteRestore) {
        this.overwriteRestore = overwriteRestore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionInfoInitializeInfo that = (CreateSubscriptionInfoInitializeInfo) obj;
        return Objects.equals(this.fileSource, that.fileSource) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.overwriteRestore, that.overwriteRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSource, backupId, bucketName, filePath, fileName, overwriteRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionInfoInitializeInfo {\n");
        sb.append("    fileSource: ").append(toIndentedString(fileSource)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    overwriteRestore: ").append(toIndentedString(overwriteRestore)).append("\n");
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
