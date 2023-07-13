package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class CreateVpcRouteRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route")

    private CreateVpcRouteOption route;

    public CreateVpcRouteRequestBody withRoute(CreateVpcRouteOption route) {
        this.route = route;
        return this;
    }

    public CreateVpcRouteRequestBody withRoute(Consumer<CreateVpcRouteOption> routeSetter) {
        if (this.route == null) {
            this.route = new CreateVpcRouteOption();
            routeSetter.accept(this.route);
        }

        return this;
    }

    /**
     * Get route
     * @return route
     */
    public CreateVpcRouteOption getRoute() {
        return route;
    }

    public void setRoute(CreateVpcRouteOption route) {
        this.route = route;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcRouteRequestBody that = (CreateVpcRouteRequestBody) obj;
        return Objects.equals(this.route, that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcRouteRequestBody {\n");
        sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
