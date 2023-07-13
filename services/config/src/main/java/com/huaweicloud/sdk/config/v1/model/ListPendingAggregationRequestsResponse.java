package com.huaweicloud.sdk.config.v1.model;

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
public class ListPendingAggregationRequestsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pending_aggregation_requests")

    private List<PendingAggregationRequest> pendingAggregationRequests = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListPendingAggregationRequestsResponse withPendingAggregationRequests(
        List<PendingAggregationRequest> pendingAggregationRequests) {
        this.pendingAggregationRequests = pendingAggregationRequests;
        return this;
    }

    public ListPendingAggregationRequestsResponse addPendingAggregationRequestsItem(
        PendingAggregationRequest pendingAggregationRequestsItem) {
        if (this.pendingAggregationRequests == null) {
            this.pendingAggregationRequests = new ArrayList<>();
        }
        this.pendingAggregationRequests.add(pendingAggregationRequestsItem);
        return this;
    }

    public ListPendingAggregationRequestsResponse withPendingAggregationRequests(
        Consumer<List<PendingAggregationRequest>> pendingAggregationRequestsSetter) {
        if (this.pendingAggregationRequests == null) {
            this.pendingAggregationRequests = new ArrayList<>();
        }
        pendingAggregationRequestsSetter.accept(this.pendingAggregationRequests);
        return this;
    }

    /**
     * 挂起的聚合请求列表。
     * @return pendingAggregationRequests
     */
    public List<PendingAggregationRequest> getPendingAggregationRequests() {
        return pendingAggregationRequests;
    }

    public void setPendingAggregationRequests(List<PendingAggregationRequest> pendingAggregationRequests) {
        this.pendingAggregationRequests = pendingAggregationRequests;
    }

    public ListPendingAggregationRequestsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListPendingAggregationRequestsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListPendingAggregationRequestsResponse that = (ListPendingAggregationRequestsResponse) obj;
        return Objects.equals(this.pendingAggregationRequests, that.pendingAggregationRequests)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pendingAggregationRequests, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPendingAggregationRequestsResponse {\n");
        sb.append("    pendingAggregationRequests: ").append(toIndentedString(pendingAggregationRequests)).append("\n");
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
