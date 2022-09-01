package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronUpdateFirewallPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy")

    @JacksonXmlProperty(localName = "firewall_policy")

    private NeutronUpdateFirewallPolicyOption firewallPolicy;

    public NeutronUpdateFirewallPolicyRequestBody withFirewallPolicy(NeutronUpdateFirewallPolicyOption firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    public NeutronUpdateFirewallPolicyRequestBody withFirewallPolicy(
        Consumer<NeutronUpdateFirewallPolicyOption> firewallPolicySetter) {
        if (this.firewallPolicy == null) {
            this.firewallPolicy = new NeutronUpdateFirewallPolicyOption();
            firewallPolicySetter.accept(this.firewallPolicy);
        }

        return this;
    }

    /**
     * Get firewallPolicy
     * @return firewallPolicy
     */
    public NeutronUpdateFirewallPolicyOption getFirewallPolicy() {
        return firewallPolicy;
    }

    public void setFirewallPolicy(NeutronUpdateFirewallPolicyOption firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallPolicyRequestBody neutronUpdateFirewallPolicyRequestBody =
            (NeutronUpdateFirewallPolicyRequestBody) o;
        return Objects.equals(this.firewallPolicy, neutronUpdateFirewallPolicyRequestBody.firewallPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallPolicyRequestBody {\n");
        sb.append("    firewallPolicy: ").append(toIndentedString(firewallPolicy)).append("\n");
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
