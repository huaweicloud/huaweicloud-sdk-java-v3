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
public class NeutronListSubnetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets")

    private List<NeutronSubnet> subnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnets_links")

    private List<NeutronPageLink> subnetsLinks = null;

    public NeutronListSubnetsResponse withSubnets(List<NeutronSubnet> subnets) {
        this.subnets = subnets;
        return this;
    }

    public NeutronListSubnetsResponse addSubnetsItem(NeutronSubnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    public NeutronListSubnetsResponse withSubnets(Consumer<List<NeutronSubnet>> subnetsSetter) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<>();
        }
        subnetsSetter.accept(this.subnets);
        return this;
    }

    /**
     * subnet对象列表
     * @return subnets
     */
    public List<NeutronSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<NeutronSubnet> subnets) {
        this.subnets = subnets;
    }

    public NeutronListSubnetsResponse withSubnetsLinks(List<NeutronPageLink> subnetsLinks) {
        this.subnetsLinks = subnetsLinks;
        return this;
    }

    public NeutronListSubnetsResponse addSubnetsLinksItem(NeutronPageLink subnetsLinksItem) {
        if (this.subnetsLinks == null) {
            this.subnetsLinks = new ArrayList<>();
        }
        this.subnetsLinks.add(subnetsLinksItem);
        return this;
    }

    public NeutronListSubnetsResponse withSubnetsLinks(Consumer<List<NeutronPageLink>> subnetsLinksSetter) {
        if (this.subnetsLinks == null) {
            this.subnetsLinks = new ArrayList<>();
        }
        subnetsLinksSetter.accept(this.subnetsLinks);
        return this;
    }

    /**
     * 分页信息
     * @return subnetsLinks
     */
    public List<NeutronPageLink> getSubnetsLinks() {
        return subnetsLinks;
    }

    public void setSubnetsLinks(List<NeutronPageLink> subnetsLinks) {
        this.subnetsLinks = subnetsLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronListSubnetsResponse that = (NeutronListSubnetsResponse) obj;
        return Objects.equals(this.subnets, that.subnets) && Objects.equals(this.subnetsLinks, that.subnetsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnets, subnetsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListSubnetsResponse {\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
        sb.append("    subnetsLinks: ").append(toIndentedString(subnetsLinks)).append("\n");
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
