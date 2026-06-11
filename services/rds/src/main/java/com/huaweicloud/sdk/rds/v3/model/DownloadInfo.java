package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 下载信息
 */
public class DownloadInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_id")

    private String workflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link")

    private String fileLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link_expiration_time")

    private Long fileLinkExpirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public DownloadInfo withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * 参数解释： 任务ID。 取值范围： 不涉及。
     * @return workflowId
     */
    public String getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    public DownloadInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 参数解释： 生成的下载文件名。 取值范围： 不涉及。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public DownloadInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 参数解释： 当前链接的生成状态。 取值范围： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DownloadInfo withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 参数解释： 文件大小。单位Byte 取值范围： 不涉及。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public DownloadInfo withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * 参数解释： 下载链接。 取值范围： 不涉及。
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public DownloadInfo withFileLinkExpirationTime(Long fileLinkExpirationTime) {
        this.fileLinkExpirationTime = fileLinkExpirationTime;
        return this;
    }

    /**
     * 下载链接过期时间
     * @return fileLinkExpirationTime
     */
    public Long getFileLinkExpirationTime() {
        return fileLinkExpirationTime;
    }

    public void setFileLinkExpirationTime(Long fileLinkExpirationTime) {
        this.fileLinkExpirationTime = fileLinkExpirationTime;
    }

    public DownloadInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 参数解释： 开始时间。 格式为UTC时间戳。 取值范围： 不涉及。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DownloadInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 参数解释： 结束时间。 格式为UTC时间戳。 取值范围： 不涉及。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
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
        DownloadInfo that = (DownloadInfo) obj;
        return Objects.equals(this.workflowId, that.workflowId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileLink, that.fileLink)
            && Objects.equals(this.fileLinkExpirationTime, that.fileLinkExpirationTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workflowId, fileName, status, fileSize, fileLink, fileLinkExpirationTime, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadInfo {\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
        sb.append("    fileLinkExpirationTime: ").append(toIndentedString(fileLinkExpirationTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
