package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListAutoScalingPolicyDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<AutoScalingPolicyRsp> policies = null;

    public ListAutoScalingPolicyDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 不分页的情况下符合查询条件的总自动扩缩容策略数量。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListAutoScalingPolicyDetailsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 分页的情况下，当前查询结果列表中自动扩缩容策略的总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAutoScalingPolicyDetailsResponse withPolicies(List<AutoScalingPolicyRsp> policies) {
        this.policies = policies;
        return this;
    }

    public ListAutoScalingPolicyDetailsResponse addPoliciesItem(AutoScalingPolicyRsp policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListAutoScalingPolicyDetailsResponse withPolicies(Consumer<List<AutoScalingPolicyRsp>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 自动扩缩容策略详情列表
     * @return policies
     */
    public List<AutoScalingPolicyRsp> getPolicies() {
        return policies;
    }

    public void setPolicies(List<AutoScalingPolicyRsp> policies) {
        this.policies = policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutoScalingPolicyDetailsResponse that = (ListAutoScalingPolicyDetailsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.count, that.count)
            && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, count, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoScalingPolicyDetailsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
