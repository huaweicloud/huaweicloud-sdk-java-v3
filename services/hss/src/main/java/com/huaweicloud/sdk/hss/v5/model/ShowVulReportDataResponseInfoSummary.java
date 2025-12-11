package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 统计信息
 */
public class ShowVulReportDataResponseInfoSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_repair_necessity")

    private Integer vulNumRepairNecessity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_unfixed")

    private Integer vulNumUnfixed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_linux")

    private Integer vulNumLinux;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_windows")

    private Integer vulNumWindows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_web_cms")

    private Integer vulNumWebCms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_num_app")

    private Integer vulNumApp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num_risk")

    private Integer hostNumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num_high_risk")

    private Integer hostNumHighRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num_medium_risk")

    private Integer hostNumMediumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num_low_risk")

    private Integer hostNumLowRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_asset_num_important")

    private Integer affectAssetNumImportant;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_asset_num_common")

    private Integer affectAssetNumCommon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affect_asset_num_test")

    private Integer affectAssetNumTest;

    public ShowVulReportDataResponseInfoSummary withVulNumRepairNecessity(Integer vulNumRepairNecessity) {
        this.vulNumRepairNecessity = vulNumRepairNecessity;
        return this;
    }

    /**
     * **参数解释**: 紧急修复漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumRepairNecessity
     */
    public Integer getVulNumRepairNecessity() {
        return vulNumRepairNecessity;
    }

    public void setVulNumRepairNecessity(Integer vulNumRepairNecessity) {
        this.vulNumRepairNecessity = vulNumRepairNecessity;
    }

    public ShowVulReportDataResponseInfoSummary withVulNumUnfixed(Integer vulNumUnfixed) {
        this.vulNumUnfixed = vulNumUnfixed;
        return this;
    }

    /**
     * **参数解释**: 未完成修复的漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumUnfixed
     */
    public Integer getVulNumUnfixed() {
        return vulNumUnfixed;
    }

    public void setVulNumUnfixed(Integer vulNumUnfixed) {
        this.vulNumUnfixed = vulNumUnfixed;
    }

    public ShowVulReportDataResponseInfoSummary withVulNumLinux(Integer vulNumLinux) {
        this.vulNumLinux = vulNumLinux;
        return this;
    }

    /**
     * **参数解释**: linux漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumLinux
     */
    public Integer getVulNumLinux() {
        return vulNumLinux;
    }

    public void setVulNumLinux(Integer vulNumLinux) {
        this.vulNumLinux = vulNumLinux;
    }

    public ShowVulReportDataResponseInfoSummary withVulNumWindows(Integer vulNumWindows) {
        this.vulNumWindows = vulNumWindows;
        return this;
    }

    /**
     * **参数解释**: windows的漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumWindows
     */
    public Integer getVulNumWindows() {
        return vulNumWindows;
    }

    public void setVulNumWindows(Integer vulNumWindows) {
        this.vulNumWindows = vulNumWindows;
    }

    public ShowVulReportDataResponseInfoSummary withVulNumWebCms(Integer vulNumWebCms) {
        this.vulNumWebCms = vulNumWebCms;
        return this;
    }

    /**
     * **参数解释**: web-cms的漏洞数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumWebCms
     */
    public Integer getVulNumWebCms() {
        return vulNumWebCms;
    }

    public void setVulNumWebCms(Integer vulNumWebCms) {
        this.vulNumWebCms = vulNumWebCms;
    }

    public ShowVulReportDataResponseInfoSummary withVulNumApp(Integer vulNumApp) {
        this.vulNumApp = vulNumApp;
        return this;
    }

    /**
     * **参数解释**: 应用漏洞 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return vulNumApp
     */
    public Integer getVulNumApp() {
        return vulNumApp;
    }

    public void setVulNumApp(Integer vulNumApp) {
        this.vulNumApp = vulNumApp;
    }

    public ShowVulReportDataResponseInfoSummary withHostNumRisk(Integer hostNumRisk) {
        this.hostNumRisk = hostNumRisk;
        return this;
    }

    /**
     * **参数解释**: 有风险的主机数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return hostNumRisk
     */
    public Integer getHostNumRisk() {
        return hostNumRisk;
    }

    public void setHostNumRisk(Integer hostNumRisk) {
        this.hostNumRisk = hostNumRisk;
    }

    public ShowVulReportDataResponseInfoSummary withHostNumHighRisk(Integer hostNumHighRisk) {
        this.hostNumHighRisk = hostNumHighRisk;
        return this;
    }

    /**
     * **参数解释**: 有高危风险的主机数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return hostNumHighRisk
     */
    public Integer getHostNumHighRisk() {
        return hostNumHighRisk;
    }

    public void setHostNumHighRisk(Integer hostNumHighRisk) {
        this.hostNumHighRisk = hostNumHighRisk;
    }

    public ShowVulReportDataResponseInfoSummary withHostNumMediumRisk(Integer hostNumMediumRisk) {
        this.hostNumMediumRisk = hostNumMediumRisk;
        return this;
    }

    /**
     * **参数解释**: 有中危风险的主机数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return hostNumMediumRisk
     */
    public Integer getHostNumMediumRisk() {
        return hostNumMediumRisk;
    }

    public void setHostNumMediumRisk(Integer hostNumMediumRisk) {
        this.hostNumMediumRisk = hostNumMediumRisk;
    }

    public ShowVulReportDataResponseInfoSummary withHostNumLowRisk(Integer hostNumLowRisk) {
        this.hostNumLowRisk = hostNumLowRisk;
        return this;
    }

    /**
     * **参数解释**: 有低危风险的主机数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return hostNumLowRisk
     */
    public Integer getHostNumLowRisk() {
        return hostNumLowRisk;
    }

    public void setHostNumLowRisk(Integer hostNumLowRisk) {
        this.hostNumLowRisk = hostNumLowRisk;
    }

    public ShowVulReportDataResponseInfoSummary withAffectAssetNumImportant(Integer affectAssetNumImportant) {
        this.affectAssetNumImportant = affectAssetNumImportant;
        return this;
    }

    /**
     * **参数解释**: 受影响的重要资产数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return affectAssetNumImportant
     */
    public Integer getAffectAssetNumImportant() {
        return affectAssetNumImportant;
    }

    public void setAffectAssetNumImportant(Integer affectAssetNumImportant) {
        this.affectAssetNumImportant = affectAssetNumImportant;
    }

    public ShowVulReportDataResponseInfoSummary withAffectAssetNumCommon(Integer affectAssetNumCommon) {
        this.affectAssetNumCommon = affectAssetNumCommon;
        return this;
    }

    /**
     * **参数解释**: 受影响的一般资产数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return affectAssetNumCommon
     */
    public Integer getAffectAssetNumCommon() {
        return affectAssetNumCommon;
    }

    public void setAffectAssetNumCommon(Integer affectAssetNumCommon) {
        this.affectAssetNumCommon = affectAssetNumCommon;
    }

    public ShowVulReportDataResponseInfoSummary withAffectAssetNumTest(Integer affectAssetNumTest) {
        this.affectAssetNumTest = affectAssetNumTest;
        return this;
    }

    /**
     * **参数解释**: 受影响的测试资产数量 **取值范围**: 最小值0，最大值1000000 
     * minimum: 0
     * maximum: 1000000
     * @return affectAssetNumTest
     */
    public Integer getAffectAssetNumTest() {
        return affectAssetNumTest;
    }

    public void setAffectAssetNumTest(Integer affectAssetNumTest) {
        this.affectAssetNumTest = affectAssetNumTest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulReportDataResponseInfoSummary that = (ShowVulReportDataResponseInfoSummary) obj;
        return Objects.equals(this.vulNumRepairNecessity, that.vulNumRepairNecessity)
            && Objects.equals(this.vulNumUnfixed, that.vulNumUnfixed)
            && Objects.equals(this.vulNumLinux, that.vulNumLinux)
            && Objects.equals(this.vulNumWindows, that.vulNumWindows)
            && Objects.equals(this.vulNumWebCms, that.vulNumWebCms) && Objects.equals(this.vulNumApp, that.vulNumApp)
            && Objects.equals(this.hostNumRisk, that.hostNumRisk)
            && Objects.equals(this.hostNumHighRisk, that.hostNumHighRisk)
            && Objects.equals(this.hostNumMediumRisk, that.hostNumMediumRisk)
            && Objects.equals(this.hostNumLowRisk, that.hostNumLowRisk)
            && Objects.equals(this.affectAssetNumImportant, that.affectAssetNumImportant)
            && Objects.equals(this.affectAssetNumCommon, that.affectAssetNumCommon)
            && Objects.equals(this.affectAssetNumTest, that.affectAssetNumTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulNumRepairNecessity,
            vulNumUnfixed,
            vulNumLinux,
            vulNumWindows,
            vulNumWebCms,
            vulNumApp,
            hostNumRisk,
            hostNumHighRisk,
            hostNumMediumRisk,
            hostNumLowRisk,
            affectAssetNumImportant,
            affectAssetNumCommon,
            affectAssetNumTest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulReportDataResponseInfoSummary {\n");
        sb.append("    vulNumRepairNecessity: ").append(toIndentedString(vulNumRepairNecessity)).append("\n");
        sb.append("    vulNumUnfixed: ").append(toIndentedString(vulNumUnfixed)).append("\n");
        sb.append("    vulNumLinux: ").append(toIndentedString(vulNumLinux)).append("\n");
        sb.append("    vulNumWindows: ").append(toIndentedString(vulNumWindows)).append("\n");
        sb.append("    vulNumWebCms: ").append(toIndentedString(vulNumWebCms)).append("\n");
        sb.append("    vulNumApp: ").append(toIndentedString(vulNumApp)).append("\n");
        sb.append("    hostNumRisk: ").append(toIndentedString(hostNumRisk)).append("\n");
        sb.append("    hostNumHighRisk: ").append(toIndentedString(hostNumHighRisk)).append("\n");
        sb.append("    hostNumMediumRisk: ").append(toIndentedString(hostNumMediumRisk)).append("\n");
        sb.append("    hostNumLowRisk: ").append(toIndentedString(hostNumLowRisk)).append("\n");
        sb.append("    affectAssetNumImportant: ").append(toIndentedString(affectAssetNumImportant)).append("\n");
        sb.append("    affectAssetNumCommon: ").append(toIndentedString(affectAssetNumCommon)).append("\n");
        sb.append("    affectAssetNumTest: ").append(toIndentedString(affectAssetNumTest)).append("\n");
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
