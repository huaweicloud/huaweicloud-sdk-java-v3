package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应急漏洞信息
 */
public class UrgentVulInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private List<String> labelList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts_num")

    private VulnerabilityHostNumberInfo hostsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private Long publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_detail")

    private String solutionDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_status")

    private String scanStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning_host_num")

    private Integer scanningHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_host_num")

    private Integer successHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_host_num")

    private Integer failedHostNum;

    public UrgentVulInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**： 漏洞名称 **取值范围**： 字符长度0-256位 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public UrgentVulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**： 漏洞ID **取值范围**： 字符长度0-64位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public UrgentVulInfo withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public UrgentVulInfo addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public UrgentVulInfo withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * **参数解释**： 漏洞标签 **取值范围**: 最小值0，最大值2147483647 
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public UrgentVulInfo withHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
        return this;
    }

    public UrgentVulInfo withHostsNum(Consumer<VulnerabilityHostNumberInfo> hostsNumSetter) {
        if (this.hostsNum == null) {
            this.hostsNum = new VulnerabilityHostNumberInfo();
            hostsNumSetter.accept(this.hostsNum);
        }

        return this;
    }

    /**
     * Get hostsNum
     * @return hostsNum
     */
    public VulnerabilityHostNumberInfo getHostsNum() {
        return hostsNum;
    }

    public void setHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
    }

    public UrgentVulInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最近扫描时间 **取值范围**： 字符长度0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public UrgentVulInfo withPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * **参数解释**： 漏洞披露时间 **取值范围**： 字符长度0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return publishTime
     */
    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public UrgentVulInfo withSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
        return this;
    }

    /**
     * **参数解释**： 解决方案 **取值范围**： 字符长度0-65534位 
     * @return solutionDetail
     */
    public String getSolutionDetail() {
        return solutionDetail;
    }

    public void setSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
    }

    public UrgentVulInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 漏洞描述 **取值范围**： 字符长度0-64位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UrgentVulInfo withScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
        return this;
    }

    /**
     * **参数解释**： 漏洞扫描状态 **约束限制**: 不涉及 **取值范围**： - never_scan : 未扫描 - scanning : 扫描中 - finished : 扫描完成  **默认取值**: 不涉及 
     * @return scanStatus
     */
    public String getScanStatus() {
        return scanStatus;
    }

    public void setScanStatus(String scanStatus) {
        this.scanStatus = scanStatus;
    }

    public UrgentVulInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**： 危险程度 **约束限制**: 不涉及 **取值范围**： - Critical：漏洞cvss评分大于等于9；对应控制台页面的高危 - High：漏洞cvss评分大于等于7，小于9；对应控制台页面的中危 - Medium：漏洞cvss评分大于等于4，小于7；对应控制台页面的中危 - Low：漏洞cvss评分小于4；对应控制台页面的低危  **默认取值**: 不涉及 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public UrgentVulInfo withScanningHostNum(Integer scanningHostNum) {
        this.scanningHostNum = scanningHostNum;
        return this;
    }

    /**
     * **参数解释**： 处于扫描中状态的主机数量 **取值范围**： 字符长度0-2147483647 
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

    public UrgentVulInfo withSuccessHostNum(Integer successHostNum) {
        this.successHostNum = successHostNum;
        return this;
    }

    /**
     * **参数解释**： 已扫描成功的主机数量 **取值范围**： 字符长度0-2147483647 
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

    public UrgentVulInfo withFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
        return this;
    }

    /**
     * **参数解释**： 已扫描失败的主机数量 **取值范围**： 字符长度0-2147483647 
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrgentVulInfo that = (UrgentVulInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.labelList, that.labelList) && Objects.equals(this.hostsNum, that.hostsNum)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.publishTime, that.publishTime)
            && Objects.equals(this.solutionDetail, that.solutionDetail)
            && Objects.equals(this.description, that.description) && Objects.equals(this.scanStatus, that.scanStatus)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.scanningHostNum, that.scanningHostNum)
            && Objects.equals(this.successHostNum, that.successHostNum)
            && Objects.equals(this.failedHostNum, that.failedHostNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName,
            vulId,
            labelList,
            hostsNum,
            scanTime,
            publishTime,
            solutionDetail,
            description,
            scanStatus,
            severityLevel,
            scanningHostNum,
            successHostNum,
            failedHostNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrgentVulInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    hostsNum: ").append(toIndentedString(hostsNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    solutionDetail: ").append(toIndentedString(solutionDetail)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    scanningHostNum: ").append(toIndentedString(scanningHostNum)).append("\n");
        sb.append("    successHostNum: ").append(toIndentedString(successHostNum)).append("\n");
        sb.append("    failedHostNum: ").append(toIndentedString(failedHostNum)).append("\n");
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
