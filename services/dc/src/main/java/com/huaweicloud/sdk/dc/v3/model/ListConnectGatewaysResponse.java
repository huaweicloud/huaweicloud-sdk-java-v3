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
public class ListConnectGatewaysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateways")

    private List<ConnectGatewayResponse> connectGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListConnectGatewaysResponse withRequestId(String requestId) {
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

    public ListConnectGatewaysResponse withConnectGateways(List<ConnectGatewayResponse> connectGateways) {
        this.connectGateways = connectGateways;
        return this;
    }

    public ListConnectGatewaysResponse addConnectGatewaysItem(ConnectGatewayResponse connectGatewaysItem) {
        if (this.connectGateways == null) {
            this.connectGateways = new ArrayList<>();
        }
        this.connectGateways.add(connectGatewaysItem);
        return this;
    }

    public ListConnectGatewaysResponse withConnectGateways(
        Consumer<List<ConnectGatewayResponse>> connectGatewaysSetter) {
        if (this.connectGateways == null) {
            this.connectGateways = new ArrayList<>();
        }
        connectGatewaysSetter.accept(this.connectGateways);
        return this;
    }

    /**
     * Get connectGateways
     * @return connectGateways
     */
    public List<ConnectGatewayResponse> getConnectGateways() {
        return connectGateways;
    }

    public void setConnectGateways(List<ConnectGatewayResponse> connectGateways) {
        this.connectGateways = connectGateways;
    }

    public ListConnectGatewaysResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListConnectGatewaysResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListConnectGatewaysResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListConnectGatewaysResponse that = (ListConnectGatewaysResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.connectGateways, that.connectGateways)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, connectGateways, totalCount, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConnectGatewaysResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    connectGateways: ").append(toIndentedString(connectGateways)).append("\n");
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
