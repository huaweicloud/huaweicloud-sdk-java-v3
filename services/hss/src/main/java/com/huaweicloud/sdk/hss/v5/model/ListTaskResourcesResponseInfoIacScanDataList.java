package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 任务下的文件扫描详情信息
 */
public class ListTaskResourcesResponseInfoIacScanDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chart_name")

    private String chartName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ListTaskResourcesResponseInfoIacScanDataList withFileName(String fileName) {
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

    public ListTaskResourcesResponseInfoIacScanDataList withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * 文件类型，包含如下   - dockerfile：Dockerfile文件   - k8s_yaml：k8s yaml文件
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }

    /**
     * chart包名称
     * @return chartName
     */
    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * 文件ID，服务生成的文件唯一ID
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 文件大小
     * minimum: 0
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * 文件的扫描状态，包含如下：   - scanning：扫描中   - success：扫描成功   - failed：扫描失败
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 扫描失败的原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 扫描开始的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListTaskResourcesResponseInfoIacScanDataList withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 扫描结束的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTaskResourcesResponseInfoIacScanDataList that = (ListTaskResourcesResponseInfoIacScanDataList) obj;
        return Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.chartName, that.chartName) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.fileSize, that.fileSize) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fileName, fileType, chartName, fileId, fileSize, scanStatus, failedReason, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskResourcesResponseInfoIacScanDataList {\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    chartName: ").append(toIndentedString(chartName)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
