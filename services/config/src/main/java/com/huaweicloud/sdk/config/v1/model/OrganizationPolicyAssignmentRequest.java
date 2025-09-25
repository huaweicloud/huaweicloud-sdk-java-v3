package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组织合规规则请求体。
 */
public class OrganizationPolicyAssignmentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excluded_accounts")

    private List<String> excludedAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_policy_assignment_name")

    private String organizationPolicyAssignmentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_policy_assignment_metadata")

    private ManagedPolicyAssignmentMetadata managedPolicyAssignmentMetadata;

    public OrganizationPolicyAssignmentRequest withExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
        return this;
    }

    public OrganizationPolicyAssignmentRequest addExcludedAccountsItem(String excludedAccountsItem) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        this.excludedAccounts.add(excludedAccountsItem);
        return this;
    }

    public OrganizationPolicyAssignmentRequest withExcludedAccounts(Consumer<List<String>> excludedAccountsSetter) {
        if (this.excludedAccounts == null) {
            this.excludedAccounts = new ArrayList<>();
        }
        excludedAccountsSetter.accept(this.excludedAccounts);
        return this;
    }

    /**
     * 需要排除配置规则的帐号。
     * @return excludedAccounts
     */
    public List<String> getExcludedAccounts() {
        return excludedAccounts;
    }

    public void setExcludedAccounts(List<String> excludedAccounts) {
        this.excludedAccounts = excludedAccounts;
    }

    public OrganizationPolicyAssignmentRequest withOrganizationPolicyAssignmentName(
        String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
        return this;
    }

    /**
     * 组织合规规则名称
     * @return organizationPolicyAssignmentName
     */
    public String getOrganizationPolicyAssignmentName() {
        return organizationPolicyAssignmentName;
    }

    public void setOrganizationPolicyAssignmentName(String organizationPolicyAssignmentName) {
        this.organizationPolicyAssignmentName = organizationPolicyAssignmentName;
    }

    public OrganizationPolicyAssignmentRequest withManagedPolicyAssignmentMetadata(
        ManagedPolicyAssignmentMetadata managedPolicyAssignmentMetadata) {
        this.managedPolicyAssignmentMetadata = managedPolicyAssignmentMetadata;
        return this;
    }

    public OrganizationPolicyAssignmentRequest withManagedPolicyAssignmentMetadata(
        Consumer<ManagedPolicyAssignmentMetadata> managedPolicyAssignmentMetadataSetter) {
        if (this.managedPolicyAssignmentMetadata == null) {
            this.managedPolicyAssignmentMetadata = new ManagedPolicyAssignmentMetadata();
            managedPolicyAssignmentMetadataSetter.accept(this.managedPolicyAssignmentMetadata);
        }

        return this;
    }

    /**
     * Get managedPolicyAssignmentMetadata
     * @return managedPolicyAssignmentMetadata
     */
    public ManagedPolicyAssignmentMetadata getManagedPolicyAssignmentMetadata() {
        return managedPolicyAssignmentMetadata;
    }

    public void setManagedPolicyAssignmentMetadata(ManagedPolicyAssignmentMetadata managedPolicyAssignmentMetadata) {
        this.managedPolicyAssignmentMetadata = managedPolicyAssignmentMetadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrganizationPolicyAssignmentRequest that = (OrganizationPolicyAssignmentRequest) obj;
        return Objects.equals(this.excludedAccounts, that.excludedAccounts)
            && Objects.equals(this.organizationPolicyAssignmentName, that.organizationPolicyAssignmentName)
            && Objects.equals(this.managedPolicyAssignmentMetadata, that.managedPolicyAssignmentMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludedAccounts, organizationPolicyAssignmentName, managedPolicyAssignmentMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationPolicyAssignmentRequest {\n");
        sb.append("    excludedAccounts: ").append(toIndentedString(excludedAccounts)).append("\n");
        sb.append("    organizationPolicyAssignmentName: ")
            .append(toIndentedString(organizationPolicyAssignmentName))
            .append("\n");
        sb.append("    managedPolicyAssignmentMetadata: ")
            .append(toIndentedString(managedPolicyAssignmentMetadata))
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
