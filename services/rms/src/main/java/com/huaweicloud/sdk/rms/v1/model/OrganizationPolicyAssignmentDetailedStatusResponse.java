package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组织合规规则部署详细状态。
 */
public class OrganizationPolicyAssignmentDetailedStatusResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_id")

    private String policyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_assignment_name")

    private String policyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_account_policy_assignment_status")

    private String memberAccountPolicyAssignmentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private Object errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public OrganizationPolicyAssignmentDetailedStatusResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 帐号ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public OrganizationPolicyAssignmentDetailedStatusResponse withPolicyAssignmentId(String policyAssignmentId) {
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

    public OrganizationPolicyAssignmentDetailedStatusResponse withPolicyAssignmentName(String policyAssignmentName) {
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

    public OrganizationPolicyAssignmentDetailedStatusResponse withMemberAccountPolicyAssignmentStatus(
        String memberAccountPolicyAssignmentStatus) {
        this.memberAccountPolicyAssignmentStatus = memberAccountPolicyAssignmentStatus;
        return this;
    }

    /**
     * 成员帐号中配置规则的部署状态。
     * @return memberAccountPolicyAssignmentStatus
     */
    public String getMemberAccountPolicyAssignmentStatus() {
        return memberAccountPolicyAssignmentStatus;
    }

    public void setMemberAccountPolicyAssignmentStatus(String memberAccountPolicyAssignmentStatus) {
        this.memberAccountPolicyAssignmentStatus = memberAccountPolicyAssignmentStatus;
    }

    public OrganizationPolicyAssignmentDetailedStatusResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 当创建或更新合规规则失败时错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public OrganizationPolicyAssignmentDetailedStatusResponse withErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 当创建或更新合规规则失败时错误信息。
     * @return errorMessage
     */
    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public OrganizationPolicyAssignmentDetailedStatusResponse withCreatedAt(String createdAt) {
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

    public OrganizationPolicyAssignmentDetailedStatusResponse withUpdatedAt(String updatedAt) {
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
        OrganizationPolicyAssignmentDetailedStatusResponse organizationPolicyAssignmentDetailedStatusResponse =
            (OrganizationPolicyAssignmentDetailedStatusResponse) o;
        return Objects.equals(this.domainId, organizationPolicyAssignmentDetailedStatusResponse.domainId)
            && Objects.equals(this.policyAssignmentId,
                organizationPolicyAssignmentDetailedStatusResponse.policyAssignmentId)
            && Objects.equals(this.policyAssignmentName,
                organizationPolicyAssignmentDetailedStatusResponse.policyAssignmentName)
            && Objects.equals(this.memberAccountPolicyAssignmentStatus,
                organizationPolicyAssignmentDetailedStatusResponse.memberAccountPolicyAssignmentStatus)
            && Objects.equals(this.errorCode, organizationPolicyAssignmentDetailedStatusResponse.errorCode)
            && Objects.equals(this.errorMessage, organizationPolicyAssignmentDetailedStatusResponse.errorMessage)
            && Objects.equals(this.createdAt, organizationPolicyAssignmentDetailedStatusResponse.createdAt)
            && Objects.equals(this.updatedAt, organizationPolicyAssignmentDetailedStatusResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId,
            policyAssignmentId,
            policyAssignmentName,
            memberAccountPolicyAssignmentStatus,
            errorCode,
            errorMessage,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicyAssignmentDetailedStatusResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    policyAssignmentId: ").append(toIndentedString(policyAssignmentId)).append("\n");
        sb.append("    policyAssignmentName: ").append(toIndentedString(policyAssignmentName)).append("\n");
        sb.append("    memberAccountPolicyAssignmentStatus: ")
            .append(toIndentedString(memberAccountPolicyAssignmentStatus))
            .append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
