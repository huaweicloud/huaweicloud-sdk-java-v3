package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.VaultPolicyResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateVaultPolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="associate_policy")
    
    private VaultPolicyResp associatePolicy = null;

    public AssociateVaultPolicyResponse withAssociatePolicy(VaultPolicyResp associatePolicy) {
        this.associatePolicy = associatePolicy;
        return this;
    }

    public AssociateVaultPolicyResponse withAssociatePolicy(Consumer<VaultPolicyResp> associatePolicySetter) {
        if(this.associatePolicy == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateVaultPolicyResponse associateVaultPolicyResponse = (AssociateVaultPolicyResponse) o;
        return Objects.equals(this.associatePolicy, associateVaultPolicyResponse.associatePolicy);
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

