package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查项信息
 */
public class CheckRulesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_name")

    private String checkTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Integer failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistics_scan_result")

    private String statisticsScanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fix")

    private Integer enableFix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_click")

    private Boolean enableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_ignore_enable_click")

    private Boolean cancelIgnoreEnableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_params")

    private List<CheckRuleFixParamInfo> ruleParams = null;

    public CheckRulesResponseInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释** 基线检查项的类型 **取值范围** 字符长度0-256位
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public CheckRulesResponseInfo withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * **参数解释** 检查项（检查规则）名称 **取值范围** 字符长度0-2048位
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public CheckRulesResponseInfo withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释** 检查项ID **取值范围** 字符长度0-64位
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public CheckRulesResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释** 风险等级，包含如下: **取值范围** - Low    : 低危 - Medium : 中危 - High   : 高危
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public CheckRulesResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的类型,Linux系统支持的基线一般check_type和check_name相同,例如SSH、CentOS 7。 Windows系统支持的基线一般check_type和check_name不相同，例如check_name为Windows的配置检查（基线），它的check_type包含Windows Server 2019 R2、Windows Server 2016 R2等。 **取值范围** 字符长度0-256位
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public CheckRulesResponseInfo withCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的类型名称, 一般为check_type + 系统基线检查|应用基线检查 **取值范围** 字符长度0-256位
     * @return checkTypeName
     */
    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName;
    }

    public CheckRulesResponseInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释** 标准类型，包含如下3种 **取值范围** - cn_standard : 等保合规标准 - hw_standard : 云安全实践标准 - cis_standard : 通用安全标准
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public CheckRulesResponseInfo withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释** 受影响的服务器的数量，进行了当前基线检测的服务器数量 **取值范围** 取值0-2147483647
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

    public CheckRulesResponseInfo withFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * **参数解释** 此检测项失败，且未忽略且未加白的主机数 **取值范围** 取值0-2147483647
     * minimum: 0
     * maximum: 2147483647
     * @return failedNum
     */
    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public CheckRulesResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 最新检测时间(ms)
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

    public CheckRulesResponseInfo withStatisticsScanResult(String statisticsScanResult) {
        this.statisticsScanResult = statisticsScanResult;
        return this;
    }

    /**
     * **参数解释** 检查项统计结果： **取值范围** - pass      : 已通过，表示此检查项涉及的主机，全部检查通过。 - failed    : 未通过，表示此检查项涉及的主机，存在检查不通过，且不通过的主机中，存在未处理(忽略、加白)主机。 - processed : 已处理，表示此检查项涉及的主机，存在未通过，但所有的未通过主机均已处理(忽略、加白)。
     * @return statisticsScanResult
     */
    public String getStatisticsScanResult() {
        return statisticsScanResult;
    }

    public void setStatisticsScanResult(String statisticsScanResult) {
        this.statisticsScanResult = statisticsScanResult;
    }

    public CheckRulesResponseInfo withEnableFix(Integer enableFix) {
        this.enableFix = enableFix;
        return this;
    }

    /**
     * **参数解释** 是否支持一键修复 **取值范围** - 1 : 支持一键修复 - 0 : 不支持
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

    public CheckRulesResponseInfo withEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
        return this;
    }

    /**
     * **参数解释** 该检查项的 修复 & 验证 按钮是否可单击 **取值范围** - true  : 按钮可单击 - false : 按钮不可单击
     * @return enableClick
     */
    public Boolean getEnableClick() {
        return enableClick;
    }

    public void setEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
    }

    public CheckRulesResponseInfo withCancelIgnoreEnableClick(Boolean cancelIgnoreEnableClick) {
        this.cancelIgnoreEnableClick = cancelIgnoreEnableClick;
        return this;
    }

    /**
     * **参数解释** 已忽略检查项是否可点击 **取值范围** - true  : 按钮可单击 - false : 按钮不可单击
     * @return cancelIgnoreEnableClick
     */
    public Boolean getCancelIgnoreEnableClick() {
        return cancelIgnoreEnableClick;
    }

    public void setCancelIgnoreEnableClick(Boolean cancelIgnoreEnableClick) {
        this.cancelIgnoreEnableClick = cancelIgnoreEnableClick;
    }

    public CheckRulesResponseInfo withRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
        return this;
    }

    public CheckRulesResponseInfo addRuleParamsItem(CheckRuleFixParamInfo ruleParamsItem) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        this.ruleParams.add(ruleParamsItem);
        return this;
    }

    public CheckRulesResponseInfo withRuleParams(Consumer<List<CheckRuleFixParamInfo>> ruleParamsSetter) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        ruleParamsSetter.accept(this.ruleParams);
        return this;
    }

    /**
     * **参数解释** 支持传递参数修复的检查项可传递参数的范围，只有支持传递参数修复的检查项才返回此数据
     * @return ruleParams
     */
    public List<CheckRuleFixParamInfo> getRuleParams() {
        return ruleParams;
    }

    public void setRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRulesResponseInfo that = (CheckRulesResponseInfo) obj;
        return Objects.equals(this.tag, that.tag) && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.checkRuleId, that.checkRuleId) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.checkTypeName, that.checkTypeName)
            && Objects.equals(this.standard, that.standard) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.failedNum, that.failedNum) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.statisticsScanResult, that.statisticsScanResult)
            && Objects.equals(this.enableFix, that.enableFix) && Objects.equals(this.enableClick, that.enableClick)
            && Objects.equals(this.cancelIgnoreEnableClick, that.cancelIgnoreEnableClick)
            && Objects.equals(this.ruleParams, that.ruleParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag,
            checkRuleName,
            checkRuleId,
            severity,
            checkType,
            checkTypeName,
            standard,
            hostNum,
            failedNum,
            scanTime,
            statisticsScanResult,
            enableFix,
            enableClick,
            cancelIgnoreEnableClick,
            ruleParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRulesResponseInfo {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    checkTypeName: ").append(toIndentedString(checkTypeName)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    statisticsScanResult: ").append(toIndentedString(statisticsScanResult)).append("\n");
        sb.append("    enableFix: ").append(toIndentedString(enableFix)).append("\n");
        sb.append("    enableClick: ").append(toIndentedString(enableClick)).append("\n");
        sb.append("    cancelIgnoreEnableClick: ").append(toIndentedString(cancelIgnoreEnableClick)).append("\n");
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
