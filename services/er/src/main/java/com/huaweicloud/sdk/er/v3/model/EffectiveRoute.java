package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 有效路由数据
 */
public class EffectiveRoute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_id")

    private String routeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_hops")

    private List<RouteAttachment> nextHops = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_blackhole")

    private Boolean isBlackhole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_type")

    private String routeType;

    public EffectiveRoute withRouteId(String routeId) {
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

    public EffectiveRoute withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 路由目的地
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public EffectiveRoute withNextHops(List<RouteAttachment> nextHops) {
        this.nextHops = nextHops;
        return this;
    }

    public EffectiveRoute addNextHopsItem(RouteAttachment nextHopsItem) {
        if (this.nextHops == null) {
            this.nextHops = new ArrayList<>();
        }
        this.nextHops.add(nextHopsItem);
        return this;
    }

    public EffectiveRoute withNextHops(Consumer<List<RouteAttachment>> nextHopsSetter) {
        if (this.nextHops == null) {
            this.nextHops = new ArrayList<>();
        }
        nextHopsSetter.accept(this.nextHops);
        return this;
    }

    /**
     * 路由下一跳列表
     * @return nextHops
     */
    public List<RouteAttachment> getNextHops() {
        return nextHops;
    }

    public void setNextHops(List<RouteAttachment> nextHops) {
        this.nextHops = nextHops;
    }

    public EffectiveRoute withIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
        return this;
    }

    /**
     * 是否黑洞路由
     * @return isBlackhole
     */
    public Boolean getIsBlackhole() {
        return isBlackhole;
    }

    public void setIsBlackhole(Boolean isBlackhole) {
        this.isBlackhole = isBlackhole;
    }

    public EffectiveRoute withRouteType(String routeType) {
        this.routeType = routeType;
        return this;
    }

    /**
     * 路由类型
     * @return routeType
     */
    public String getRouteType() {
        return routeType;
    }

    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EffectiveRoute effectiveRoute = (EffectiveRoute) o;
        return Objects.equals(this.routeId, effectiveRoute.routeId)
            && Objects.equals(this.destination, effectiveRoute.destination)
            && Objects.equals(this.nextHops, effectiveRoute.nextHops)
            && Objects.equals(this.isBlackhole, effectiveRoute.isBlackhole)
            && Objects.equals(this.routeType, effectiveRoute.routeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeId, destination, nextHops, isBlackhole, routeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EffectiveRoute {\n");
        sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    nextHops: ").append(toIndentedString(nextHops)).append("\n");
        sb.append("    isBlackhole: ").append(toIndentedString(isBlackhole)).append("\n");
        sb.append("    routeType: ").append(toIndentedString(routeType)).append("\n");
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
