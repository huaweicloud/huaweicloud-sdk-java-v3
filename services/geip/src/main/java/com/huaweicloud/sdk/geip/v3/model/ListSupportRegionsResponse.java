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
public class ListSupportRegionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_regions")

    private List<ListSupportRegions> supportRegions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListGlobalEipsResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListSupportRegionsResponse withRequestId(String requestId) {
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

    public ListSupportRegionsResponse withSupportRegions(List<ListSupportRegions> supportRegions) {
        this.supportRegions = supportRegions;
        return this;
    }

    public ListSupportRegionsResponse addSupportRegionsItem(ListSupportRegions supportRegionsItem) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        this.supportRegions.add(supportRegionsItem);
        return this;
    }

    public ListSupportRegionsResponse withSupportRegions(Consumer<List<ListSupportRegions>> supportRegionsSetter) {
        if (this.supportRegions == null) {
            this.supportRegions = new ArrayList<>();
        }
        supportRegionsSetter.accept(this.supportRegions);
        return this;
    }

    /**
     * 支持的Region对象
     * @return supportRegions
     */
    public List<ListSupportRegions> getSupportRegions() {
        return supportRegions;
    }

    public void setSupportRegions(List<ListSupportRegions> supportRegions) {
        this.supportRegions = supportRegions;
    }

    public ListSupportRegionsResponse withPageInfo(ListGlobalEipsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSupportRegionsResponse withPageInfo(Consumer<ListGlobalEipsResponseBodyPageInfo> pageInfoSetter) {
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

    public ListSupportRegionsResponse withXRequestId(String xRequestId) {
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
        ListSupportRegionsResponse that = (ListSupportRegionsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.supportRegions, that.supportRegions) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, supportRegions, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSupportRegionsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    supportRegions: ").append(toIndentedString(supportRegions)).append("\n");
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
