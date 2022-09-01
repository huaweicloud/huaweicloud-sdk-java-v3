package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateRouteTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    @JacksonXmlProperty(localName = "routes")

    private List<RouteTableRoute> routes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    @JacksonXmlProperty(localName = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    public CreateRouteTableReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 功能说明：路由表名称  取值范围：0-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRouteTableReq withRoutes(List<RouteTableRoute> routes) {
        this.routes = routes;
        return this;
    }

    public CreateRouteTableReq addRoutesItem(RouteTableRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public CreateRouteTableReq withRoutes(Consumer<List<RouteTableRoute>> routesSetter) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 功能说明：路由对象，参见route字段说明  约束：每个路由表最大关联200条路由
     * @return routes
     */
    public List<RouteTableRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteTableRoute> routes) {
        this.routes = routes;
    }

    public CreateRouteTableReq withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 路由表所在的虚拟私有云ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateRouteTableReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：路由表描述信息  取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRouteTableReq createRouteTableReq = (CreateRouteTableReq) o;
        return Objects.equals(this.name, createRouteTableReq.name)
            && Objects.equals(this.routes, createRouteTableReq.routes)
            && Objects.equals(this.vpcId, createRouteTableReq.vpcId)
            && Objects.equals(this.description, createRouteTableReq.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, routes, vpcId, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRouteTableReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
