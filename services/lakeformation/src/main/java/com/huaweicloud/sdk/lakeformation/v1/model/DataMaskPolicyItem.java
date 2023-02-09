package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DataMaskPolicyItem
 */
public class DataMaskPolicyItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accesses")

    private List<PolicyItemAccess> accesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<PolicyItemCondition> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_mask_info")

    private PolicyItemDataMaskInfo dataMaskInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegate_admin")

    private Boolean delegateAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<String> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles")

    private List<String> roles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<String> users = null;

    public DataMaskPolicyItem withAccesses(List<PolicyItemAccess> accesses) {
        this.accesses = accesses;
        return this;
    }

    public DataMaskPolicyItem addAccessesItem(PolicyItemAccess accessesItem) {
        if (this.accesses == null) {
            this.accesses = new ArrayList<>();
        }
        this.accesses.add(accessesItem);
        return this;
    }

    public DataMaskPolicyItem withAccesses(Consumer<List<PolicyItemAccess>> accessesSetter) {
        if (this.accesses == null) {
            this.accesses = new ArrayList<>();
        }
        accessesSetter.accept(this.accesses);
        return this;
    }

    /**
     * 访问数组
     * @return accesses
     */
    public List<PolicyItemAccess> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<PolicyItemAccess> accesses) {
        this.accesses = accesses;
    }

    public DataMaskPolicyItem withConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public DataMaskPolicyItem addConditionsItem(PolicyItemCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public DataMaskPolicyItem withConditions(Consumer<List<PolicyItemCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件数组
     * @return conditions
     */
    public List<PolicyItemCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
    }

    public DataMaskPolicyItem withDataMaskInfo(PolicyItemDataMaskInfo dataMaskInfo) {
        this.dataMaskInfo = dataMaskInfo;
        return this;
    }

    public DataMaskPolicyItem withDataMaskInfo(Consumer<PolicyItemDataMaskInfo> dataMaskInfoSetter) {
        if (this.dataMaskInfo == null) {
            this.dataMaskInfo = new PolicyItemDataMaskInfo();
            dataMaskInfoSetter.accept(this.dataMaskInfo);
        }

        return this;
    }

    /**
     * Get dataMaskInfo
     * @return dataMaskInfo
     */
    public PolicyItemDataMaskInfo getDataMaskInfo() {
        return dataMaskInfo;
    }

    public void setDataMaskInfo(PolicyItemDataMaskInfo dataMaskInfo) {
        this.dataMaskInfo = dataMaskInfo;
    }

    public DataMaskPolicyItem withDelegateAdmin(Boolean delegateAdmin) {
        this.delegateAdmin = delegateAdmin;
        return this;
    }

    /**
     * 是否支持传递
     * @return delegateAdmin
     */
    public Boolean getDelegateAdmin() {
        return delegateAdmin;
    }

    public void setDelegateAdmin(Boolean delegateAdmin) {
        this.delegateAdmin = delegateAdmin;
    }

    public DataMaskPolicyItem withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public DataMaskPolicyItem addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public DataMaskPolicyItem withGroups(Consumer<List<String>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组
     * @return groups
     */
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public DataMaskPolicyItem withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public DataMaskPolicyItem addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public DataMaskPolicyItem withRoles(Consumer<List<String>> rolesSetter) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色
     * @return roles
     */
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public DataMaskPolicyItem withUsers(List<String> users) {
        this.users = users;
        return this;
    }

    public DataMaskPolicyItem addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public DataMaskPolicyItem withUsers(Consumer<List<String>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户
     * @return users
     */
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataMaskPolicyItem dataMaskPolicyItem = (DataMaskPolicyItem) o;
        return Objects.equals(this.accesses, dataMaskPolicyItem.accesses)
            && Objects.equals(this.conditions, dataMaskPolicyItem.conditions)
            && Objects.equals(this.dataMaskInfo, dataMaskPolicyItem.dataMaskInfo)
            && Objects.equals(this.delegateAdmin, dataMaskPolicyItem.delegateAdmin)
            && Objects.equals(this.groups, dataMaskPolicyItem.groups)
            && Objects.equals(this.roles, dataMaskPolicyItem.roles)
            && Objects.equals(this.users, dataMaskPolicyItem.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accesses, conditions, dataMaskInfo, delegateAdmin, groups, roles, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMaskPolicyItem {\n");
        sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    dataMaskInfo: ").append(toIndentedString(dataMaskInfo)).append("\n");
        sb.append("    delegateAdmin: ").append(toIndentedString(delegateAdmin)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
