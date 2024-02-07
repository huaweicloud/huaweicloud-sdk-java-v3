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
public class ListGlobalEipSegmentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segments")

    private List<ListGlobalEipSegments> globalEipSegments = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListGlobalEipsResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListGlobalEipSegmentsResponse withRequestId(String requestId) {
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

    public ListGlobalEipSegmentsResponse withGlobalEipSegments(List<ListGlobalEipSegments> globalEipSegments) {
        this.globalEipSegments = globalEipSegments;
        return this;
    }

    public ListGlobalEipSegmentsResponse addGlobalEipSegmentsItem(ListGlobalEipSegments globalEipSegmentsItem) {
        if (this.globalEipSegments == null) {
            this.globalEipSegments = new ArrayList<>();
        }
        this.globalEipSegments.add(globalEipSegmentsItem);
        return this;
    }

    public ListGlobalEipSegmentsResponse withGlobalEipSegments(
        Consumer<List<ListGlobalEipSegments>> globalEipSegmentsSetter) {
        if (this.globalEipSegments == null) {
            this.globalEipSegments = new ArrayList<>();
        }
        globalEipSegmentsSetter.accept(this.globalEipSegments);
        return this;
    }

    /**
     * 全域弹性公网IP段对象
     * @return globalEipSegments
     */
    public List<ListGlobalEipSegments> getGlobalEipSegments() {
        return globalEipSegments;
    }

    public void setGlobalEipSegments(List<ListGlobalEipSegments> globalEipSegments) {
        this.globalEipSegments = globalEipSegments;
    }

    public ListGlobalEipSegmentsResponse withPageInfo(ListGlobalEipsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListGlobalEipSegmentsResponse withPageInfo(Consumer<ListGlobalEipsResponseBodyPageInfo> pageInfoSetter) {
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

    public ListGlobalEipSegmentsResponse withXRequestId(String xRequestId) {
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
        ListGlobalEipSegmentsResponse that = (ListGlobalEipSegmentsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.globalEipSegments, that.globalEipSegments)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, globalEipSegments, pageInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGlobalEipSegmentsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    globalEipSegments: ").append(toIndentedString(globalEipSegments)).append("\n");
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
