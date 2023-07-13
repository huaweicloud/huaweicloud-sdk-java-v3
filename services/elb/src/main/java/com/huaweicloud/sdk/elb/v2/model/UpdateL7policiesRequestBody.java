package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateL7policiesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy")

    private UpdateL7policyReq l7policy;

    public UpdateL7policiesRequestBody withL7policy(UpdateL7policyReq l7policy) {
        this.l7policy = l7policy;
        return this;
    }

    public UpdateL7policiesRequestBody withL7policy(Consumer<UpdateL7policyReq> l7policySetter) {
        if (this.l7policy == null) {
            this.l7policy = new UpdateL7policyReq();
            l7policySetter.accept(this.l7policy);
        }

        return this;
    }

    /**
     * Get l7policy
     * @return l7policy
     */
    public UpdateL7policyReq getL7policy() {
        return l7policy;
    }

    public void setL7policy(UpdateL7policyReq l7policy) {
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
        UpdateL7policiesRequestBody that = (UpdateL7policiesRequestBody) obj;
        return Objects.equals(this.l7policy, that.l7policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7policiesRequestBody {\n");
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
