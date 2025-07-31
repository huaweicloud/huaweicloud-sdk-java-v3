package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件信息
 */
public class BatchUploadFilesResponseInfoFailFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    public BatchUploadFilesResponseInfoFailFileInfo withFileName(String fileName) {
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

    public BatchUploadFilesResponseInfoFailFileInfo withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUploadFilesResponseInfoFailFileInfo that = (BatchUploadFilesResponseInfoFailFileInfo) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.failReason, that.failReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, failReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUploadFilesResponseInfoFailFileInfo {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
