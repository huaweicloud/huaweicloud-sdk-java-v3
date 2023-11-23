package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 治理策略详情。
 */
public class GovPolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matchGroup")

    private CreateBussinessScene matchGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<GovPolicyDetailPolicies> policies = null;

    public GovPolicyDetail withMatchGroup(CreateBussinessScene matchGroup) {
        this.matchGroup = matchGroup;
        return this;
    }

    public GovPolicyDetail withMatchGroup(Consumer<CreateBussinessScene> matchGroupSetter) {
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

    public GovPolicyDetail withPolicies(List<GovPolicyDetailPolicies> policies) {
        this.policies = policies;
        return this;
    }

    public GovPolicyDetail addPoliciesItem(GovPolicyDetailPolicies policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public GovPolicyDetail withPolicies(Consumer<List<GovPolicyDetailPolicies>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 治理策略定义。
     * @return policies
     */
    public List<GovPolicyDetailPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<GovPolicyDetailPolicies> policies) {
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
        GovPolicyDetail that = (GovPolicyDetail) obj;
        return Objects.equals(this.matchGroup, that.matchGroup) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchGroup, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GovPolicyDetail {\n");
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
