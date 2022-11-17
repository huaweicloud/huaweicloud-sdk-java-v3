package com.huaweicloud.sdk.dc.v3.model;

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
public class ListVirtualGatewaysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateways")

    private List<VirtualGateway> virtualGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListVirtualGatewaysResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListVirtualGatewaysResponse withVirtualGateways(List<VirtualGateway> virtualGateways) {
        this.virtualGateways = virtualGateways;
        return this;
    }

    public ListVirtualGatewaysResponse addVirtualGatewaysItem(VirtualGateway virtualGatewaysItem) {
        if (this.virtualGateways == null) {
            this.virtualGateways = new ArrayList<>();
        }
        this.virtualGateways.add(virtualGatewaysItem);
        return this;
    }

    public ListVirtualGatewaysResponse withVirtualGateways(Consumer<List<VirtualGateway>> virtualGatewaysSetter) {
        if (this.virtualGateways == null) {
            this.virtualGateways = new ArrayList<>();
        }
        virtualGatewaysSetter.accept(this.virtualGateways);
        return this;
    }

    /**
     * 虚拟网关对象列表
     * @return virtualGateways
     */
    public List<VirtualGateway> getVirtualGateways() {
        return virtualGateways;
    }

    public void setVirtualGateways(List<VirtualGateway> virtualGateways) {
        this.virtualGateways = virtualGateways;
    }

    public ListVirtualGatewaysResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVirtualGatewaysResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListVirtualGatewaysResponse listVirtualGatewaysResponse = (ListVirtualGatewaysResponse) o;
        return Objects.equals(this.requestId, listVirtualGatewaysResponse.requestId)
            && Objects.equals(this.virtualGateways, listVirtualGatewaysResponse.virtualGateways)
            && Objects.equals(this.pageInfo, listVirtualGatewaysResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, virtualGateways, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVirtualGatewaysResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    virtualGateways: ").append(toIndentedString(virtualGateways)).append("\n");
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
