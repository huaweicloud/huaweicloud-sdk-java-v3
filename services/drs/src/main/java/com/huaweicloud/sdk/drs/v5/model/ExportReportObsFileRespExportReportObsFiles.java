package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExportReportObsFileRespExportReportObsFiles
 */
public class ExportReportObsFileRespExportReportObsFiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private String lastModified;

    public ExportReportObsFileRespExportReportObsFiles withFileName(String fileName) {
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

    public ExportReportObsFileRespExportReportObsFiles withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间。
     * @return lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportReportObsFileRespExportReportObsFiles that = (ExportReportObsFileRespExportReportObsFiles) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.lastModified, that.lastModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, lastModified);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportReportObsFileRespExportReportObsFiles {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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
