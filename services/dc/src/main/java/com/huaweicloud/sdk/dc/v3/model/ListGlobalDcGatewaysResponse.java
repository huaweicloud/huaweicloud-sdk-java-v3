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
public class ListGlobalDcGatewaysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateways")

    private List<GlobalDcGatewayEntry> globalDcGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListGlobalDcGatewaysResponse withGlobalDcGateways(List<GlobalDcGatewayEntry> globalDcGateways) {
        this.globalDcGateways = globalDcGateways;
        return this;
    }

    public ListGlobalDcGatewaysResponse addGlobalDcGatewaysItem(GlobalDcGatewayEntry globalDcGatewaysItem) {
        if (this.globalDcGateways == null) {
            this.globalDcGateways = new ArrayList<>();
        }
        this.globalDcGateways.add(globalDcGatewaysItem);
        return this;
    }

    public ListGlobalDcGatewaysResponse withGlobalDcGateways(
        Consumer<List<GlobalDcGatewayEntry>> globalDcGatewaysSetter) {
        if (this.globalDcGateways == null) {
            this.globalDcGateways = new ArrayList<>();
        }
        globalDcGatewaysSetter.accept(this.globalDcGateways);
        return this;
    }

    /**
     * 全域接入网关列表。
     * @return globalDcGateways
     */
    public List<GlobalDcGatewayEntry> getGlobalDcGateways() {
        return globalDcGateways;
    }

    public void setGlobalDcGateways(List<GlobalDcGatewayEntry> globalDcGateways) {
        this.globalDcGateways = globalDcGateways;
    }

    public ListGlobalDcGatewaysResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalDcGatewaysResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListGlobalDcGatewaysResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalDcGatewaysResponse that = (ListGlobalDcGatewaysResponse) obj;
        return Objects.equals(this.globalDcGateways, that.globalDcGateways)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGateways, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalDcGatewaysResponse {\n");
        sb.append("    globalDcGateways: ").append(toIndentedString(globalDcGateways)).append("\n");
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
