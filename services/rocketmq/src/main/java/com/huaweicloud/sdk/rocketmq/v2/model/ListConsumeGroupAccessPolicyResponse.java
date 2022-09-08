package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConsumeGroupAccessPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private List<ListAccessPolicyRespPolicies> policies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private BigDecimal total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public ListConsumeGroupAccessPolicyResponse withPolicies(List<ListAccessPolicyRespPolicies> policies) {
        this.policies = policies;
        return this;
    }

    public ListConsumeGroupAccessPolicyResponse addPoliciesItem(ListAccessPolicyRespPolicies policiesItem) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        this.policies.add(policiesItem);
        return this;
    }

    public ListConsumeGroupAccessPolicyResponse withPolicies(
        Consumer<List<ListAccessPolicyRespPolicies>> policiesSetter) {
        if (this.policies == null) {
            this.policies = new ArrayList<>();
        }
        policiesSetter.accept(this.policies);
        return this;
    }

    /**
     * 用户列表。
     * @return policies
     */
    public List<ListAccessPolicyRespPolicies> getPolicies() {
        return policies;
    }

    public void setPolicies(List<ListAccessPolicyRespPolicies> policies) {
        this.policies = policies;
    }

    public ListConsumeGroupAccessPolicyResponse withTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    /**
     * 总用户个数。
     * @return total
     */
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public ListConsumeGroupAccessPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 主题或消费组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConsumeGroupAccessPolicyResponse listConsumeGroupAccessPolicyResponse =
            (ListConsumeGroupAccessPolicyResponse) o;
        return Objects.equals(this.policies, listConsumeGroupAccessPolicyResponse.policies)
            && Objects.equals(this.total, listConsumeGroupAccessPolicyResponse.total)
            && Objects.equals(this.name, listConsumeGroupAccessPolicyResponse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policies, total, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConsumeGroupAccessPolicyResponse {\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
