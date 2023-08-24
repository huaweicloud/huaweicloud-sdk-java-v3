package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class DisassociateSubnetFirewallRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<FirewallAssociation> subnets = null;

    public DisassociateSubnetFirewallRequestBody withSubnets(List<FirewallAssociation> subnets) {
        this.subnets = subnets;
        return this;
    }

    public DisassociateSubnetFirewallRequestBody addSubnetsItem(FirewallAssociation subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public DisassociateSubnetFirewallRequestBody withSubnets(Consumer<List<FirewallAssociation>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * 解绑ACL的子网列表
     * @return subnets
     */
    public List<FirewallAssociation> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<FirewallAssociation> subnets) {
        this.subnets = subnets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateSubnetFirewallRequestBody that = (DisassociateSubnetFirewallRequestBody) obj;
        return Objects.equals(this.subnets, that.subnets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateSubnetFirewallRequestBody {\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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
