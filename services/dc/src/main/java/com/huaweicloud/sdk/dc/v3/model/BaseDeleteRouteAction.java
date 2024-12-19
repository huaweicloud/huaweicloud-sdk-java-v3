package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BaseDeleteRouteAction
 */
public class BaseDeleteRouteAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexthop")

    private String nexthop;

    public BaseDeleteRouteAction withDestination(String destination) {
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

    public BaseDeleteRouteAction withNexthop(String nexthop) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseDeleteRouteAction that = (BaseDeleteRouteAction) obj;
        return Objects.equals(this.destination, that.destination) && Objects.equals(this.nexthop, that.nexthop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, nexthop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseDeleteRouteAction {\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
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
