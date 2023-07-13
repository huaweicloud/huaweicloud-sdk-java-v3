package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 聚合合规规则过滤器。
 */
public class AggregatePolicyAssignmentsFilters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    /**
     * 合规结果。
     */
    public static final class ComplianceStateEnum {

        /**
         * Enum NONCOMPLIANT for value: "NonCompliant"
         */
        public static final ComplianceStateEnum NONCOMPLIANT = new ComplianceStateEnum("NonCompliant");

        /**
         * Enum COMPLIANT for value: "Compliant"
         */
        public static final ComplianceStateEnum COMPLIANT = new ComplianceStateEnum("Compliant");

        /**
         * Enum NOTSTARTED for value: "NotStarted"
         */
        public static final ComplianceStateEnum NOTSTARTED = new ComplianceStateEnum("NotStarted");

        private static final Map<String, ComplianceStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComplianceStateEnum> createStaticFields() {
            Map<String, ComplianceStateEnum> map = new HashMap<>();
            map.put("NonCompliant", NONCOMPLIANT);
            map.put("Compliant", COMPLIANT);
            map.put("NotStarted", NOTSTARTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ComplianceStateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ComplianceStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ComplianceStateEnum(value));
        }

        public static ComplianceStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ComplianceStateEnum) {
                return this.value.equals(((ComplianceStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private ComplianceStateEnum complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    public AggregatePolicyAssignmentsFilters withAccountId(String accountId) {
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

    public AggregatePolicyAssignmentsFilters withComplianceState(ComplianceStateEnum complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * 合规结果。
     * @return complianceState
     */
    public ComplianceStateEnum getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(ComplianceStateEnum complianceState) {
        this.complianceState = complianceState;
    }

    public AggregatePolicyAssignmentsFilters withPolicyAssignmentName(String policyAssignmentName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AggregatePolicyAssignmentsFilters that = (AggregatePolicyAssignmentsFilters) obj;
        return Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.complianceState, that.complianceState)
            && Objects.equals(this.policyAssignmentName, that.policyAssignmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, complianceState, policyAssignmentName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregatePolicyAssignmentsFilters {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
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
