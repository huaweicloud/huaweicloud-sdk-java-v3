package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * binlog导出任务详情
 */
public class BinlogExportTaskDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Long taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_record_time")

    private Long lastRecordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_line_num")

    private Long exportLineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_file_name")

    private String sourceFileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_task_id")

    private Long parseTaskId;

    public BinlogExportTaskDetailResp withTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public BinlogExportTaskDetailResp withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BinlogExportTaskDetailResp withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态。取值范围：0（初始化）、1（运行中）、2（部分成功）、3（成功）、4（失败）、-1（已删除）
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public BinlogExportTaskDetailResp withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public BinlogExportTaskDetailResp withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public BinlogExportTaskDetailResp withLastRecordTime(Long lastRecordTime) {
        this.lastRecordTime = lastRecordTime;
        return this;
    }

    /**
     * 最后记录时间
     * @return lastRecordTime
     */
    public Long getLastRecordTime() {
        return lastRecordTime;
    }

    public void setLastRecordTime(Long lastRecordTime) {
        this.lastRecordTime = lastRecordTime;
    }

    public BinlogExportTaskDetailResp withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 任务创建时间
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public BinlogExportTaskDetailResp withExportLineNum(Long exportLineNum) {
        this.exportLineNum = exportLineNum;
        return this;
    }

    /**
     * 导出行数
     * @return exportLineNum
     */
    public Long getExportLineNum() {
        return exportLineNum;
    }

    public void setExportLineNum(Long exportLineNum) {
        this.exportLineNum = exportLineNum;
    }

    public BinlogExportTaskDetailResp withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 文件下载地址
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public BinlogExportTaskDetailResp withSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
        return this;
    }

    /**
     * binlog源文件名
     * @return sourceFileName
     */
    public String getSourceFileName() {
        return sourceFileName;
    }

    public void setSourceFileName(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    public BinlogExportTaskDetailResp withParseTaskId(Long parseTaskId) {
        this.parseTaskId = parseTaskId;
        return this;
    }

    /**
     * 解析任务ID
     * @return parseTaskId
     */
    public Long getParseTaskId() {
        return parseTaskId;
    }

    public void setParseTaskId(Long parseTaskId) {
        this.parseTaskId = parseTaskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinlogExportTaskDetailResp that = (BinlogExportTaskDetailResp) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.lastRecordTime, that.lastRecordTime)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.exportLineNum, that.exportLineNum)
            && Objects.equals(this.downloadUrl, that.downloadUrl)
            && Objects.equals(this.sourceFileName, that.sourceFileName)
            && Objects.equals(this.parseTaskId, that.parseTaskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            instanceId,
            taskStatus,
            startTime,
            endTime,
            lastRecordTime,
            createAt,
            exportLineNum,
            downloadUrl,
            sourceFileName,
            parseTaskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BinlogExportTaskDetailResp {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastRecordTime: ").append(toIndentedString(lastRecordTime)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    exportLineNum: ").append(toIndentedString(exportLineNum)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    sourceFileName: ").append(toIndentedString(sourceFileName)).append("\n");
        sb.append("    parseTaskId: ").append(toIndentedString(parseTaskId)).append("\n");
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
