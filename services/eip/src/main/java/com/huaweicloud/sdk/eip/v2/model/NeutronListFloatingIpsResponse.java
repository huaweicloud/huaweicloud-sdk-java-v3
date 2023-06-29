package com.huaweicloud.sdk.eip.v2.model;

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
public class NeutronListFloatingIpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips")

    private List<FloatingIpResp> floatingips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips_links")

    private List<Pager> floatingipsLinks = null;

    public NeutronListFloatingIpsResponse withFloatingips(List<FloatingIpResp> floatingips) {
        this.floatingips = floatingips;
        return this;
    }

    public NeutronListFloatingIpsResponse addFloatingipsItem(FloatingIpResp floatingipsItem) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        this.floatingips.add(floatingipsItem);
        return this;
    }

    public NeutronListFloatingIpsResponse withFloatingips(Consumer<List<FloatingIpResp>> floatingipsSetter) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        floatingipsSetter.accept(this.floatingips);
        return this;
    }

    /**
     * floatingip对象列表
     * @return floatingips
     */
    public List<FloatingIpResp> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<FloatingIpResp> floatingips) {
        this.floatingips = floatingips;
    }

    public NeutronListFloatingIpsResponse withFloatingipsLinks(List<Pager> floatingipsLinks) {
        this.floatingipsLinks = floatingipsLinks;
        return this;
    }

    public NeutronListFloatingIpsResponse addFloatingipsLinksItem(Pager floatingipsLinksItem) {
        if (this.floatingipsLinks == null) {
            this.floatingipsLinks = new ArrayList<>();
        }
        this.floatingipsLinks.add(floatingipsLinksItem);
        return this;
    }

    public NeutronListFloatingIpsResponse withFloatingipsLinks(Consumer<List<Pager>> floatingipsLinksSetter) {
        if (this.floatingipsLinks == null) {
            this.floatingipsLinks = new ArrayList<>();
        }
        floatingipsLinksSetter.accept(this.floatingipsLinks);
        return this;
    }

    /**
     * marker分页结构
     * @return floatingipsLinks
     */
    public List<Pager> getFloatingipsLinks() {
        return floatingipsLinks;
    }

    public void setFloatingipsLinks(List<Pager> floatingipsLinks) {
        this.floatingipsLinks = floatingipsLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronListFloatingIpsResponse that = (NeutronListFloatingIpsResponse) obj;
        return Objects.equals(this.floatingips, that.floatingips)
            && Objects.equals(this.floatingipsLinks, that.floatingipsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingips, floatingipsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListFloatingIpsResponse {\n");
        sb.append("    floatingips: ").append(toIndentedString(floatingips)).append("\n");
        sb.append("    floatingipsLinks: ").append(toIndentedString(floatingipsLinks)).append("\n");
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
