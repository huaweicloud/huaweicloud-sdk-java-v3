package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ListSecurityDynamicMaskingPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<DynamicMaskingPolicySet> policies = null;

    public ListSecurityDynamicMaskingPoliciesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 动态脱敏策略总条数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSecurityDynamicMaskingPoliciesResponse withPolicies(List<DynamicMaskingPolicySet> policies) {
        this.policies = policies;
        return this;
    }

    public ListSecurityDynamicMaskingPoliciesResponse addPoliciesItem(DynamicMaskingPolicySet policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListSecurityDynamicMaskingPoliciesResponse withPolicies(
        Consumer<List<DynamicMaskingPolicySet>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 动态数据脱敏策略列表。
     * @return policies
     */
    public List<DynamicMaskingPolicySet> getPolicies() {
        return policies;
    }

    public void setPolicies(List<DynamicMaskingPolicySet> policies) {
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
        ListSecurityDynamicMaskingPoliciesResponse that = (ListSecurityDynamicMaskingPoliciesResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.policies, that.policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityDynamicMaskingPoliciesResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
