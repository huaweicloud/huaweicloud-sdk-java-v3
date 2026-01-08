package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略组模板。
 */
public class PolicyGroupForTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_name")

    private String policyGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private String policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_group_type")

    private String policyGroupType;

    public PolicyGroupForTemplate withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    /**
     * 策略组名称。
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    public PolicyGroupForTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyGroupForTemplate withPolicies(String policies) {
        this.policies = policies;
        return this;
    }

    /**
     * 策略。
     * @return policies
     */
    public String getPolicies() {
        return policies;
    }

    public void setPolicies(String policies) {
        this.policies = policies;
    }

    public PolicyGroupForTemplate withPolicyGroupType(String policyGroupType) {
        this.policyGroupType = policyGroupType;
        return this;
    }

    /**
     * 策略组类型。
     * @return policyGroupType
     */
    public String getPolicyGroupType() {
        return policyGroupType;
    }

    public void setPolicyGroupType(String policyGroupType) {
        this.policyGroupType = policyGroupType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyGroupForTemplate that = (PolicyGroupForTemplate) obj;
        return Objects.equals(this.policyGroupName, that.policyGroupName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.policies, that.policies)
            && Objects.equals(this.policyGroupType, that.policyGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyGroupName, description, policies, policyGroupType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyGroupForTemplate {\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    policyGroupType: ").append(toIndentedString(policyGroupType)).append("\n");
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
