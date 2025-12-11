package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个主机的单个检查项信息
 */
public class HostCheckRulesResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_type")

    private String resultType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_params")

    private List<CheckRuleFixParamInfo> ruleParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diff_description")

    private String diffDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fix")

    private Integer enableFix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_click")

    private Boolean enableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_verify")

    private Boolean enableVerify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_ignore_enable_click")

    private Boolean cancelIgnoreEnableClick;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_failed_reason")

    private String fixFailedReason;

    public HostCheckRulesResponseInfo withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释** 检查项id **取值范围** 字符长度0-256位
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public HostCheckRulesResponseInfo withCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
        return this;
    }

    /**
     * **参数解释** 检查项（检查规则）名称 **取值范围** 字符长度0-65534位
     * @return checkRuleName
     */
    public String getCheckRuleName() {
        return checkRuleName;
    }

    public void setCheckRuleName(String checkRuleName) {
        this.checkRuleName = checkRuleName;
    }

    public HostCheckRulesResponseInfo withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 基线检查中检查项的检查类型 - 访问控制 - 服务配置
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public HostCheckRulesResponseInfo withSeverity(String severity) {
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

    public HostCheckRulesResponseInfo withResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * **参数解释** 检测结果类型 **取值范围** - safe             : 已通过 - unhandled        : 未处理 - ignored          : 已忽略 - fixing           : 修复中 - fix-failed       : 修复失败 - verifying        : 验证中 - add_to_whitelist : 已加白
     * @return resultType
     */
    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public HostCheckRulesResponseInfo withRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
        return this;
    }

    public HostCheckRulesResponseInfo addRuleParamsItem(CheckRuleFixParamInfo ruleParamsItem) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        this.ruleParams.add(ruleParamsItem);
        return this;
    }

    public HostCheckRulesResponseInfo withRuleParams(Consumer<List<CheckRuleFixParamInfo>> ruleParamsSetter) {
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

    public HostCheckRulesResponseInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释** 检查项扫描时间(ms) **取值范围** 不涉及
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

    public HostCheckRulesResponseInfo withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * **参数解释** 主机类型，是cce则返回cce，否则返回null **取值范围** - cce
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public HostCheckRulesResponseInfo withDiffDescription(String diffDescription) {
        this.diffDescription = diffDescription;
        return this;
    }

    /**
     * **参数解释** 差异化展示提示信息 **取值范围** 字符长度0-2048位
     * @return diffDescription
     */
    public String getDiffDescription() {
        return diffDescription;
    }

    public void setDiffDescription(String diffDescription) {
        this.diffDescription = diffDescription;
    }

    public HostCheckRulesResponseInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 忽略或加白的描述 **取值范围** 字符长度0-512位
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HostCheckRulesResponseInfo withEnableFix(Integer enableFix) {
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

    public HostCheckRulesResponseInfo withEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
        return this;
    }

    /**
     * **参数解释** 该检查项的修复 & 验证 按钮是否可单击 **取值范围** - true  : 按钮可单击 - false : 按钮不可单击
     * @return enableClick
     */
    public Boolean getEnableClick() {
        return enableClick;
    }

    public void setEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
    }

    public HostCheckRulesResponseInfo withEnableVerify(Boolean enableVerify) {
        this.enableVerify = enableVerify;
        return this;
    }

    /**
     * **参数解释** 该检查项是否可验证，要求为Linux且agent版本>=3.2.24 **取值范围** - true  : 可验证 - false : 不可验证
     * @return enableVerify
     */
    public Boolean getEnableVerify() {
        return enableVerify;
    }

    public void setEnableVerify(Boolean enableVerify) {
        this.enableVerify = enableVerify;
    }

    public HostCheckRulesResponseInfo withCancelIgnoreEnableClick(Boolean cancelIgnoreEnableClick) {
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

    public HostCheckRulesResponseInfo withFixFailedReason(String fixFailedReason) {
        this.fixFailedReason = fixFailedReason;
        return this;
    }

    /**
     * **参数解释** 修复失败原因 **取值范围** 不涉及
     * @return fixFailedReason
     */
    public String getFixFailedReason() {
        return fixFailedReason;
    }

    public void setFixFailedReason(String fixFailedReason) {
        this.fixFailedReason = fixFailedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostCheckRulesResponseInfo that = (HostCheckRulesResponseInfo) obj;
        return Objects.equals(this.checkRuleId, that.checkRuleId)
            && Objects.equals(this.checkRuleName, that.checkRuleName) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.resultType, that.resultType)
            && Objects.equals(this.ruleParams, that.ruleParams) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.hostType, that.hostType)
            && Objects.equals(this.diffDescription, that.diffDescription)
            && Objects.equals(this.description, that.description) && Objects.equals(this.enableFix, that.enableFix)
            && Objects.equals(this.enableClick, that.enableClick)
            && Objects.equals(this.enableVerify, that.enableVerify)
            && Objects.equals(this.cancelIgnoreEnableClick, that.cancelIgnoreEnableClick)
            && Objects.equals(this.fixFailedReason, that.fixFailedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkRuleId,
            checkRuleName,
            tag,
            severity,
            resultType,
            ruleParams,
            scanTime,
            hostType,
            diffDescription,
            description,
            enableFix,
            enableClick,
            enableVerify,
            cancelIgnoreEnableClick,
            fixFailedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostCheckRulesResponseInfo {\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
        sb.append("    ruleParams: ").append(toIndentedString(ruleParams)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    diffDescription: ").append(toIndentedString(diffDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enableFix: ").append(toIndentedString(enableFix)).append("\n");
        sb.append("    enableClick: ").append(toIndentedString(enableClick)).append("\n");
        sb.append("    enableVerify: ").append(toIndentedString(enableVerify)).append("\n");
        sb.append("    cancelIgnoreEnableClick: ").append(toIndentedString(cancelIgnoreEnableClick)).append("\n");
        sb.append("    fixFailedReason: ").append(toIndentedString(fixFailedReason)).append("\n");
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
