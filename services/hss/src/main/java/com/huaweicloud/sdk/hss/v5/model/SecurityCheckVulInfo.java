package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 漏洞信息
 */
public class SecurityCheckVulInfo {

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
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_cmd")

    private String repairCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    public SecurityCheckVulInfo withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**： 漏洞名称 **取值范围**： 不涉及 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public SecurityCheckVulInfo withVulId(String vulId) {
        this.vulId = vulId;
        return this;
    }

    /**
     * **参数解释**： 漏洞ID **取值范围**： 不涉及 
     * @return vulId
     */
    public String getVulId() {
        return vulId;
    }

    public void setVulId(String vulId) {
        this.vulId = vulId;
    }

    public SecurityCheckVulInfo withRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
        return this;
    }

    /**
     * **参数解释**： 修复紧急度 **取值范围**： 不涉及 
     * @return repairNecessity
     */
    public String getRepairNecessity() {
        return repairNecessity;
    }

    public void setRepairNecessity(String repairNecessity) {
        this.repairNecessity = repairNecessity;
    }

    public SecurityCheckVulInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最近扫描时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public SecurityCheckVulInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 漏洞类型 **取值范围**： 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SecurityCheckVulInfo withRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
        return this;
    }

    /**
     * **参数解释**： 修复命令行 **取值范围**： 不涉及 
     * @return repairCmd
     */
    public String getRepairCmd() {
        return repairCmd;
    }

    public void setRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
    }

    public SecurityCheckVulInfo withSeverityLevel(String severityLevel) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityCheckVulInfo that = (SecurityCheckVulInfo) obj;
        return Objects.equals(this.vulName, that.vulName) && Objects.equals(this.vulId, that.vulId)
            && Objects.equals(this.repairNecessity, that.repairNecessity)
            && Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.type, that.type)
            && Objects.equals(this.repairCmd, that.repairCmd) && Objects.equals(this.severityLevel, that.severityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vulName, vulId, repairNecessity, scanTime, type, repairCmd, severityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckVulInfo {\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    vulId: ").append(toIndentedString(vulId)).append("\n");
        sb.append("    repairNecessity: ").append(toIndentedString(repairNecessity)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    repairCmd: ").append(toIndentedString(repairCmd)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
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
