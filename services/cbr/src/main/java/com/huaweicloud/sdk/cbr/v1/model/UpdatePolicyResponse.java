package com.huaweicloud.sdk.cbr.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.Policy;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdatePolicyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy")
    
    private Policy policy;

    public UpdatePolicyResponse withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    public UpdatePolicyResponse withPolicy(Consumer<Policy> policySetter) {
        if(this.policy == null ){
            this.policy = new Policy();
            policySetter.accept(this.policy);
        }
        
        return this;
    }


    /**
     * Get policy
     * @return policy
     */
    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyResponse updatePolicyResponse = (UpdatePolicyResponse) o;
        return Objects.equals(this.policy, updatePolicyResponse.policy);
    }
    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyResponse {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

