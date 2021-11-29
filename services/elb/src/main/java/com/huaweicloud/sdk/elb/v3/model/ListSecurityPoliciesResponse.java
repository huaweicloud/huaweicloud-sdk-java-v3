package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListSecurityPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policies")

    private List<SecurityPolicy> securityPolicies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListSecurityPoliciesResponse withSecurityPolicies(List<SecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
        return this;
    }

    public ListSecurityPoliciesResponse addSecurityPoliciesItem(SecurityPolicy securityPoliciesItem) {
        if (this.securityPolicies == null) {
            this.securityPolicies = new ArrayList<>();
        }
        this.securityPolicies.add(securityPoliciesItem);
        return this;
    }

    public ListSecurityPoliciesResponse withSecurityPolicies(Consumer<List<SecurityPolicy>> securityPoliciesSetter) {
        if (this.securityPolicies == null) {
            this.securityPolicies = new ArrayList<>();
        }
        securityPoliciesSetter.accept(this.securityPolicies);
        return this;
    }

    /** 自定义安全策略列表返回对象。
     * 
     * @return securityPolicies */
    public List<SecurityPolicy> getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(List<SecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
    }

    public ListSecurityPoliciesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /** 请求ID。 注：自动生成 。
     * 
     * @return requestId */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListSecurityPoliciesResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListSecurityPoliciesResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /** Get pageInfo
     * 
     * @return pageInfo */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecurityPoliciesResponse listSecurityPoliciesResponse = (ListSecurityPoliciesResponse) o;
        return Objects.equals(this.securityPolicies, listSecurityPoliciesResponse.securityPolicies)
            && Objects.equals(this.requestId, listSecurityPoliciesResponse.requestId)
            && Objects.equals(this.pageInfo, listSecurityPoliciesResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityPolicies, requestId, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPoliciesResponse {\n");
        sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
