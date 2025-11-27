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
    @JsonProperty(value = "not_enable_click_description")

    private String notEnableClickDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_params")

    private List<CheckRuleFixParamInfo> ruleParams = null;

    public CheckRuleRiskInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**: 风险等级 **取值范围**: - Low：低危 - Medium：中危 - High：高危 
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
     * **参数解释**: 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **取值范围**: 不涉及 
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
     * **参数解释**: 配置检查（基线）的类型,Linux系统支持的基线一般check_type和check_name相同,例如SSH、CentOS 7。 Windows系统支持的基线一般check_type和check_name不相同，例如check_name为Windows的配置检查（基线），它的check_type包含Windows Server 2019 R2、Windows Server 2016 R2等。 **取值范围**: 不涉及 
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
     * **参数解释**: 标准类型 **取值范围**: - cn_standard：等保合规标准 - hw_standard：云安全实践标准 
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
     * **参数解释**: 检查项（检查规则）名称 **取值范围**: 不涉及 
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
     * **参数解释**: 检查项ID **取值范围**: 不涉及 
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
     * **参数解释**: 受影响的服务器的数量，进行了当前基线检测的服务器数量 **取值范围**: 不涉及 
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
     * **参数解释**: 检测结果 **取值范围**: - pass : 检测通过 - failed : 检测不通过 
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
     * **参数解释**: 检测项状态 **取值范围**: - safe : 无需处理 - ignored : 已忽略 - unhandled : 未处理 - fixing : 修复中 - fix-failed : 修复失败 - verifying : 验证中 
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
     * **参数解释**: 是否支持一键修复 **取值范围**: - 1：支持一键修复 - 0：不支持 
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
     * **参数解释**: 该检查项的修复&忽略&验证按钮是否可单击 **取值范围**: - true：按钮可单击 - false：按钮不可单击 
     * @return enableClick
     */
    public Boolean getEnableClick() {
        return enableClick;
    }

    public void setEnableClick(Boolean enableClick) {
        this.enableClick = enableClick;
    }

    public CheckRuleRiskInfoResponseInfo withNotEnableClickDescription(String notEnableClickDescription) {
        this.notEnableClickDescription = notEnableClickDescription;
        return this;
    }

    /**
     * **参数解释** 不可点击的原因 **取值范围**  字符长度0-512位
     * @return notEnableClickDescription
     */
    public String getNotEnableClickDescription() {
        return notEnableClickDescription;
    }

    public void setNotEnableClickDescription(String notEnableClickDescription) {
        this.notEnableClickDescription = notEnableClickDescription;
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
     * **参数解释**: 支持传递参数修复的检查项可传递参数的范围，只有支持传递参数修复的检查项才返回此数据 **取值范围**: 不涉及 
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
        CheckRuleRiskInfoResponseInfo that = (CheckRuleRiskInfoResponseInfo) obj;
        return Objects.equals(this.severity, that.severity) && Objects.equals(this.checkName, that.checkName)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.standard, that.standard)
            && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.checkRuleId, that.checkRuleId) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.scanResult, that.scanResult) && Objects.equals(this.status, that.status)
            && Objects.equals(this.enableFix, that.enableFix) && Objects.equals(this.enableClick, that.enableClick)
            && Objects.equals(this.notEnableClickDescription, that.notEnableClickDescription)
            && Objects.equals(this.ruleParams, that.ruleParams);
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
            notEnableClickDescription,
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
        sb.append("    notEnableClickDescription: ").append(toIndentedString(notEnableClickDescription)).append("\n");
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
