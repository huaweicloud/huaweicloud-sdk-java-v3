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
public class ListCentralNetworkPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_policies")

    private List<CentralNetworkPolicy> centralNetworkPolicies = null;

    public ListCentralNetworkPoliciesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCentralNetworkPoliciesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListCentralNetworkPoliciesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListCentralNetworkPoliciesResponse withCentralNetworkPolicies(
        List<CentralNetworkPolicy> centralNetworkPolicies) {
        this.centralNetworkPolicies = centralNetworkPolicies;
        return this;
    }

    public ListCentralNetworkPoliciesResponse addCentralNetworkPoliciesItem(
        CentralNetworkPolicy centralNetworkPoliciesItem) {
        if (this.centralNetworkPolicies == null) {
            this.centralNetworkPolicies = new ArrayList<>();
        }
        this.centralNetworkPolicies.add(centralNetworkPoliciesItem);
        return this;
    }

    public ListCentralNetworkPoliciesResponse withCentralNetworkPolicies(
        Consumer<List<CentralNetworkPolicy>> centralNetworkPoliciesSetter) {
        if (this.centralNetworkPolicies == null) {
            this.centralNetworkPolicies = new ArrayList<>();
        }
        centralNetworkPoliciesSetter.accept(this.centralNetworkPolicies);
        return this;
    }

    /**
     * 中心网络策略列表。
     * @return centralNetworkPolicies
     */
    public List<CentralNetworkPolicy> getCentralNetworkPolicies() {
        return centralNetworkPolicies;
    }

    public void setCentralNetworkPolicies(List<CentralNetworkPolicy> centralNetworkPolicies) {
        this.centralNetworkPolicies = centralNetworkPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCentralNetworkPoliciesResponse that = (ListCentralNetworkPoliciesResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.centralNetworkPolicies, that.centralNetworkPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, pageInfo, centralNetworkPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCentralNetworkPoliciesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    centralNetworkPolicies: ").append(toIndentedString(centralNetworkPolicies)).append("\n");
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
