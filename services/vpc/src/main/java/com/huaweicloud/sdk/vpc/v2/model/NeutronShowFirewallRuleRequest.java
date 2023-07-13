package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class NeutronShowFirewallRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    private String firewallRuleId;

    public NeutronShowFirewallRuleRequest withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    /**
     * 网络ACL规则ID
     * @return firewallRuleId
     */
    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronShowFirewallRuleRequest that = (NeutronShowFirewallRuleRequest) obj;
        return Objects.equals(this.firewallRuleId, that.firewallRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallRuleRequest {\n");
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
