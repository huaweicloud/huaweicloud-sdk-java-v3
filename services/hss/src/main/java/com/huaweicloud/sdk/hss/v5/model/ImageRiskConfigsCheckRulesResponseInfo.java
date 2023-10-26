package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查项风险信息
 */
public class ImageRiskConfigsCheckRulesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    public ImageRiskConfigsCheckRulesResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 风险等级，包含如下:   - Security : 安全   - Low : 低危   - Medium : 中危   - High : 高危
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * 基线名称
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * 基线类型
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * 标准类型，包含如下:   - cn_standard : 等保合规标准   - hw_standard : 华为标准   - qt_standard : 青腾标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * 检查项
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * 检查项ID
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public ImageRiskConfigsCheckRulesResponseInfo withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * 检测结果，包含如下：   - pass    通过   - failed  未通过
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageRiskConfigsCheckRulesResponseInfo that = (ImageRiskConfigsCheckRulesResponseInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.checkRuleId, that.checkRuleId) && Objects.equals(this.scanResult, that.scanResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, checkName, checkType, standard, checkRuleName, checkRuleId, scanResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRiskConfigsCheckRulesResponseInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
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
