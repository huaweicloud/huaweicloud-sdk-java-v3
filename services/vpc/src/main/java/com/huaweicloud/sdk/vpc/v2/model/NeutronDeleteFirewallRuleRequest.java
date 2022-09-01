package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class NeutronDeleteFirewallRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    @JacksonXmlProperty(localName = "firewall_rule_id")

    private String firewallRuleId;

    public NeutronDeleteFirewallRuleRequest withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    /**
     * 网络ACL防火墙规则ID
     * @return firewallRuleId
     */
    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronDeleteFirewallRuleRequest neutronDeleteFirewallRuleRequest = (NeutronDeleteFirewallRuleRequest) o;
        return Objects.equals(this.firewallRuleId, neutronDeleteFirewallRuleRequest.firewallRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronDeleteFirewallRuleRequest {\n");
        sb.append("    firewallRuleId: ").append(toIndentedString(firewallRuleId)).append("\n");
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
