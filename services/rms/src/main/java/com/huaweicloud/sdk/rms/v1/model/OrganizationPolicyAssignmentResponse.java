package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织合规规则部署返回。
 */
public class OrganizationPolicyAssignmentResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_id")

    private String organizationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_urn")

    private String organizationPolicyAssignmentUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_id")

    private String organizationPolicyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_name")

    private String organizationPolicyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_filter")

    private PolicyFilterDefinition policyFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private Map<String, PolicyParameterValue> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public OrganizationPolicyAssignmentResponse withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 组织合规规则创建者。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public OrganizationPolicyAssignmentResponse withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 组织ID。
     * @return organizationId
     */
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public OrganizationPolicyAssignmentResponse withOrganizationPolicyAssignmentUrn(
        String organizationPolicyAssignmentUrn) {
        this.organizationPolicyAssignmentUrn = organizationPolicyAssignmentUrn;
        return this;
    }

    /**
     * 组织合规规则资源唯一标识。
     * @return organizationPolicyAssignmentUrn
     */
    public String getOrganizationPolicyAssignmentUrn() {
        return organizationPolicyAssignmentUrn;
    }

    public void setOrganizationPolicyAssignmentUrn(String organizationPolicyAssignmentUrn) {
        this.organizationPolicyAssignmentUrn = organizationPolicyAssignmentUrn;
    }

    public OrganizationPolicyAssignmentResponse withOrganizationPolicyAssignmentId(
        String organizationPolicyAssignmentId) {
        this.organizationPolicyAssignmentId = organizationPolicyAssignmentId;
        return this;
    }

    /**
     * 组织合规规则ID。
     * @return organizationPolicyAssignmentId
     */
    public String getOrganizationPolicyAssignmentId() {
        return organizationPolicyAssignmentId;
    }

    public void setOrganizationPolicyAssignmentId(String organizationPolicyAssignmentId) {
        this.organizationPolicyAssignmentId = organizationPolicyAssignmentId;
    }

    public OrganizationPolicyAssignmentResponse withOrganizationPolicyAssignmentName(
        String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
        return this;
    }

    /**
     * 组织合规规则名称。
     * @return organizationPolicyAssignmentName
     */
    public String getOrganizationPolicyAssignmentName() {
        return organizationPolicyAssignmentName;
    }

    public void setOrganizationPolicyAssignmentName(String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
    }

    public OrganizationPolicyAssignmentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationPolicyAssignmentResponse withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 触发周期。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public OrganizationPolicyAssignmentResponse withPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
        return this;
    }

    public OrganizationPolicyAssignmentResponse withPolicyFilter(Consumer<PolicyFilterDefinition> policyFilterSetter) {
        if (this.policyFilter == null) {
            this.policyFilter = new PolicyFilterDefinition();
            policyFilterSetter.accept(this.policyFilter);
        }

        return this;
    }

    /**
     * Get policyFilter
     * @return policyFilter
     */
    public PolicyFilterDefinition getPolicyFilter() {
        return policyFilter;
    }

    public void setPolicyFilter(PolicyFilterDefinition policyFilter) {
        this.policyFilter = policyFilter;
    }

    public OrganizationPolicyAssignmentResponse withParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    public OrganizationPolicyAssignmentResponse putParametersItem(String key, PolicyParameterValue parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    public OrganizationPolicyAssignmentResponse withParameters(
        Consumer<Map<String, PolicyParameterValue>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 规则参数。
     * @return parameters
     */
    public Map<String, PolicyParameterValue> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, PolicyParameterValue> parameters) {
        this.parameters = parameters;
    }

    public OrganizationPolicyAssignmentResponse withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * 策略ID。
     * @return policyDefinitionId
     */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public OrganizationPolicyAssignmentResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationPolicyAssignmentResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationPolicyAssignmentResponse organizationPolicyAssignmentResponse =
            (OrganizationPolicyAssignmentResponse) o;
        return Objects.equals(this.ownerId, organizationPolicyAssignmentResponse.ownerId)
            && Objects.equals(this.organizationId, organizationPolicyAssignmentResponse.organizationId)
            && Objects.equals(this.organizationPolicyAssignmentUrn,
                organizationPolicyAssignmentResponse.organizationPolicyAssignmentUrn)
            && Objects.equals(this.organizationPolicyAssignmentId,
                organizationPolicyAssignmentResponse.organizationPolicyAssignmentId)
            && Objects.equals(this.organizationPolicyAssignmentName,
                organizationPolicyAssignmentResponse.organizationPolicyAssignmentName)
            && Objects.equals(this.description, organizationPolicyAssignmentResponse.description)
            && Objects.equals(this.period, organizationPolicyAssignmentResponse.period)
            && Objects.equals(this.policyFilter, organizationPolicyAssignmentResponse.policyFilter)
            && Objects.equals(this.parameters, organizationPolicyAssignmentResponse.parameters)
            && Objects.equals(this.policyDefinitionId, organizationPolicyAssignmentResponse.policyDefinitionId)
            && Objects.equals(this.createdAt, organizationPolicyAssignmentResponse.createdAt)
            && Objects.equals(this.updatedAt, organizationPolicyAssignmentResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId,
            organizationId,
            organizationPolicyAssignmentUrn,
            organizationPolicyAssignmentId,
            organizationPolicyAssignmentName,
            description,
            period,
            policyFilter,
            parameters,
            policyDefinitionId,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicyAssignmentResponse {\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
        sb.append("    organizationPolicyAssignmentUrn: ")
            .append(toIndentedString(organizationPolicyAssignmentUrn))
            .append("\n");
        sb.append("    organizationPolicyAssignmentId: ")
            .append(toIndentedString(organizationPolicyAssignmentId))
            .append("\n");
        sb.append("    organizationPolicyAssignmentName: ")
            .append(toIndentedString(organizationPolicyAssignmentName))
            .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    policyFilter: ").append(toIndentedString(policyFilter)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
