package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞列表
 */
public class VulInfo {

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
    @JsonProperty(value = "repair_necessity")

    private String repairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unhandle_host_num")

    private Integer unhandleHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution_detail")

    private String solutionDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<VulInfoCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_url")

    private String patchUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private String repairPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts_num")

    private VulnerabilityHostNumberInfo hostsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_success_num")

    private Integer repairSuccessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_num")

    private Long fixedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignored_num")

    private Long ignoredNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_num")

    private Integer verifyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority_list")

    private List<RepairPriorityListInfo> repairPriorityList = null;

    public VulInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **取值范围**: 字符长度0-256位 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public VulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**: 漏洞ID **取值范围**: 字符长度0-64位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public VulInfo withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public VulInfo addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public VulInfo withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * **参数解释**: 漏洞标签列表 **取值范围**: 不涉及 
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public VulInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * **参数解释**: 漏洞修复的必要性 **取值范围**: - Critical：漏洞cvss评分大于等于9；对应控制台页面的高危 - High：漏洞cvss评分大于等于7，小于9；对应控制台页面的中危 - Medium：漏洞cvss评分大于等于4，小于7；对应控制台页面的中危 - Low：漏洞cvss评分小于4；对应控制台页面的低危 
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public VulInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 漏洞风险级别 **取值范围**: - Critical：漏洞cvss评分大于等于9；对应控制台页面的高危 - High：漏洞cvss评分大于等于7，小于9；对应控制台页面的中危 - Medium：漏洞cvss评分大于等于4，小于7；对应控制台页面的中危 - Low：漏洞cvss评分小于4；对应控制台页面的低危 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public VulInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 受影响服务器台数 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public VulInfo withUnhandleHostNum(Integer unhandleHostNum) {
        this.unhandleHostNum = unhandleHostNum;
        return this;
    }

    /**
     * **参数解释**: 未处理主机台数：除已忽略和已修复的主机数量 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return unhandleHostNum
     */
    public Integer getUnhandleHostNum() {
        return unhandleHostNum;
    }

    public void setUnhandleHostNum(Integer unhandleHostNum) {
        this.unhandleHostNum = unhandleHostNum;
    }

    public VulInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最近扫描时间，时间戳单位：毫秒 **取值范围**: 取值0-9223372036854775807 
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

