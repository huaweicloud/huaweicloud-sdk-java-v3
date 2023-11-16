package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 治理策略详情
 */
public class ListGovernancePolicyResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchGroup")

    private CreateBussinessScene matchGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<ListGovernancePolicyResponsePolicies> policies = null;

    public ListGovernancePolicyResponseBody withMatchGroup(CreateBussinessScene matchGroup) {
        this.matchGroup = matchGroup;
        return this;
    }

    public ListGovernancePolicyResponseBody withMatchGroup(Consumer<CreateBussinessScene> matchGroupSetter) {
        if (this.matchGroup == null) {
            this.matchGroup = new CreateBussinessScene();
            matchGroupSetter.accept(this.matchGroup);
        }

        return this;
    }

    /**
     * Get matchGroup
     * @return matchGroup
     */
    public CreateBussinessScene getMatchGroup() {
        return matchGroup;
    }

    public void setMatchGroup(CreateBussinessScene matchGroup) {
        this.matchGroup = matchGroup;
    }

    public ListGovernancePolicyResponseBody withPolicies(List<ListGovernancePolicyResponsePolicies> policies) {
        this.policies = policies;
        return this;
    }

    public ListGovernancePolicyResponseBody addPoliciesItem(ListGovernancePolicyResponsePolicies policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListGovernancePolicyResponseBody withPolicies(
        Consumer<List<ListGovernancePolicyResponsePolicies>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 治理策略定义
     * @return policies
     */
    public List<ListGovernancePolicyResponsePolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ListGovernancePolicyResponsePolicies> policies) {
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
        ListGovernancePolicyResponseBody that = (ListGovernancePolicyResponseBody) obj;
        return Objects.equals(this.matchGroup, that.matchGroup) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchGroup, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGovernancePolicyResponseBody {\n");
        sb.append("    matchGroup: ").append(toIndentedString(matchGroup)).append("\n");
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
