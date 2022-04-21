package com.huaweicloud.sdk.vpc.v2.model;

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
public class NeutronListFirewallRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    private List<NeutronFirewallRule> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules_links")

    private List<NeutronPageLink> firewallRulesLinks = null;

    public NeutronListFirewallRulesResponse withFirewallRules(List<NeutronFirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public NeutronListFirewallRulesResponse addFirewallRulesItem(NeutronFirewallRule firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public NeutronListFirewallRulesResponse withFirewallRules(Consumer<List<NeutronFirewallRule>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    /**
     * firewall_rule对象列表
     * @return firewallRules
     */
    public List<NeutronFirewallRule> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<NeutronFirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public NeutronListFirewallRulesResponse withFirewallRulesLinks(List<NeutronPageLink> firewallRulesLinks) {
        this.firewallRulesLinks = firewallRulesLinks;
        return this;
    }

    public NeutronListFirewallRulesResponse addFirewallRulesLinksItem(NeutronPageLink firewallRulesLinksItem) {
        if (this.firewallRulesLinks == null) {
            this.firewallRulesLinks = new ArrayList<>();
        }
        this.firewallRulesLinks.add(firewallRulesLinksItem);
        return this;
    }

    public NeutronListFirewallRulesResponse withFirewallRulesLinks(
        Consumer<List<NeutronPageLink>> firewallRulesLinksSetter) {
        if (this.firewallRulesLinks == null) {
            this.firewallRulesLinks = new ArrayList<>();
        }
        firewallRulesLinksSetter.accept(this.firewallRulesLinks);
        return this;
    }

    /**
     * 分页信息
     * @return firewallRulesLinks
     */
    public List<NeutronPageLink> getFirewallRulesLinks() {
        return firewallRulesLinks;
    }

    public void setFirewallRulesLinks(List<NeutronPageLink> firewallRulesLinks) {
        this.firewallRulesLinks = firewallRulesLinks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFirewallRulesResponse neutronListFirewallRulesResponse = (NeutronListFirewallRulesResponse) o;
        return Objects.equals(this.firewallRules, neutronListFirewallRulesResponse.firewallRules)
            && Objects.equals(this.firewallRulesLinks, neutronListFirewallRulesResponse.firewallRulesLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRules, firewallRulesLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFirewallRulesResponse {\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    firewallRulesLinks: ").append(toIndentedString(firewallRulesLinks)).append("\n");
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
