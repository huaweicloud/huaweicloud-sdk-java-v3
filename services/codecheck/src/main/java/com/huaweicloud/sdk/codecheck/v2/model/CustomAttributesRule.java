package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CustomAttributesRule */
public class CustomAttributesRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_config_list")

    private List<RuleConfig> ruleConfigList = null;

    public CustomAttributesRule withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /** 规则ID
     * 
     * @return ruleId */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public CustomAttributesRule withValue(String value) {
        this.value = value;
        return this;
    }

    /** attribute的问题级别，0致命，1严重，2一般，3提示
     * 
     * @return value */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CustomAttributesRule withRuleConfigList(List<RuleConfig> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
        return this;
    }

    public CustomAttributesRule addRuleConfigListItem(RuleConfig ruleConfigListItem) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        this.ruleConfigList.add(ruleConfigListItem);
        return this;
    }

    public CustomAttributesRule withRuleConfigList(Consumer<List<RuleConfig>> ruleConfigListSetter) {
        if (this.ruleConfigList == null) {
            this.ruleConfigList = new ArrayList<>();
        }
        ruleConfigListSetter.accept(this.ruleConfigList);
        return this;
    }

    /** 规则阈值详细
     * 
     * @return ruleConfigList */
    public List<RuleConfig> getRuleConfigList() {
        return ruleConfigList;
    }

    public void setRuleConfigList(List<RuleConfig> ruleConfigList) {
        this.ruleConfigList = ruleConfigList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomAttributesRule customAttributesRule = (CustomAttributesRule) o;
        return Objects.equals(this.ruleId, customAttributesRule.ruleId)
            && Objects.equals(this.value, customAttributesRule.value)
            && Objects.equals(this.ruleConfigList, customAttributesRule.ruleConfigList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, value, ruleConfigList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomAttributesRule {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    ruleConfigList: ").append(toIndentedString(ruleConfigList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
