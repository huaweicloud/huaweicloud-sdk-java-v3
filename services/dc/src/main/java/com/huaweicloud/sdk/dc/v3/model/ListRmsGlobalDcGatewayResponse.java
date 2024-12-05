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
public class ListRmsGlobalDcGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateways")

    private List<RmsListGlobalDcGateways> globalDcGateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListRmsGlobalDcGatewayResponse withRequestId(String requestId) {
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

    public ListRmsGlobalDcGatewayResponse withGlobalDcGateways(List<RmsListGlobalDcGateways> globalDcGateways) {
        this.globalDcGateways = globalDcGateways;
        return this;
    }

    public ListRmsGlobalDcGatewayResponse addGlobalDcGatewaysItem(RmsListGlobalDcGateways globalDcGatewaysItem) {
        if (this.globalDcGateways == null) {
            this.globalDcGateways = new ArrayList<>();
        }
        this.globalDcGateways.add(globalDcGatewaysItem);
        return this;
    }

    public ListRmsGlobalDcGatewayResponse withGlobalDcGateways(
        Consumer<List<RmsListGlobalDcGateways>> globalDcGatewaysSetter) {
        if (this.globalDcGateways == null) {
            this.globalDcGateways = new ArrayList<>();
        }
        globalDcGatewaysSetter.accept(this.globalDcGateways);
        return this;
    }

    /**
     * 全球接入网关
     * @return globalDcGateways
     */
    public List<RmsListGlobalDcGateways> getGlobalDcGateways() {
        return globalDcGateways;
    }

    public void setGlobalDcGateways(List<RmsListGlobalDcGateways> globalDcGateways) {
        this.globalDcGateways = globalDcGateways;
    }

    public ListRmsGlobalDcGatewayResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRmsGlobalDcGatewayResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListRmsGlobalDcGatewayResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRmsGlobalDcGatewayResponse that = (ListRmsGlobalDcGatewayResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.globalDcGateways, that.globalDcGateways)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, globalDcGateways, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRmsGlobalDcGatewayResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    globalDcGateways: ").append(toIndentedString(globalDcGateways)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
