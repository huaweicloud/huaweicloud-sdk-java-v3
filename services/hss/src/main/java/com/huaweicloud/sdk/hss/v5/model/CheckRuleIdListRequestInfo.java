package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 检查项ID列表
 */
public class CheckRuleIdListRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rules")

    private List<CheckRuleKeyInfoRequestInfo> checkRules = null;

    public CheckRuleIdListRequestInfo withCheckRules(List<CheckRuleKeyInfoRequestInfo> checkRules) {
        this.checkRules = checkRules;
        return this;
    }

    public CheckRuleIdListRequestInfo addCheckRulesItem(CheckRuleKeyInfoRequestInfo checkRulesItem) {
        if (this.checkRules == null) {
            this.checkRules = new ArrayList<>();
        }
        this.checkRules.add(checkRulesItem);
        return this;
    }

    public CheckRuleIdListRequestInfo withCheckRules(Consumer<List<CheckRuleKeyInfoRequestInfo>> checkRulesSetter) {
        if (this.checkRules == null) {
            this.checkRules = new ArrayList<>();
        }
        checkRulesSetter.accept(this.checkRules);
        return this;
    }

    /**
     * 检查项ID列表
     * @return checkRules
     */
    public List<CheckRuleKeyInfoRequestInfo> getCheckRules() {
        return checkRules;
    }

    public void setCheckRules(List<CheckRuleKeyInfoRequestInfo> checkRules) {
        this.checkRules = checkRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckRuleIdListRequestInfo that = (CheckRuleIdListRequestInfo) obj;
        return Objects.equals(this.checkRules, that.checkRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRuleIdListRequestInfo {\n");
        sb.append("    checkRules: ").append(toIndentedString(checkRules)).append("\n");
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
