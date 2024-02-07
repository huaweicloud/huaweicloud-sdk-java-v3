package com.huaweicloud.sdk.geip.v3.model;

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
public class ListInternetBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidths")

    private List<ListInternetBandwidths> internetBandwidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListGlobalEipsResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListInternetBandwidthsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListInternetBandwidthsResponse withInternetBandwidths(List<ListInternetBandwidths> internetBandwidths) {
        this.internetBandwidths = internetBandwidths;
        return this;
    }

    public ListInternetBandwidthsResponse addInternetBandwidthsItem(ListInternetBandwidths internetBandwidthsItem) {
        if (this.internetBandwidths == null) {
            this.internetBandwidths = new ArrayList<>();
        }
        this.internetBandwidths.add(internetBandwidthsItem);
        return this;
    }

    public ListInternetBandwidthsResponse withInternetBandwidths(
        Consumer<List<ListInternetBandwidths>> internetBandwidthsSetter) {
        if (this.internetBandwidths == null) {
            this.internetBandwidths = new ArrayList<>();
        }
        internetBandwidthsSetter.accept(this.internetBandwidths);
        return this;
    }

    /**
     * 全域公网带宽列表
     * @return internetBandwidths
     */
    public List<ListInternetBandwidths> getInternetBandwidths() {
        return internetBandwidths;
    }

    public void setInternetBandwidths(List<ListInternetBandwidths> internetBandwidths) {
        this.internetBandwidths = internetBandwidths;
    }

    public ListInternetBandwidthsResponse withPageInfo(ListGlobalEipsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListInternetBandwidthsResponse withPageInfo(Consumer<ListGlobalEipsResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListGlobalEipsResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListGlobalEipsResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListGlobalEipsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListInternetBandwidthsResponse withXRequestId(String xRequestId) {
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
        ListInternetBandwidthsResponse that = (ListInternetBandwidthsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.internetBandwidths, that.internetBandwidths)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, internetBandwidths, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetBandwidthsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    internetBandwidths: ").append(toIndentedString(internetBandwidths)).append("\n");
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
