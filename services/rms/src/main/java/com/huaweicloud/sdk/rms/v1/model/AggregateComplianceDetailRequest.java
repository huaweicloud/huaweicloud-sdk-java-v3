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
 * 查询指定聚合合规规则评估结果详情请求体。
 */
public class AggregateComplianceDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

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

        private static final Map<String, ComplianceStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ComplianceStateEnum> createStaticFields() {
            Map<String, ComplianceStateEnum> map = new HashMap<>();
            map.put("NonCompliant", NONCOMPLIANT);
            map.put("Compliant", COMPLIANT);
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
            ComplianceStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ComplianceStateEnum(value);
            }
            return result;
        }

        public static ComplianceStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ComplianceStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    public AggregateComplianceDetailRequest withAggregatorId(String aggregatorId) {
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

    public AggregateComplianceDetailRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 源帐号ID
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AggregateComplianceDetailRequest withComplianceState(ComplianceStateEnum complianceState) {
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

    public AggregateComplianceDetailRequest withPolicyAssignmentName(String policyAssignmentName) {
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

    public AggregateComplianceDetailRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public AggregateComplianceDetailRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregateComplianceDetailRequest aggregateComplianceDetailRequest = (AggregateComplianceDetailRequest) o;
        return Objects.equals(this.aggregatorId, aggregateComplianceDetailRequest.aggregatorId)
            && Objects.equals(this.accountId, aggregateComplianceDetailRequest.accountId)
            && Objects.equals(this.complianceState, aggregateComplianceDetailRequest.complianceState)
            && Objects.equals(this.policyAssignmentName, aggregateComplianceDetailRequest.policyAssignmentName)
            && Objects.equals(this.resourceName, aggregateComplianceDetailRequest.resourceName)
            && Objects.equals(this.resourceId, aggregateComplianceDetailRequest.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, accountId, complianceState, policyAssignmentName, resourceName, resourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateComplianceDetailRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
