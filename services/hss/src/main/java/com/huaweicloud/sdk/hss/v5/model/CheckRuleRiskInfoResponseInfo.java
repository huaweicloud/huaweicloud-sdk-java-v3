package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查项风险信息
 */
public class CheckRuleRiskInfoResponseInfo {

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
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_result")

    private String scanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fix")

    private Integer enableFix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_click")

    private Boolean enableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_params")

    private List<CheckRuleFixParamInfo> ruleParams = null;

    public CheckRuleRiskInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 风险等级，包含如下:   - Low : 低危   - Medium : 中危   - High : 高危
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public CheckRuleRiskInfoResponseInfo withCheckName(String checkName) {
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

    public CheckRuleRiskInfoResponseInfo withCheckType(String checkType) {
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

    public CheckRuleRiskInfoResponseInfo withStandard(String standard) {
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

    public CheckRuleRiskInfoResponseInfo withCheckRuleName(String checkRuleName) {
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

    public CheckRuleRiskInfoResponseInfo withCheckRuleId(String checkRuleId) {
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

    public CheckRuleRiskInfoResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * 影响服务器数量
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

    public CheckRuleRiskInfoResponseInfo withScanResult(String scanResult) {
        this.scanResult = scanResult;
        return this;
    }

    /**
     * 检测结果，包含如下：   - pass   - failed
     * @return scanResult
     */
    public String getScanResult() {
        return scanResult;
    }

    public void setScanResult(String scanResult) {
        this.scanResult = scanResult;
    }

    public CheckRuleRiskInfoResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，包含如下：   - safe : 无需处理   - ignored : 已忽略   - unhandled : 未处理   - fixing : 修复中   - fix-failed : 修复失败   - verifying : 验证中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CheckRuleRiskInfoResponseInfo withEnableFix(Integer enableFix) {
        this.enableFix = enableFix;
        return this;
    }

    /**
     * 是否支持一键修复,1:支持一键修复,0:不支持
     * minimum: 0
     * maximum: 2147483647
     * @return enableFix
     */
    public Integer getEnableFix() {
        return enableFix;
    }

    public void setEnableFix(Integer enableFix) {
        this.enableFix = enableFix;
    }

    public CheckRuleRiskInfoResponseInfo withEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
        return this;
    }

    /**
     * 该检查项的修复&忽略&验证按钮是否可点击,true:按钮可点击,false:按钮不可点击
     * @return enableClick
     */
    public Boolean getEnableClick() {
        return enableClick;
    }

    public void setEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
    }

    public CheckRuleRiskInfoResponseInfo withRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
        return this;
    }

    public CheckRuleRiskInfoResponseInfo addRuleParamsItem(CheckRuleFixParamInfo ruleParamsItem) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        this.ruleParams.add(ruleParamsItem);
        return this;
    }

    public CheckRuleRiskInfoResponseInfo withRuleParams(Consumer<List<CheckRuleFixParamInfo>> ruleParamsSetter) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        ruleParamsSetter.accept(this.ruleParams);
        return this;
    }

    /**
     * 支持传递参数修复的检查项可传递参数的范围
     * @return ruleParams
     */
    public List<CheckRuleFixParamInfo> getRuleParams() {
        return ruleParams;
    }

    public void setRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRuleRiskInfoResponseInfo checkRuleRiskInfoResponseInfo = (CheckRuleRiskInfoResponseInfo) o;
        return Objects.equals(this.severity, checkRuleRiskInfoResponseInfo.severity)
            && Objects.equals(this.checkName, checkRuleRiskInfoResponseInfo.checkName)
            && Objects.equals(this.checkType, checkRuleRiskInfoResponseInfo.checkType)
            && Objects.equals(this.standard, checkRuleRiskInfoResponseInfo.standard)
            && Objects.equals(this.checkRuleName, checkRuleRiskInfoResponseInfo.checkRuleName)
            && Objects.equals(this.checkRuleId, checkRuleRiskInfoResponseInfo.checkRuleId)
            && Objects.equals(this.hostNum, checkRuleRiskInfoResponseInfo.hostNum)
            && Objects.equals(this.scanResult, checkRuleRiskInfoResponseInfo.scanResult)
            && Objects.equals(this.status, checkRuleRiskInfoResponseInfo.status)
            && Objects.equals(this.enableFix, checkRuleRiskInfoResponseInfo.enableFix)
            && Objects.equals(this.enableClick, checkRuleRiskInfoResponseInfo.enableClick)
            && Objects.equals(this.ruleParams, checkRuleRiskInfoResponseInfo.ruleParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity,
            checkName,
            checkType,
            standard,
            checkRuleName,
            checkRuleId,
            hostNum,
            scanResult,
            status,
            enableFix,
            enableClick,
            ruleParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleRiskInfoResponseInfo {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    scanResult: ").append(toIndentedString(scanResult)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enableFix: ").append(toIndentedString(enableFix)).append("\n");
        sb.append("    enableClick: ").append(toIndentedString(enableClick)).append("\n");
        sb.append("    ruleParams: ").append(toIndentedString(ruleParams)).append("\n");
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
