package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.VpcRoute;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowVpcRouteResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="route")
    
    private VpcRoute route = null;

    public ShowVpcRouteResponse withRoute(VpcRoute route) {
        this.route = route;
        return this;
    }

    public ShowVpcRouteResponse withRoute(Consumer<VpcRoute> routeSetter) {
        if(this.route == null ){
            this.route = new VpcRoute();
            routeSetter.accept(this.route);
        }
        
        return this;
    }


    /**
     * Get route
     * @return route
     */
    public VpcRoute getRoute() {
        return route;
    }

    public void setRoute(VpcRoute route) {
        this.route = route;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcRouteResponse showVpcRouteResponse = (ShowVpcRouteResponse) o;
        return Objects.equals(this.route, showVpcRouteResponse.route);
    }
    @Override
    public int hashCode() {
        return Objects.hash(route);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcRouteResponse {\n");
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

