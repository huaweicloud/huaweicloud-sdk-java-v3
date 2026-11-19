package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 最后一次漏洞扫描任务的数据 **取值范围**: 不涉及 
 */
public class VulScanTaskStatisticsResponseInfoLastScanTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

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
    @JsonProperty(value = "scanning_host_num")

    private Integer scanningHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_host_num")

    private Integer successHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_host_num")

    private VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum riskyHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_host_num")

    private Integer failedHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    public VulScanTaskStatisticsResponseInfoLastScanTask withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 任务ID **取值范围**: 字符长度1-128位 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**: 扫描任务类型 **取值范围**: - manual：手动扫描 - automatic：自动扫描 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 任务状态 **取值范围**: - finished：已完成 - running：运行中 - failed：失败 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 任务开始时间，Unix时间戳格式，单位为毫秒 **取值范围**: 最小值0，最大值9223372036854775807 
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 任务结束时间，Unix时间戳格式，单位为毫秒 **取值范围**: 最小值0，最大值9223372036854775807 
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
        return this;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask addScanVulTypesItem(String scanVulTypesItem) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        this.scanVulTypes.add(scanVulTypesItem);
        return this;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withScanVulTypes(Consumer<List<String>> scanVulTypesSetter) {
        if (this.scanVulTypes == null) {
            this.scanVulTypes = new ArrayList<>();
        }
        scanVulTypesSetter.accept(this.scanVulTypes);
        return this;
    }

    /**
     * **参数解释**: 扫描的漏洞类型列表 **取值范围**: 0-100个漏洞类型 
     * @return scanVulTypes
     */
    public List<String> getScanVulTypes() {
        return scanVulTypes;
    }

    public void setScanVulTypes(List<String> scanVulTypes) {
        this.scanVulTypes = scanVulTypes;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withScanningHostNum(Integer scanningHostNum) {
        this.scanningHostNum = scanningHostNum;
        return this;
    }

    /**
     * **参数解释**: 扫描中的主机数，Serverless场景下为POD实例数 **取值范围**: 最小值0，最大值2147483647 
     * @return scanningHostNum
     */
    public Integer getScanningHostNum() {
        return scanningHostNum;
    }

    public void setScanningHostNum(Integer scanningHostNum) {
        this.scanningHostNum = scanningHostNum;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
        return this;
    }

    /**
     * **参数解释**: 扫描成功的主机数，Serverless场景下为POD实例数 **取值范围**: 最小值0，最大值2147483647 
     * @return successHostNum
     */
    public Integer getSuccessHostNum() {
        return successHostNum;
    }

    public void setSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withRiskyHostNum(
        VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
        return this;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withRiskyHostNum(
        Consumer<VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum> riskyHostNumSetter) {
        if (this.riskyHostNum == null) {
            this.riskyHostNum = new VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum();
            riskyHostNumSetter.accept(this.riskyHostNum);
        }

        return this;
    }

    /**
     * Get riskyHostNum
     * @return riskyHostNum
     */
    public VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum getRiskyHostNum() {
        return riskyHostNum;
    }

    public void setRiskyHostNum(VulScanTaskStatisticsResponseInfoLastScanTaskRiskyHostNum riskyHostNum) {
        this.riskyHostNum = riskyHostNum;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
        return this;
    }

    /**
     * **参数解释**: 扫描失败的主机数，Serverless场景下为POD实例数 **取值范围**: 最小值0，最大值2147483647 
     * @return failedHostNum
     */
    public Integer getFailedHostNum() {
        return failedHostNum;
    }

    public void setFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
    }

    public VulScanTaskStatisticsResponseInfoLastScanTask withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * **参数解释**: 预计还需要多长时间，单位为秒 **取值范围**: 最小值0，最大值2147483647 
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
        VulScanTaskStatisticsResponseInfoLastScanTask that = (VulScanTaskStatisticsResponseInfoLastScanTask) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.scanType, that.scanType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.scanVulTypes, that.scanVulTypes)
            && Objects.equals(this.scanningHostNum, that.scanningHostNum)
            && Objects.equals(this.successHostNum, that.successHostNum)
            && Objects.equals(this.riskyHostNum, that.riskyHostNum)
            && Objects.equals(this.failedHostNum, that.failedHostNum)
            && Objects.equals(this.estimatedTime, that.estimatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            scanType,
            status,
            startTime,
            endTime,
            scanVulTypes,
            scanningHostNum,
            successHostNum,
            riskyHostNum,
            failedHostNum,
            estimatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulScanTaskStatisticsResponseInfoLastScanTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    scanVulTypes: ").append(toIndentedString(scanVulTypes)).append("\n");
        sb.append("    scanningHostNum: ").append(toIndentedString(scanningHostNum)).append("\n");
        sb.append("    successHostNum: ").append(toIndentedString(successHostNum)).append("\n");
        sb.append("    riskyHostNum: ").append(toIndentedString(riskyHostNum)).append("\n");
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
