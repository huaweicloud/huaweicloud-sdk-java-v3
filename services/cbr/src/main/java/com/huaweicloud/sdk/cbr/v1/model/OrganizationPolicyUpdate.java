package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新组织策略body体
 */
public class OrganizationPolicyUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_enabled")

    private Boolean policyEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_operation_definition")

    private PolicyoODCreate policyOperationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_trigger")

    private PolicyTriggerReq policyTrigger;

    public OrganizationPolicyUpdate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组织策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationPolicyUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 组织策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationPolicyUpdate withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public OrganizationPolicyUpdate withPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
        return this;
    }

    /**
     * 策略是否开启
     * @return policyEnabled
     */
    public Boolean getPolicyEnabled() {
        return policyEnabled;
    }

    public void setPolicyEnabled(Boolean policyEnabled) {
        this.policyEnabled = policyEnabled;
    }

    public OrganizationPolicyUpdate withPolicyOperationDefinition(PolicyoODCreate policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
        return this;
    }

    public OrganizationPolicyUpdate withPolicyOperationDefinition(
        Consumer<PolicyoODCreate> policyOperationDefinitionSetter) {
        if (this.policyOperationDefinition == null) {
            this.policyOperationDefinition = new PolicyoODCreate();
            policyOperationDefinitionSetter.accept(this.policyOperationDefinition);
        }

        return this;
    }

    /**
     * Get policyOperationDefinition
     * @return policyOperationDefinition
     */
    public PolicyoODCreate getPolicyOperationDefinition() {
        return policyOperationDefinition;
    }

    public void setPolicyOperationDefinition(PolicyoODCreate policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
    }

    public OrganizationPolicyUpdate withPolicyTrigger(PolicyTriggerReq policyTrigger) {
        this.policyTrigger = policyTrigger;
        return this;
    }

    public OrganizationPolicyUpdate withPolicyTrigger(Consumer<PolicyTriggerReq> policyTriggerSetter) {
        if (this.policyTrigger == null) {
            this.policyTrigger = new PolicyTriggerReq();
            policyTriggerSetter.accept(this.policyTrigger);
        }

        return this;
    }

    /**
     * Get policyTrigger
     * @return policyTrigger
     */
    public PolicyTriggerReq getPolicyTrigger() {
        return policyTrigger;
    }

    public void setPolicyTrigger(PolicyTriggerReq policyTrigger) {
        this.policyTrigger = policyTrigger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationPolicyUpdate that = (OrganizationPolicyUpdate) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyEnabled, that.policyEnabled)
            && Objects.equals(this.policyOperationDefinition, that.policyOperationDefinition)
            && Objects.equals(this.policyTrigger, that.policyTrigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, policyName, policyEnabled, policyOperationDefinition, policyTrigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicyUpdate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyEnabled: ").append(toIndentedString(policyEnabled)).append("\n");
        sb.append("    policyOperationDefinition: ").append(toIndentedString(policyOperationDefinition)).append("\n");
        sb.append("    policyTrigger: ").append(toIndentedString(policyTrigger)).append("\n");
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
