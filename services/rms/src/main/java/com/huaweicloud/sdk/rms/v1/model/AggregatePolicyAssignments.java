package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合合规策略响应列表
 */
public class AggregatePolicyAssignments {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance")

    private Compliance compliance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    public AggregatePolicyAssignments withPolicyAssignmentId(String policyAssignmentId) {
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

    public AggregatePolicyAssignments withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * 合规规则名称
     * @return policyAssignmentName
     */
    public String getPolicyAssignmentName() {
        return policyAssignmentName;
    }

    public void setPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
    }

    public AggregatePolicyAssignments withCompliance(Compliance compliance) {
        this.compliance = compliance;
        return this;
    }

    public AggregatePolicyAssignments withCompliance(Consumer<Compliance> complianceSetter) {
        if (this.compliance == null) {
            this.compliance = new Compliance();
            complianceSetter.accept(this.compliance);
        }

        return this;
    }

    /**
     * Get compliance
     * @return compliance
     */
    public Compliance getCompliance() {
        return compliance;
    }

    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }

    public AggregatePolicyAssignments withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账户ID
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregatePolicyAssignments aggregatePolicyAssignments = (AggregatePolicyAssignments) o;
        return Objects.equals(this.policyAssignmentId, aggregatePolicyAssignments.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName, aggregatePolicyAssignments.policyAssignmentName)
            && Objects.equals(this.compliance, aggregatePolicyAssignments.compliance)
            && Objects.equals(this.accountId, aggregatePolicyAssignments.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, policyAssignmentName, compliance, accountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyAssignments {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
