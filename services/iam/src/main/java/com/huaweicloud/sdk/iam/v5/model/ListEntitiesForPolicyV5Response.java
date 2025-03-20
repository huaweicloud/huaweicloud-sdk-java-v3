package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEntitiesForPolicyV5Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_agencies")

    private List<PolicyAgency> policyAgencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_groups")

    private List<PolicyGroup> policyGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_users")

    private List<PolicyUser> policyUsers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ListEntitiesForPolicyV5Response withPolicyAgencies(List<PolicyAgency> policyAgencies) {
        this.policyAgencies = policyAgencies;
        return this;
    }

    public ListEntitiesForPolicyV5Response addPolicyAgenciesItem(PolicyAgency policyAgenciesItem) {
        if (this.policyAgencies == null) {
            this.policyAgencies = new ArrayList<>();
        }
        this.policyAgencies.add(policyAgenciesItem);
        return this;
    }

    public ListEntitiesForPolicyV5Response withPolicyAgencies(Consumer<List<PolicyAgency>> policyAgenciesSetter) {
        if (this.policyAgencies == null) {
            this.policyAgencies = new ArrayList<>();
        }
        policyAgenciesSetter.accept(this.policyAgencies);
        return this;
    }

    /**
     * 委托及信任委托列表。
     * @return policyAgencies
     */
    public List<PolicyAgency> getPolicyAgencies() {
        return policyAgencies;
    }

    public void setPolicyAgencies(List<PolicyAgency> policyAgencies) {
        this.policyAgencies = policyAgencies;
    }

    public ListEntitiesForPolicyV5Response withPolicyGroups(List<PolicyGroup> policyGroups) {
        this.policyGroups = policyGroups;
        return this;
    }

    public ListEntitiesForPolicyV5Response addPolicyGroupsItem(PolicyGroup policyGroupsItem) {
        if (this.policyGroups == null) {
            this.policyGroups = new ArrayList<>();
        }
        this.policyGroups.add(policyGroupsItem);
        return this;
    }

    public ListEntitiesForPolicyV5Response withPolicyGroups(Consumer<List<PolicyGroup>> policyGroupsSetter) {
        if (this.policyGroups == null) {
            this.policyGroups = new ArrayList<>();
        }
        policyGroupsSetter.accept(this.policyGroups);
        return this;
    }

    /**
     * 用户组列表。
     * @return policyGroups
     */
    public List<PolicyGroup> getPolicyGroups() {
        return policyGroups;
    }

    public void setPolicyGroups(List<PolicyGroup> policyGroups) {
        this.policyGroups = policyGroups;
    }

    public ListEntitiesForPolicyV5Response withPolicyUsers(List<PolicyUser> policyUsers) {
        this.policyUsers = policyUsers;
        return this;
    }

    public ListEntitiesForPolicyV5Response addPolicyUsersItem(PolicyUser policyUsersItem) {
        if (this.policyUsers == null) {
            this.policyUsers = new ArrayList<>();
        }
        this.policyUsers.add(policyUsersItem);
        return this;
    }

    public ListEntitiesForPolicyV5Response withPolicyUsers(Consumer<List<PolicyUser>> policyUsersSetter) {
        if (this.policyUsers == null) {
            this.policyUsers = new ArrayList<>();
        }
        policyUsersSetter.accept(this.policyUsers);
        return this;
    }

    /**
     * IAM用户列表。
     * @return policyUsers
     */
    public List<PolicyUser> getPolicyUsers() {
        return policyUsers;
    }

    public void setPolicyUsers(List<PolicyUser> policyUsers) {
        this.policyUsers = policyUsers;
    }

    public ListEntitiesForPolicyV5Response withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListEntitiesForPolicyV5Response withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEntitiesForPolicyV5Response that = (ListEntitiesForPolicyV5Response) obj;
        return Objects.equals(this.policyAgencies, that.policyAgencies)
            && Objects.equals(this.policyGroups, that.policyGroups)
            && Objects.equals(this.policyUsers, that.policyUsers) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyAgencies, policyGroups, policyUsers, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEntitiesForPolicyV5Response {\n");
        sb.append("    policyAgencies: ").append(toIndentedString(policyAgencies)).append("\n");
        sb.append("    policyGroups: ").append(toIndentedString(policyGroups)).append("\n");
        sb.append("    policyUsers: ").append(toIndentedString(policyUsers)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
