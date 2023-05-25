package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询指定聚合合规规则详情请求体。
 */
public class AggregatePolicyAssignmentDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    public AggregatePolicyAssignmentDetailRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public AggregatePolicyAssignmentDetailRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 租户ID
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AggregatePolicyAssignmentDetailRequest withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * 合规规则ID
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregatePolicyAssignmentDetailRequest aggregatePolicyAssignmentDetailRequest =
            (AggregatePolicyAssignmentDetailRequest) o;
        return Objects.equals(this.aggregatorId, aggregatePolicyAssignmentDetailRequest.aggregatorId)
            && Objects.equals(this.accountId, aggregatePolicyAssignmentDetailRequest.accountId)
            && Objects.equals(this.policyAssignmentId, aggregatePolicyAssignmentDetailRequest.policyAssignmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, accountId, policyAssignmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyAssignmentDetailRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
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