    public VulInfo withSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
        return this;
    }

    /**
     * **参数解释**: 修复漏洞的指导意见 **取值范围**: 字符长度0-65534位 
     * @return solutionDetail
     */
    public String getSolutionDetail() {
        return solutionDetail;
    }

    public void setSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
    }

    public VulInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**: URL链接 **取值范围**: 字符长度0-2083位 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VulInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 漏洞描述 **取值范围**: 字符长度0-65534位 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VulInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms：Web-CMS漏洞 - app_vul：应用漏洞 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VulInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public VulInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public VulInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 可处置该漏洞的主机ID列表 **取值范围**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public VulInfo withCveList(List<VulInfoCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public VulInfo addCveListItem(VulInfoCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public VulInfo withCveList(Consumer<List<VulInfoCveList>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * **参数解释**: 漏洞关联的cve信息列表 **取值范围**: 不涉及 
     * @return cveList
     */
    public List<VulInfoCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<VulInfoCveList> cveList) {
        this.cveList = cveList;
    }

    public VulInfo withPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
        return this;
    }

    /**
     * **参数解释**: 补丁地址 **取值范围**: 字符长度0-512位 
     * @return patchUrl
     */
    public String getPatchUrl() {
        return patchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    public VulInfo withRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * **参数解释**: 修复优先级 **取值范围**: - Critical：紧急 - High：高 - Medium：中 - Low：低 
     * @return repairPriority
     */
    public String getRepairPriority() {
        return repairPriority;
    }

    public void setRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
    }

    public VulInfo withHostsNum(VulnerabilityHostNumberInfo hostsNum) {
        this.hostsNum = hostsNum;
        return this;
    }

    public VulInfo withHostsNum(Consumer<VulnerabilityHostNumberInfo> hostsNumSetter) {
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

    public VulInfo withRepairSuccessNum(Integer repairSuccessNum) {
        this.repairSuccessNum = repairSuccessNum;
        return this;
    }

    /**
     * **参数解释**: 修复成功次数 **取值范围**: 取值0-1000000 
     * minimum: 0
     * maximum: 1000000
     * @return repairSuccessNum
     */
    public Integer getRepairSuccessNum() {
        return repairSuccessNum;
    }

    public void setRepairSuccessNum(Integer repairSuccessNum) {
        this.repairSuccessNum = repairSuccessNum;
    }

    public VulInfo withFixedNum(Long fixedNum) {
        this.fixedNum = fixedNum;
        return this;
    }

    /**
     * **参数解释**: 修复数量 **取值范围**: 取值0-1000000 
     * minimum: 0
     * maximum: 1000000
     * @return fixedNum
     */
    public Long getFixedNum() {
        return fixedNum;
    }

    public void setFixedNum(Long fixedNum) {
        this.fixedNum = fixedNum;
    }

    public VulInfo withIgnoredNum(Long ignoredNum) {
        this.ignoredNum = ignoredNum;
        return this;
    }

    /**
     * **参数解释**: 忽略数量 **取值范围**: 取值0-1000000 
     * minimum: 0
     * maximum: 1000000
     * @return ignoredNum
     */
    public Long getIgnoredNum() {
        return ignoredNum;
    }

    public void setIgnoredNum(Long ignoredNum) {
        this.ignoredNum = ignoredNum;
    }

    public VulInfo withVerifyNum(Integer verifyNum) {
        this.verifyNum = verifyNum;
        return this;
    }

    /**
     * **参数解释**: 验证数量 **取值范围**: 取值0-1000000 
     * minimum: 0
     * maximum: 1000000
     * @return verifyNum
     */
    public Integer getVerifyNum() {
        return verifyNum;
    }

    public void setVerifyNum(Integer verifyNum) {
        this.verifyNum = verifyNum;
    }

    public VulInfo withRepairPriorityList(List<RepairPriorityListInfo> repairPriorityList) {
        this.repairPriorityList = repairPriorityList;
        return this;
    }

    public VulInfo addRepairPriorityListItem(RepairPriorityListInfo repairPriorityListItem) {
        if (this.repairPriorityList == null) {
            this.repairPriorityList = new ArrayList<>();
        }
        this.repairPriorityList.add(repairPriorityListItem);
        return this;
    }

    public VulInfo withRepairPriorityList(Consumer<List<RepairPriorityListInfo>> repairPriorityListSetter) {
        if (this.repairPriorityList == null) {
            this.repairPriorityList = new ArrayList<>();
        }
        repairPriorityListSetter.accept(this.repairPriorityList);
        return this;
    }

    /**
     * **参数解释**: 修复优先级，每个修复优先级对应的主机数量 **取值范围**: 不涉及 
     * @return repairPriorityList
     */
    public List<RepairPriorityListInfo> getRepairPriorityList() {
        return repairPriorityList;
    }

    public void setRepairPriorityList(List<RepairPriorityListInfo> repairPriorityList) {
        this.repairPriorityList = repairPriorityList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulInfo that = (VulInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.labelList, that.labelList)
            && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.severityLevel, that.severityLevel) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.unhandleHostNum, that.unhandleHostNum)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.solutionDetail, that.solutionDetail)
            && Objects.equals(this.url, that.url) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.hostIdList, that.hostIdList)
            && Objects.equals(this.cveList, that.cveList) && Objects.equals(this.patchUrl, that.patchUrl)
            && Objects.equals(this.repairPriority, that.repairPriority) && Objects.equals(this.hostsNum, that.hostsNum)
            && Objects.equals(this.repairSuccessNum, that.repairSuccessNum)
            && Objects.equals(this.fixedNum, that.fixedNum) && Objects.equals(this.ignoredNum, that.ignoredNum)
            && Objects.equals(this.verifyNum, that.verifyNum)
            && Objects.equals(this.repairPriorityList, that.repairPriorityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName,
            vulId,
            labelList,
            repairNecessity,
            severityLevel,
            hostNum,
            unhandleHostNum,
            scanTime,
            solutionDetail,
            url,
            description,
            type,
            hostIdList,
            cveList,
            patchUrl,
            repairPriority,
            hostsNum,
            repairSuccessNum,
            fixedNum,
            ignoredNum,
            verifyNum,
            repairPriorityList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    unhandleHostNum: ").append(toIndentedString(unhandleHostNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    solutionDetail: ").append(toIndentedString(solutionDetail)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    patchUrl: ").append(toIndentedString(patchUrl)).append("\n");
        sb.append("    repairPriority: ").append(toIndentedString(repairPriority)).append("\n");
        sb.append("    hostsNum: ").append(toIndentedString(hostsNum)).append("\n");
        sb.append("    repairSuccessNum: ").append(toIndentedString(repairSuccessNum)).append("\n");
        sb.append("    fixedNum: ").append(toIndentedString(fixedNum)).append("\n");
        sb.append("    ignoredNum: ").append(toIndentedString(ignoredNum)).append("\n");
        sb.append("    verifyNum: ").append(toIndentedString(verifyNum)).append("\n");
        sb.append("    repairPriorityList: ").append(toIndentedString(repairPriorityList)).append("\n");
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
