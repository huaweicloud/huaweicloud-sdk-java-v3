package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronListFirewallPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policies")

    @JacksonXmlProperty(localName = "firewall_policies")

    private List<NeutronFirewallPolicy> firewallPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policies_links")

    @JacksonXmlProperty(localName = "firewall_policies_links")

    private List<NeutronPageLink> firewallPoliciesLinks = null;

    public NeutronListFirewallPoliciesResponse withFirewallPolicies(List<NeutronFirewallPolicy> firewallPolicies) {
        this.firewallPolicies = firewallPolicies;
        return this;
    }

    public NeutronListFirewallPoliciesResponse addFirewallPoliciesItem(NeutronFirewallPolicy firewallPoliciesItem) {
        if (this.firewallPolicies == null) {
            this.firewallPolicies = new ArrayList<>();
        }
        this.firewallPolicies.add(firewallPoliciesItem);
        return this;
    }

    public NeutronListFirewallPoliciesResponse withFirewallPolicies(
        Consumer<List<NeutronFirewallPolicy>> firewallPoliciesSetter) {
        if (this.firewallPolicies == null) {
            this.firewallPolicies = new ArrayList<>();
        }
        firewallPoliciesSetter.accept(this.firewallPolicies);
        return this;
    }

    /**
     * firewall_policy对象列表
     * @return firewallPolicies
     */
    public List<NeutronFirewallPolicy> getFirewallPolicies() {
        return firewallPolicies;
    }

    public void setFirewallPolicies(List<NeutronFirewallPolicy> firewallPolicies) {
        this.firewallPolicies = firewallPolicies;
    }

    public NeutronListFirewallPoliciesResponse withFirewallPoliciesLinks(List<NeutronPageLink> firewallPoliciesLinks) {
        this.firewallPoliciesLinks = firewallPoliciesLinks;
        return this;
    }

    public NeutronListFirewallPoliciesResponse addFirewallPoliciesLinksItem(NeutronPageLink firewallPoliciesLinksItem) {
        if (this.firewallPoliciesLinks == null) {
            this.firewallPoliciesLinks = new ArrayList<>();
        }
        this.firewallPoliciesLinks.add(firewallPoliciesLinksItem);
        return this;
    }

    public NeutronListFirewallPoliciesResponse withFirewallPoliciesLinks(
        Consumer<List<NeutronPageLink>> firewallPoliciesLinksSetter) {
        if (this.firewallPoliciesLinks == null) {
            this.firewallPoliciesLinks = new ArrayList<>();
        }
        firewallPoliciesLinksSetter.accept(this.firewallPoliciesLinks);
        return this;
    }

    /**
     * 分页信息
     * @return firewallPoliciesLinks
     */
    public List<NeutronPageLink> getFirewallPoliciesLinks() {
        return firewallPoliciesLinks;
    }

    public void setFirewallPoliciesLinks(List<NeutronPageLink> firewallPoliciesLinks) {
        this.firewallPoliciesLinks = firewallPoliciesLinks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFirewallPoliciesResponse neutronListFirewallPoliciesResponse =
            (NeutronListFirewallPoliciesResponse) o;
        return Objects.equals(this.firewallPolicies, neutronListFirewallPoliciesResponse.firewallPolicies)
            && Objects.equals(this.firewallPoliciesLinks, neutronListFirewallPoliciesResponse.firewallPoliciesLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicies, firewallPoliciesLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFirewallPoliciesResponse {\n");
        sb.append("    firewallPolicies: ").append(toIndentedString(firewallPolicies)).append("\n");
        sb.append("    firewallPoliciesLinks: ").append(toIndentedString(firewallPoliciesLinks)).append("\n");
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
