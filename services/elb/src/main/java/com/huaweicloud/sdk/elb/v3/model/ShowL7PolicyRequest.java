package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowL7PolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy_id")

    private String l7policyId;

    public ShowL7PolicyRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    /**
     * **参数解释**：转发策略ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return l7policyId
     */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowL7PolicyRequest that = (ShowL7PolicyRequest) obj;
        return Objects.equals(this.l7policyId, that.l7policyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowL7PolicyRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
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
