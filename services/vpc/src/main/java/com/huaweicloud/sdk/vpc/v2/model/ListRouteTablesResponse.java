package com.huaweicloud.sdk.vpc.v2.model;

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
public class ListRouteTablesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routetables")

    private List<RouteTableListResp> routetables = null;

    public ListRouteTablesResponse withRoutetables(List<RouteTableListResp> routetables) {
        this.routetables = routetables;
        return this;
    }

    public ListRouteTablesResponse addRoutetablesItem(RouteTableListResp routetablesItem) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        this.routetables.add(routetablesItem);
        return this;
    }

    public ListRouteTablesResponse withRoutetables(Consumer<List<RouteTableListResp>> routetablesSetter) {
        if (this.routetables == null) {
            this.routetables = new ArrayList<>();
        }
        routetablesSetter.accept(this.routetables);
        return this;
    }

    /**
     * 路由表对象列表
     * @return routetables
     */
    public List<RouteTableListResp> getRoutetables() {
        return routetables;
    }

    public void setRoutetables(List<RouteTableListResp> routetables) {
        this.routetables = routetables;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRouteTablesResponse listRouteTablesResponse = (ListRouteTablesResponse) o;
        return Objects.equals(this.routetables, listRouteTablesResponse.routetables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routetables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRouteTablesResponse {\n");
        sb.append("    routetables: ").append(toIndentedString(routetables)).append("\n");
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
