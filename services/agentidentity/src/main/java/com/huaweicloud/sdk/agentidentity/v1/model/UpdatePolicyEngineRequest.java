package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdatePolicyEngineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_engine_id")

    private String policyEngineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePolicyEngineReqBody body;

    public UpdatePolicyEngineRequest withPolicyEngineId(String policyEngineId) {
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

    public UpdatePolicyEngineRequest withBody(UpdatePolicyEngineReqBody body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyEngineRequest withBody(Consumer<UpdatePolicyEngineReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePolicyEngineReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePolicyEngineReqBody getBody() {
        return body;
    }

    public void setBody(UpdatePolicyEngineReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePolicyEngineRequest that = (UpdatePolicyEngineRequest) obj;
        return Objects.equals(this.policyEngineId, that.policyEngineId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyEngineId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyEngineRequest {\n");
        sb.append("    policyEngineId: ").append(toIndentedString(policyEngineId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
