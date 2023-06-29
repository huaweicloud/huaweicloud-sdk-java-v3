package com.huaweicloud.sdk.ga.v1.model;

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
public class ListEndpointGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_groups")

    private List<EndpointGroupDetail> endpointGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListEndpointGroupsResponse withEndpointGroups(List<EndpointGroupDetail> endpointGroups) {
        this.endpointGroups = endpointGroups;
        return this;
    }

    public ListEndpointGroupsResponse addEndpointGroupsItem(EndpointGroupDetail endpointGroupsItem) {
        if (this.endpointGroups == null) {
            this.endpointGroups = new ArrayList<>();
        }
        this.endpointGroups.add(endpointGroupsItem);
        return this;
    }

    public ListEndpointGroupsResponse withEndpointGroups(Consumer<List<EndpointGroupDetail>> endpointGroupsSetter) {
        if (this.endpointGroups == null) {
            this.endpointGroups = new ArrayList<>();
        }
        endpointGroupsSetter.accept(this.endpointGroups);
        return this;
    }

    /**
     * 终端节点组列表。
     * @return endpointGroups
     */
    public List<EndpointGroupDetail> getEndpointGroups() {
        return endpointGroups;
    }

    public void setEndpointGroups(List<EndpointGroupDetail> endpointGroups) {
        this.endpointGroups = endpointGroups;
    }

    public ListEndpointGroupsResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEndpointGroupsResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListEndpointGroupsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
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
        ListEndpointGroupsResponse that = (ListEndpointGroupsResponse) obj;
        return Objects.equals(this.endpointGroups, that.endpointGroups) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroups, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEndpointGroupsResponse {\n");
        sb.append("    endpointGroups: ").append(toIndentedString(endpointGroups)).append("\n");
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
