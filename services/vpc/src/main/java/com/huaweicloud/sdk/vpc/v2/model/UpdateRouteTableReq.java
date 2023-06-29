package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateRouteTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    private RouteTableRouteAction routes;

    public UpdateRouteTableReq withName(String name) {
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

    public UpdateRouteTableReq withDescription(String description) {
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

    public UpdateRouteTableReq withRoutes(RouteTableRouteAction routes) {
        this.routes = routes;
        return this;
    }

    public UpdateRouteTableReq withRoutes(Consumer<RouteTableRouteAction> routesSetter) {
        if (this.routes == null) {
            this.routes = new RouteTableRouteAction();
            routesSetter.accept(this.routes);
        }

        return this;
    }

    /**
     * Get routes
     * @return routes
     */
    public RouteTableRouteAction getRoutes() {
        return routes;
    }

    public void setRoutes(RouteTableRouteAction routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRouteTableReq that = (UpdateRouteTableReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.routes, that.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
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
