package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问分析结果的详细信息。
 */
public class FindingDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_access_details")

    private ExternalAccessDetails externalAccessDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege_escalation_details")

    private PrivilegeEscalationDetails privilegeEscalationDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_iam_user_access_key_details")

    private UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_iam_user_password_details")

    private UnusedIamUserPasswordDetails unusedIamUserPasswordDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_permission_details")

    private UnusedPermissionDetails unusedPermissionDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_iam_agency_details")

    private UnusedIamAgencyDetails unusedIamAgencyDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_root_user_has_access_key_details")

    private IamBpRootUserHasAccessKeyDetails iamBpRootUserHasAccessKeyDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_access_api_with_password_details")

    private IamBpAccessApiWithPasswordDetails iamBpAccessApiWithPasswordDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_login_protection_disabled_details")

    private IamBpLoginProtectionDisabledDetails iamBpLoginProtectionDisabledDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_mfa_unconfigured_details")

    private IamBpMfaUnconfiguredDetails iamBpMfaUnconfiguredDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_assign_high_risk_sys_policy_or_role_to_user_details")

    private IamBpAssignHighRiskSysPolicyOrRoleToUserDetails iamBpAssignHighRiskSysPolicyOrRoleToUserDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_attach_high_risk_sys_identity_policy_to_user_details")

    private IamBpAttachHighRiskSysIdentityPolicyToUserDetails iamBpAttachHighRiskSysIdentityPolicyToUserDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_assign_high_risk_sys_policy_or_role_to_agency_details")

    private IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_bp_attach_high_risk_sys_identity_policy_to_agency_details")

    private IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails;

    public FindingDetails withExternalAccessDetails(ExternalAccessDetails externalAccessDetails) {
        this.externalAccessDetails = externalAccessDetails;
        return this;
    }

    public FindingDetails withExternalAccessDetails(Consumer<ExternalAccessDetails> externalAccessDetailsSetter) {
        if (this.externalAccessDetails == null) {
            this.externalAccessDetails = new ExternalAccessDetails();
            externalAccessDetailsSetter.accept(this.externalAccessDetails);
        }

        return this;
    }

    /**
     * Get externalAccessDetails
     * @return externalAccessDetails
     */
    public ExternalAccessDetails getExternalAccessDetails() {
        return externalAccessDetails;
    }

    public void setExternalAccessDetails(ExternalAccessDetails externalAccessDetails) {
        this.externalAccessDetails = externalAccessDetails;
    }

    public FindingDetails withPrivilegeEscalationDetails(PrivilegeEscalationDetails privilegeEscalationDetails) {
        this.privilegeEscalationDetails = privilegeEscalationDetails;
        return this;
    }

    public FindingDetails withPrivilegeEscalationDetails(
        Consumer<PrivilegeEscalationDetails> privilegeEscalationDetailsSetter) {
        if (this.privilegeEscalationDetails == null) {
            this.privilegeEscalationDetails = new PrivilegeEscalationDetails();
            privilegeEscalationDetailsSetter.accept(this.privilegeEscalationDetails);
        }

        return this;
    }

    /**
     * Get privilegeEscalationDetails
     * @return privilegeEscalationDetails
     */
    public PrivilegeEscalationDetails getPrivilegeEscalationDetails() {
        return privilegeEscalationDetails;
    }

    public void setPrivilegeEscalationDetails(PrivilegeEscalationDetails privilegeEscalationDetails) {
        this.privilegeEscalationDetails = privilegeEscalationDetails;
    }

    public FindingDetails withUnusedIamUserAccessKeyDetails(
        UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails) {
        this.unusedIamUserAccessKeyDetails = unusedIamUserAccessKeyDetails;
        return this;
    }

    public FindingDetails withUnusedIamUserAccessKeyDetails(
        Consumer<UnusedIamUserAccessKeyDetails> unusedIamUserAccessKeyDetailsSetter) {
        if (this.unusedIamUserAccessKeyDetails == null) {
            this.unusedIamUserAccessKeyDetails = new UnusedIamUserAccessKeyDetails();
            unusedIamUserAccessKeyDetailsSetter.accept(this.unusedIamUserAccessKeyDetails);
        }

        return this;
    }

    /**
     * Get unusedIamUserAccessKeyDetails
     * @return unusedIamUserAccessKeyDetails
     */
    public UnusedIamUserAccessKeyDetails getUnusedIamUserAccessKeyDetails() {
        return unusedIamUserAccessKeyDetails;
    }

    public void setUnusedIamUserAccessKeyDetails(UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails) {
        this.unusedIamUserAccessKeyDetails = unusedIamUserAccessKeyDetails;
    }

    public FindingDetails withUnusedIamUserPasswordDetails(UnusedIamUserPasswordDetails unusedIamUserPasswordDetails) {
        this.unusedIamUserPasswordDetails = unusedIamUserPasswordDetails;
        return this;
    }

    public FindingDetails withUnusedIamUserPasswordDetails(
        Consumer<UnusedIamUserPasswordDetails> unusedIamUserPasswordDetailsSetter) {
        if (this.unusedIamUserPasswordDetails == null) {
            this.unusedIamUserPasswordDetails = new UnusedIamUserPasswordDetails();
            unusedIamUserPasswordDetailsSetter.accept(this.unusedIamUserPasswordDetails);
        }

        return this;
    }

    /**
     * Get unusedIamUserPasswordDetails
     * @return unusedIamUserPasswordDetails
     */
    public UnusedIamUserPasswordDetails getUnusedIamUserPasswordDetails() {
        return unusedIamUserPasswordDetails;
    }

    public void setUnusedIamUserPasswordDetails(UnusedIamUserPasswordDetails unusedIamUserPasswordDetails) {
        this.unusedIamUserPasswordDetails = unusedIamUserPasswordDetails;
    }

    public FindingDetails withUnusedPermissionDetails(UnusedPermissionDetails unusedPermissionDetails) {
        this.unusedPermissionDetails = unusedPermissionDetails;
        return this;
    }

    public FindingDetails withUnusedPermissionDetails(Consumer<UnusedPermissionDetails> unusedPermissionDetailsSetter) {
        if (this.unusedPermissionDetails == null) {
            this.unusedPermissionDetails = new UnusedPermissionDetails();
            unusedPermissionDetailsSetter.accept(this.unusedPermissionDetails);
        }

        return this;
    }

    /**
     * Get unusedPermissionDetails
     * @return unusedPermissionDetails
     */
    public UnusedPermissionDetails getUnusedPermissionDetails() {
        return unusedPermissionDetails;
    }

    public void setUnusedPermissionDetails(UnusedPermissionDetails unusedPermissionDetails) {
        this.unusedPermissionDetails = unusedPermissionDetails;
    }

    public FindingDetails withUnusedIamAgencyDetails(UnusedIamAgencyDetails unusedIamAgencyDetails) {
        this.unusedIamAgencyDetails = unusedIamAgencyDetails;
        return this;
    }

    public FindingDetails withUnusedIamAgencyDetails(Consumer<UnusedIamAgencyDetails> unusedIamAgencyDetailsSetter) {
        if (this.unusedIamAgencyDetails == null) {
            this.unusedIamAgencyDetails = new UnusedIamAgencyDetails();
            unusedIamAgencyDetailsSetter.accept(this.unusedIamAgencyDetails);
        }

        return this;
    }

    /**
     * Get unusedIamAgencyDetails
     * @return unusedIamAgencyDetails
     */
    public UnusedIamAgencyDetails getUnusedIamAgencyDetails() {
        return unusedIamAgencyDetails;
    }

    public void setUnusedIamAgencyDetails(UnusedIamAgencyDetails unusedIamAgencyDetails) {
        this.unusedIamAgencyDetails = unusedIamAgencyDetails;
    }

    public FindingDetails withIamBpRootUserHasAccessKeyDetails(
        IamBpRootUserHasAccessKeyDetails iamBpRootUserHasAccessKeyDetails) {
        this.iamBpRootUserHasAccessKeyDetails = iamBpRootUserHasAccessKeyDetails;
        return this;
    }

    public FindingDetails withIamBpRootUserHasAccessKeyDetails(
        Consumer<IamBpRootUserHasAccessKeyDetails> iamBpRootUserHasAccessKeyDetailsSetter) {
        if (this.iamBpRootUserHasAccessKeyDetails == null) {
            this.iamBpRootUserHasAccessKeyDetails = new IamBpRootUserHasAccessKeyDetails();
            iamBpRootUserHasAccessKeyDetailsSetter.accept(this.iamBpRootUserHasAccessKeyDetails);
        }

        return this;
    }

    /**
     * Get iamBpRootUserHasAccessKeyDetails
     * @return iamBpRootUserHasAccessKeyDetails
     */
    public IamBpRootUserHasAccessKeyDetails getIamBpRootUserHasAccessKeyDetails() {
        return iamBpRootUserHasAccessKeyDetails;
    }

    public void setIamBpRootUserHasAccessKeyDetails(IamBpRootUserHasAccessKeyDetails iamBpRootUserHasAccessKeyDetails) {
        this.iamBpRootUserHasAccessKeyDetails = iamBpRootUserHasAccessKeyDetails;
    }

    public FindingDetails withIamBpAccessApiWithPasswordDetails(
        IamBpAccessApiWithPasswordDetails iamBpAccessApiWithPasswordDetails) {
        this.iamBpAccessApiWithPasswordDetails = iamBpAccessApiWithPasswordDetails;
        return this;
    }

    public FindingDetails withIamBpAccessApiWithPasswordDetails(
        Consumer<IamBpAccessApiWithPasswordDetails> iamBpAccessApiWithPasswordDetailsSetter) {
        if (this.iamBpAccessApiWithPasswordDetails == null) {
            this.iamBpAccessApiWithPasswordDetails = new IamBpAccessApiWithPasswordDetails();
            iamBpAccessApiWithPasswordDetailsSetter.accept(this.iamBpAccessApiWithPasswordDetails);
        }

        return this;
    }

    /**
     * Get iamBpAccessApiWithPasswordDetails
     * @return iamBpAccessApiWithPasswordDetails
     */
    public IamBpAccessApiWithPasswordDetails getIamBpAccessApiWithPasswordDetails() {
        return iamBpAccessApiWithPasswordDetails;
    }

    public void setIamBpAccessApiWithPasswordDetails(
        IamBpAccessApiWithPasswordDetails iamBpAccessApiWithPasswordDetails) {
        this.iamBpAccessApiWithPasswordDetails = iamBpAccessApiWithPasswordDetails;
    }

    public FindingDetails withIamBpLoginProtectionDisabledDetails(
        IamBpLoginProtectionDisabledDetails iamBpLoginProtectionDisabledDetails) {
        this.iamBpLoginProtectionDisabledDetails = iamBpLoginProtectionDisabledDetails;
        return this;
    }

    public FindingDetails withIamBpLoginProtectionDisabledDetails(
        Consumer<IamBpLoginProtectionDisabledDetails> iamBpLoginProtectionDisabledDetailsSetter) {
        if (this.iamBpLoginProtectionDisabledDetails == null) {
            this.iamBpLoginProtectionDisabledDetails = new IamBpLoginProtectionDisabledDetails();
            iamBpLoginProtectionDisabledDetailsSetter.accept(this.iamBpLoginProtectionDisabledDetails);
        }

        return this;
    }

    /**
     * Get iamBpLoginProtectionDisabledDetails
     * @return iamBpLoginProtectionDisabledDetails
     */
    public IamBpLoginProtectionDisabledDetails getIamBpLoginProtectionDisabledDetails() {
        return iamBpLoginProtectionDisabledDetails;
    }

    public void setIamBpLoginProtectionDisabledDetails(
        IamBpLoginProtectionDisabledDetails iamBpLoginProtectionDisabledDetails) {
        this.iamBpLoginProtectionDisabledDetails = iamBpLoginProtectionDisabledDetails;
    }

    public FindingDetails withIamBpMfaUnconfiguredDetails(IamBpMfaUnconfiguredDetails iamBpMfaUnconfiguredDetails) {
        this.iamBpMfaUnconfiguredDetails = iamBpMfaUnconfiguredDetails;
        return this;
    }

    public FindingDetails withIamBpMfaUnconfiguredDetails(
        Consumer<IamBpMfaUnconfiguredDetails> iamBpMfaUnconfiguredDetailsSetter) {
        if (this.iamBpMfaUnconfiguredDetails == null) {
            this.iamBpMfaUnconfiguredDetails = new IamBpMfaUnconfiguredDetails();
            iamBpMfaUnconfiguredDetailsSetter.accept(this.iamBpMfaUnconfiguredDetails);
        }

        return this;
    }

    /**
     * Get iamBpMfaUnconfiguredDetails
     * @return iamBpMfaUnconfiguredDetails
     */
    public IamBpMfaUnconfiguredDetails getIamBpMfaUnconfiguredDetails() {
        return iamBpMfaUnconfiguredDetails;
    }

    public void setIamBpMfaUnconfiguredDetails(IamBpMfaUnconfiguredDetails iamBpMfaUnconfiguredDetails) {
        this.iamBpMfaUnconfiguredDetails = iamBpMfaUnconfiguredDetails;
    }

    public FindingDetails withIamBpAssignHighRiskSysPolicyOrRoleToUserDetails(
        IamBpAssignHighRiskSysPolicyOrRoleToUserDetails iamBpAssignHighRiskSysPolicyOrRoleToUserDetails) {
        this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails = iamBpAssignHighRiskSysPolicyOrRoleToUserDetails;
        return this;
    }

    public FindingDetails withIamBpAssignHighRiskSysPolicyOrRoleToUserDetails(
        Consumer<IamBpAssignHighRiskSysPolicyOrRoleToUserDetails> iamBpAssignHighRiskSysPolicyOrRoleToUserDetailsSetter) {
        if (this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails == null) {
            this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails =
                new IamBpAssignHighRiskSysPolicyOrRoleToUserDetails();
            iamBpAssignHighRiskSysPolicyOrRoleToUserDetailsSetter
                .accept(this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails);
        }

        return this;
    }

    /**
     * Get iamBpAssignHighRiskSysPolicyOrRoleToUserDetails
     * @return iamBpAssignHighRiskSysPolicyOrRoleToUserDetails
     */
    public IamBpAssignHighRiskSysPolicyOrRoleToUserDetails getIamBpAssignHighRiskSysPolicyOrRoleToUserDetails() {
        return iamBpAssignHighRiskSysPolicyOrRoleToUserDetails;
    }

    public void setIamBpAssignHighRiskSysPolicyOrRoleToUserDetails(
        IamBpAssignHighRiskSysPolicyOrRoleToUserDetails iamBpAssignHighRiskSysPolicyOrRoleToUserDetails) {
        this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails = iamBpAssignHighRiskSysPolicyOrRoleToUserDetails;
    }

    public FindingDetails withIamBpAttachHighRiskSysIdentityPolicyToUserDetails(
        IamBpAttachHighRiskSysIdentityPolicyToUserDetails iamBpAttachHighRiskSysIdentityPolicyToUserDetails) {
        this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails = iamBpAttachHighRiskSysIdentityPolicyToUserDetails;
        return this;
    }

    public FindingDetails withIamBpAttachHighRiskSysIdentityPolicyToUserDetails(
        Consumer<IamBpAttachHighRiskSysIdentityPolicyToUserDetails> iamBpAttachHighRiskSysIdentityPolicyToUserDetailsSetter) {
        if (this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails == null) {
            this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails =
                new IamBpAttachHighRiskSysIdentityPolicyToUserDetails();
            iamBpAttachHighRiskSysIdentityPolicyToUserDetailsSetter
                .accept(this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails);
        }

        return this;
    }

    /**
     * Get iamBpAttachHighRiskSysIdentityPolicyToUserDetails
     * @return iamBpAttachHighRiskSysIdentityPolicyToUserDetails
     */
    public IamBpAttachHighRiskSysIdentityPolicyToUserDetails getIamBpAttachHighRiskSysIdentityPolicyToUserDetails() {
        return iamBpAttachHighRiskSysIdentityPolicyToUserDetails;
    }

    public void setIamBpAttachHighRiskSysIdentityPolicyToUserDetails(
        IamBpAttachHighRiskSysIdentityPolicyToUserDetails iamBpAttachHighRiskSysIdentityPolicyToUserDetails) {
        this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails = iamBpAttachHighRiskSysIdentityPolicyToUserDetails;
    }

    public FindingDetails withIamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails(
        IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails) {
        this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails = iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails;
        return this;
    }

    public FindingDetails withIamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails(
        Consumer<IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails> iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetailsSetter) {
        if (this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails == null) {
            this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails =
                new IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails();
            iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetailsSetter
                .accept(this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails);
        }

        return this;
    }

    /**
     * Get iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails
     * @return iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails
     */
    public IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails getIamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails() {
        return iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails;
    }

    public void setIamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails(
        IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails) {
        this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails = iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails;
    }

    public FindingDetails withIamBpAttachHighRiskSysIdentityPolicyToAgencyDetails(
        IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails) {
        this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails = iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails;
        return this;
    }

    public FindingDetails withIamBpAttachHighRiskSysIdentityPolicyToAgencyDetails(
        Consumer<IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails> iamBpAttachHighRiskSysIdentityPolicyToAgencyDetailsSetter) {
        if (this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails == null) {
            this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails =
                new IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails();
            iamBpAttachHighRiskSysIdentityPolicyToAgencyDetailsSetter
                .accept(this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails);
        }

        return this;
    }

    /**
     * Get iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails
     * @return iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails
     */
    public IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails getIamBpAttachHighRiskSysIdentityPolicyToAgencyDetails() {
        return iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails;
    }

    public void setIamBpAttachHighRiskSysIdentityPolicyToAgencyDetails(
        IamBpAttachHighRiskSysIdentityPolicyToAgencyDetails iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails) {
        this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails = iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindingDetails that = (FindingDetails) obj;
        return Objects.equals(this.externalAccessDetails, that.externalAccessDetails)
            && Objects.equals(this.privilegeEscalationDetails, that.privilegeEscalationDetails)
            && Objects.equals(this.unusedIamUserAccessKeyDetails, that.unusedIamUserAccessKeyDetails)
            && Objects.equals(this.unusedIamUserPasswordDetails, that.unusedIamUserPasswordDetails)
            && Objects.equals(this.unusedPermissionDetails, that.unusedPermissionDetails)
            && Objects.equals(this.unusedIamAgencyDetails, that.unusedIamAgencyDetails)
            && Objects.equals(this.iamBpRootUserHasAccessKeyDetails, that.iamBpRootUserHasAccessKeyDetails)
            && Objects.equals(this.iamBpAccessApiWithPasswordDetails, that.iamBpAccessApiWithPasswordDetails)
            && Objects.equals(this.iamBpLoginProtectionDisabledDetails, that.iamBpLoginProtectionDisabledDetails)
            && Objects.equals(this.iamBpMfaUnconfiguredDetails, that.iamBpMfaUnconfiguredDetails)
            && Objects.equals(this.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails,
                that.iamBpAssignHighRiskSysPolicyOrRoleToUserDetails)
            && Objects.equals(this.iamBpAttachHighRiskSysIdentityPolicyToUserDetails,
                that.iamBpAttachHighRiskSysIdentityPolicyToUserDetails)
            && Objects.equals(this.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails,
                that.iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails)
            && Objects.equals(this.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails,
                that.iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalAccessDetails,
            privilegeEscalationDetails,
            unusedIamUserAccessKeyDetails,
            unusedIamUserPasswordDetails,
            unusedPermissionDetails,
            unusedIamAgencyDetails,
            iamBpRootUserHasAccessKeyDetails,
            iamBpAccessApiWithPasswordDetails,
            iamBpLoginProtectionDisabledDetails,
            iamBpMfaUnconfiguredDetails,
            iamBpAssignHighRiskSysPolicyOrRoleToUserDetails,
            iamBpAttachHighRiskSysIdentityPolicyToUserDetails,
            iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails,
            iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FindingDetails {\n");
        sb.append("    externalAccessDetails: ").append(toIndentedString(externalAccessDetails)).append("\n");
        sb.append("    privilegeEscalationDetails: ").append(toIndentedString(privilegeEscalationDetails)).append("\n");
        sb.append("    unusedIamUserAccessKeyDetails: ")
            .append(toIndentedString(unusedIamUserAccessKeyDetails))
            .append("\n");
        sb.append("    unusedIamUserPasswordDetails: ")
            .append(toIndentedString(unusedIamUserPasswordDetails))
            .append("\n");
        sb.append("    unusedPermissionDetails: ").append(toIndentedString(unusedPermissionDetails)).append("\n");
        sb.append("    unusedIamAgencyDetails: ").append(toIndentedString(unusedIamAgencyDetails)).append("\n");
        sb.append("    iamBpRootUserHasAccessKeyDetails: ")
            .append(toIndentedString(iamBpRootUserHasAccessKeyDetails))
            .append("\n");
        sb.append("    iamBpAccessApiWithPasswordDetails: ")
            .append(toIndentedString(iamBpAccessApiWithPasswordDetails))
            .append("\n");
        sb.append("    iamBpLoginProtectionDisabledDetails: ")
            .append(toIndentedString(iamBpLoginProtectionDisabledDetails))
            .append("\n");
        sb.append("    iamBpMfaUnconfiguredDetails: ")
            .append(toIndentedString(iamBpMfaUnconfiguredDetails))
            .append("\n");
        sb.append("    iamBpAssignHighRiskSysPolicyOrRoleToUserDetails: ")
            .append(toIndentedString(iamBpAssignHighRiskSysPolicyOrRoleToUserDetails))
            .append("\n");
        sb.append("    iamBpAttachHighRiskSysIdentityPolicyToUserDetails: ")
            .append(toIndentedString(iamBpAttachHighRiskSysIdentityPolicyToUserDetails))
            .append("\n");
        sb.append("    iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails: ")
            .append(toIndentedString(iamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails))
            .append("\n");
        sb.append("    iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails: ")
            .append(toIndentedString(iamBpAttachHighRiskSysIdentityPolicyToAgencyDetails))
            .append("\n");
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
