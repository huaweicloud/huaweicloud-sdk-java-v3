package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 更新防火墙规则的参数 */
public class UpdateFirewallRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_firewall_policy")

    private FirewallPolicy egressFirewallPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_firewall_policy")

    private FirewallPolicy ingressFirewallPolicy;

    public UpdateFirewallRuleOption withEgressFirewallPolicy(FirewallPolicy egressFirewallPolicy) {
        this.egressFirewallPolicy = egressFirewallPolicy;
        return this;
    }

    public UpdateFirewallRuleOption withEgressFirewallPolicy(Consumer<FirewallPolicy> egressFirewallPolicySetter) {
        if (this.egressFirewallPolicy == null) {
            this.egressFirewallPolicy = new FirewallPolicy();
            egressFirewallPolicySetter.accept(this.egressFirewallPolicy);
        }

        return this;
    }

    /** Get egressFirewallPolicy
     * 
     * @return egressFirewallPolicy */
    public FirewallPolicy getEgressFirewallPolicy() {
        return egressFirewallPolicy;
    }

    public void setEgressFirewallPolicy(FirewallPolicy egressFirewallPolicy) {
        this.egressFirewallPolicy = egressFirewallPolicy;
    }

    public UpdateFirewallRuleOption withIngressFirewallPolicy(FirewallPolicy ingressFirewallPolicy) {
        this.ingressFirewallPolicy = ingressFirewallPolicy;
        return this;
    }

    public UpdateFirewallRuleOption withIngressFirewallPolicy(Consumer<FirewallPolicy> ingressFirewallPolicySetter) {
        if (this.ingressFirewallPolicy == null) {
            this.ingressFirewallPolicy = new FirewallPolicy();
            ingressFirewallPolicySetter.accept(this.ingressFirewallPolicy);
        }

        return this;
    }

    /** Get ingressFirewallPolicy
     * 
     * @return ingressFirewallPolicy */
    public FirewallPolicy getIngressFirewallPolicy() {
        return ingressFirewallPolicy;
    }

    public void setIngressFirewallPolicy(FirewallPolicy ingressFirewallPolicy) {
        this.ingressFirewallPolicy = ingressFirewallPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFirewallRuleOption updateFirewallRuleOption = (UpdateFirewallRuleOption) o;
        return Objects.equals(this.egressFirewallPolicy, updateFirewallRuleOption.egressFirewallPolicy)
            && Objects.equals(this.ingressFirewallPolicy, updateFirewallRuleOption.ingressFirewallPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(egressFirewallPolicy, ingressFirewallPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRuleOption {\n");
        sb.append("    egressFirewallPolicy: ").append(toIndentedString(egressFirewallPolicy)).append("\n");
        sb.append("    ingressFirewallPolicy: ").append(toIndentedString(ingressFirewallPolicy)).append("\n");
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
