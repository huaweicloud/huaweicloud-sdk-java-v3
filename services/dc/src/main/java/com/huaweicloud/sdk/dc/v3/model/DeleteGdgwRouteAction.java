package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeleteGdgwRouteAction
 */
public class DeleteGdgwRouteAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private RouteTypeOfGdgw type;

    public DeleteGdgwRouteAction withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 路由子网
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DeleteGdgwRouteAction withNexthop(String nexthop) {
        this.nexthop = nexthop;
        return this;
    }

    /**
     * 下一跳id
     * @return nexthop
     */
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public DeleteGdgwRouteAction withType(RouteTypeOfGdgw type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public RouteTypeOfGdgw getType() {
        return type;
    }

    public void setType(RouteTypeOfGdgw type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGdgwRouteAction that = (DeleteGdgwRouteAction) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.nexthop, that.nexthop)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, nexthop, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGdgwRouteAction {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
