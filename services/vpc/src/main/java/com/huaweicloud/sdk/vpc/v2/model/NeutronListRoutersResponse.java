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
public class NeutronListRoutersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routers")

    private List<NeutronRouter> routers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routers_links")

    private List<NeutronPageLink> routersLinks = null;

    public NeutronListRoutersResponse withRouters(List<NeutronRouter> routers) {
        this.routers = routers;
        return this;
    }

    public NeutronListRoutersResponse addRoutersItem(NeutronRouter routersItem) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        this.routers.add(routersItem);
        return this;
    }

    public NeutronListRoutersResponse withRouters(Consumer<List<NeutronRouter>> routersSetter) {
        if (this.routers == null) {
            this.routers = new ArrayList<>();
        }
        routersSetter.accept(this.routers);
        return this;
    }

    /**
     * router对象列表
     * @return routers
     */
    public List<NeutronRouter> getRouters() {
        return routers;
    }

    public void setRouters(List<NeutronRouter> routers) {
        this.routers = routers;
    }

    public NeutronListRoutersResponse withRoutersLinks(List<NeutronPageLink> routersLinks) {
        this.routersLinks = routersLinks;
        return this;
    }

    public NeutronListRoutersResponse addRoutersLinksItem(NeutronPageLink routersLinksItem) {
        if (this.routersLinks == null) {
            this.routersLinks = new ArrayList<>();
        }
        this.routersLinks.add(routersLinksItem);
        return this;
    }

    public NeutronListRoutersResponse withRoutersLinks(Consumer<List<NeutronPageLink>> routersLinksSetter) {
        if (this.routersLinks == null) {
            this.routersLinks = new ArrayList<>();
        }
        routersLinksSetter.accept(this.routersLinks);
        return this;
    }

    /**
     * 分页信息
     * @return routersLinks
     */
    public List<NeutronPageLink> getRoutersLinks() {
        return routersLinks;
    }

    public void setRoutersLinks(List<NeutronPageLink> routersLinks) {
        this.routersLinks = routersLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronListRoutersResponse that = (NeutronListRoutersResponse) obj;
        return Objects.equals(this.routers, that.routers) && Objects.equals(this.routersLinks, that.routersLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routers, routersLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListRoutersResponse {\n");
        sb.append("    routers: ").append(toIndentedString(routers)).append("\n");
        sb.append("    routersLinks: ").append(toIndentedString(routersLinks)).append("\n");
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
