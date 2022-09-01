package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronUpdateFirewallRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule")

    @JacksonXmlProperty(localName = "firewall_rule")

    private NeutronFirewallRule firewallRule;

    public NeutronUpdateFirewallRuleResponse withFirewallRule(NeutronFirewallRule firewallRule) {
        this.firewallRule = firewallRule;
        return this;
    }

    public NeutronUpdateFirewallRuleResponse withFirewallRule(Consumer<NeutronFirewallRule> firewallRuleSetter) {
        if (this.firewallRule == null) {
            this.firewallRule = new NeutronFirewallRule();
            firewallRuleSetter.accept(this.firewallRule);
        }

        return this;
    }

    /**
     * Get firewallRule
     * @return firewallRule
     */
    public NeutronFirewallRule getFirewallRule() {
        return firewallRule;
    }

    public void setFirewallRule(NeutronFirewallRule firewallRule) {
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
        NeutronUpdateFirewallRuleResponse neutronUpdateFirewallRuleResponse = (NeutronUpdateFirewallRuleResponse) o;
        return Objects.equals(this.firewallRule, neutronUpdateFirewallRuleResponse.firewallRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallRuleResponse {\n");
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
