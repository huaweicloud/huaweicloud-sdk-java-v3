package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 待删除的安全组策略
 */
public class DeleteSecurityGroupPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<DeletedPolicy> policies = null;

    public DeleteSecurityGroupPolicyRequestBody withPolicies(List<DeletedPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public DeleteSecurityGroupPolicyRequestBody addPoliciesItem(DeletedPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public DeleteSecurityGroupPolicyRequestBody withPolicies(Consumer<List<DeletedPolicy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 待删除的安全组策略
     * @return policies
     */
    public List<DeletedPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<DeletedPolicy> policies) {
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
        DeleteSecurityGroupPolicyRequestBody that = (DeleteSecurityGroupPolicyRequestBody) obj;
        return Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecurityGroupPolicyRequestBody {\n");
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
