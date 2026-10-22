package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteAiGuardRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_ids")

    private List<String> ruleIds = null;

    public BatchDeleteAiGuardRuleResponse withRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }

    public BatchDeleteAiGuardRuleResponse addRuleIdsItem(String ruleIdsItem) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        this.ruleIds.add(ruleIdsItem);
        return this;
    }

    public BatchDeleteAiGuardRuleResponse withRuleIds(Consumer<List<String>> ruleIdsSetter) {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<>();
        }
        ruleIdsSetter.accept(this.ruleIds);
        return this;
    }

    /**
     * 已删除的规则ID列表
     * @return ruleIds
     */
    public List<String> getRuleIds() {
        return ruleIds;
    }

    public void setRuleIds(List<String> ruleIds) {
        this.ruleIds = ruleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteAiGuardRuleResponse that = (BatchDeleteAiGuardRuleResponse) obj;
        return Objects.equals(this.ruleIds, that.ruleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAiGuardRuleResponse {\n");
        sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
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
