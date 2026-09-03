package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * binlog文件信息
 */
public class BinlogFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_info")

    private BinlogParseTaskInfo taskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public BinlogFileInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BinlogFileInfo withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 备份ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public BinlogFileInfo withFileSize(Long fileSize) {
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

    public BinlogFileInfo withTaskInfo(BinlogParseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
        return this;
    }

    public BinlogFileInfo withTaskInfo(Consumer<BinlogParseTaskInfo> taskInfoSetter) {
        if (this.taskInfo == null) {
            this.taskInfo = new BinlogParseTaskInfo();
            taskInfoSetter.accept(this.taskInfo);
        }

        return this;
    }

    /**
     * Get taskInfo
     * @return taskInfo
     */
    public BinlogParseTaskInfo getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(BinlogParseTaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    public BinlogFileInfo withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * binlog备份开始时间
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public BinlogFileInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * binlog备份结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinlogFileInfo that = (BinlogFileInfo) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.backupId, that.backupId)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.taskInfo, that.taskInfo)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, backupId, fileSize, taskInfo, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BinlogFileInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
