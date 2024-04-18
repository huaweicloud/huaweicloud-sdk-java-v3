package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceLogFile
 */
public class InstanceLogFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_link")

    private String fileLink;

    public InstanceLogFile withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 日志采集状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceLogFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 日志文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InstanceLogFile withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 日志开始时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public InstanceLogFile withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 日志结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public InstanceLogFile withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 日志文件大小，单位kb。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public InstanceLogFile withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * 日志文件下载链接。
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceLogFile that = (InstanceLogFile) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileLink, that.fileLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, fileName, startTime, endTime, fileSize, fileLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceLogFile {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
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
