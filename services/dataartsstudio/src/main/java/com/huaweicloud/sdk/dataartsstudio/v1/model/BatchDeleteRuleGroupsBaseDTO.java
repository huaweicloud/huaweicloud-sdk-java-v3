package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteRuleGroupsBaseDTO
 */
public class BatchDeleteRuleGroupsBaseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_group_ids")

    private List<String> ruleGroupIds = null;

    public BatchDeleteRuleGroupsBaseDTO withRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
        return this;
    }

    public BatchDeleteRuleGroupsBaseDTO addRuleGroupIdsItem(String ruleGroupIdsItem) {
        if (this.ruleGroupIds == null) {
            this.ruleGroupIds = new ArrayList<>();
        }
        this.ruleGroupIds.add(ruleGroupIdsItem);
        return this;
    }

    public BatchDeleteRuleGroupsBaseDTO withRuleGroupIds(Consumer<List<String>> ruleGroupIdsSetter) {
        if (this.ruleGroupIds == null) {
            this.ruleGroupIds = new ArrayList<>();
        }
        ruleGroupIdsSetter.accept(this.ruleGroupIds);
        return this;
    }

    /**
     * 识别规则组id列表
     * @return ruleGroupIds
     */
    public List<String> getRuleGroupIds() {
        return ruleGroupIds;
    }

    public void setRuleGroupIds(List<String> ruleGroupIds) {
        this.ruleGroupIds = ruleGroupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteRuleGroupsBaseDTO that = (BatchDeleteRuleGroupsBaseDTO) obj;
        return Objects.equals(this.ruleGroupIds, that.ruleGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRuleGroupsBaseDTO {\n");
        sb.append("    ruleGroupIds: ").append(toIndentedString(ruleGroupIds)).append("\n");
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
