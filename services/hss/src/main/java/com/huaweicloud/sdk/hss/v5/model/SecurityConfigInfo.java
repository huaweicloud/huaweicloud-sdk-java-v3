package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配置检测信息
 */
public class SecurityConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_rule_num")

    private Integer failedRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_desc")

    private String checkTypeDesc;

    public SecurityConfigInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 风险级别 **取值范围**： - high：高危 - medium：中危 - low：低危 - safe：安全，无风险 
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityConfigInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**： 基线名称 **取值范围**： 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public SecurityConfigInfo withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释**： 检查项数量 **取值范围**： 不涉及 
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public SecurityConfigInfo withFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
        return this;
    }

    /**
     * **参数解释**： 风险项数量 **取值范围**： 不涉及 
     * @return failedRuleNum
     */
    public Integer getFailedRuleNum() {
        return failedRuleNum;
    }

    public void setFailedRuleNum(Integer failedRuleNum) {
        this.failedRuleNum = failedRuleNum;
    }

    public SecurityConfigInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**： 最新检测时间 **取值范围**： 不涉及 
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public SecurityConfigInfo withCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
        return this;
    }

    /**
     * **参数解释**： 基线描述信息 **取值范围**： 不涉及 
     * @return checkTypeDesc
     */
    public String getCheckTypeDesc() {
        return checkTypeDesc;
    }

    public void setCheckTypeDesc(String checkTypeDesc) {
        this.checkTypeDesc = checkTypeDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecurityConfigInfo that = (SecurityConfigInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.failedRuleNum, that.failedRuleNum) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.checkTypeDesc, that.checkTypeDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, checkName, checkRuleNum, failedRuleNum, scanTime, checkTypeDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityConfigInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    failedRuleNum: ").append(toIndentedString(failedRuleNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    checkTypeDesc: ").append(toIndentedString(checkTypeDesc)).append("\n");
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
