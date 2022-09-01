package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DisassociateVaultPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dissociate_policy")

    @JacksonXmlProperty(localName = "dissociate_policy")

    private VaultPolicyResp dissociatePolicy;

    public DisassociateVaultPolicyResponse withDissociatePolicy(VaultPolicyResp dissociatePolicy) {
        this.dissociatePolicy = dissociatePolicy;
        return this;
    }

    public DisassociateVaultPolicyResponse withDissociatePolicy(Consumer<VaultPolicyResp> dissociatePolicySetter) {
        if (this.dissociatePolicy == null) {
            this.dissociatePolicy = new VaultPolicyResp();
            dissociatePolicySetter.accept(this.dissociatePolicy);
        }

        return this;
    }

    /**
     * Get dissociatePolicy
     * @return dissociatePolicy
     */
    public VaultPolicyResp getDissociatePolicy() {
        return dissociatePolicy;
    }

    public void setDissociatePolicy(VaultPolicyResp dissociatePolicy) {
        this.dissociatePolicy = dissociatePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateVaultPolicyResponse disassociateVaultPolicyResponse = (DisassociateVaultPolicyResponse) o;
        return Objects.equals(this.dissociatePolicy, disassociateVaultPolicyResponse.dissociatePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dissociatePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateVaultPolicyResponse {\n");
        sb.append("    dissociatePolicy: ").append(toIndentedString(dissociatePolicy)).append("\n");
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
