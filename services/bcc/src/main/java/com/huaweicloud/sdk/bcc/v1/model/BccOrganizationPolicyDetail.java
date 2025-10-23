package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织策略详情
 */
public class BccOrganizationPolicyDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_enabled")

    private Boolean policyEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_operation_definition")

    private BccOrganizationPolicyDetailPolicyOperationDefinition policyOperationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_trigger")

    private PolicyTriggerResp policyTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_scope")

    private String effectiveScope;

    public BccOrganizationPolicyDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BccOrganizationPolicyDetail withName(String name) {
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

    public BccOrganizationPolicyDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BccOrganizationPolicyDetail withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 保护类型：备份（backup）、复制(replication)。
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public BccOrganizationPolicyDetail withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public BccOrganizationPolicyDetail withPolicyName(String policyName) {
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

    public BccOrganizationPolicyDetail withPolicyEnabled(Boolean policyEnabled) {
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

    public BccOrganizationPolicyDetail withPolicyOperationDefinition(
        BccOrganizationPolicyDetailPolicyOperationDefinition policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
        return this;
    }

    public BccOrganizationPolicyDetail withPolicyOperationDefinition(
        Consumer<BccOrganizationPolicyDetailPolicyOperationDefinition> policyOperationDefinitionSetter) {
        if (this.policyOperationDefinition == null) {
            this.policyOperationDefinition = new BccOrganizationPolicyDetailPolicyOperationDefinition();
            policyOperationDefinitionSetter.accept(this.policyOperationDefinition);
        }

        return this;
    }

    /**
     * Get policyOperationDefinition
     * @return policyOperationDefinition
     */
    public BccOrganizationPolicyDetailPolicyOperationDefinition getPolicyOperationDefinition() {
        return policyOperationDefinition;
    }

    public void setPolicyOperationDefinition(
        BccOrganizationPolicyDetailPolicyOperationDefinition policyOperationDefinition) {
        this.policyOperationDefinition = policyOperationDefinition;
    }

    public BccOrganizationPolicyDetail withPolicyTrigger(PolicyTriggerResp policyTrigger) {
        this.policyTrigger = policyTrigger;
        return this;
    }

    public BccOrganizationPolicyDetail withPolicyTrigger(Consumer<PolicyTriggerResp> policyTriggerSetter) {
        if (this.policyTrigger == null) {
            this.policyTrigger = new PolicyTriggerResp();
            policyTriggerSetter.accept(this.policyTrigger);
        }

        return this;
    }

    /**
     * Get policyTrigger
     * @return policyTrigger
     */
    public PolicyTriggerResp getPolicyTrigger() {
        return policyTrigger;
    }

    public void setPolicyTrigger(PolicyTriggerResp policyTrigger) {
        this.policyTrigger = policyTrigger;
    }

    public BccOrganizationPolicyDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BccOrganizationPolicyDetail withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 账号名称
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public BccOrganizationPolicyDetail withEffectiveScope(String effectiveScope) {
        this.effectiveScope = effectiveScope;
        return this;
    }

    /**
     * 组织策略生效范围
     * @return effectiveScope
     */
    public String getEffectiveScope() {
        return effectiveScope;
    }

    public void setEffectiveScope(String effectiveScope) {
        this.effectiveScope = effectiveScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BccOrganizationPolicyDetail that = (BccOrganizationPolicyDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.operationType, that.operationType) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.policyEnabled, that.policyEnabled)
            && Objects.equals(this.policyOperationDefinition, that.policyOperationDefinition)
            && Objects.equals(this.policyTrigger, that.policyTrigger) && Objects.equals(this.status, that.status)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.effectiveScope, that.effectiveScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            operationType,
            domainId,
            policyName,
            policyEnabled,
            policyOperationDefinition,
            policyTrigger,
            status,
            domainName,
            effectiveScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BccOrganizationPolicyDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyEnabled: ").append(toIndentedString(policyEnabled)).append("\n");
        sb.append("    policyOperationDefinition: ").append(toIndentedString(policyOperationDefinition)).append("\n");
        sb.append("    policyTrigger: ").append(toIndentedString(policyTrigger)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    effectiveScope: ").append(toIndentedString(effectiveScope)).append("\n");
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
