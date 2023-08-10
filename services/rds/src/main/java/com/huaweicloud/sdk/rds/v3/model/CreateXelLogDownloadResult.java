package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateXelLogDownloadResult
 */
public class CreateXelLogDownloadResult {

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
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public CreateXelLogDownloadResult withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 下载文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateXelLogDownloadResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 生成链接的生成状态。FINISH，表示下载链接已经生成完成。EXPORTING，，表示正在生成文件。FAILED，表示存在日志文件准备失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CreateXelLogDownloadResult withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 日志大小，单位：KB
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public CreateXelLogDownloadResult withFileLink(String fileLink) {
        this.fileLink = fileLink;
        return this;
    }

    /**
     * 下载链接,链接的生成状态为EXPORTING，或者FAILED不予返回
     * @return fileLink
     */
    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public CreateXelLogDownloadResult withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 生成时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public CreateXelLogDownloadResult withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateXelLogDownloadResult that = (CreateXelLogDownloadResult) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.fileLink, that.fileLink)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, status, fileSize, fileLink, createAt, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateXelLogDownloadResult {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLink: ").append(toIndentedString(fileLink)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
