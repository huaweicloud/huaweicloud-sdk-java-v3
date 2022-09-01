package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除路由请求体
 */
public class DeleteRoutesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routes")

    @JacksonXmlProperty(localName = "routes")

    private List<DeleteRouteOption> routes = null;

    public DeleteRoutesRequestBody withRoutes(List<DeleteRouteOption> routes) {
        this.routes = routes;
        return this;
    }

    public DeleteRoutesRequestBody addRoutesItem(DeleteRouteOption routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        this.routes.add(routesItem);
        return this;
    }

    public DeleteRoutesRequestBody withRoutes(Consumer<List<DeleteRouteOption>> routesSetter) {
        if (this.routes == null) {
            this.routes = new ArrayList<>();
        }
        routesSetter.accept(this.routes);
        return this;
    }

    /**
     * 待删除的路由信息
     * @return routes
     */
    public List<DeleteRouteOption> getRoutes() {
        return routes;
    }

    public void setRoutes(List<DeleteRouteOption> routes) {
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
        DeleteRoutesRequestBody deleteRoutesRequestBody = (DeleteRoutesRequestBody) o;
        return Objects.equals(this.routes, deleteRoutesRequestBody.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteRoutesRequestBody {\n");
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
