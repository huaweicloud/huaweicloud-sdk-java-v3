package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 合规状态 */
public class PolicyState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_provider")

    private String resourceProvider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_state")

    private String complianceState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_definition_id")

    private String policyDefinitionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_time")

    private String evaluationTime;

    public PolicyState withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 合规状态所属用户ID
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PolicyState withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** 合规状态所属资源区域ID
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PolicyState withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /** 合规状态所属资源ID
     * 
     * @return resourceId */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public PolicyState withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /** 合规状态所属资源名字
     * 
     * @return resourceName */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public PolicyState withResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /** 合规状态所属资源provider
     * 
     * @return resourceProvider */
    public String getResourceProvider() {
        return resourceProvider;
    }

    public void setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
    }

    public PolicyState withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /** 合规状态所属资源类型
     * 
     * @return resourceType */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public PolicyState withComplianceState(String complianceState) {
        this.complianceState = complianceState;
        return this;
    }

    /** 合规状态
     * 
     * @return complianceState */
    public String getComplianceState() {
        return complianceState;
    }

    public void setComplianceState(String complianceState) {
        this.complianceState = complianceState;
    }

    public PolicyState withPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
        return this;
    }

    /** 合规状态所属规则ID
     * 
     * @return policyAssignmentId */
    public String getPolicyAssignmentId() {
        return policyAssignmentId;
    }

    public void setPolicyAssignmentId(String policyAssignmentId) {
        this.policyAssignmentId = policyAssignmentId;
    }

    public PolicyState withPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
        return this;
    }

    /** 合规状态所属规则名字
     * 
     * @return policyAssignmentName */
    public String getPolicyAssignmentName() {
        return policyAssignmentName;
    }

    public void setPolicyAssignmentName(String policyAssignmentName) {
        this.policyAssignmentName = policyAssignmentName;
    }

    public PolicyState withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /** 合规状态所属策略ID
     * 
     * @return policyDefinitionId */
    public String getPolicyDefinitionId() {
        return policyDefinitionId;
    }

    public void setPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
    }

    public PolicyState withEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
        return this;
    }

    /** 合规状态评估时间
     * 
     * @return evaluationTime */
    public String getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyState policyState = (PolicyState) o;
        return Objects.equals(this.domainId, policyState.domainId)
            && Objects.equals(this.regionId, policyState.regionId)
            && Objects.equals(this.resourceId, policyState.resourceId)
            && Objects.equals(this.resourceName, policyState.resourceName)
            && Objects.equals(this.resourceProvider, policyState.resourceProvider)
            && Objects.equals(this.resourceType, policyState.resourceType)
            && Objects.equals(this.complianceState, policyState.complianceState)
            && Objects.equals(this.policyAssignmentId, policyState.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName, policyState.policyAssignmentName)
            && Objects.equals(this.policyDefinitionId, policyState.policyDefinitionId)
            && Objects.equals(this.evaluationTime, policyState.evaluationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            regionId,
            resourceId,
            resourceName,
            resourceProvider,
            resourceType,
            complianceState,
            policyAssignmentId,
            policyAssignmentName,
            policyDefinitionId,
            evaluationTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyState {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceProvider: ").append(toIndentedString(resourceProvider)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    complianceState: ").append(toIndentedString(complianceState)).append("\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    policyDefinitionId: ").append(toIndentedString(policyDefinitionId)).append("\n");
        sb.append("    evaluationTime: ").append(toIndentedString(evaluationTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
