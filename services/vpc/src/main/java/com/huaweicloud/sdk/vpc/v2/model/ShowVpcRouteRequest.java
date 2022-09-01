package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowVpcRouteRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_id")

    @JacksonXmlProperty(localName = "route_id")

    private String routeId;

    public ShowVpcRouteRequest withRouteId(String routeId) {
        this.routeId = routeId;
        return this;
    }

    /**
     * 路由ID
     * @return routeId
     */
    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowVpcRouteRequest showVpcRouteRequest = (ShowVpcRouteRequest) o;
        return Objects.equals(this.routeId, showVpcRouteRequest.routeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpcRouteRequest {\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
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
