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
    @JsonProperty(value = "unused_iam_user_access_key_details")

    private UnusedIamUserAccessKeyDetails unusedIamUserAccessKeyDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_iam_user_password_details")

    private UnusedIamUserPasswordDetails unusedIamUserPasswordDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_permission_details")

    private UnusedPermissionDetails unusedPermissionDetails;

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
            && Objects.equals(this.unusedIamUserAccessKeyDetails, that.unusedIamUserAccessKeyDetails)
            && Objects.equals(this.unusedIamUserPasswordDetails, that.unusedIamUserPasswordDetails)
            && Objects.equals(this.unusedPermissionDetails, that.unusedPermissionDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalAccessDetails,
            unusedIamUserAccessKeyDetails,
            unusedIamUserPasswordDetails,
            unusedPermissionDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FindingDetails {\n");
        sb.append("    externalAccessDetails: ").append(toIndentedString(externalAccessDetails)).append("\n");
        sb.append("    unusedIamUserAccessKeyDetails: ")
            .append(toIndentedString(unusedIamUserAccessKeyDetails))
            .append("\n");
        sb.append("    unusedIamUserPasswordDetails: ")
            .append(toIndentedString(unusedIamUserPasswordDetails))
            .append("\n");
        sb.append("    unusedPermissionDetails: ").append(toIndentedString(unusedPermissionDetails)).append("\n");
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
