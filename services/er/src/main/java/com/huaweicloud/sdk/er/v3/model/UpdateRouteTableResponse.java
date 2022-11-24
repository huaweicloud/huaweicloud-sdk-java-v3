package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRouteTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_table")

    private RouteTable routeTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public UpdateRouteTableResponse withRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    public UpdateRouteTableResponse withRouteTable(Consumer<RouteTable> routeTableSetter) {
        if (this.routeTable == null) {
            this.routeTable = new RouteTable();
            routeTableSetter.accept(this.routeTable);
        }

        return this;
    }

    /**
     * Get routeTable
     * @return routeTable
     */
    public RouteTable getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(RouteTable routeTable) {
        this.routeTable = routeTable;
    }

    public UpdateRouteTableResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRouteTableResponse updateRouteTableResponse = (UpdateRouteTableResponse) o;
        return Objects.equals(this.routeTable, updateRouteTableResponse.routeTable)
            && Objects.equals(this.requestId, updateRouteTableResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTable, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRouteTableResponse {\n");
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
