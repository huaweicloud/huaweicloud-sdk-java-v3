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
public class ListEipBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_bandwidths")

    private List<EipBandwidthResponseBody> eipBandwidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDict pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListEipBandwidthsResponse withEipBandwidths(List<EipBandwidthResponseBody> eipBandwidths) {
        this.eipBandwidths = eipBandwidths;
        return this;
    }

    public ListEipBandwidthsResponse addEipBandwidthsItem(EipBandwidthResponseBody eipBandwidthsItem) {
        if (this.eipBandwidths == null) {
            this.eipBandwidths = new ArrayList<>();
        }
        this.eipBandwidths.add(eipBandwidthsItem);
        return this;
    }

    public ListEipBandwidthsResponse withEipBandwidths(Consumer<List<EipBandwidthResponseBody>> eipBandwidthsSetter) {
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
    public List<EipBandwidthResponseBody> getEipBandwidths() {
        return eipBandwidths;
    }

    public void setEipBandwidths(List<EipBandwidthResponseBody> eipBandwidths) {
        this.eipBandwidths = eipBandwidths;
    }

    public ListEipBandwidthsResponse withPageInfo(PageInfoDict pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEipBandwidthsResponse withPageInfo(Consumer<PageInfoDict> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDict();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDict getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDict pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListEipBandwidthsResponse withRequestId(String requestId) {
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
        ListEipBandwidthsResponse that = (ListEipBandwidthsResponse) obj;
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
        sb.append("class ListEipBandwidthsResponse {\n");
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
