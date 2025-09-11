package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAlarmRulePoliciesReqBodyV2
 */
public class UpdateAlarmRulePoliciesReqBodyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<UpdatePolicyReq> policies = null;

    public UpdateAlarmRulePoliciesReqBodyV2 withPolicies(List<UpdatePolicyReq> policies) {
        this.policies = policies;
        return this;
    }

    public UpdateAlarmRulePoliciesReqBodyV2 addPoliciesItem(UpdatePolicyReq policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public UpdateAlarmRulePoliciesReqBodyV2 withPolicies(Consumer<List<UpdatePolicyReq>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * **参数解释**： 策略信息。 **约束限制**： 策略信息数量最多为50个。 
     * @return policies
     */
    public List<UpdatePolicyReq> getPolicies() {
        return policies;
    }

    public void setPolicies(List<UpdatePolicyReq> policies) {
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
        UpdateAlarmRulePoliciesReqBodyV2 that = (UpdateAlarmRulePoliciesReqBodyV2) obj;
        return Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmRulePoliciesReqBodyV2 {\n");
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
