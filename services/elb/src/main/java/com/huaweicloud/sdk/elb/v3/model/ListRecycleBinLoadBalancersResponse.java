package com.huaweicloud.sdk.elb.v3.model;

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
public class ListRecycleBinLoadBalancersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<RecycleLoadBalancer> loadbalancers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListRecycleBinLoadBalancersResponse withLoadbalancers(List<RecycleLoadBalancer> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public ListRecycleBinLoadBalancersResponse addLoadbalancersItem(RecycleLoadBalancer loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public ListRecycleBinLoadBalancersResponse withLoadbalancers(
        Consumer<List<RecycleLoadBalancer>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 回收站中的弹性负载均衡器实例列表。
     * @return loadbalancers
     */
    public List<RecycleLoadBalancer> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<RecycleLoadBalancer> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public ListRecycleBinLoadBalancersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListRecycleBinLoadBalancersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListRecycleBinLoadBalancersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。  注：自动生成 。
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
        ListRecycleBinLoadBalancersResponse that = (ListRecycleBinLoadBalancersResponse) obj;
        return Objects.equals(this.loadbalancers, that.loadbalancers) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancers, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecycleBinLoadBalancersResponse {\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
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
