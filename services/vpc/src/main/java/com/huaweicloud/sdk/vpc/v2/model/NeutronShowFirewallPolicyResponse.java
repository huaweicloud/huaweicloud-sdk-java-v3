package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronShowFirewallPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy")

    private NeutronFirewallPolicy firewallPolicy;

    public NeutronShowFirewallPolicyResponse withFirewallPolicy(NeutronFirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
        return this;
    }

    public NeutronShowFirewallPolicyResponse withFirewallPolicy(Consumer<NeutronFirewallPolicy> firewallPolicySetter) {
        if (this.firewallPolicy == null) {
            this.firewallPolicy = new NeutronFirewallPolicy();
            firewallPolicySetter.accept(this.firewallPolicy);
        }

        return this;
    }

    /**
     * Get firewallPolicy
     * @return firewallPolicy
     */
    public NeutronFirewallPolicy getFirewallPolicy() {
        return firewallPolicy;
    }

    public void setFirewallPolicy(NeutronFirewallPolicy firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronShowFirewallPolicyResponse that = (NeutronShowFirewallPolicyResponse) obj;
        return Objects.equals(this.firewallPolicy, that.firewallPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallPolicyResponse {\n");
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
