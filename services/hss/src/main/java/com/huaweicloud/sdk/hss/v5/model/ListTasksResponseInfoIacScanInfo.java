package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IAC安全扫描任务特有的任务信息
 */
public class ListTasksResponseInfoIacScanInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_file_num")

    private Integer scanFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_file_num")

    private Integer successFileNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_file_num")

    private Integer failedFileNum;

    public ListTasksResponseInfoIacScanInfo withFileType(String fileType) {
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

    public ListTasksResponseInfoIacScanInfo withScanFileNum(Integer scanFileNum) {
        this.scanFileNum = scanFileNum;
        return this;
    }

    /**
     * 当前任务扫描的文件总数
     * minimum: 1
     * maximum: 100
     * @return scanFileNum
     */
    public Integer getScanFileNum() {
        return scanFileNum;
    }

    public void setScanFileNum(Integer scanFileNum) {
        this.scanFileNum = scanFileNum;
    }

    public ListTasksResponseInfoIacScanInfo withSuccessFileNum(Integer successFileNum) {
        this.successFileNum = successFileNum;
        return this;
    }

    /**
     * 当前任务扫描成功的文件数量
     * minimum: 0
     * maximum: 100
     * @return successFileNum
     */
    public Integer getSuccessFileNum() {
        return successFileNum;
    }

    public void setSuccessFileNum(Integer successFileNum) {
        this.successFileNum = successFileNum;
    }

    public ListTasksResponseInfoIacScanInfo withFailedFileNum(Integer failedFileNum) {
        this.failedFileNum = failedFileNum;
        return this;
    }

    /**
     * 当前任务扫描失败的文件数量
     * minimum: 0
     * maximum: 100
     * @return failedFileNum
     */
    public Integer getFailedFileNum() {
        return failedFileNum;
    }

    public void setFailedFileNum(Integer failedFileNum) {
        this.failedFileNum = failedFileNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksResponseInfoIacScanInfo that = (ListTasksResponseInfoIacScanInfo) obj;
        return Objects.equals(this.fileType, that.fileType) && Objects.equals(this.scanFileNum, that.scanFileNum)
            && Objects.equals(this.successFileNum, that.successFileNum)
            && Objects.equals(this.failedFileNum, that.failedFileNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileType, scanFileNum, successFileNum, failedFileNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksResponseInfoIacScanInfo {\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    scanFileNum: ").append(toIndentedString(scanFileNum)).append("\n");
        sb.append("    successFileNum: ").append(toIndentedString(successFileNum)).append("\n");
        sb.append("    failedFileNum: ").append(toIndentedString(failedFileNum)).append("\n");
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
