package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRoutesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routeResps")

    private List<RouteRespsResource> routeResps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSize")

    private Integer totalSize;

    public ListRoutesResponse withRouteResps(List<RouteRespsResource> routeResps) {
        this.routeResps = routeResps;
        return this;
    }

    public ListRoutesResponse addRouteRespsItem(RouteRespsResource routeRespsItem) {
        if (this.routeResps == null) {
            this.routeResps = new ArrayList<>();
        }
        this.routeResps.add(routeRespsItem);
        return this;
    }

    public ListRoutesResponse withRouteResps(Consumer<List<RouteRespsResource>> routeRespsSetter) {
        if (this.routeResps == null) {
            this.routeResps = new ArrayList<>();
        }
        routeRespsSetter.accept(this.routeResps);
        return this;
    }

    /**
     * 路由IP。
     * @return routeResps
     */
    public List<RouteRespsResource> getRouteResps() {
        return routeResps;
    }

    public void setRouteResps(List<RouteRespsResource> routeResps) {
        this.routeResps = routeResps;
    }

    public ListRoutesResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 路由总数。
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRoutesResponse that = (ListRoutesResponse) obj;
        return Objects.equals(this.routeResps, that.routeResps) && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeResps, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRoutesResponse {\n");
        sb.append("    routeResps: ").append(toIndentedString(routeResps)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
