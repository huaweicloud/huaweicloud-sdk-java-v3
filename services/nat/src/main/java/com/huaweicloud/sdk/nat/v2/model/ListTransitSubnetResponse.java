package com.huaweicloud.sdk.nat.v2.model;

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
public class ListTransitSubnetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transit_subnets")

    private List<TransitSubnet> transitSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListTransitSubnetResponse withTransitSubnets(List<TransitSubnet> transitSubnets) {
        this.transitSubnets = transitSubnets;
        return this;
    }

    public ListTransitSubnetResponse addTransitSubnetsItem(TransitSubnet transitSubnetsItem) {
        if (this.transitSubnets == null) {
            this.transitSubnets = new ArrayList<>();
        }
        this.transitSubnets.add(transitSubnetsItem);
        return this;
    }

    public ListTransitSubnetResponse withTransitSubnets(Consumer<List<TransitSubnet>> transitSubnetsSetter) {
        if (this.transitSubnets == null) {
            this.transitSubnets = new ArrayList<>();
        }
        transitSubnetsSetter.accept(this.transitSubnets);
        return this;
    }

    /**
     * 查询中转子网列表的响应体。详见TransitSubnet字段说明
     * @return transitSubnets
     */
    public List<TransitSubnet> getTransitSubnets() {
        return transitSubnets;
    }

    public void setTransitSubnets(List<TransitSubnet> transitSubnets) {
        this.transitSubnets = transitSubnets;
    }

    public ListTransitSubnetResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListTransitSubnetResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTransitSubnetResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListTransitSubnetResponse that = (ListTransitSubnetResponse) obj;
        return Objects.equals(this.transitSubnets, that.transitSubnets)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitSubnets, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransitSubnetResponse {\n");
        sb.append("    transitSubnets: ").append(toIndentedString(transitSubnets)).append("\n");
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
