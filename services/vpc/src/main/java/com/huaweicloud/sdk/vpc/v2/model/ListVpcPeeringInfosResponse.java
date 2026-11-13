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
public class ListVpcPeeringInfosResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering_infos")

    private List<VpcPeering> peeringInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peering_infos_links")

    private List<NeutronPageLink> peeringInfosLinks = null;

    public ListVpcPeeringInfosResponse withPeeringInfos(List<VpcPeering> peeringInfos) {
        this.peeringInfos = peeringInfos;
        return this;
    }

    public ListVpcPeeringInfosResponse addPeeringInfosItem(VpcPeering peeringInfosItem) {
        if (this.peeringInfos == null) {
            this.peeringInfos = new ArrayList<>();
        }
        this.peeringInfos.add(peeringInfosItem);
        return this;
    }

    public ListVpcPeeringInfosResponse withPeeringInfos(Consumer<List<VpcPeering>> peeringInfosSetter) {
        if (this.peeringInfos == null) {
            this.peeringInfos = new ArrayList<>();
        }
        peeringInfosSetter.accept(this.peeringInfos);
        return this;
    }

    /**
     * 对等连接信息对象列表
     * @return peeringInfos
     */
    public List<VpcPeering> getPeeringInfos() {
        return peeringInfos;
    }

    public void setPeeringInfos(List<VpcPeering> peeringInfos) {
        this.peeringInfos = peeringInfos;
    }

    public ListVpcPeeringInfosResponse withPeeringInfosLinks(List<NeutronPageLink> peeringInfosLinks) {
        this.peeringInfosLinks = peeringInfosLinks;
        return this;
    }

    public ListVpcPeeringInfosResponse addPeeringInfosLinksItem(NeutronPageLink peeringInfosLinksItem) {
        if (this.peeringInfosLinks == null) {
            this.peeringInfosLinks = new ArrayList<>();
        }
        this.peeringInfosLinks.add(peeringInfosLinksItem);
        return this;
    }

    public ListVpcPeeringInfosResponse withPeeringInfosLinks(Consumer<List<NeutronPageLink>> peeringInfosLinksSetter) {
        if (this.peeringInfosLinks == null) {
            this.peeringInfosLinks = new ArrayList<>();
        }
        peeringInfosLinksSetter.accept(this.peeringInfosLinks);
        return this;
    }

    /**
     * 分页信息
     * @return peeringInfosLinks
     */
    public List<NeutronPageLink> getPeeringInfosLinks() {
        return peeringInfosLinks;
    }

    public void setPeeringInfosLinks(List<NeutronPageLink> peeringInfosLinks) {
        this.peeringInfosLinks = peeringInfosLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVpcPeeringInfosResponse that = (ListVpcPeeringInfosResponse) obj;
        return Objects.equals(this.peeringInfos, that.peeringInfos)
            && Objects.equals(this.peeringInfosLinks, that.peeringInfosLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peeringInfos, peeringInfosLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcPeeringInfosResponse {\n");
        sb.append("    peeringInfos: ").append(toIndentedString(peeringInfos)).append("\n");
        sb.append("    peeringInfosLinks: ").append(toIndentedString(peeringInfosLinks)).append("\n");
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
