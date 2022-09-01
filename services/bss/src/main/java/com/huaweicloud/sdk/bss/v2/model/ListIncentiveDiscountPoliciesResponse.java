package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListIncentiveDiscountPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    @JacksonXmlProperty(localName = "policies")

    private List<IncentiveAndDiscountPolicy> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    public ListIncentiveDiscountPoliciesResponse withPolicies(List<IncentiveAndDiscountPolicy> policies) {
        this.policies = policies;
        return this;
    }

    public ListIncentiveDiscountPoliciesResponse addPoliciesItem(IncentiveAndDiscountPolicy policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListIncentiveDiscountPoliciesResponse withPolicies(
        Consumer<List<IncentiveAndDiscountPolicy>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 产品折扣和激励策略信息列表。 具体请参见表2。
     * @return policies
     */
    public List<IncentiveAndDiscountPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<IncentiveAndDiscountPolicy> policies) {
        this.policies = policies;
    }

    public ListIncentiveDiscountPoliciesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 查询总条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIncentiveDiscountPoliciesResponse listIncentiveDiscountPoliciesResponse =
            (ListIncentiveDiscountPoliciesResponse) o;
        return Objects.equals(this.policies, listIncentiveDiscountPoliciesResponse.policies)
            && Objects.equals(this.totalCount, listIncentiveDiscountPoliciesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIncentiveDiscountPoliciesResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
