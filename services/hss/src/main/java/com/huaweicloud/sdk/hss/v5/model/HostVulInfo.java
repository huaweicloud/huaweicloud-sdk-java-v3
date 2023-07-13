package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HostVulInfo
 */
public class HostVulInfo {

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
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_list")

    private List<HostVulInfoAppList> appList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

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
    @JsonProperty(value = "repair_cmd")

    private String repairCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_success_num")

    private Integer repairSuccessNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<HostVulInfoCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_affect_business")

    private Boolean isAffectBusiness;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    public HostVulInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * 漏洞名称
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public HostVulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * 漏洞ID
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public HostVulInfo withLabelList(List<String> labelList) {
        this.labelList = labelList;
        return this;
    }

    public HostVulInfo addLabelListItem(String labelListItem) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        this.labelList.add(labelListItem);
        return this;
    }

    public HostVulInfo withLabelList(Consumer<List<String>> labelListSetter) {
        if (this.labelList == null) {
            this.labelList = new ArrayList<>();
        }
        labelListSetter.accept(this.labelList);
        return this;
    }

    /**
     * 漏洞标签列表
     * @return labelList
     */
    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public HostVulInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * 修复紧急度，包括如下：   - immediate_repair : 尽快修复   - delay_repair : 延后修复   - not_needed_repair : 暂可不修复
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public HostVulInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 最近扫描时间
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

    public HostVulInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 漏洞类型，包含如下：   -linux_vul : linux漏洞   -windows_vul : windows漏洞   -web_cms : Web-CMS漏洞   -app_vul : 应用漏洞
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HostVulInfo withAppList(List<HostVulInfoAppList> appList) {
        this.appList = appList;
        return this;
    }

    public HostVulInfo addAppListItem(HostVulInfoAppList appListItem) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        this.appList.add(appListItem);
        return this;
    }

    public HostVulInfo withAppList(Consumer<List<HostVulInfoAppList>> appListSetter) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        appListSetter.accept(this.appList);
        return this;
    }

    /**
     * 服务器上受该漏洞影响的软件列表
     * @return appList
     */
    public List<HostVulInfoAppList> getAppList() {
        return appList;
    }

    public void setAppList(List<HostVulInfoAppList> appList) {
        this.appList = appList;
    }

    public HostVulInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 危险程度   - Critical : 致命   - High : 高危   - Medium : 中危   - Low : 低危
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public HostVulInfo withSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
        return this;
    }

    /**
     * 解决方案
     * @return solutionDetail
     */
    public String getSolutionDetail() {
        return solutionDetail;
    }

    public void setSolutionDetail(String solutionDetail) {
        this.solutionDetail = solutionDetail;
    }

    public HostVulInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * URL链接
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HostVulInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 漏洞描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostVulInfo withRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
        return this;
    }

    /**
     * 修复命令行
     * @return repairCmd
     */
    public String getRepairCmd() {
        return repairCmd;
    }

    public void setRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
    }

    public HostVulInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HostVulInfo withRepairSuccessNum(Integer repairSuccessNum) {
        this.repairSuccessNum = repairSuccessNum;
        return this;
    }

    /**
     * HSS全网修复该漏洞的次数
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

    public HostVulInfo withCveList(List<HostVulInfoCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public HostVulInfo addCveListItem(HostVulInfoCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public HostVulInfo withCveList(Consumer<List<HostVulInfoCveList>> cveListSetter) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        cveListSetter.accept(this.cveList);
        return this;
    }

    /**
     * CVE列表
     * @return cveList
     */
    public List<HostVulInfoCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<HostVulInfoCveList> cveList) {
        this.cveList = cveList;
    }

    public HostVulInfo withIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
        return this;
    }

    /**
     * 是否影响业务
     * @return isAffectBusiness
     */
    public Boolean getIsAffectBusiness() {
        return isAffectBusiness;
    }

    public void setIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
    }

    public HostVulInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * 首次扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVulInfo that = (HostVulInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.labelList, that.labelList)
            && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.type, that.type)
            && Objects.equals(this.appList, that.appList) && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.solutionDetail, that.solutionDetail) && Objects.equals(this.url, that.url)
            && Objects.equals(this.description, that.description) && Objects.equals(this.repairCmd, that.repairCmd)
            && Objects.equals(this.status, that.status) && Objects.equals(this.repairSuccessNum, that.repairSuccessNum)
            && Objects.equals(this.cveList, that.cveList)
            && Objects.equals(this.isAffectBusiness, that.isAffectBusiness)
            && Objects.equals(this.firstScanTime, that.firstScanTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName,
            vulId,
            labelList,
            repairNecessity,
            scanTime,
            type,
            appList,
            severityLevel,
            solutionDetail,
            url,
            description,
            repairCmd,
            status,
            repairSuccessNum,
            cveList,
            isAffectBusiness,
            firstScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVulInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    solutionDetail: ").append(toIndentedString(solutionDetail)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    repairCmd: ").append(toIndentedString(repairCmd)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repairSuccessNum: ").append(toIndentedString(repairSuccessNum)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    isAffectBusiness: ").append(toIndentedString(isAffectBusiness)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
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
