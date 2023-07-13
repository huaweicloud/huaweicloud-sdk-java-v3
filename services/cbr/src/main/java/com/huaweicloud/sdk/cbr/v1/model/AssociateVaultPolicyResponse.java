package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssociateVaultPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_policy")

    private VaultPolicyResp associatePolicy;

    public AssociateVaultPolicyResponse withAssociatePolicy(VaultPolicyResp associatePolicy) {
        this.associatePolicy = associatePolicy;
        return this;
    }

    public AssociateVaultPolicyResponse withAssociatePolicy(Consumer<VaultPolicyResp> associatePolicySetter) {
        if (this.associatePolicy == null) {
            this.associatePolicy = new VaultPolicyResp();
            associatePolicySetter.accept(this.associatePolicy);
        }

        return this;
    }

    /**
     * Get associatePolicy
     * @return associatePolicy
     */
    public VaultPolicyResp getAssociatePolicy() {
        return associatePolicy;
    }

    public void setAssociatePolicy(VaultPolicyResp associatePolicy) {
        this.associatePolicy = associatePolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateVaultPolicyResponse that = (AssociateVaultPolicyResponse) obj;
        return Objects.equals(this.associatePolicy, that.associatePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associatePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateVaultPolicyResponse {\n");
        sb.append("    associatePolicy: ").append(toIndentedString(associatePolicy)).append("\n");
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
