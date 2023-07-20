package com.huaweicloud.sdk.eip.v3.model;

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
public class ListBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_bandwidths")

    private List<BandwidthResponseBody> eipBandwidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoOption pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListBandwidthResponse withEipBandwidths(List<BandwidthResponseBody> eipBandwidths) {
        this.eipBandwidths = eipBandwidths;
        return this;
    }

    public ListBandwidthResponse addEipBandwidthsItem(BandwidthResponseBody eipBandwidthsItem) {
        if (this.eipBandwidths == null) {
            this.eipBandwidths = new ArrayList<>();
        }
        this.eipBandwidths.add(eipBandwidthsItem);
        return this;
    }

    public ListBandwidthResponse withEipBandwidths(Consumer<List<BandwidthResponseBody>> eipBandwidthsSetter) {
        if (this.eipBandwidths == null) {
            this.eipBandwidths = new ArrayList<>();
        }
        eipBandwidthsSetter.accept(this.eipBandwidths);
        return this;
    }

    /**
     * 带宽列表对象
     * @return eipBandwidths
     */
    public List<BandwidthResponseBody> getEipBandwidths() {
        return eipBandwidths;
    }

    public void setEipBandwidths(List<BandwidthResponseBody> eipBandwidths) {
        this.eipBandwidths = eipBandwidths;
    }

    public ListBandwidthResponse withPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthResponse withPageInfo(Consumer<PageInfoOption> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoOption();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoOption getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoOption pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListBandwidthResponse withRequestId(String requestId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBandwidthResponse that = (ListBandwidthResponse) obj;
        return Objects.equals(this.eipBandwidths, that.eipBandwidths) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipBandwidths, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthResponse {\n");
        sb.append("    eipBandwidths: ").append(toIndentedString(eipBandwidths)).append("\n");
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
