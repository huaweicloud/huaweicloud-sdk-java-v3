package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** 基线的详细检查项信息
 */
public class SecurityCheckPolicyDetailInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_name")

    private String checkRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_type")

    private Integer checkRuleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checked")

    private Boolean checked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_params")

    private List<CheckRuleFixParamInfo> ruleParams = null;

    public SecurityCheckPolicyDetailInfoResponseInfo withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释** 检查项唯一值 **取值范围** 字符长度0-256位
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withCheckRuleId(String checkRuleId) {
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

    public SecurityCheckPolicyDetailInfoResponseInfo withCheckRuleName(String checkRuleName) {
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

    public SecurityCheckPolicyDetailInfoResponseInfo withCheckRuleType(Integer checkRuleType) {
        this.checkRuleType = checkRuleType;
        return this;
    }

    /**
     * **参数解释** 检查项类型是否是数值类型 **取值范围** - 1 : 是 - 0 : 不是
     * minimum: 0
     * maximum: 10
     * @return checkRuleType
     */
    public Integer getCheckRuleType() {
        return checkRuleType;
    }

    public void setCheckRuleType(Integer checkRuleType) {
        this.checkRuleType = checkRuleType;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）的类型，例如SSH、CentOS 7、Windows **取值范围** 字符长度0-256位
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释** 检查项的风险程度 **取值范围** - Low    : 低危 - Medium : 中危 - High   : 高危
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释** 配置检查（基线）检查项的版本信息 **取值范围** 字符长度0-32位
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withChecked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    /**
     * **参数解释** 检查项是否被选中 **取值范围** - true  : 被选中 - false : 未被选中
     * @return checked
     */
    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withRuleParams(List<CheckRuleFixParamInfo> ruleParams) {
        this.ruleParams = ruleParams;
        return this;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo addRuleParamsItem(CheckRuleFixParamInfo ruleParamsItem) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        this.ruleParams.add(ruleParamsItem);
        return this;
    }

    public SecurityCheckPolicyDetailInfoResponseInfo withRuleParams(
        Consumer<List<CheckRuleFixParamInfo>> ruleParamsSetter) {
        if (this.ruleParams == null) {
            this.ruleParams = new ArrayList<>();
        }
        ruleParamsSetter.accept(this.ruleParams);
        return this;
    }

    /**
     * **参数解释** 可自定义配置的参数
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
        SecurityCheckPolicyDetailInfoResponseInfo that = (SecurityCheckPolicyDetailInfoResponseInfo) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.checkRuleId, that.checkRuleId)
            && Objects.equals(this.checkRuleName, that.checkRuleName)
            && Objects.equals(this.checkRuleType, that.checkRuleType) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.level, that.level)
            && Objects.equals(this.checked, that.checked) && Objects.equals(this.ruleParams, that.ruleParams);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(key, checkRuleId, checkRuleName, checkRuleType, checkType, severity, level, checked, ruleParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityCheckPolicyDetailInfoResponseInfo {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    checkRuleName: ").append(toIndentedString(checkRuleName)).append("\n");
        sb.append("    checkRuleType: ").append(toIndentedString(checkRuleType)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
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
