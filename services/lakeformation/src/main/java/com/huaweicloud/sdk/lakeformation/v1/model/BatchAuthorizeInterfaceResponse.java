package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class BatchAuthorizeInterfaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<LakeFormationPolicy> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PagedInfo pageInfo;

    public BatchAuthorizeInterfaceResponse withPolicies(List<LakeFormationPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public BatchAuthorizeInterfaceResponse addPoliciesItem(LakeFormationPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public BatchAuthorizeInterfaceResponse withPolicies(Consumer<List<LakeFormationPolicy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * lakecat策略信息
     * @return policies
     */
    public List<LakeFormationPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<LakeFormationPolicy> policies) {
        this.policies = policies;
    }

    public BatchAuthorizeInterfaceResponse withPageInfo(PagedInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchAuthorizeInterfaceResponse withPageInfo(Consumer<PagedInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PagedInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PagedInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PagedInfo pageInfo) {
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
        BatchAuthorizeInterfaceResponse batchAuthorizeInterfaceResponse = (BatchAuthorizeInterfaceResponse) o;
        return Objects.equals(this.policies, batchAuthorizeInterfaceResponse.policies)
            && Objects.equals(this.pageInfo, batchAuthorizeInterfaceResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAuthorizeInterfaceResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
