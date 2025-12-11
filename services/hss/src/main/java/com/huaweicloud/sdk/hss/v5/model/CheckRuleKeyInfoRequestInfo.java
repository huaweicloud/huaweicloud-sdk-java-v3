package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查项key
 */
public class CheckRuleKeyInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_name")

    private String checkName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_id")

    private String checkRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standard")

    private String standard;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fix_values")

    private List<CheckRuleFixValuesInfo> fixValues = null;

    public CheckRuleKeyInfoRequestInfo withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * **参数解释**: 配置检查（基线）的名称，例如SSH、CentOS 7、Windows **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return checkName
     */
    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public CheckRuleKeyInfoRequestInfo withCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
        return this;
    }

    /**
     * **参数解释**: 检查项ID，值可以通过这个接口的返回数据获得：/v5/{project_id}/baseline/risk-config/{check_name}/check-rules **约束限制**: 不涉及 **取值范围**: 字符长度0-64位 **默认取值**: 不涉及 
     * @return checkRuleId
     */
    public String getCheckRuleId() {
        return checkRuleId;
    }

    public void setCheckRuleId(String checkRuleId) {
        this.checkRuleId = checkRuleId;
    }

    public CheckRuleKeyInfoRequestInfo withStandard(String standard) {
        this.standard = standard;
        return this;
    }

    /**
     * **参数解释**: 基线标准 **约束限制**: 不涉及 **取值范围**: - cn_standard：等保合规 - hw_standard：云安全实践 - cis_standard：通用安全标准  **默认取值**: 不涉及 
     * @return standard
     */
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public CheckRuleKeyInfoRequestInfo withFixValues(List<CheckRuleFixValuesInfo> fixValues) {
        this.fixValues = fixValues;
        return this;
    }

    public CheckRuleKeyInfoRequestInfo addFixValuesItem(CheckRuleFixValuesInfo fixValuesItem) {
        if (this.fixValues == null) {
            this.fixValues = new ArrayList<>();
        }
        this.fixValues.add(fixValuesItem);
        return this;
    }

    public CheckRuleKeyInfoRequestInfo withFixValues(Consumer<List<CheckRuleFixValuesInfo>> fixValuesSetter) {
        if (this.fixValues == null) {
            this.fixValues = new ArrayList<>();
        }
        fixValuesSetter.accept(this.fixValues);
        return this;
    }

    /**
     * **参数解释**: 用户键入的检查项修复参数数组 **约束限制**: 不涉及 **取值范围**: 元素个数0-10000 **默认取值**: 不涉及 
     * @return fixValues
     */
    public List<CheckRuleFixValuesInfo> getFixValues() {
        return fixValues;
    }

    public void setFixValues(List<CheckRuleFixValuesInfo> fixValues) {
        this.fixValues = fixValues;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleKeyInfoRequestInfo that = (CheckRuleKeyInfoRequestInfo) obj;
        return Objects.equals(this.checkName, that.checkName) && Objects.equals(this.checkRuleId, that.checkRuleId)
            && Objects.equals(this.standard, that.standard) && Objects.equals(this.fixValues, that.fixValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkName, checkRuleId, standard, fixValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleKeyInfoRequestInfo {\n");
        sb.append("    checkName: ").append(toIndentedString(checkName)).append("\n");
        sb.append("    checkRuleId: ").append(toIndentedString(checkRuleId)).append("\n");
        sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
        sb.append("    fixValues: ").append(toIndentedString(fixValues)).append("\n");
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
