package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule")

    private NeutronCreateFirewallRuleOption firewallRule;

    public NeutronCreateFirewallRuleRequestBody withFirewallRule(NeutronCreateFirewallRuleOption firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }

    public NeutronCreateFirewallRuleRequestBody withFirewallRule(
        Consumer<NeutronCreateFirewallRuleOption> firewallRuleSetter) {
        if (this.firewallRule == null) {
            this.firewallRule = new NeutronCreateFirewallRuleOption();
            firewallRuleSetter.accept(this.firewallRule);
        }

        return this;
    }

    /**
     * Get firewallRule
     * @return firewallRule
     */
    public NeutronCreateFirewallRuleOption getFirewallRule() {
        return firewallRule;
    }

    public void setFirewallRule(NeutronCreateFirewallRuleOption firewallRule) {
        this.firewallRule = firewallRule;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallRuleRequestBody neutronCreateFirewallRuleRequestBody =
            (NeutronCreateFirewallRuleRequestBody) o;
        return Objects.equals(this.firewallRule, neutronCreateFirewallRuleRequestBody.firewallRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallRuleRequestBody {\n");
        sb.append("    firewallRule: ").append(toIndentedString(firewallRule)).append("\n");
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
