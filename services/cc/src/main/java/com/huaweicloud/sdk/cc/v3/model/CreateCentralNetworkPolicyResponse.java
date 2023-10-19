package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCentralNetworkPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_policy")

    private CentralNetworkPolicy centralNetworkPolicy;

    public CreateCentralNetworkPolicyResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateCentralNetworkPolicyResponse withCentralNetworkPolicy(CentralNetworkPolicy centralNetworkPolicy) {
        this.centralNetworkPolicy = centralNetworkPolicy;
        return this;
    }

    public CreateCentralNetworkPolicyResponse withCentralNetworkPolicy(
        Consumer<CentralNetworkPolicy> centralNetworkPolicySetter) {
        if (this.centralNetworkPolicy == null) {
            this.centralNetworkPolicy = new CentralNetworkPolicy();
            centralNetworkPolicySetter.accept(this.centralNetworkPolicy);
        }

        return this;
    }

    /**
     * Get centralNetworkPolicy
     * @return centralNetworkPolicy
     */
    public CentralNetworkPolicy getCentralNetworkPolicy() {
        return centralNetworkPolicy;
    }

    public void setCentralNetworkPolicy(CentralNetworkPolicy centralNetworkPolicy) {
        this.centralNetworkPolicy = centralNetworkPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCentralNetworkPolicyResponse that = (CreateCentralNetworkPolicyResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetworkPolicy, that.centralNetworkPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetworkPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkPolicyResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    centralNetworkPolicy: ").append(toIndentedString(centralNetworkPolicy)).append("\n");
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
