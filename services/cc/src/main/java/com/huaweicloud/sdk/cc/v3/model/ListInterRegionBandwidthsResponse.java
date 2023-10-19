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
public class ListInterRegionBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inter_region_bandwidths")

    private List<InterRegionBandwidth> interRegionBandwidths = null;

    public ListInterRegionBandwidthsResponse withRequestId(String requestId) {
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

    public ListInterRegionBandwidthsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListInterRegionBandwidthsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListInterRegionBandwidthsResponse withInterRegionBandwidths(
        List<InterRegionBandwidth> interRegionBandwidths) {
        this.interRegionBandwidths = interRegionBandwidths;
        return this;
    }

    public ListInterRegionBandwidthsResponse addInterRegionBandwidthsItem(
        InterRegionBandwidth interRegionBandwidthsItem) {
        if (this.interRegionBandwidths == null) {
            this.interRegionBandwidths = new ArrayList<>();
        }
        this.interRegionBandwidths.add(interRegionBandwidthsItem);
        return this;
    }

    public ListInterRegionBandwidthsResponse withInterRegionBandwidths(
        Consumer<List<InterRegionBandwidth>> interRegionBandwidthsSetter) {
        if (this.interRegionBandwidths == null) {
            this.interRegionBandwidths = new ArrayList<>();
        }
        interRegionBandwidthsSetter.accept(this.interRegionBandwidths);
        return this;
    }

    /**
     * 域间带宽实例列表。
     * @return interRegionBandwidths
     */
    public List<InterRegionBandwidth> getInterRegionBandwidths() {
        return interRegionBandwidths;
    }

    public void setInterRegionBandwidths(List<InterRegionBandwidth> interRegionBandwidths) {
        this.interRegionBandwidths = interRegionBandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInterRegionBandwidthsResponse that = (ListInterRegionBandwidthsResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.interRegionBandwidths, that.interRegionBandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, interRegionBandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInterRegionBandwidthsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    interRegionBandwidths: ").append(toIndentedString(interRegionBandwidths)).append("\n");
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
