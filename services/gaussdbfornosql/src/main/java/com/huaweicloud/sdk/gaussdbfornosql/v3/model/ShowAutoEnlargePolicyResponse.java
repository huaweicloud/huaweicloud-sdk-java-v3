package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutoEnlargePolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private DiskAutoExpansionPolicy policy;

    public ShowAutoEnlargePolicyResponse withPolicy(DiskAutoExpansionPolicy policy) {
        this.policy = policy;
        return this;
    }

    public ShowAutoEnlargePolicyResponse withPolicy(Consumer<DiskAutoExpansionPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new DiskAutoExpansionPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public DiskAutoExpansionPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(DiskAutoExpansionPolicy policy) {
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
        ShowAutoEnlargePolicyResponse showAutoEnlargePolicyResponse = (ShowAutoEnlargePolicyResponse) o;
        return Objects.equals(this.policy, showAutoEnlargePolicyResponse.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoEnlargePolicyResponse {\n");
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
