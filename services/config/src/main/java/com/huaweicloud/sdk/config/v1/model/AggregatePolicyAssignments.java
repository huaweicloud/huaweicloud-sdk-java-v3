package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 聚合合规规则。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

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
     * 源帐号ID。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AggregatePolicyAssignments withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 帐户名称
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggregatePolicyAssignments that = (AggregatePolicyAssignments) obj;
        return Objects.equals(this.policyAssignmentId, that.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName, that.policyAssignmentName)
            && Objects.equals(this.compliance, that.compliance) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.accountName, that.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, policyAssignmentName, compliance, accountId, accountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyAssignments {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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
