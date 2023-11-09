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
public class ListCgwsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_gateways")

    private List<ResponseCustomerGateway> customerGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListCgwsResponse withCustomerGateways(List<ResponseCustomerGateway> customerGateways) {
        this.customerGateways = customerGateways;
        return this;
    }

    public ListCgwsResponse addCustomerGatewaysItem(ResponseCustomerGateway customerGatewaysItem) {
        if (this.customerGateways == null) {
            this.customerGateways = new ArrayList<>();
        }
        this.customerGateways.add(customerGatewaysItem);
        return this;
    }

    public ListCgwsResponse withCustomerGateways(Consumer<List<ResponseCustomerGateway>> customerGatewaysSetter) {
        if (this.customerGateways == null) {
            this.customerGateways = new ArrayList<>();
        }
        customerGatewaysSetter.accept(this.customerGateways);
        return this;
    }

    /**
     * 对端网关信息
     * @return customerGateways
     */
    public List<ResponseCustomerGateway> getCustomerGateways() {
        return customerGateways;
    }

    public void setCustomerGateways(List<ResponseCustomerGateway> customerGateways) {
        this.customerGateways = customerGateways;
    }

    public ListCgwsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 租户下对端网关总数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListCgwsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCgwsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCgwsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
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
        ListCgwsResponse that = (ListCgwsResponse) obj;
        return Objects.equals(this.customerGateways, that.customerGateways)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerGateways, totalCount, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCgwsResponse {\n");
        sb.append("    customerGateways: ").append(toIndentedString(customerGateways)).append("\n");
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
