package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateRouteTableReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    @JacksonXmlProperty(localName = "routes")

    private Map<String, List<RouteTableRoute>> routes = null;

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

    public UpdateRouteTableReq withRoutes(Map<String, List<RouteTableRoute>> routes) {
        this.routes = routes;
        return this;
    }

    public UpdateRouteTableReq putRoutesItem(String key, List<RouteTableRoute> routesItem) {
        if (this.routes == null) {
            this.routes = new HashMap<>();
        }
        this.routes.put(key, routesItem);
        return this;
    }

    public UpdateRouteTableReq withRoutes(Consumer<Map<String, List<RouteTableRoute>>> routesSetter) {
        if (this.routes == null) {
            this.routes = new HashMap<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 功能说明：路由对象  取值范围：参见route字段说明。更新存在三种动作：     1）add：新增路由条目，type，destination，nexthop必选。     2）mod：修改路由信息，type，destination，nexthop必选。     3）del：删除路由条目，destination必选  约束：     每个路由表最大关联200条路由。     不支持直接修改destination，如需修改，只能使用del先删除对应路由，然后使用add新增路由。
     * @return routes
     */
    public Map<String, List<RouteTableRoute>> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<String, List<RouteTableRoute>> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteTableReq updateRouteTableReq = (UpdateRouteTableReq) o;
        return Objects.equals(this.name, updateRouteTableReq.name)
            && Objects.equals(this.description, updateRouteTableReq.description)
            && Objects.equals(this.routes, updateRouteTableReq.routes);
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
