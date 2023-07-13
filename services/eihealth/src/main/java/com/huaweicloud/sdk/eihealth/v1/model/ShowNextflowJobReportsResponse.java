package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowNextflowJobReportsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_files")

    private List<NextflowJobReportFile> reportFiles = null;

    public ShowNextflowJobReportsResponse withReportFiles(List<NextflowJobReportFile> reportFiles) {
        this.reportFiles = reportFiles;
        return this;
    }

    public ShowNextflowJobReportsResponse addReportFilesItem(NextflowJobReportFile reportFilesItem) {
        if (this.reportFiles == null) {
            this.reportFiles = new ArrayList<>();
        }
        this.reportFiles.add(reportFilesItem);
        return this;
    }

    public ShowNextflowJobReportsResponse withReportFiles(Consumer<List<NextflowJobReportFile>> reportFilesSetter) {
        if (this.reportFiles == null) {
            this.reportFiles = new ArrayList<>();
        }
        reportFilesSetter.accept(this.reportFiles);
        return this;
    }

    /**
     * 作业报告文件列表
     * @return reportFiles
     */
    public List<NextflowJobReportFile> getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(List<NextflowJobReportFile> reportFiles) {
        this.reportFiles = reportFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNextflowJobReportsResponse that = (ShowNextflowJobReportsResponse) obj;
        return Objects.equals(this.reportFiles, that.reportFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNextflowJobReportsResponse {\n");
        sb.append("    reportFiles: ").append(toIndentedString(reportFiles)).append("\n");
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
