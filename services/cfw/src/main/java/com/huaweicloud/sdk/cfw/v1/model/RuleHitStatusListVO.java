package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RuleHitStatusListVO
 */
public class RuleHitStatusListVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_hit_count")

    private Long ruleHitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_last_hit_time")

    private Long ruleLastHitTime;

    public RuleHitStatusListVO withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释**： 规则ID **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public RuleHitStatusListVO withRuleHitCount(Long ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
        return this;
    }

    /**
     * **参数解释**： 规则命中次数 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ruleHitCount
     */
    public Long getRuleHitCount() {
        return ruleHitCount;
    }

    public void setRuleHitCount(Long ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
    }

    public RuleHitStatusListVO withRuleLastHitTime(Long ruleLastHitTime) {
        this.ruleLastHitTime = ruleLastHitTime;
        return this;
    }

    /**
     * **参数解释**： 命中时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return ruleLastHitTime
     */
    public Long getRuleLastHitTime() {
        return ruleLastHitTime;
    }

    public void setRuleLastHitTime(Long ruleLastHitTime) {
        this.ruleLastHitTime = ruleLastHitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleHitStatusListVO that = (RuleHitStatusListVO) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.ruleHitCount, that.ruleHitCount)
            && Objects.equals(this.ruleLastHitTime, that.ruleLastHitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, ruleHitCount, ruleLastHitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleHitStatusListVO {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    ruleHitCount: ").append(toIndentedString(ruleHitCount)).append("\n");
        sb.append("    ruleLastHitTime: ").append(toIndentedString(ruleLastHitTime)).append("\n");
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
