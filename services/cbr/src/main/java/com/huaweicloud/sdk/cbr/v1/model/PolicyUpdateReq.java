package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 策略修改body */
public class PolicyUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private PolicyUpdate policy;

    public PolicyUpdateReq withPolicy(PolicyUpdate policy) {
        this.policy = policy;
        return this;
    }

    public PolicyUpdateReq withPolicy(Consumer<PolicyUpdate> policySetter) {
        if (this.policy == null) {
            this.policy = new PolicyUpdate();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /** Get policy
     * 
     * @return policy */
    public PolicyUpdate getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyUpdate policy) {
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
        PolicyUpdateReq policyUpdateReq = (PolicyUpdateReq) o;
        return Objects.equals(this.policy, policyUpdateReq.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyUpdateReq {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
