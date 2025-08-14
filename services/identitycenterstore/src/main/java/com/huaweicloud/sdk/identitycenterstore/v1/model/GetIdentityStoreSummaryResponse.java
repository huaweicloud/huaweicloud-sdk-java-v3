package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetIdentityStoreSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private Long users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users_quota")

    private Long usersQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private Long groups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups_quota")

    private Long groupsQuota;

    public GetIdentityStoreSummaryResponse withUsers(Long users) {
        this.users = users;
        return this;
    }

    /**
     * 已创建的用户数量
     * @return users
     */
    public Long getUsers() {
        return users;
    }

    public void setUsers(Long users) {
        this.users = users;
    }

    public GetIdentityStoreSummaryResponse withUsersQuota(Long usersQuota) {
        this.usersQuota = usersQuota;
        return this;
    }

    /**
     * 用户配额
     * @return usersQuota
     */
    public Long getUsersQuota() {
        return usersQuota;
    }

    public void setUsersQuota(Long usersQuota) {
        this.usersQuota = usersQuota;
    }

    public GetIdentityStoreSummaryResponse withGroups(Long groups) {
        this.groups = groups;
        return this;
    }

    /**
     * 已创建的用户组数量
     * @return groups
     */
    public Long getGroups() {
        return groups;
    }

    public void setGroups(Long groups) {
        this.groups = groups;
    }

    public GetIdentityStoreSummaryResponse withGroupsQuota(Long groupsQuota) {
        this.groupsQuota = groupsQuota;
        return this;
    }

    /**
     * 用户组配额
     * @return groupsQuota
     */
    public Long getGroupsQuota() {
        return groupsQuota;
    }

    public void setGroupsQuota(Long groupsQuota) {
        this.groupsQuota = groupsQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetIdentityStoreSummaryResponse that = (GetIdentityStoreSummaryResponse) obj;
        return Objects.equals(this.users, that.users) && Objects.equals(this.usersQuota, that.usersQuota)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.groupsQuota, that.groupsQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, usersQuota, groups, groupsQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetIdentityStoreSummaryResponse {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    usersQuota: ").append(toIndentedString(usersQuota)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    groupsQuota: ").append(toIndentedString(groupsQuota)).append("\n");
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
