package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronShowFirewallGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_group")

    private NeutronFirewallGroup firewallGroup;

    public NeutronShowFirewallGroupResponse withFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
        return this;
    }

    public NeutronShowFirewallGroupResponse withFirewallGroup(Consumer<NeutronFirewallGroup> firewallGroupSetter) {
        if (this.firewallGroup == null) {
            this.firewallGroup = new NeutronFirewallGroup();
            firewallGroupSetter.accept(this.firewallGroup);
        }

        return this;
    }

    /**
     * Get firewallGroup
     * @return firewallGroup
     */
    public NeutronFirewallGroup getFirewallGroup() {
        return firewallGroup;
    }

    public void setFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronShowFirewallGroupResponse neutronShowFirewallGroupResponse = (NeutronShowFirewallGroupResponse) o;
        return Objects.equals(this.firewallGroup, neutronShowFirewallGroupResponse.firewallGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallGroupResponse {\n");
        sb.append("    firewallGroup: ").append(toIndentedString(firewallGroup)).append("\n");
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
