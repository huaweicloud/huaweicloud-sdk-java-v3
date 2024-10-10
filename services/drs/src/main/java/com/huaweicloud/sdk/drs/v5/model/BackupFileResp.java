package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备份文件信息体。
 */
public class BackupFileResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private String fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_last_modify")

    private String fileLastModify;

    public BackupFileResp withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public BackupFileResp withFileSize(String fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 备份文件大小。
     * @return fileSize
     */
    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public BackupFileResp withFileLastModify(String fileLastModify) {
        this.fileLastModify = fileLastModify;
        return this;
    }

    /**
     * 备份文件最近修改时间。
     * @return fileLastModify
     */
    public String getFileLastModify() {
        return fileLastModify;
    }

    public void setFileLastModify(String fileLastModify) {
        this.fileLastModify = fileLastModify;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupFileResp that = (BackupFileResp) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileSize, that.fileSize)
            && Objects.equals(this.fileLastModify, that.fileLastModify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, fileSize, fileLastModify);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupFileResp {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    fileLastModify: ").append(toIndentedString(fileLastModify)).append("\n");
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
