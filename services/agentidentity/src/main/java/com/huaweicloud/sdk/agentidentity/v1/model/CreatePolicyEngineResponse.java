package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePolicyEngineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engine")

    private PolicyEngine policyEngine;

    public CreatePolicyEngineResponse withPolicyEngine(PolicyEngine policyEngine) {
        this.policyEngine = policyEngine;
        return this;
    }

    public CreatePolicyEngineResponse withPolicyEngine(Consumer<PolicyEngine> policyEngineSetter) {
        if (this.policyEngine == null) {
            this.policyEngine = new PolicyEngine();
            policyEngineSetter.accept(this.policyEngine);
        }

        return this;
    }

    /**
     * Get policyEngine
     * @return policyEngine
     */
    public PolicyEngine getPolicyEngine() {
        return policyEngine;
    }

    public void setPolicyEngine(PolicyEngine policyEngine) {
        this.policyEngine = policyEngine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePolicyEngineResponse that = (CreatePolicyEngineResponse) obj;
        return Objects.equals(this.policyEngine, that.policyEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyEngine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePolicyEngineResponse {\n");
        sb.append("    policyEngine: ").append(toIndentedString(policyEngine)).append("\n");
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
