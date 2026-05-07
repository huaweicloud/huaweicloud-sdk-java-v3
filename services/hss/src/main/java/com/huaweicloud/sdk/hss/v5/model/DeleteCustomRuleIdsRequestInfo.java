package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DeleteCustomRuleIdsRequestInfo
 */
public class DeleteCustomRuleIdsRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id_list")

    private List<String> ruleIdList = null;

    public DeleteCustomRuleIdsRequestInfo withRuleIdList(List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }

    public DeleteCustomRuleIdsRequestInfo addRuleIdListItem(String ruleIdListItem) {
        if (this.ruleIdList == null) {
            this.ruleIdList = new ArrayList<>();
        }
        this.ruleIdList.add(ruleIdListItem);
        return this;
    }

    public DeleteCustomRuleIdsRequestInfo withRuleIdList(Consumer<List<String>> ruleIdListSetter) {
        if (this.ruleIdList == null) {
            this.ruleIdList = new ArrayList<>();
        }
        ruleIdListSetter.accept(this.ruleIdList);
        return this;
    }

    /**
     * **参数解释**： 规则ID列表 **约束限制**: 必填 **取值范围**: 1-1000个规则ID **默认取值**: 不涉及 
     * @return ruleIdList
     */
    public List<String> getRuleIdList() {
        return ruleIdList;
    }

    public void setRuleIdList(List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCustomRuleIdsRequestInfo that = (DeleteCustomRuleIdsRequestInfo) obj;
        return Objects.equals(this.ruleIdList, that.ruleIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCustomRuleIdsRequestInfo {\n");
        sb.append("    ruleIdList: ").append(toIndentedString(ruleIdList)).append("\n");
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
