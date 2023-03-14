package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组织合规规则部署状态。
 */
public class OrganizationPolicyAssignmentStatusResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_id")

    private String organizationPolicyAssignmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_name")

    private String organizationPolicyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_status")

    private String organizationPolicyAssignmentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public OrganizationPolicyAssignmentStatusResponse withOrganizationPolicyAssignmentId(
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

    public OrganizationPolicyAssignmentStatusResponse withOrganizationPolicyAssignmentName(
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

    public OrganizationPolicyAssignmentStatusResponse withOrganizationPolicyAssignmentStatus(
        String organizationPolicyAssignmentStatus) {
        this.organizationPolicyAssignmentStatus = organizationPolicyAssignmentStatus;
        return this;
    }

    /**
     * 组织合规规则部署状态。
     * @return organizationPolicyAssignmentStatus
     */
    public String getOrganizationPolicyAssignmentStatus() {
        return organizationPolicyAssignmentStatus;
    }

    public void setOrganizationPolicyAssignmentStatus(String organizationPolicyAssignmentStatus) {
        this.organizationPolicyAssignmentStatus = organizationPolicyAssignmentStatus;
    }

    public OrganizationPolicyAssignmentStatusResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 当创建或更新组织合规规则失败时错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public OrganizationPolicyAssignmentStatusResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 当创建或更新组织合规规则失败时错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public OrganizationPolicyAssignmentStatusResponse withCreatedAt(String createdAt) {
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

    public OrganizationPolicyAssignmentStatusResponse withUpdatedAt(String updatedAt) {
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
        OrganizationPolicyAssignmentStatusResponse organizationPolicyAssignmentStatusResponse =
            (OrganizationPolicyAssignmentStatusResponse) o;
        return Objects.equals(this.organizationPolicyAssignmentId,
            organizationPolicyAssignmentStatusResponse.organizationPolicyAssignmentId)
            && Objects.equals(this.organizationPolicyAssignmentName,
                organizationPolicyAssignmentStatusResponse.organizationPolicyAssignmentName)
            && Objects.equals(this.organizationPolicyAssignmentStatus,
                organizationPolicyAssignmentStatusResponse.organizationPolicyAssignmentStatus)
            && Objects.equals(this.errorCode, organizationPolicyAssignmentStatusResponse.errorCode)
            && Objects.equals(this.errorMessage, organizationPolicyAssignmentStatusResponse.errorMessage)
            && Objects.equals(this.createdAt, organizationPolicyAssignmentStatusResponse.createdAt)
            && Objects.equals(this.updatedAt, organizationPolicyAssignmentStatusResponse.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationPolicyAssignmentId,
            organizationPolicyAssignmentName,
            organizationPolicyAssignmentStatus,
            errorCode,
            errorMessage,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicyAssignmentStatusResponse {\n");
        sb.append("    organizationPolicyAssignmentId: ")
            .append(toIndentedString(organizationPolicyAssignmentId))
            .append("\n");
        sb.append("    organizationPolicyAssignmentName: ")
            .append(toIndentedString(organizationPolicyAssignmentName))
            .append("\n");
        sb.append("    organizationPolicyAssignmentStatus: ")
            .append(toIndentedString(organizationPolicyAssignmentStatus))
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
