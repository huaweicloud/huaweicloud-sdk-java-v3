package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronPageLink;
import com.huaweicloud.sdk.vpc.v2.model.VpcRoute;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListVpcRoutesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="routes")
    
    private List<VpcRoute> routes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="routes_links")
    
    private List<NeutronPageLink> routesLinks = null;
    
    public ListVpcRoutesResponse withRoutes(List<VpcRoute> routes) {
        this.routes = routes;
        return this;
    }

    
    public ListVpcRoutesResponse addRoutesItem(VpcRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public ListVpcRoutesResponse withRoutes(Consumer<List<VpcRoute>> routesSetter) {
        if(this.routes == null ){
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * route对象列表
     * @return routes
     */
    public List<VpcRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<VpcRoute> routes) {
        this.routes = routes;
    }

    public ListVpcRoutesResponse withRoutesLinks(List<NeutronPageLink> routesLinks) {
        this.routesLinks = routesLinks;
        return this;
    }

    
    public ListVpcRoutesResponse addRoutesLinksItem(NeutronPageLink routesLinksItem) {
        if (this.routesLinks == null) {
            this.routesLinks = new ArrayList<>();
        }
        this.routesLinks.add(routesLinksItem);
        return this;
    }

    public ListVpcRoutesResponse withRoutesLinks(Consumer<List<NeutronPageLink>> routesLinksSetter) {
        if(this.routesLinks == null ){
            this.routesLinks = new ArrayList<>();
        }
        routesLinksSetter.accept(this.routesLinks);
        return this;
    }

    /**
     * 分页信息
     * @return routesLinks
     */
    public List<NeutronPageLink> getRoutesLinks() {
        return routesLinks;
    }

    public void setRoutesLinks(List<NeutronPageLink> routesLinks) {
        this.routesLinks = routesLinks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVpcRoutesResponse listVpcRoutesResponse = (ListVpcRoutesResponse) o;
        return Objects.equals(this.routes, listVpcRoutesResponse.routes) &&
            Objects.equals(this.routesLinks, listVpcRoutesResponse.routesLinks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(routes, routesLinks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpcRoutesResponse {\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    routesLinks: ").append(toIndentedString(routesLinks)).append("\n");
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

