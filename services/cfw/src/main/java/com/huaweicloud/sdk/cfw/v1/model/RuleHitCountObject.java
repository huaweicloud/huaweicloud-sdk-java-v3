package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleHitCountObject
 */
public class RuleHitCountObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_hit_count")

    private Integer ruleHitCount;

    public RuleHitCountObject withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleHitCountObject withRuleHitCount(Integer ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
        return this;
    }

    /**
     * 规则击中次数，当acl规则被触发时，对应规则id的击中次数会添加一次。
     * @return ruleHitCount
     */
    public Integer getRuleHitCount() {
        return ruleHitCount;
    }

    public void setRuleHitCount(Integer ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleHitCountObject that = (RuleHitCountObject) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleHitCount, that.ruleHitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleHitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleHitCountObject {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleHitCount: ").append(toIndentedString(ruleHitCount)).append("\n");
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
