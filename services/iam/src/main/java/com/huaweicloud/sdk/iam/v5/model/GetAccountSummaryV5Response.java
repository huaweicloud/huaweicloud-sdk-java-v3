package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetAccountSummaryV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_policies_per_agency_quota")

    private Integer attachedPoliciesPerAgencyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_policies_per_group_quota")

    private Integer attachedPoliciesPerGroupQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_policies_per_user_quota")

    private Integer attachedPoliciesPerUserQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies_quota")

    private Integer policiesQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_size_quota")

    private Integer policySizeQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions_per_policy_quota")

    private Integer versionsPerPolicyQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policies")

    private Integer policies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencies")

    private Integer agencies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencies_quota")

    private Integer agenciesQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private Integer users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users_quota")

    private Integer usersQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private Integer groups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups_quota")

    private Integer groupsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_user_mfa_enabled")

    private Integer rootUserMfaEnabled;

    public GetAccountSummaryV5Response withAttachedPoliciesPerAgencyQuota(Integer attachedPoliciesPerAgencyQuota) {
        this.attachedPoliciesPerAgencyQuota = attachedPoliciesPerAgencyQuota;
        return this;
    }

    /**
     * 附加到委托或信任委托上的身份策略的最大数量。
     * @return attachedPoliciesPerAgencyQuota
     */
    public Integer getAttachedPoliciesPerAgencyQuota() {
        return attachedPoliciesPerAgencyQuota;
    }

    public void setAttachedPoliciesPerAgencyQuota(Integer attachedPoliciesPerAgencyQuota) {
        this.attachedPoliciesPerAgencyQuota = attachedPoliciesPerAgencyQuota;
    }

    public GetAccountSummaryV5Response withAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
        this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
        return this;
    }

    /**
     * 附加到用户组上的身份策略的最大数量。
     * @return attachedPoliciesPerGroupQuota
     */
    public Integer getAttachedPoliciesPerGroupQuota() {
        return attachedPoliciesPerGroupQuota;
    }

    public void setAttachedPoliciesPerGroupQuota(Integer attachedPoliciesPerGroupQuota) {
        this.attachedPoliciesPerGroupQuota = attachedPoliciesPerGroupQuota;
    }

    public GetAccountSummaryV5Response withAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
        this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
        return this;
    }

    /**
     * 附加到IAM用户上的身份策略的最大数量。
     * @return attachedPoliciesPerUserQuota
     */
    public Integer getAttachedPoliciesPerUserQuota() {
        return attachedPoliciesPerUserQuota;
    }

    public void setAttachedPoliciesPerUserQuota(Integer attachedPoliciesPerUserQuota) {
        this.attachedPoliciesPerUserQuota = attachedPoliciesPerUserQuota;
    }

    public GetAccountSummaryV5Response withPoliciesQuota(Integer policiesQuota) {
        this.policiesQuota = policiesQuota;
        return this;
    }

    /**
     * 自定义身份策略的最大数量。
     * @return policiesQuota
     */
    public Integer getPoliciesQuota() {
        return policiesQuota;
    }

    public void setPoliciesQuota(Integer policiesQuota) {
        this.policiesQuota = policiesQuota;
    }

    public GetAccountSummaryV5Response withPolicySizeQuota(Integer policySizeQuota) {
        this.policySizeQuota = policySizeQuota;
        return this;
    }

    /**
     * 身份策略及信任策略的策略文档的最大字符数，不包括空格。
     * @return policySizeQuota
     */
    public Integer getPolicySizeQuota() {
        return policySizeQuota;
    }

    public void setPolicySizeQuota(Integer policySizeQuota) {
        this.policySizeQuota = policySizeQuota;
    }

    public GetAccountSummaryV5Response withVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
        this.versionsPerPolicyQuota = versionsPerPolicyQuota;
        return this;
    }

    /**
     * 自定义身份策略同一时刻保留的最大版本数量。
     * @return versionsPerPolicyQuota
     */
    public Integer getVersionsPerPolicyQuota() {
        return versionsPerPolicyQuota;
    }

    public void setVersionsPerPolicyQuota(Integer versionsPerPolicyQuota) {
        this.versionsPerPolicyQuota = versionsPerPolicyQuota;
    }

    public GetAccountSummaryV5Response withPolicies(Integer policies) {
        this.policies = policies;
        return this;
    }

    /**
     * 此账号中当前创建的自定义身份策略数量。
     * @return policies
     */
    public Integer getPolicies() {
        return policies;
    }

    public void setPolicies(Integer policies) {
        this.policies = policies;
    }

    public GetAccountSummaryV5Response withAgencies(Integer agencies) {
        this.agencies = agencies;
        return this;
    }

    /**
     * 此账号中当前创建的委托及信任委托的总数量。
     * @return agencies
     */
    public Integer getAgencies() {
        return agencies;
    }

    public void setAgencies(Integer agencies) {
        this.agencies = agencies;
    }

    public GetAccountSummaryV5Response withAgenciesQuota(Integer agenciesQuota) {
        this.agenciesQuota = agenciesQuota;
        return this;
    }

    /**
     * 此账号能够创建的委托及信任委托的总数上限。
     * @return agenciesQuota
     */
    public Integer getAgenciesQuota() {
        return agenciesQuota;
    }

    public void setAgenciesQuota(Integer agenciesQuota) {
        this.agenciesQuota = agenciesQuota;
    }

    public GetAccountSummaryV5Response withUsers(Integer users) {
        this.users = users;
        return this;
    }

    /**
     * 此账号当前创建的IAM用户数量，包括根用户。
     * @return users
     */
    public Integer getUsers() {
        return users;
    }

    public void setUsers(Integer users) {
        this.users = users;
    }

    public GetAccountSummaryV5Response withUsersQuota(Integer usersQuota) {
        this.usersQuota = usersQuota;
        return this;
    }

    /**
     * 此账号能够创建的IAM用户数上限，包括根用户。
     * @return usersQuota
     */
    public Integer getUsersQuota() {
        return usersQuota;
    }

    public void setUsersQuota(Integer usersQuota) {
        this.usersQuota = usersQuota;
    }

    public GetAccountSummaryV5Response withGroups(Integer groups) {
        this.groups = groups;
        return this;
    }

    /**
     * 此账号当前创建的用户组数量。
     * @return groups
     */
    public Integer getGroups() {
        return groups;
    }

    public void setGroups(Integer groups) {
        this.groups = groups;
    }

    public GetAccountSummaryV5Response withGroupsQuota(Integer groupsQuota) {
        this.groupsQuota = groupsQuota;
        return this;
    }

    /**
     * 此账号能够创建的用户组数上限。
     * @return groupsQuota
     */
    public Integer getGroupsQuota() {
        return groupsQuota;
    }

    public void setGroupsQuota(Integer groupsQuota) {
        this.groupsQuota = groupsQuota;
    }

    public GetAccountSummaryV5Response withRootUserMfaEnabled(Integer rootUserMfaEnabled) {
        this.rootUserMfaEnabled = rootUserMfaEnabled;
        return this;
    }

    /**
     * 根用户绑定的已启用MFA的数量。
     * @return rootUserMfaEnabled
     */
    public Integer getRootUserMfaEnabled() {
        return rootUserMfaEnabled;
    }

    public void setRootUserMfaEnabled(Integer rootUserMfaEnabled) {
        this.rootUserMfaEnabled = rootUserMfaEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetAccountSummaryV5Response that = (GetAccountSummaryV5Response) obj;
        return Objects.equals(this.attachedPoliciesPerAgencyQuota, that.attachedPoliciesPerAgencyQuota)
            && Objects.equals(this.attachedPoliciesPerGroupQuota, that.attachedPoliciesPerGroupQuota)
            && Objects.equals(this.attachedPoliciesPerUserQuota, that.attachedPoliciesPerUserQuota)
            && Objects.equals(this.policiesQuota, that.policiesQuota)
            && Objects.equals(this.policySizeQuota, that.policySizeQuota)
            && Objects.equals(this.versionsPerPolicyQuota, that.versionsPerPolicyQuota)
            && Objects.equals(this.policies, that.policies) && Objects.equals(this.agencies, that.agencies)
            && Objects.equals(this.agenciesQuota, that.agenciesQuota) && Objects.equals(this.users, that.users)
            && Objects.equals(this.usersQuota, that.usersQuota) && Objects.equals(this.groups, that.groups)
            && Objects.equals(this.groupsQuota, that.groupsQuota)
            && Objects.equals(this.rootUserMfaEnabled, that.rootUserMfaEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedPoliciesPerAgencyQuota,
            attachedPoliciesPerGroupQuota,
            attachedPoliciesPerUserQuota,
            policiesQuota,
            policySizeQuota,
            versionsPerPolicyQuota,
            policies,
            agencies,
            agenciesQuota,
            users,
            usersQuota,
            groups,
            groupsQuota,
            rootUserMfaEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountSummaryV5Response {\n");
        sb.append("    attachedPoliciesPerAgencyQuota: ")
            .append(toIndentedString(attachedPoliciesPerAgencyQuota))
            .append("\n");
        sb.append("    attachedPoliciesPerGroupQuota: ")
            .append(toIndentedString(attachedPoliciesPerGroupQuota))
            .append("\n");
        sb.append("    attachedPoliciesPerUserQuota: ")
            .append(toIndentedString(attachedPoliciesPerUserQuota))
            .append("\n");
        sb.append("    policiesQuota: ").append(toIndentedString(policiesQuota)).append("\n");
        sb.append("    policySizeQuota: ").append(toIndentedString(policySizeQuota)).append("\n");
        sb.append("    versionsPerPolicyQuota: ").append(toIndentedString(versionsPerPolicyQuota)).append("\n");
        sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
        sb.append("    agenciesQuota: ").append(toIndentedString(agenciesQuota)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    usersQuota: ").append(toIndentedString(usersQuota)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    groupsQuota: ").append(toIndentedString(groupsQuota)).append("\n");
        sb.append("    rootUserMfaEnabled: ").append(toIndentedString(rootUserMfaEnabled)).append("\n");
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
