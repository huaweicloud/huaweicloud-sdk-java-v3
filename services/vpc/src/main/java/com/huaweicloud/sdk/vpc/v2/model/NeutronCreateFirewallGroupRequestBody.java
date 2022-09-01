package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateFirewallGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_group")

    @JacksonXmlProperty(localName = "firewall_group")

    private NeutronCreateFirewallGroupOption firewallGroup;

    public NeutronCreateFirewallGroupRequestBody withFirewallGroup(NeutronCreateFirewallGroupOption firewallGroup) {
        this.firewallGroup = firewallGroup;
        return this;
    }

    public NeutronCreateFirewallGroupRequestBody withFirewallGroup(
        Consumer<NeutronCreateFirewallGroupOption> firewallGroupSetter) {
        if (this.firewallGroup == null) {
            this.firewallGroup = new NeutronCreateFirewallGroupOption();
            firewallGroupSetter.accept(this.firewallGroup);
        }

        return this;
    }

    /**
     * Get firewallGroup
     * @return firewallGroup
     */
    public NeutronCreateFirewallGroupOption getFirewallGroup() {
        return firewallGroup;
    }

    public void setFirewallGroup(NeutronCreateFirewallGroupOption firewallGroup) {
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
        NeutronCreateFirewallGroupRequestBody neutronCreateFirewallGroupRequestBody =
            (NeutronCreateFirewallGroupRequestBody) o;
        return Objects.equals(this.firewallGroup, neutronCreateFirewallGroupRequestBody.firewallGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallGroupRequestBody {\n");
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
