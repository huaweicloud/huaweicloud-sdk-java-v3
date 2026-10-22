package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteBotMTrafficDetectionConditionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_id")

    private String conditionId;

    public DeleteBotMTrafficDetectionConditionRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * policyId
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public DeleteBotMTrafficDetectionConditionRequest withConditionId(String conditionId) {
        this.conditionId = conditionId;
        return this;
    }

    /**
     * 流量检测条件Id
     * @return conditionId
     */
    public String getConditionId() {
        return conditionId;
    }

    public void setConditionId(String conditionId) {
        this.conditionId = conditionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteBotMTrafficDetectionConditionRequest that = (DeleteBotMTrafficDetectionConditionRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.conditionId, that.conditionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, conditionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteBotMTrafficDetectionConditionRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
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
