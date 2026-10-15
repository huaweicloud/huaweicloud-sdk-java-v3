package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportFileObsUrisResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_report_obs_files")

    private List<ExportReportObsTmpFileUrlResp> exportReportObsFiles = null;

    public ShowReportFileObsUrisResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 可下载文件总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowReportFileObsUrisResponse withExportReportObsFiles(
        List<ExportReportObsTmpFileUrlResp> exportReportObsFiles) {
        this.exportReportObsFiles = exportReportObsFiles;
        return this;
    }

    public ShowReportFileObsUrisResponse addExportReportObsFilesItem(
        ExportReportObsTmpFileUrlResp exportReportObsFilesItem) {
        if (this.exportReportObsFiles == null) {
            this.exportReportObsFiles = new ArrayList<>();
        }
        this.exportReportObsFiles.add(exportReportObsFilesItem);
        return this;
    }

    public ShowReportFileObsUrisResponse withExportReportObsFiles(
        Consumer<List<ExportReportObsTmpFileUrlResp>> exportReportObsFilesSetter) {
        if (this.exportReportObsFiles == null) {
            this.exportReportObsFiles = new ArrayList<>();
        }
        exportReportObsFilesSetter.accept(this.exportReportObsFiles);
        return this;
    }

    /**
     * 可下载的文件列表
     * @return exportReportObsFiles
     */
    public List<ExportReportObsTmpFileUrlResp> getExportReportObsFiles() {
        return exportReportObsFiles;
    }

    public void setExportReportObsFiles(List<ExportReportObsTmpFileUrlResp> exportReportObsFiles) {
        this.exportReportObsFiles = exportReportObsFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReportFileObsUrisResponse that = (ShowReportFileObsUrisResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.exportReportObsFiles, that.exportReportObsFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, exportReportObsFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportFileObsUrisResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    exportReportObsFiles: ").append(toIndentedString(exportReportObsFiles)).append("\n");
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
