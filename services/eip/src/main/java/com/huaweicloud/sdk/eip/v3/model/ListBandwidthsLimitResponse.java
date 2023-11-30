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
public class ListBandwidthsLimitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_bandwidth_limits")

    private List<ShowTenantDict> eipBandwidthLimits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDict pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListBandwidthsLimitResponse withEipBandwidthLimits(List<ShowTenantDict> eipBandwidthLimits) {
        this.eipBandwidthLimits = eipBandwidthLimits;
        return this;
    }

    public ListBandwidthsLimitResponse addEipBandwidthLimitsItem(ShowTenantDict eipBandwidthLimitsItem) {
        if (this.eipBandwidthLimits == null) {
            this.eipBandwidthLimits = new ArrayList<>();
        }
        this.eipBandwidthLimits.add(eipBandwidthLimitsItem);
        return this;
    }

    public ListBandwidthsLimitResponse withEipBandwidthLimits(Consumer<List<ShowTenantDict>> eipBandwidthLimitsSetter) {
        if (this.eipBandwidthLimits == null) {
            this.eipBandwidthLimits = new ArrayList<>();
        }
        eipBandwidthLimitsSetter.accept(this.eipBandwidthLimits);
        return this;
    }

    /**
     * 带宽限制列表
     * @return eipBandwidthLimits
     */
    public List<ShowTenantDict> getEipBandwidthLimits() {
        return eipBandwidthLimits;
    }

    public void setEipBandwidthLimits(List<ShowTenantDict> eipBandwidthLimits) {
        this.eipBandwidthLimits = eipBandwidthLimits;
    }

    public ListBandwidthsLimitResponse withPageInfo(PageInfoDict pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListBandwidthsLimitResponse withPageInfo(Consumer<PageInfoDict> pageInfoSetter) {
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

    public ListBandwidthsLimitResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求编号
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
        ListBandwidthsLimitResponse that = (ListBandwidthsLimitResponse) obj;
        return Objects.equals(this.eipBandwidthLimits, that.eipBandwidthLimits)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipBandwidthLimits, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBandwidthsLimitResponse {\n");
        sb.append("    eipBandwidthLimits: ").append(toIndentedString(eipBandwidthLimits)).append("\n");
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
