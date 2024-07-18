package com.huaweicloud.sdk.vpn.v5.model;

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
public class ListVpnAccessPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_policies")

    private List<VpnAccessPolicy> accessPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListVpnAccessPoliciesResponse withAccessPolicies(List<VpnAccessPolicy> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    public ListVpnAccessPoliciesResponse addAccessPoliciesItem(VpnAccessPolicy accessPoliciesItem) {
        if (this.accessPolicies == null) {
            this.accessPolicies = new ArrayList<>();
        }
        this.accessPolicies.add(accessPoliciesItem);
        return this;
    }

    public ListVpnAccessPoliciesResponse withAccessPolicies(Consumer<List<VpnAccessPolicy>> accessPoliciesSetter) {
        if (this.accessPolicies == null) {
            this.accessPolicies = new ArrayList<>();
        }
        accessPoliciesSetter.accept(this.accessPolicies);
        return this;
    }

    /**
     * 访问资源策略信息
     * @return accessPolicies
     */
    public List<VpnAccessPolicy> getAccessPolicies() {
        return accessPolicies;
    }

    public void setAccessPolicies(List<VpnAccessPolicy> accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    public ListVpnAccessPoliciesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListVpnAccessPoliciesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListVpnAccessPoliciesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
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

    public ListVpnAccessPoliciesResponse withRequestId(String requestId) {
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
        ListVpnAccessPoliciesResponse that = (ListVpnAccessPoliciesResponse) obj;
        return Objects.equals(this.accessPolicies, that.accessPolicies)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessPolicies, totalCount, pageInfo, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVpnAccessPoliciesResponse {\n");
        sb.append("    accessPolicies: ").append(toIndentedString(accessPolicies)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
