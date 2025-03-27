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
public class ListP2cVgwsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vpn_gateways")

    private List<ShowResponseP2cVgw> p2cVpnGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListP2cVgwsResponse withP2cVpnGateways(List<ShowResponseP2cVgw> p2cVpnGateways) {
        this.p2cVpnGateways = p2cVpnGateways;
        return this;
    }

    public ListP2cVgwsResponse addP2cVpnGatewaysItem(ShowResponseP2cVgw p2cVpnGatewaysItem) {
        if (this.p2cVpnGateways == null) {
            this.p2cVpnGateways = new ArrayList<>();
        }
        this.p2cVpnGateways.add(p2cVpnGatewaysItem);
        return this;
    }

    public ListP2cVgwsResponse withP2cVpnGateways(Consumer<List<ShowResponseP2cVgw>> p2cVpnGatewaysSetter) {
        if (this.p2cVpnGateways == null) {
            this.p2cVpnGateways = new ArrayList<>();
        }
        p2cVpnGatewaysSetter.accept(this.p2cVpnGateways);
        return this;
    }

    /**
     * 网关信息
     * @return p2cVpnGateways
     */
    public List<ShowResponseP2cVgw> getP2cVpnGateways() {
        return p2cVpnGateways;
    }

    public void setP2cVpnGateways(List<ShowResponseP2cVgw> p2cVpnGateways) {
        this.p2cVpnGateways = p2cVpnGateways;
    }

    public ListP2cVgwsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListP2cVgwsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListP2cVgwsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListP2cVgwsResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListP2cVgwsResponse that = (ListP2cVgwsResponse) obj;
        return Objects.equals(this.p2cVpnGateways, that.p2cVpnGateways)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVpnGateways, totalCount, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListP2cVgwsResponse {\n");
        sb.append("    p2cVpnGateways: ").append(toIndentedString(p2cVpnGateways)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
