package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronFirewallGroup;
import com.huaweicloud.sdk.vpc.v2.model.NeutronPageLink;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronListFirewallGroupsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_groups")
    
    private List<NeutronFirewallGroup> firewallGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_groups_links")
    
    private List<NeutronPageLink> firewallGroupsLinks = null;
    
    public NeutronListFirewallGroupsResponse withFirewallGroups(List<NeutronFirewallGroup> firewallGroups) {
        this.firewallGroups = firewallGroups;
        return this;
    }

    
    public NeutronListFirewallGroupsResponse addFirewallGroupsItem(NeutronFirewallGroup firewallGroupsItem) {
        if(this.firewallGroups == null) {
            this.firewallGroups = new ArrayList<>();
        }
        this.firewallGroups.add(firewallGroupsItem);
        return this;
    }

    public NeutronListFirewallGroupsResponse withFirewallGroups(Consumer<List<NeutronFirewallGroup>> firewallGroupsSetter) {
        if(this.firewallGroups == null) {
            this.firewallGroups = new ArrayList<>();
        }
        firewallGroupsSetter.accept(this.firewallGroups);
        return this;
    }

    /**
     * firewall_group对象列表
     * @return firewallGroups
     */
    public List<NeutronFirewallGroup> getFirewallGroups() {
        return firewallGroups;
    }

    public void setFirewallGroups(List<NeutronFirewallGroup> firewallGroups) {
        this.firewallGroups = firewallGroups;
    }

    

    public NeutronListFirewallGroupsResponse withFirewallGroupsLinks(List<NeutronPageLink> firewallGroupsLinks) {
        this.firewallGroupsLinks = firewallGroupsLinks;
        return this;
    }

    
    public NeutronListFirewallGroupsResponse addFirewallGroupsLinksItem(NeutronPageLink firewallGroupsLinksItem) {
        if(this.firewallGroupsLinks == null) {
            this.firewallGroupsLinks = new ArrayList<>();
        }
        this.firewallGroupsLinks.add(firewallGroupsLinksItem);
        return this;
    }

    public NeutronListFirewallGroupsResponse withFirewallGroupsLinks(Consumer<List<NeutronPageLink>> firewallGroupsLinksSetter) {
        if(this.firewallGroupsLinks == null) {
            this.firewallGroupsLinks = new ArrayList<>();
        }
        firewallGroupsLinksSetter.accept(this.firewallGroupsLinks);
        return this;
    }

    /**
     * 分页信息
     * @return firewallGroupsLinks
     */
    public List<NeutronPageLink> getFirewallGroupsLinks() {
        return firewallGroupsLinks;
    }

    public void setFirewallGroupsLinks(List<NeutronPageLink> firewallGroupsLinks) {
        this.firewallGroupsLinks = firewallGroupsLinks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronListFirewallGroupsResponse neutronListFirewallGroupsResponse = (NeutronListFirewallGroupsResponse) o;
        return Objects.equals(this.firewallGroups, neutronListFirewallGroupsResponse.firewallGroups) &&
            Objects.equals(this.firewallGroupsLinks, neutronListFirewallGroupsResponse.firewallGroupsLinks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallGroups, firewallGroupsLinks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFirewallGroupsResponse {\n");
        sb.append("    firewallGroups: ").append(toIndentedString(firewallGroups)).append("\n");
        sb.append("    firewallGroupsLinks: ").append(toIndentedString(firewallGroupsLinks)).append("\n");
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

