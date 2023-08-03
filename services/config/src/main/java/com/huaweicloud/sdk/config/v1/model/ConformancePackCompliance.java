package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 合规规则评估结果。
 */
public class ConformancePackCompliance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_compliance")

    private String policyAssignmentCompliance;

    public ConformancePackCompliance withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /**
     * 合规规则ID。
     * @return policyAssignmentId
     */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public ConformancePackCompliance withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /**
     * 合规规则名称。
     * @return policyAssignmentName
     */
    public String getPolicyAssignmentName() {
        return policyAssignmentName;
    }

    public void setPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
    }

    public ConformancePackCompliance withPolicyAssignmentCompliance(String policyAssignmentCompliance) {
        this.policyAssignmentCompliance = policyAssignmentCompliance;
        return this;
    }

    /**
     * 合规规则合规结果。
     * @return policyAssignmentCompliance
     */
    public String getPolicyAssignmentCompliance() {
        return policyAssignmentCompliance;
    }

    public void setPolicyAssignmentCompliance(String policyAssignmentCompliance) {
        this.policyAssignmentCompliance = policyAssignmentCompliance;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConformancePackCompliance that = (ConformancePackCompliance) obj;
        return Objects.equals(this.policyAssignmentId, that.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName, that.policyAssignmentName)
            && Objects.equals(this.policyAssignmentCompliance, that.policyAssignmentCompliance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAssignmentId, policyAssignmentName, policyAssignmentCompliance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConformancePackCompliance {\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    policyAssignmentCompliance: ").append(toIndentedString(policyAssignmentCompliance)).append("\n");
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
