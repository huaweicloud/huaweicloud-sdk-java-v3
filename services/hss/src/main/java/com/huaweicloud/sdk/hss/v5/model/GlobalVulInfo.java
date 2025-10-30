package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 漏洞对应的记录
 */
public class GlobalVulInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_id")

    private String vulId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_necessity")

    private String repairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decription")

    private String decription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_number")

    private Integer historyNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "undeal_number")

    private Integer undealNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_list")

    private List<CveInfo> dataList = null;

    public GlobalVulInfo withVulName(String vulName) {
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

    public GlobalVulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释** 漏洞ID **取值范围** 字符长度0-65535位 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public GlobalVulInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * **参数解释**: 修复紧急度 **取值范围**: - immediate_repair：需尽快修复。 - delay_repair：可延后修复。 - not_needed_repair：暂可不修复。 
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public GlobalVulInfo withDecription(String decription) {
        this.decription = decription;
        return this;
    }

    /**
     * **参数解释** 漏洞描述 **取值范围** 字符长度0-65535位 
     * @return decription
     */
    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public GlobalVulInfo withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * **参数解释** 解决方案 **取值范围** 字符长度0-65535位 
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public GlobalVulInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释** URL链接 **取值范围** 字符长度0-65535位 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GlobalVulInfo withHistoryNumber(Integer historyNumber) {
        this.historyNumber = historyNumber;
        return this;
    }

    /**
     * **参数解释** 历史受影响镜像的个数 **取值范围** 取值0-65535 
     * minimum: 0
     * maximum: 65535
     * @return historyNumber
     */
    public Integer getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(Integer historyNumber) {
        this.historyNumber = historyNumber;
    }

    public GlobalVulInfo withUndealNumber(Integer undealNumber) {
        this.undealNumber = undealNumber;
        return this;
    }

    /**
     * **参数解释** 未处理镜像的格式 **取值范围** 取值0-65535 
     * minimum: 0
     * maximum: 65535
     * @return undealNumber
     */
    public Integer getUndealNumber() {
        return undealNumber;
    }

    public void setUndealNumber(Integer undealNumber) {
        this.undealNumber = undealNumber;
    }

    public GlobalVulInfo withDataList(List<CveInfo> dataList) {
        this.dataList = dataList;
        return this;
    }

    public GlobalVulInfo addDataListItem(CveInfo dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public GlobalVulInfo withDataList(Consumer<List<CveInfo>> dataListSetter) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * cve列表
     * @return dataList
     */
    public List<CveInfo> getDataList() {
        return dataList;
    }

    public void setDataList(List<CveInfo> dataList) {
        this.dataList = dataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GlobalVulInfo that = (GlobalVulInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.decription, that.decription) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.url, that.url) && Objects.equals(this.historyNumber, that.historyNumber)
            && Objects.equals(this.undealNumber, that.undealNumber) && Objects.equals(this.dataList, that.dataList);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(vulName, vulId, repairNecessity, decription, solution, url, historyNumber, undealNumber, dataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalVulInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    decription: ").append(toIndentedString(decription)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    historyNumber: ").append(toIndentedString(historyNumber)).append("\n");
        sb.append("    undealNumber: ").append(toIndentedString(undealNumber)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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
