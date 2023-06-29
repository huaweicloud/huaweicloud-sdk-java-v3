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
public class ListPrivateNatsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateways")

    private List<PrivateNat> gateways = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPrivateNatsResponse withGateways(List<PrivateNat> gateways) {
        this.gateways = gateways;
        return this;
    }

    public ListPrivateNatsResponse addGatewaysItem(PrivateNat gatewaysItem) {
        if (this.gateways == null) {
            this.gateways = new ArrayList<>();
        }
        this.gateways.add(gatewaysItem);
        return this;
    }

    public ListPrivateNatsResponse withGateways(Consumer<List<PrivateNat>> gatewaysSetter) {
        if (this.gateways == null) {
            this.gateways = new ArrayList<>();
        }
        gatewaysSetter.accept(this.gateways);
        return this;
    }

    /**
     * 查询私网NAT网关实例列表的响应体。 详见PrivateNat字段说明。
     * @return gateways
     */
    public List<PrivateNat> getGateways() {
        return gateways;
    }

    public void setGateways(List<PrivateNat> gateways) {
        this.gateways = gateways;
    }

    public ListPrivateNatsResponse withRequestId(String requestId) {
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

    public ListPrivateNatsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPrivateNatsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListPrivateNatsResponse that = (ListPrivateNatsResponse) obj;
        return Objects.equals(this.gateways, that.gateways) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateways, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateNatsResponse {\n");
        sb.append("    gateways: ").append(toIndentedString(gateways)).append("\n");
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
