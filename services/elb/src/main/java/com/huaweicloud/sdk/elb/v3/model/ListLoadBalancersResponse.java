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
public class ListLoadBalancersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<LoadBalancer> loadbalancers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListLoadBalancersResponse withLoadbalancers(List<LoadBalancer> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public ListLoadBalancersResponse addLoadbalancersItem(LoadBalancer loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public ListLoadBalancersResponse withLoadbalancers(Consumer<List<LoadBalancer>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * **参数解释**：负载均衡器列表。
     * @return loadbalancers
     */
    public List<LoadBalancer> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadBalancer> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public ListLoadBalancersResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListLoadBalancersResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListLoadBalancersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
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
        ListLoadBalancersResponse that = (ListLoadBalancersResponse) obj;
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
        sb.append("class ListLoadBalancersResponse {\n");
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
