package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规评估结果
 */
public class PolicyStateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_resource")

    private PolicyResource policyResource;

    /**
     * 触发器类型
     */
    public static final class TriggerTypeEnum {

        /**
         * Enum RESOURCE for value: "resource"
         */
        public static final TriggerTypeEnum RESOURCE = new TriggerTypeEnum("resource");

        /**
         * Enum PERIOD for value: "period"
         */
        public static final TriggerTypeEnum PERIOD = new TriggerTypeEnum("period");

        private static final Map<String, TriggerTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeEnum> createStaticFields() {
            Map<String, TriggerTypeEnum> map = new HashMap<>();
            map.put("resource", RESOURCE);
            map.put("period", PERIOD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeEnum(String value) {
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
        public static TriggerTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerTypeEnum(value);
            }
            return result;
        }

        public static TriggerTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeEnum) {
                return this.value.equals(((TriggerTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private TriggerTypeEnum triggerType;

    /**
     * 合规状态
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
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_time")

    private String evaluationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_hash")

    private String evaluationHash;

    public PolicyStateRequestBody withPolicyResource(PolicyResource policyResource) {
        this.policyResource = policyResource;
        return this;
    }

    public PolicyStateRequestBody withPolicyResource(Consumer<PolicyResource> policyResourceSetter) {
        if (this.policyResource == null) {
            this.policyResource = new PolicyResource();
            policyResourceSetter.accept(this.policyResource);
        }

        return this;
    }

    /**
     * Get policyResource
     * @return policyResource
     */
    public PolicyResource getPolicyResource() {
        return policyResource;
    }

    public void setPolicyResource(PolicyResource policyResource) {
        this.policyResource = policyResource;
    }

    public PolicyStateRequestBody withTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发器类型
     * @return triggerType
     */
    public TriggerTypeEnum getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerTypeEnum triggerType) {
        this.triggerType = triggerType;
    }

    public PolicyStateRequestBody withComplianceState(ComplianceStateEnum complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /**
     * 合规状态
     * @return complianceState
     */
    public ComplianceStateEnum getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(ComplianceStateEnum complianceState) {
        this.complianceState = complianceState;
    }

    public PolicyStateRequestBody withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * 规则ID
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public PolicyStateRequestBody withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * 规则名称
     * @return policyAssignmentName
     */
    public String getPolicyAssignmentName() {
        return policyAssignmentName;
    }

    public void setPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
    }

    public PolicyStateRequestBody withEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }

    /**
     * 合规状态评估时间
     * @return evaluationTime
     */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public PolicyStateRequestBody withEvaluationHash(String evaluationHash) {
        this.evaluationHash = evaluationHash;
        return this;
    }

    /**
     * 评估校验码
     * @return evaluationHash
     */
    public String getEvaluationHash() {
        return evaluationHash;
    }

    public void setEvaluationHash(String evaluationHash) {
        this.evaluationHash = evaluationHash;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyStateRequestBody policyStateRequestBody = (PolicyStateRequestBody) o;
        return Objects.equals(this.policyResource, policyStateRequestBody.policyResource)
            && Objects.equals(this.triggerType, policyStateRequestBody.triggerType)
            && Objects.equals(this.complianceState, policyStateRequestBody.complianceState)
            && Objects.equals(this.policyAssignmentId, policyStateRequestBody.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName, policyStateRequestBody.policyAssignmentName)
            && Objects.equals(this.evaluationTime, policyStateRequestBody.evaluationTime)
            && Objects.equals(this.evaluationHash, policyStateRequestBody.evaluationHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyResource,
            triggerType,
            complianceState,
            policyAssignmentId,
            policyAssignmentName,
            evaluationTime,
            evaluationHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStateRequestBody {\n");
        sb.append("    policyResource: ").append(toIndentedString(policyResource)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    evaluationTime: ").append(toIndentedString(evaluationTime)).append("\n");
        sb.append("    evaluationHash: ").append(toIndentedString(evaluationHash)).append("\n");
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
