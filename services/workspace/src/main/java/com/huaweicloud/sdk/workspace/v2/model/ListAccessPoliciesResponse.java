package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAccessPoliciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<AccessPolicyDetailInfo> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAccessPoliciesResponse withPolicies(List<AccessPolicyDetailInfo> policies) {
        this.policies = policies;
        return this;
    }

    public ListAccessPoliciesResponse addPoliciesItem(AccessPolicyDetailInfo policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListAccessPoliciesResponse withPolicies(Consumer<List<AccessPolicyDetailInfo>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 查询接入策略响应。
     * @return policies
     */
    public List<AccessPolicyDetailInfo> getPolicies() {
        return policies;
    }

    public void setPolicies(List<AccessPolicyDetailInfo> policies) {
        this.policies = policies;
    }

    public ListAccessPoliciesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 策略总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAccessPoliciesResponse listAccessPoliciesResponse = (ListAccessPoliciesResponse) o;
        return Objects.equals(this.policies, listAccessPoliciesResponse.policies)
            && Objects.equals(this.total, listAccessPoliciesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPoliciesResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
