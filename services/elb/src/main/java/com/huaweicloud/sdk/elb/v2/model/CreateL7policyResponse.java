package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateL7policyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private L7policyResp l7policy;

    public CreateL7policyResponse withL7policy(L7policyResp l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public CreateL7policyResponse withL7policy(Consumer<L7policyResp> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new L7policyResp();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    /**
     * Get l7policy
     * @return l7policy
     */
    public L7policyResp getL7policy() {
        return l7policy;
    }

    public void setL7policy(L7policyResp l7policy) {
        this.l7policy = l7policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateL7policyResponse that = (CreateL7policyResponse) obj;
        return Objects.equals(this.l7policy, that.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7policyResponse {\n");
        sb.append("    l7policy: ").append(toIndentedString(l7policy)).append("\n");
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
