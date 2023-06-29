package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ShowSyncPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_version")

    private Long policyVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_updateTime")

    private String policyUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<Policy> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_deltas")

    private List<PolicyDelta> policyDeltas = null;

    public ShowSyncPolicyResponse withPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }

    /**
     * 策略版本
     * @return policyVersion
     */
    public Long getPolicyVersion() {
        return policyVersion;
    }

    public void setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
    }

    public ShowSyncPolicyResponse withPolicyUpdateTime(String policyUpdateTime) {
        this.policyUpdateTime = policyUpdateTime;
        return this;
    }

    /**
     * 策略更新时间
     * @return policyUpdateTime
     */
    public String getPolicyUpdateTime() {
        return policyUpdateTime;
    }

    public void setPolicyUpdateTime(String policyUpdateTime) {
        this.policyUpdateTime = policyUpdateTime;
    }

    public ShowSyncPolicyResponse withPolicies(List<Policy> policies) {
        this.policies = policies;
        return this;
    }

    public ShowSyncPolicyResponse addPoliciesItem(Policy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ShowSyncPolicyResponse withPolicies(Consumer<List<Policy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 权限策略信息
     * @return policies
     */
    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }

    public ShowSyncPolicyResponse withPolicyDeltas(List<PolicyDelta> policyDeltas) {
        this.policyDeltas = policyDeltas;
        return this;
    }

    public ShowSyncPolicyResponse addPolicyDeltasItem(PolicyDelta policyDeltasItem) {
        if (this.policyDeltas == null) {
            this.policyDeltas = new ArrayList<>();
        }
        this.policyDeltas.add(policyDeltasItem);
        return this;
    }

    public ShowSyncPolicyResponse withPolicyDeltas(Consumer<List<PolicyDelta>> policyDeltasSetter) {
        if (this.policyDeltas == null) {
            this.policyDeltas = new ArrayList<>();
        }
        policyDeltasSetter.accept(this.policyDeltas);
        return this;
    }

    /**
     * 增量权限策略信息
     * @return policyDeltas
     */
    public List<PolicyDelta> getPolicyDeltas() {
        return policyDeltas;
    }

    public void setPolicyDeltas(List<PolicyDelta> policyDeltas) {
        this.policyDeltas = policyDeltas;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSyncPolicyResponse that = (ShowSyncPolicyResponse) obj;
        return Objects.equals(this.policyVersion, that.policyVersion)
            && Objects.equals(this.policyUpdateTime, that.policyUpdateTime)
            && Objects.equals(this.policies, that.policies) && Objects.equals(this.policyDeltas, that.policyDeltas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyVersion, policyUpdateTime, policies, policyDeltas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncPolicyResponse {\n");
        sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
        sb.append("    policyUpdateTime: ").append(toIndentedString(policyUpdateTime)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    policyDeltas: ").append(toIndentedString(policyDeltas)).append("\n");
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
