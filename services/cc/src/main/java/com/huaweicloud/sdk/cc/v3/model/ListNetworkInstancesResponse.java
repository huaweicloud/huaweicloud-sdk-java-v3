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
public class ListNetworkInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_instances")

    private List<NetworkInstance> networkInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListNetworkInstancesResponse withNetworkInstances(List<NetworkInstance> networkInstances) {
        this.networkInstances = networkInstances;
        return this;
    }

    public ListNetworkInstancesResponse addNetworkInstancesItem(NetworkInstance networkInstancesItem) {
        if (this.networkInstances == null) {
            this.networkInstances = new ArrayList<>();
        }
        this.networkInstances.add(networkInstancesItem);
        return this;
    }

    public ListNetworkInstancesResponse withNetworkInstances(Consumer<List<NetworkInstance>> networkInstancesSetter) {
        if (this.networkInstances == null) {
            this.networkInstances = new ArrayList<>();
        }
        networkInstancesSetter.accept(this.networkInstances);
        return this;
    }

    /**
     * 网络实例列表。
     * @return networkInstances
     */
    public List<NetworkInstance> getNetworkInstances() {
        return networkInstances;
    }

    public void setNetworkInstances(List<NetworkInstance> networkInstances) {
        this.networkInstances = networkInstances;
    }

    public ListNetworkInstancesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListNetworkInstancesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListNetworkInstancesResponse withRequestId(String requestId) {
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
        ListNetworkInstancesResponse that = (ListNetworkInstancesResponse) obj;
        return Objects.equals(this.networkInstances, that.networkInstances)
            && Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkInstances, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworkInstancesResponse {\n");
        sb.append("    networkInstances: ").append(toIndentedString(networkInstances)).append("\n");
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
