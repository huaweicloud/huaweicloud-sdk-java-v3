package com.huaweicloud.sdk.er.v3.model;

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
    @JsonProperty(value = "route_tables")

    private List<RouteTable> routeTables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListRouteTablesResponse withRouteTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
        return this;
    }

    public ListRouteTablesResponse addRouteTablesItem(RouteTable routeTablesItem) {
        if (this.routeTables == null) {
            this.routeTables = new ArrayList<>();
        }
        this.routeTables.add(routeTablesItem);
        return this;
    }

    public ListRouteTablesResponse withRouteTables(Consumer<List<RouteTable>> routeTablesSetter) {
        if (this.routeTables == null) {
            this.routeTables = new ArrayList<>();
        }
        routeTablesSetter.accept(this.routeTables);
        return this;
    }

    /**
     * 路由表列表
     * @return routeTables
     */
    public List<RouteTable> getRouteTables() {
        return routeTables;
    }

    public void setRouteTables(List<RouteTable> routeTables) {
        this.routeTables = routeTables;
    }

    public ListRouteTablesResponse withRequestId(String requestId) {
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

    public ListRouteTablesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRouteTablesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
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
        return Objects.equals(this.routeTables, listRouteTablesResponse.routeTables)
            && Objects.equals(this.requestId, listRouteTablesResponse.requestId)
            && Objects.equals(this.pageInfo, listRouteTablesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeTables, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRouteTablesResponse {\n");
        sb.append("    routeTables: ").append(toIndentedString(routeTables)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
