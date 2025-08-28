package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteL7RuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy_id")

    private String l7policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7rule_id")

    private String l7ruleId;

    public DeleteL7RuleRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    /**
     * **参数解释**：策略ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    public DeleteL7RuleRequest withL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
        return this;
    }

    /**
     * **参数解释**：规则ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return l7ruleId
     */
    public String getL7ruleId() {
        return l7ruleId;
    }

    public void setL7ruleId(String l7ruleId) {
        this.l7ruleId = l7ruleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteL7RuleRequest that = (DeleteL7RuleRequest) obj;
        return Objects.equals(this.l7policyId, that.l7policyId) && Objects.equals(this.l7ruleId, that.l7ruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policyId, l7ruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteL7RuleRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
        sb.append("    l7ruleId: ").append(toIndentedString(l7ruleId)).append("\n");
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
