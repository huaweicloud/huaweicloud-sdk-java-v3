package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowVulReportDataResponseInfoVulnerabilities
 */
public class ShowVulReportDataResponseInfoVulnerabilities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_list")

    private List<ShowVulReportDataResponseInfoCveList> cveList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private String repairPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    public ShowVulReportDataResponseInfoVulnerabilities withVulName(String vulName) {
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

    public ShowVulReportDataResponseInfoVulnerabilities withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最近扫描时间 **取值范围**： 最小值0，最大值9223372036854775807 
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

    public ShowVulReportDataResponseInfoVulnerabilities withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 漏洞类型 **取值范围**： - linux_vul：linux漏洞。 - windows_vul：windows漏洞。 - web_cms：Web-CMS漏洞。 - app_vul：应用漏洞。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withCveList(
        List<ShowVulReportDataResponseInfoCveList> cveList) {
        this.cveList = cveList;
        return this;
    }

    public ShowVulReportDataResponseInfoVulnerabilities addCveListItem(
        ShowVulReportDataResponseInfoCveList cveListItem) {
        if (this.cveList == null) {
            this.cveList = new ArrayList<>();
        }
        this.cveList.add(cveListItem);
        return this;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withCveList(
        Consumer<List<ShowVulReportDataResponseInfoCveList>> cveListSetter) {
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
    public List<ShowVulReportDataResponseInfoCveList> getCveList() {
        return cveList;
    }

    public void setCveList(List<ShowVulReportDataResponseInfoCveList> cveList) {
        this.cveList = cveList;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * **参数解释**： 修复优先级 **取值范围**： - Critical：紧急。 - High：高。 - Medium：中。 - Low：低。 
     * @return repairPriority
     */
    public String getRepairPriority() {
        return repairPriority;
    }

    public void setRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**： 影响主机数量 **取值范围**： 最小值0，最大值20000 
     * minimum: 0
     * maximum: 20000
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public ShowVulReportDataResponseInfoVulnerabilities addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public ShowVulReportDataResponseInfoVulnerabilities withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 主机ID列表(数组长度跟host_num对不上时，主机数量以host_num为准) **取值范围**: 最小值0，最大值20000 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulReportDataResponseInfoVulnerabilities that = (ShowVulReportDataResponseInfoVulnerabilities) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.cveList, that.cveList)
            && Objects.equals(this.repairPriority, that.repairPriority) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.hostIdList, that.hostIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName, scanTime, type, cveList, repairPriority, hostNum, hostIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulReportDataResponseInfoVulnerabilities {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cveList: ").append(toIndentedString(cveList)).append("\n");
        sb.append("    repairPriority: ").append(toIndentedString(repairPriority)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
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
