package com.huaweicloud.sdk.vpn.v5.model;

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
public class ShowVpnGatewayRoutingTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_table")

    private List<VpnGatewayRoutingTableEntryVo> routingTable = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ShowVpnGatewayRoutingTableResponse withRoutingTable(List<VpnGatewayRoutingTableEntryVo> routingTable) {
        this.routingTable = routingTable;
        return this;
    }

    public ShowVpnGatewayRoutingTableResponse addRoutingTableItem(VpnGatewayRoutingTableEntryVo routingTableItem) {
        if (this.routingTable == null) {
            this.routingTable = new ArrayList<>();
        }
        this.routingTable.add(routingTableItem);
        return this;
    }

    public ShowVpnGatewayRoutingTableResponse withRoutingTable(
        Consumer<List<VpnGatewayRoutingTableEntryVo>> routingTableSetter) {
        if (this.routingTable == null) {
            this.routingTable = new ArrayList<>();
        }
        routingTableSetter.accept(this.routingTable);
        return this;
    }

    /**
     * VPN网关的路由表
     * @return routingTable
     */
    public List<VpnGatewayRoutingTableEntryVo> getRoutingTable() {
        return routingTable;
    }

    public void setRoutingTable(List<VpnGatewayRoutingTableEntryVo> routingTable) {
        this.routingTable = routingTable;
    }

    public ShowVpnGatewayRoutingTableResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 该网关下的路由总条数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ShowVpnGatewayRoutingTableResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowVpnGatewayRoutingTableResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVpnGatewayRoutingTableResponse that = (ShowVpnGatewayRoutingTableResponse) obj;
        return Objects.equals(this.routingTable, that.routingTable) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routingTable, totalCount, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVpnGatewayRoutingTableResponse {\n");
        sb.append("    routingTable: ").append(toIndentedString(routingTable)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
