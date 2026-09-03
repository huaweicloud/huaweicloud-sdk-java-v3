package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class GetPolicyEngineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engine_id")

    private String policyEngineId;

    public GetPolicyEngineRequest withPolicyEngineId(String policyEngineId) {
        this.policyEngineId = policyEngineId;
        return this;
    }

    /**
     * System-generated unique identifier for the policy engine.
     * @return policyEngineId
     */
    public String getPolicyEngineId() {
        return policyEngineId;
    }

    public void setPolicyEngineId(String policyEngineId) {
        this.policyEngineId = policyEngineId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetPolicyEngineRequest that = (GetPolicyEngineRequest) obj;
        return Objects.equals(this.policyEngineId, that.policyEngineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyEngineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPolicyEngineRequest {\n");
        sb.append("    policyEngineId: ").append(toIndentedString(policyEngineId)).append("\n");
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
