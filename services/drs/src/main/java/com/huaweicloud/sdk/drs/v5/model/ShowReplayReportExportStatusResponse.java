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
public class ShowReplayReportExportStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_status")

    private String exportStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_count")

    private Long currentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_percentage")

    private Integer progressPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uploaded_file_names")

    private List<String> uploadedFileNames = null;

    public ShowReplayReportExportStatusResponse withExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }

    /**
     * 导出状态。取值范围： - EXPORTING ：导出中 - EXPORT_COMPLETE ：导出完成 - EXPORT_COMMON_FAILED ：导出失败
     * @return exportStatus
     */
    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public ShowReplayReportExportStatusResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowReplayReportExportStatusResponse withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 导出的sql文件类型。取值范围： - abnormal_sql ：异常sql列表 - error_sql_detail ：异常sql详情 - slow_sql ：慢sql列表 - slow_sql_detail ： 慢sql详情
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ShowReplayReportExportStatusResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ShowReplayReportExportStatusResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 导出的数据总量
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowReplayReportExportStatusResponse withCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
        return this;
    }

    /**
     * 当前已经处理数据量
     * @return currentCount
     */
    public Long getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(Long currentCount) {
        this.currentCount = currentCount;
    }

    public ShowReplayReportExportStatusResponse withProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
        return this;
    }

    /**
     * 任务进度百分数
     * @return progressPercentage
     */
    public Integer getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public ShowReplayReportExportStatusResponse withUploadedFileNames(List<String> uploadedFileNames) {
        this.uploadedFileNames = uploadedFileNames;
        return this;
    }

    public ShowReplayReportExportStatusResponse addUploadedFileNamesItem(String uploadedFileNamesItem) {
        if (this.uploadedFileNames == null) {
            this.uploadedFileNames = new ArrayList<>();
        }
        this.uploadedFileNames.add(uploadedFileNamesItem);
        return this;
    }

    public ShowReplayReportExportStatusResponse withUploadedFileNames(Consumer<List<String>> uploadedFileNamesSetter) {
        if (this.uploadedFileNames == null) {
            this.uploadedFileNames = new ArrayList<>();
        }
        uploadedFileNamesSetter.accept(this.uploadedFileNames);
        return this;
    }

    /**
     * 已经上传到obs的文件名称
     * @return uploadedFileNames
     */
    public List<String> getUploadedFileNames() {
        return uploadedFileNames;
    }

    public void setUploadedFileNames(List<String> uploadedFileNames) {
        this.uploadedFileNames = uploadedFileNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowReplayReportExportStatusResponse that = (ShowReplayReportExportStatusResponse) obj;
        return Objects.equals(this.exportStatus, that.exportStatus) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.failedReason, that.failedReason)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.currentCount, that.currentCount)
            && Objects.equals(this.progressPercentage, that.progressPercentage)
            && Objects.equals(this.uploadedFileNames, that.uploadedFileNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportStatus,
            jobId,
            fileType,
            failedReason,
            totalCount,
            currentCount,
            progressPercentage,
            uploadedFileNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReplayReportExportStatusResponse {\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
        sb.append("    progressPercentage: ").append(toIndentedString(progressPercentage)).append("\n");
        sb.append("    uploadedFileNames: ").append(toIndentedString(uploadedFileNames)).append("\n");
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
