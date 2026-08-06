package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowExportTaskInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private BigDecimal createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private BigDecimal endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_line_num")

    private BigDecimal exportLineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_record_time")

    private BigDecimal lastRecordTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private BigDecimal startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private BigDecimal taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private Integer taskStatus;

    public ShowExportTaskInfoResponse withCreateAt(BigDecimal createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public BigDecimal getCreateAt() {
        return createAt;
    }

    public void setCreateAt(BigDecimal createAt) {
        this.createAt = createAt;
    }

    public ShowExportTaskInfoResponse withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * 下载链接
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ShowExportTaskInfoResponse withEndTime(BigDecimal endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public BigDecimal getEndTime() {
        return endTime;
    }

    public void setEndTime(BigDecimal endTime) {
        this.endTime = endTime;
    }

    public ShowExportTaskInfoResponse withExportLineNum(BigDecimal exportLineNum) {
        this.exportLineNum = exportLineNum;
        return this;
    }

    /**
     * 导出条数
     * @return exportLineNum
     */
    public BigDecimal getExportLineNum() {
        return exportLineNum;
    }

    public void setExportLineNum(BigDecimal exportLineNum) {
        this.exportLineNum = exportLineNum;
    }

    public ShowExportTaskInfoResponse withInstanceId(String instanceId) {
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

    public ShowExportTaskInfoResponse withLastRecordTime(BigDecimal lastRecordTime) {
        this.lastRecordTime = lastRecordTime;
        return this;
    }

    /**
     * 最新SQL执行时间
     * @return lastRecordTime
     */
    public BigDecimal getLastRecordTime() {
        return lastRecordTime;
    }

    public void setLastRecordTime(BigDecimal lastRecordTime) {
        this.lastRecordTime = lastRecordTime;
    }

    public ShowExportTaskInfoResponse withStartTime(BigDecimal startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public BigDecimal getStartTime() {
        return startTime;
    }

    public void setStartTime(BigDecimal startTime) {
        this.startTime = startTime;
    }

    public ShowExportTaskInfoResponse withTaskId(BigDecimal taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public BigDecimal getTaskId() {
        return taskId;
    }

    public void setTaskId(BigDecimal taskId) {
        this.taskId = taskId;
    }

    public ShowExportTaskInfoResponse withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExportTaskInfoResponse that = (ShowExportTaskInfoResponse) obj;
        return Objects.equals(this.createAt, that.createAt) && Objects.equals(this.downloadUrl, that.downloadUrl)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.exportLineNum, that.exportLineNum)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.lastRecordTime, that.lastRecordTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createAt,
            downloadUrl,
            endTime,
            exportLineNum,
            instanceId,
            lastRecordTime,
            startTime,
            taskId,
            taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExportTaskInfoResponse {\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    exportLineNum: ").append(toIndentedString(exportLineNum)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    lastRecordTime: ").append(toIndentedString(lastRecordTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
