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
public class NeutronListNetworksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<NeutronNetwork> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks_links")

    private List<NeutronPageLink> networksLinks = null;

    public NeutronListNetworksResponse withNetworks(List<NeutronNetwork> networks) {
        this.networks = networks;
        return this;
    }

    public NeutronListNetworksResponse addNetworksItem(NeutronNetwork networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public NeutronListNetworksResponse withNetworks(Consumer<List<NeutronNetwork>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * network对象列表
     * @return networks
     */
    public List<NeutronNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NeutronNetwork> networks) {
        this.networks = networks;
    }

    public NeutronListNetworksResponse withNetworksLinks(List<NeutronPageLink> networksLinks) {
        this.networksLinks = networksLinks;
        return this;
    }

    public NeutronListNetworksResponse addNetworksLinksItem(NeutronPageLink networksLinksItem) {
        if (this.networksLinks == null) {
            this.networksLinks = new ArrayList<>();
        }
        this.networksLinks.add(networksLinksItem);
        return this;
    }

    public NeutronListNetworksResponse withNetworksLinks(Consumer<List<NeutronPageLink>> networksLinksSetter) {
        if (this.networksLinks == null) {
            this.networksLinks = new ArrayList<>();
        }
        networksLinksSetter.accept(this.networksLinks);
        return this;
    }

    /**
     * 分页信息
     * @return networksLinks
     */
    public List<NeutronPageLink> getNetworksLinks() {
        return networksLinks;
    }

    public void setNetworksLinks(List<NeutronPageLink> networksLinks) {
        this.networksLinks = networksLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronListNetworksResponse that = (NeutronListNetworksResponse) obj;
        return Objects.equals(this.networks, that.networks) && Objects.equals(this.networksLinks, that.networksLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networks, networksLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListNetworksResponse {\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    networksLinks: ").append(toIndentedString(networksLinks)).append("\n");
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
