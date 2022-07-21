package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAlarmRulePoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<Policy> policies = null;

    public UpdateAlarmRulePoliciesResponse withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public UpdateAlarmRulePoliciesResponse addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public UpdateAlarmRulePoliciesResponse withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 策略信息
     * @return policies
     */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmRulePoliciesResponse updateAlarmRulePoliciesResponse = (UpdateAlarmRulePoliciesResponse) o;
        return Objects.equals(this.policies, updateAlarmRulePoliciesResponse.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmRulePoliciesResponse {\n");
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
