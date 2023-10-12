package com.huaweicloud.sdk.vpc.v3.model;

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
public class ListTrafficMirrorFiltersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filters")

    private List<TrafficMirrorFilter> trafficMirrorFilters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListTrafficMirrorFiltersResponse withTrafficMirrorFilters(List<TrafficMirrorFilter> trafficMirrorFilters) {
        this.trafficMirrorFilters = trafficMirrorFilters;
        return this;
    }

    public ListTrafficMirrorFiltersResponse addTrafficMirrorFiltersItem(TrafficMirrorFilter trafficMirrorFiltersItem) {
        if (this.trafficMirrorFilters == null) {
            this.trafficMirrorFilters = new ArrayList<>();
        }
        this.trafficMirrorFilters.add(trafficMirrorFiltersItem);
        return this;
    }

    public ListTrafficMirrorFiltersResponse withTrafficMirrorFilters(
        Consumer<List<TrafficMirrorFilter>> trafficMirrorFiltersSetter) {
        if (this.trafficMirrorFilters == null) {
            this.trafficMirrorFilters = new ArrayList<>();
        }
        trafficMirrorFiltersSetter.accept(this.trafficMirrorFilters);
        return this;
    }

    /**
     * 流量镜像筛选条件对象列表
     * @return trafficMirrorFilters
     */
    public List<TrafficMirrorFilter> getTrafficMirrorFilters() {
        return trafficMirrorFilters;
    }

    public void setTrafficMirrorFilters(List<TrafficMirrorFilter> trafficMirrorFilters) {
        this.trafficMirrorFilters = trafficMirrorFilters;
    }

    public ListTrafficMirrorFiltersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListTrafficMirrorFiltersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListTrafficMirrorFiltersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
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
        ListTrafficMirrorFiltersResponse that = (ListTrafficMirrorFiltersResponse) obj;
        return Objects.equals(this.trafficMirrorFilters, that.trafficMirrorFilters)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilters, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTrafficMirrorFiltersResponse {\n");
        sb.append("    trafficMirrorFilters: ").append(toIndentedString(trafficMirrorFilters)).append("\n");
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
