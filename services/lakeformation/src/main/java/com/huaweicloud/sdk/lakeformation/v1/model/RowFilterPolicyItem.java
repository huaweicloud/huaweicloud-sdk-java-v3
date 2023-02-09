package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RowFilterPolicyItem
 */
public class RowFilterPolicyItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accesses")

    private List<PolicyItemAccess> accesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<PolicyItemCondition> conditions = null;

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
    @JsonProperty(value = "row_filter_info")

    private PolicyItemRowFilterInfo rowFilterInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<String> users = null;

    public RowFilterPolicyItem withAccesses(List<PolicyItemAccess> accesses) {
        this.accesses = accesses;
        return this;
    }

    public RowFilterPolicyItem addAccessesItem(PolicyItemAccess accessesItem) {
        if (this.accesses == null) {
            this.accesses = new ArrayList<>();
        }
        this.accesses.add(accessesItem);
        return this;
    }

    public RowFilterPolicyItem withAccesses(Consumer<List<PolicyItemAccess>> accessesSetter) {
        if (this.accesses == null) {
            this.accesses = new ArrayList<>();
        }
        accessesSetter.accept(this.accesses);
        return this;
    }

    /**
     * 权限
     * @return accesses
     */
    public List<PolicyItemAccess> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<PolicyItemAccess> accesses) {
        this.accesses = accesses;
    }

    public RowFilterPolicyItem withConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public RowFilterPolicyItem addConditionsItem(PolicyItemCondition conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public RowFilterPolicyItem withConditions(Consumer<List<PolicyItemCondition>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * 条件
     * @return conditions
     */
    public List<PolicyItemCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
    }

    public RowFilterPolicyItem withDelegateAdmin(Boolean delegateAdmin) {
        this.delegateAdmin = delegateAdmin;
        return this;
    }

    /**
     * 是否传递
     * @return delegateAdmin
     */
    public Boolean getDelegateAdmin() {
        return delegateAdmin;
    }

    public void setDelegateAdmin(Boolean delegateAdmin) {
        this.delegateAdmin = delegateAdmin;
    }

    public RowFilterPolicyItem withGroups(List<String> groups) {
        this.groups = groups;
        return this;
    }

    public RowFilterPolicyItem addGroupsItem(String groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public RowFilterPolicyItem withGroups(Consumer<List<String>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 组
     * @return groups
     */
    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public RowFilterPolicyItem withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public RowFilterPolicyItem addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public RowFilterPolicyItem withRoles(Consumer<List<String>> rolesSetter) {
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

    public RowFilterPolicyItem withRowFilterInfo(PolicyItemRowFilterInfo rowFilterInfo) {
        this.rowFilterInfo = rowFilterInfo;
        return this;
    }

    public RowFilterPolicyItem withRowFilterInfo(Consumer<PolicyItemRowFilterInfo> rowFilterInfoSetter) {
        if (this.rowFilterInfo == null) {
            this.rowFilterInfo = new PolicyItemRowFilterInfo();
            rowFilterInfoSetter.accept(this.rowFilterInfo);
        }

        return this;
    }

    /**
     * Get rowFilterInfo
     * @return rowFilterInfo
     */
    public PolicyItemRowFilterInfo getRowFilterInfo() {
        return rowFilterInfo;
    }

    public void setRowFilterInfo(PolicyItemRowFilterInfo rowFilterInfo) {
        this.rowFilterInfo = rowFilterInfo;
    }

    public RowFilterPolicyItem withUsers(List<String> users) {
        this.users = users;
        return this;
    }

    public RowFilterPolicyItem addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RowFilterPolicyItem withUsers(Consumer<List<String>> usersSetter) {
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
        RowFilterPolicyItem rowFilterPolicyItem = (RowFilterPolicyItem) o;
        return Objects.equals(this.accesses, rowFilterPolicyItem.accesses)
            && Objects.equals(this.conditions, rowFilterPolicyItem.conditions)
            && Objects.equals(this.delegateAdmin, rowFilterPolicyItem.delegateAdmin)
            && Objects.equals(this.groups, rowFilterPolicyItem.groups)
            && Objects.equals(this.roles, rowFilterPolicyItem.roles)
            && Objects.equals(this.rowFilterInfo, rowFilterPolicyItem.rowFilterInfo)
            && Objects.equals(this.users, rowFilterPolicyItem.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accesses, conditions, delegateAdmin, groups, roles, rowFilterInfo, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RowFilterPolicyItem {\n");
        sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    delegateAdmin: ").append(toIndentedString(delegateAdmin)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    rowFilterInfo: ").append(toIndentedString(rowFilterInfo)).append("\n");
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
