package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件信息
 */
public class BatchUploadFilesResponseInfoSuccessFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    public BatchUploadFilesResponseInfoSuccessFileInfo withFileName(String fileName) {
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

    public BatchUploadFilesResponseInfoSuccessFileInfo withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件ID，服务对保存的文件生成的唯一ID
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
        BatchUploadFilesResponseInfoSuccessFileInfo that = (BatchUploadFilesResponseInfoSuccessFileInfo) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileId, that.fileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUploadFilesResponseInfoSuccessFileInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
