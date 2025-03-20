package com.huaweicloud.sdk.er.v3.model;

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
public class ListFlowLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_logs")

    private List<FlowLog> flowLogs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListFlowLogsResponse withFlowLogs(List<FlowLog> flowLogs) {
        this.flowLogs = flowLogs;
        return this;
    }

    public ListFlowLogsResponse addFlowLogsItem(FlowLog flowLogsItem) {
        if (this.flowLogs == null) {
            this.flowLogs = new ArrayList<>();
        }
        this.flowLogs.add(flowLogsItem);
        return this;
    }

    public ListFlowLogsResponse withFlowLogs(Consumer<List<FlowLog>> flowLogsSetter) {
        if (this.flowLogs == null) {
            this.flowLogs = new ArrayList<>();
        }
        flowLogsSetter.accept(this.flowLogs);
        return this;
    }

    /**
     * Get flowLogs
     * @return flowLogs
     */
    public List<FlowLog> getFlowLogs() {
        return flowLogs;
    }

    public void setFlowLogs(List<FlowLog> flowLogs) {
        this.flowLogs = flowLogs;
    }

    public ListFlowLogsResponse withRequestId(String requestId) {
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

    public ListFlowLogsResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总计数量
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ListFlowLogsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListFlowLogsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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
        ListFlowLogsResponse that = (ListFlowLogsResponse) obj;
        return Objects.equals(this.flowLogs, that.flowLogs) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLogs, requestId, totalCount, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlowLogsResponse {\n");
        sb.append("    flowLogs: ").append(toIndentedString(flowLogs)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
