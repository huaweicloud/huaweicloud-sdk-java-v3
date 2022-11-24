package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrivacyComplianceSubtype
 */
public class PrivacyComplianceSubtype {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checker_rules")

    private List<CheckerRule> checkerRules = null;

    public PrivacyComplianceSubtype withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 隐私合规子类型描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PrivacyComplianceSubtype withCheckerRules(List<CheckerRule> checkerRules) {
        this.checkerRules = checkerRules;
        return this;
    }

    public PrivacyComplianceSubtype addCheckerRulesItem(CheckerRule checkerRulesItem) {
        if (this.checkerRules == null) {
            this.checkerRules = new ArrayList<>();
        }
        this.checkerRules.add(checkerRulesItem);
        return this;
    }

    public PrivacyComplianceSubtype withCheckerRules(Consumer<List<CheckerRule>> checkerRulesSetter) {
        if (this.checkerRules == null) {
            this.checkerRules = new ArrayList<>();
        }
        checkerRulesSetter.accept(this.checkerRules);
        return this;
    }

    /**
     * 检测项列表
     * @return checkerRules
     */
    public List<CheckerRule> getCheckerRules() {
        return checkerRules;
    }

    public void setCheckerRules(List<CheckerRule> checkerRules) {
        this.checkerRules = checkerRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivacyComplianceSubtype privacyComplianceSubtype = (PrivacyComplianceSubtype) o;
        return Objects.equals(this.desc, privacyComplianceSubtype.desc)
            && Objects.equals(this.checkerRules, privacyComplianceSubtype.checkerRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, checkerRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivacyComplianceSubtype {\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    checkerRules: ").append(toIndentedString(checkerRules)).append("\n");
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
