package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 慢日志Top信息
 */
public class SlowLogArchiveDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_start_time")

    private Long logStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_end_time")

    private Long logEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Long fileSize;

    public SlowLogArchiveDto withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SlowLogArchiveDto withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SlowLogArchiveDto withLogStartTime(Long logStartTime) {
        this.logStartTime = logStartTime;
        return this;
    }

    /**
     * 日志开始时间
     * @return logStartTime
     */
    public Long getLogStartTime() {
        return logStartTime;
    }

    public void setLogStartTime(Long logStartTime) {
        this.logStartTime = logStartTime;
    }

    public SlowLogArchiveDto withLogEndTime(Long logEndTime) {
        this.logEndTime = logEndTime;
        return this;
    }

    /**
     * 日志结束时间
     * @return logEndTime
     */
    public Long getLogEndTime() {
        return logEndTime;
    }

    public void setLogEndTime(Long logEndTime) {
        this.logEndTime = logEndTime;
    }

    public SlowLogArchiveDto withFileSize(Long fileSize) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogArchiveDto that = (SlowLogArchiveDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.logStartTime, that.logStartTime) && Objects.equals(this.logEndTime, that.logEndTime)
            && Objects.equals(this.fileSize, that.fileSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, logStartTime, logEndTime, fileSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogArchiveDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    logStartTime: ").append(toIndentedString(logStartTime)).append("\n");
        sb.append("    logEndTime: ").append(toIndentedString(logEndTime)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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
