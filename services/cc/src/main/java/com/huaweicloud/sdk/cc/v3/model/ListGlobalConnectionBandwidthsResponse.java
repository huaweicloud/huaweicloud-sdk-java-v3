package com.huaweicloud.sdk.cc.v3.model;

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
public class ListGlobalConnectionBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "globalconnection_bandwidths")

    private List<GlobalConnectionBandwidth> globalconnectionBandwidths = null;

    public ListGlobalConnectionBandwidthsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListGlobalConnectionBandwidthsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalConnectionBandwidthsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListGlobalConnectionBandwidthsResponse withGlobalconnectionBandwidths(
        List<GlobalConnectionBandwidth> globalconnectionBandwidths) {
        this.globalconnectionBandwidths = globalconnectionBandwidths;
        return this;
    }

    public ListGlobalConnectionBandwidthsResponse addGlobalconnectionBandwidthsItem(
        GlobalConnectionBandwidth globalconnectionBandwidthsItem) {
        if (this.globalconnectionBandwidths == null) {
            this.globalconnectionBandwidths = new ArrayList<>();
        }
        this.globalconnectionBandwidths.add(globalconnectionBandwidthsItem);
        return this;
    }

    public ListGlobalConnectionBandwidthsResponse withGlobalconnectionBandwidths(
        Consumer<List<GlobalConnectionBandwidth>> globalconnectionBandwidthsSetter) {
        if (this.globalconnectionBandwidths == null) {
            this.globalconnectionBandwidths = new ArrayList<>();
        }
        globalconnectionBandwidthsSetter.accept(this.globalconnectionBandwidths);
        return this;
    }

    /**
     * 全域互联带宽列表响应体。
     * @return globalconnectionBandwidths
     */
    public List<GlobalConnectionBandwidth> getGlobalconnectionBandwidths() {
        return globalconnectionBandwidths;
    }

    public void setGlobalconnectionBandwidths(List<GlobalConnectionBandwidth> globalconnectionBandwidths) {
        this.globalconnectionBandwidths = globalconnectionBandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGlobalConnectionBandwidthsResponse that = (ListGlobalConnectionBandwidthsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.globalconnectionBandwidths, that.globalconnectionBandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, globalconnectionBandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalConnectionBandwidthsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    globalconnectionBandwidths: ").append(toIndentedString(globalconnectionBandwidths)).append("\n");
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
