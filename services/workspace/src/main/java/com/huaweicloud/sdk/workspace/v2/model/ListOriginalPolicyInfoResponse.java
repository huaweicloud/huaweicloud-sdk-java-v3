package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOriginalPolicyInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private Policies policies;

    public ListOriginalPolicyInfoResponse withPolicies(Policies policies) {
        this.policies = policies;
        return this;
    }

    public ListOriginalPolicyInfoResponse withPolicies(Consumer<Policies> policiesSetter) {
        if (this.policies == null) {
            this.policies = new Policies();
            policiesSetter.accept(this.policies);
        }

        return this;
    }

    /**
     * Get policies
     * @return policies
     */
    public Policies getPolicies() {
        return policies;
    }

    public void setPolicies(Policies policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOriginalPolicyInfoResponse that = (ListOriginalPolicyInfoResponse) obj;
        return Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOriginalPolicyInfoResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
