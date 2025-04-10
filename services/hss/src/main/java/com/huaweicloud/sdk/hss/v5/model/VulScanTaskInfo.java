package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulScanTaskInfo
 */
public class VulScanTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_vul_types")

    private List<String> scanVulTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_host_num")

    private Integer scanningHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_host_num")

    private Integer successHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_host_num")

    private Integer failedHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    public VulScanTaskInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VulScanTaskInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * 扫描任务的类型，包含如下：   -manual : 手动扫描任务   -schedule : 定时扫描任务
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public VulScanTaskInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 扫描任务开始的时间
     * minimum: 0
     * maximum: 2147483647
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public VulScanTaskInfo withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 扫描任务结束的时间
     * minimum: 0
     * maximum: 2147483647
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public VulScanTaskInfo withScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
        return this;
    }

    public VulScanTaskInfo addScanVulTypesItem(String scanVulTypesItem) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        this.scanVulTypes.add(scanVulTypesItem);
        return this;
    }

    public VulScanTaskInfo withScanVulTypes(Consumer<List<String>> scanVulTypesSetter) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        scanVulTypesSetter.accept(this.scanVulTypes);
        return this;
    }

    /**
     * 该任务扫描的漏洞类型列表
     * @return scanVulTypes
     */
    public List<String> getScanVulTypes() {
        return scanVulTypes;
    }

    public void setScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
    }

    public VulScanTaskInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 扫描任务的执行状态，包含如下：   -running : 扫描中   -finished : 扫描完成
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulScanTaskInfo withScanningHostNum(Integer scanningHostNum) {
        this.scanningHostNum = scanningHostNum;
        return this;
    }

    /**
     * 该任务处于扫描中状态的主机数量
     * minimum: 0
     * maximum: 2147483647
     * @return scanningHostNum
     */
    public Integer getScanningHostNum() {
        return scanningHostNum;
    }

    public void setScanningHostNum(Integer scanningHostNum) {
        this.scanningHostNum = scanningHostNum;
    }

    public VulScanTaskInfo withSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
        return this;
    }

    /**
     * 该任务已扫描成功的主机数量
     * minimum: 0
     * maximum: 2147483647
     * @return successHostNum
     */
    public Integer getSuccessHostNum() {
        return successHostNum;
    }

    public void setSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
    }

    public VulScanTaskInfo withFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
        return this;
    }

    /**
     * 该任务已扫描失败的主机数量
     * minimum: 0
     * maximum: 2147483647
     * @return failedHostNum
     */
    public Integer getFailedHostNum() {
        return failedHostNum;
    }

    public void setFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
    }

    public VulScanTaskInfo withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * 预计完成时间
     * minimum: 0
     * maximum: 2147483647
     * @return estimatedTime
     */
    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulScanTaskInfo that = (VulScanTaskInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.scanType, that.scanType)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.scanVulTypes, that.scanVulTypes) && Objects.equals(this.status, that.status)
            && Objects.equals(this.scanningHostNum, that.scanningHostNum)
            && Objects.equals(this.successHostNum, that.successHostNum)
            && Objects.equals(this.failedHostNum, that.failedHostNum)
            && Objects.equals(this.estimatedTime, that.estimatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            scanType,
            startTime,
            endTime,
            scanVulTypes,
            status,
            scanningHostNum,
            successHostNum,
            failedHostNum,
            estimatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanTaskInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    scanVulTypes: ").append(toIndentedString(scanVulTypes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scanningHostNum: ").append(toIndentedString(scanningHostNum)).append("\n");
        sb.append("    successHostNum: ").append(toIndentedString(successHostNum)).append("\n");
        sb.append("    failedHostNum: ").append(toIndentedString(failedHostNum)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
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
